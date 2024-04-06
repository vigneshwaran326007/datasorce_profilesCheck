package com.vignesh.datasource;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vignesh.datasource.service.dataservice;

@RestController

public class HelloWorldController {
	
	@Autowired
	private dataservice service;
	
	@GetMapping("/hello")
	public String helloworld() {
		return "welcome to hello world";
	}
	
	@GetMapping("/profile")
	public Boolean getprofile() throws SQLException {
		return service.performance();
	}
	
	
	
	

}
