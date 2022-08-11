package com.giitassesment.restapi.service;

import com.giitassesment.restapi.dto.ResponseDTO;
import com.giitassesment.restapi.dto.UserDTO;

public interface UserServiceInterface {

	public ResponseDTO addNewUser(UserDTO userDTO);
	public UserDTO getUserDetails(String userEmail) throws Exception;
	public ResponseDTO updateUser(UserDTO userDTO) throws Exception;
	public ResponseDTO deleteUser(String userEmail) throws Exception;
}
