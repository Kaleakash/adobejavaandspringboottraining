package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping(value="sayHello")
	public String sayHello() {
		return "Welcome to Spring Boot Application";
	}
}
