package com.userservice.employeeDto;

import com.userservice.model.EmployeeLevel;


public class EmployeeDto {


    private Integer employeeId;
    private String employeeLogin;
    private String employeePassword;
    private EmployeeLevel employeeLevel;
    private Integer seat;


    public EmployeeDto(Integer employeeId, String employeeLogin, String employeePassword, EmployeeLevel employeeLevel, Integer seat) {
        this.employeeId = employeeId;
        this.employeeLogin = employeeLogin;
        this.employeePassword = employeePassword;
        this.employeeLevel = employeeLevel;
        this.seat = seat;
    }

    public EmployeeDto() {
    }
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeLogin() {
        return employeeLogin;
    }

    public void setEmployeeLogin(String employeeLogin) {
        this.employeeLogin = employeeLogin;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public EmployeeLevel getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(EmployeeLevel employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }
}
