package com.userservice;

import com.userservice.model.Employee;
import com.userservice.model.EmployeeLevel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		CrudService cs = new CrudService();
		Employee user = new Employee();
		user.setEmployeeId(123);
		user.setEmployeeLevel(EmployeeLevel.EMPLOYEE);
		user.setEmployeeLogin("123");
		user.setEmployeePassword("123");
		user.setSeat("12");
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
