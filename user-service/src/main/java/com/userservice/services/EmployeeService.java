package com.userservice.services;

import com.userservice.model.Employee;
import com.userservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Employee verifyEmployeeLogin(@RequestBody Employee employee) throws Exception {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .filter(emp -> emp.getEmployeeLogin().equals(employee.getEmployeeLogin())
                        && emp.getEmployeePassword().equals(employee.getEmployeePassword()))
                .findAny()
                .orElseThrow(Exception::new);


    }

    @Transactional
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


}
