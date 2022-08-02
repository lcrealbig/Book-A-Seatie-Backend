package com.userservice.services;

import com.userservice.model.Employee;
import com.userservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Boolean verifyEmployeeLogin(@RequestBody Employee employee) {
        List<Employee> employees = employeeRepository.findAll();
        boolean isLoginCorrect = employees.stream().anyMatch(emp -> emp.getEmployeeLogin().equals(employee.getEmployeeLogin()));
        boolean isPasswordCorrect = employees.stream().anyMatch(emp -> emp.getEmployeePassword().equals(employee.getEmployeePassword()));
        return isLoginCorrect && isPasswordCorrect;
    }


    @Transactional
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public String printOutQuote(){

        List<String> quotes = Arrays.asList("hello World", "hello global logic", "just say hi");
        int x =0;
        int y =2;
        int rand = ThreadLocalRandom.current().nextInt(x,y);

        return quotes.get(rand);
    }

}
