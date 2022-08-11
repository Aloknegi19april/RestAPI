package com.giitassesment.restapi.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giitassesment.restapi.dto.ResponseDTO;
import com.giitassesment.restapi.dto.UserDTO;
import com.giitassesment.restapi.entity.UserEntity;
import com.giitassesment.restapi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceInterface {

	@Autowired
	private UserRepository userRepository;

	@Override
	public ResponseDTO addNewUser(UserDTO userDTO) {

		ResponseDTO responseDTO = new ResponseDTO();
		Optional<UserEntity> getUsernew = userRepository.findByUserEmail(userDTO.getUserEmail());

		if (!getUsernew.isEmpty()) {
			responseDTO.setResponse(Boolean.FALSE);
			responseDTO.setResponseMessage("User Already Present");
			return responseDTO;
		}
		UserEntity userEntity = new UserEntity();
		userEntity.setUserName(userDTO.getUserName());
		userEntity.setUserEmail(userDTO.getUserEmail());
		userEntity.setUserAddedOn(LocalDate.now());
		userRepository.save(userEntity);

		responseDTO.setResponse(Boolean.TRUE);
		responseDTO.setResponseMessage("New User Added");
		return responseDTO;
	}

	@Override
	public UserDTO getUserDetails(String userEmail) throws Exception {

		UserDTO userDTO = new UserDTO();
		Optional<UserEntity> getUsernew = userRepository.findByUserEmail(userEmail);
		if (getUsernew.isEmpty()) {
			userDTO.setRemarks("User Not Found");
			return userDTO;
		}
		UserEntity getUser = getUsernew.get();
		userDTO.setUserId(getUser.getUserId());
		userDTO.setUserName(getUser.getUserName());
		userDTO.setUserEmail(getUser.getUserEmail());
		userDTO.setUseraddedon(getUser.getUserAddedOn());
		userDTO.setRemarks("User Found");
		return userDTO;
	}

	@Override
	public ResponseDTO updateUser(UserDTO userDTO) throws Exception {

		ResponseDTO responseDTO = new ResponseDTO();
		Optional<UserEntity> getUsernew = userRepository.findByUserEmail(userDTO.getUserEmail());
		if (getUsernew.isEmpty()) {
			responseDTO.setResponse(Boolean.FALSE);
			responseDTO.setResponseMessage("User Not Present");
			return responseDTO;
		}
		UserEntity userEntity = getUsernew.get();
		userEntity.setUserName(userDTO.getUserName());
		userRepository.save(userEntity);
		responseDTO.setResponse(Boolean.TRUE);
		responseDTO.setResponseMessage("User Name Updated");
		return responseDTO;
	}

	@Override
	public ResponseDTO deleteUser(String userEmail) throws Exception {

		ResponseDTO responseDTO = new ResponseDTO();
		Optional<UserEntity> getUsernew = userRepository.findByUserEmail(userEmail);
		if (getUsernew.isEmpty()) {
			responseDTO.setResponse(Boolean.FALSE);
			responseDTO.setResponseMessage("User Not Present");
			return responseDTO;
		}
		UserEntity userEntity = getUsernew.get();
		userRepository.delete(userEntity);
		responseDTO.setResponse(Boolean.TRUE);
		responseDTO.setResponseMessage("User's Data Deleted");
		return responseDTO;

	}

}
