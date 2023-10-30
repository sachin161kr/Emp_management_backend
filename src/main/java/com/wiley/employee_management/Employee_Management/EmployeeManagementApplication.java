package com.wiley.employee_management.Employee_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeeManagementApplication {

	@GetMapping("/")
	public String hello() {
		return "Employee Management online";
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);

	}

}
