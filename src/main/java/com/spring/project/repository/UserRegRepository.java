package com.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.project.model.UserReg;;

    @Repository
	public interface UserRegRepository extends JpaRepository<UserReg, Long>
    {
    	
	}