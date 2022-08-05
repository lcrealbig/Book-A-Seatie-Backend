package com.userservice.model;
import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Column(name="employee_id")
    private Integer employeeId;
    @Column(name="employee_login")
    private String employeeLogin;
    @Column(name="employee_password")
    private String employeePassword;
    @Column(name="employee_level")
    private EmployeeLevel employeeLevel;
    @Column(name="seat")
    private Integer seat;


    public Employee(Integer employeeId, String employeeLogin, String employeePassword, EmployeeLevel employeeLevel, Integer seat) {
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

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }
}
