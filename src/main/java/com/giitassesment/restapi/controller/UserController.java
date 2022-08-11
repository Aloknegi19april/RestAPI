package com.giitassesment.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.giitassesment.restapi.dto.ResponseDTO;
import com.giitassesment.restapi.dto.UserDTO;
import com.giitassesment.restapi.service.UserServiceInterface;

@RestController
@RequestMapping("/userOperation")
public class UserController {

	@Autowired
	private UserServiceInterface userServiceInterface;
	
	@PostMapping(value =  "/adduser")
	public ResponseDTO addUser(@RequestBody UserDTO userDTO) {
		
		return userServiceInterface.addNewUser(userDTO);
	}
	
	@GetMapping(value = "/getuser")
	public UserDTO getUserDetails(@RequestParam String userEmail) throws Exception {
		
		return userServiceInterface.getUserDetails(userEmail);
	}
	
	@PostMapping(value = "/updateuser")
	public ResponseDTO updateUser(@RequestBody UserDTO userDTO) throws Exception {
		
		return userServiceInterface.updateUser(userDTO);
	}
	
	@DeleteMapping(value = "/deleteuser")
	public ResponseDTO deleteUser(@RequestParam String userEmail) throws Exception {
		
		return userServiceInterface.deleteUser(userEmail);
	}
}
