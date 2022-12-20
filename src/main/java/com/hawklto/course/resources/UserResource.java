package com.hawklto.course.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hawklto.course.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	@GetMapping
	public String findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "943443826", "12345");
		return u.toString();
	}
	
}
