package com.userservice;

import com.userservice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Cotroller {

    @Autowired
    CrudService CRUDService;

    @PostMapping("/createemployee")
    @ResponseBody
    public void createEmployee(@RequestBody Employee employee) {
        CRUDService.createEmployee(employee);
    }

    @GetMapping("/serviceStatus")
    @ResponseBody
    public ResponseEntity getStatus() {
        return ResponseEntity.ok().body("user-service is [ONLINE]");
    }
}