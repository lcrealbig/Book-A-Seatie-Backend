package com.userservice;

import com.userservice.model.Employee;
import com.userservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Cotroller {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/createemployee")
    @ResponseBody
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @GetMapping("verifyLogin")
    public void verifyLogin(@RequestBody Employee employee) {
        System.out.println(employeeService.verifyEmployeeLogin(employee));

    }

    @GetMapping("/serviceStatus")
    @ResponseBody
    public ResponseEntity getStatus() {
        return ResponseEntity.ok().body("user-service is [ONLINE]");
    }
}