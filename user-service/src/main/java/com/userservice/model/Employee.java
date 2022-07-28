package com.userservice.model;
import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    private Integer employeeId;
    private String employeeLogin;
    private String employeePassword;
    private EmployeeLevel employeeLevel;
    private String seat;


    public Employee(Integer employeeId, String employeeLogin, String employeePassword, EmployeeLevel employeeLevel, String seat) {
        this.employeeId = employeeId;
        this.employeeLogin = employeeLogin;
        this.employeePassword = employeePassword;
        this.employeeLevel = employeeLevel;
        this.seat = seat;
    }

    public Employee() {
    }

    @Id
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

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}