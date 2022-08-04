package com.userservice.services;

import com.userservice.model.Employee;
import com.userservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    private EntityManager em;

    @Transactional
    public Employee verifyEmployeeLogin(@RequestBody Employee employee) throws Exception {
        List<Employee> employees = employeeRepository.findAll();
        Optional<Employee> verifiedEmployee = Optional.ofNullable(employees.stream()
                .filter(emp -> emp.getEmployeeLogin().equals(employee.getEmployeeLogin())
                        && emp.getEmployeePassword().equals(employee.getEmployeePassword()))
                .findAny()
                .orElseThrow(Exception::new));
        return verifiedEmployee.get();
    }


    @Transactional
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional
    public ResponseEntity<Employee> updateOrAssignSeat (Employee employee){
          em.merge(employee);
        return ResponseEntity.ok().body(employee);
    }

}
