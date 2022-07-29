package com.userservice.logging;

import com.userservice.model.Employee;

public class LogIn {
    int loginAttempts = 3;

    public void loggingProcess(Employee employee, String concatenatedLoginAndPassword) {

        String concatenatedEmployeeData = employee.getEmployeeLogin() + employee.getEmployeePassword();

        if (concatenatedEmployeeData.equals(concatenatedLoginAndPassword)) {
            // TODO
        } else {
            loginAttempts--;
            // tu wyslac na frontend informacje o niepoprawnej probie.
            if (loginAttempts == 0) {
                // tu chce wyslac informacje na frontend ze user jest zablokowany i musi sprobowac ponownie za kwadrans.
                System.exit(-1);
            }

        }

    }
}
