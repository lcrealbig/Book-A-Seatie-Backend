package com.userservice;

import com.userservice.model.Employee;
import com.userservice.services.EmployeeService;
import com.userservice.services.HintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private HintsService hintsService;

    @PostMapping("/createemployee")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @PostMapping("verifylogin")
    // @Enumerated(EnumType.STRING)
    public Employee verifyLogin(@RequestBody Employee employee) throws Exception {
        return employeeService.verifyEmployeeLogin(employee);
    }

    @GetMapping("/servicestatus")

    public ResponseEntity getStatus() {
        return ResponseEntity.ok().body("user-service is [ONLINE]");
    }

    @GetMapping("hints")
    public String getHints() {
        return hintsService.displayReservationHints();
    }

    @PutMapping("putseat")
    public ResponseEntity<Employee> putSeat(@RequestBody Employee employee) {
        return employeeService.updateOrAssignSeat(employee);
    }
}