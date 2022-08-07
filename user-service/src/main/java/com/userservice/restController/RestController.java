package com.userservice.restController;

import com.userservice.employeeDto.EmployeeDto;
import com.userservice.mapper.EmployeeMapper;
import com.userservice.model.Employee;
import com.userservice.services.EmployeeService;
import com.userservice.services.HintsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  private final EmployeeService employeeService;
  private final EmployeeMapper employeeMapper;
  private final HintsService hintsService;

    public RestController(EmployeeService employeeService, EmployeeMapper employeeMapper, HintsService hintsService) {
        this.employeeService = employeeService;
        this.employeeMapper = employeeMapper;
        this.hintsService = hintsService;
    }

    @PostMapping("createemployee")
    public ResponseEntity <EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        final Employee employee = employeeMapper.toEntity(employeeDto);
        final Employee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(employeeMapper.toDto(createdEmployee));
    }

    @PostMapping("verifylogin")
    // @Enumerated(EnumType.STRING)
    public Employee verifyLogin(@RequestBody Employee employee) throws Exception {
        return employeeService.verifyEmployeeLogin(employee);
    }

    @GetMapping("servicestatus")

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