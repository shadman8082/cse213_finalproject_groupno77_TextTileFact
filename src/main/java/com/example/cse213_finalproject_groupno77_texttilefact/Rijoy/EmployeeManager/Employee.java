package com.example.cse213_finalproject_groupno77_texttilefactory.EmployeeManager;

public class Employee {
    private final String employeeID;
    private final String name;
    private final String role;

    public Employee(String employeeID, String name, String role) {
        this.employeeID = employeeID;
        this.name = name;
        this.role = role;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
