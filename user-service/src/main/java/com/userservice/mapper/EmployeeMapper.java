package com.userservice.mapper;

import com.userservice.employeeDto.EmployeeDto;
import com.userservice.model.Employee;
import liquibase.pro.packaged.E;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EmployeeMapper extends ApplicationMapper<Employee, EmployeeDto> {


    @Override
    public Employee toEntity(final EmployeeDto employeeDto) {
        Employee newEmployee = new Employee();
        newEmployee.setEmployeeLogin(employeeDto.getEmployeeLogin());
        newEmployee.setEmployeePassword(employeeDto.getEmployeePassword());
        newEmployee.setEmployeeLevel(employeeDto.getEmployeeLevel());
        newEmployee.setEmployeeId(employeeDto.getEmployeeId());
        newEmployee.setSeat(employeeDto.getSeat());
        return newEmployee;
    }



    @Override
    public EmployeeDto toDto(final Employee employee) {
        final String status = Optional.of(employee)
                .map(Employee::getEmployeeLogin)
                .map(String::toUpperCase)
                .orElse("UNKNOWN");
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setEmployeeLogin(employee.getEmployeeLogin());
        employeeDto.setEmployeePassword(employee.getEmployeePassword());
        employeeDto.setEmployeeLevel(employee.getEmployeeLevel());
        employeeDto.setEmployeeId(employee.getEmployeeId());
        employeeDto.setSeat(employee.getSeat());
        return employeeDto;
    }
}
