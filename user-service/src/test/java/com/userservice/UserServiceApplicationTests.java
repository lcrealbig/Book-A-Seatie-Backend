package com.userservice;

import com.userservice.repositories.EmployeeRepository;
import com.userservice.restController.RestController;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {
	@Autowired
	private RestController controller;

	@Mock
	private EmployeeRepository employeeRepository;


	@Test
	void contextLoads() {
	}

}
