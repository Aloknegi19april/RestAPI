package com.giitassesment.restapi.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "giituser")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private Integer userId;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "useremail")
	private String userEmail;
	
	@Column(name = "useraddedon")
	private LocalDate userAddedOn;
}
