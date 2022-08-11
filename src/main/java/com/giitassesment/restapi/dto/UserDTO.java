package com.giitassesment.restapi.dto;

import java.time.LocalDate;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDTO {

	private Integer userId;
	private String userName;
	private String userEmail;
	private LocalDate useraddedon;
	private String remarks;
}
