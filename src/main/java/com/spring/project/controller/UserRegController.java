package com.spring.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.model.UserReg;
import com.spring.project.repository.UserRegRepository;

@RestController
@RequestMapping("api/vi/s")
public class UserRegController {
	
	
	@Autowired
	private UserRegRepository userRegRepository;
	//get user ingormation
	

	@GetMapping("/userinformation")
	public List<UserReg> getAllUserInformation(){
		System.out.println("am user get infomratin ");
		return this.userRegRepository.findAll();
	
	}
	//get user by id
	@GetMapping("/userReg/{id}")
	 public ResponseEntity<Optional<UserReg>> getuserId(@PathVariable(value = "id") Long userId)
	   {
	        Optional<UserReg> user = userRegRepository.findById(userId);
	        System.out.println(user.get().getUrUsername());
	        System.out.println(user.get().getUrLoginid());
	        System.out.println(user.get().getUrMobileNo());
	        return ResponseEntity.ok().body(user);
	    }
	
	//get user update
	
	//get user

}
