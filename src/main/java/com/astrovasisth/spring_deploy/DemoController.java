package com.astrovasisth.spring_deploy;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spring-deploy")
public class DemoController {
	
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping(value = "/demo")
	public String getMessage() {
		return "Nikhil";
	}
	
	@GetMapping(value = "/data")
	public List<UserEntity> getdata() {
		List<UserEntity> user = userRepo.findAll();
		return user;
	}

	
}
