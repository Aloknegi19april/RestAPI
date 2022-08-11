package com.giitassesment.restapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giitassesment.restapi.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	public Optional<UserEntity> findByUserEmail(String userEmail);

}
