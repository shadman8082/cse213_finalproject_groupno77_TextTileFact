package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private String role; // "Driver", "Logistics Manager", "Warehouse Staff"
    private String email;
    private String phone;
    private String department; // "Logistics", "Production", "Sales"
    private LocalDate hireDate;
    private String performanceRating; // "BAD", "GOOD", "BEST"
    private int completedTasks;
    private boolean isActive;

    public Employee(int id, String name, String role, String phone, String email, String department, LocalDate hireDate, String performanceRating, int completedTasks, boolean isActive) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.phone = phone;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.performanceRating = performanceRating;
        this.completedTasks = completedTasks;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(int completedTasks) {
        this.completedTasks = completedTasks;
    }

    public String getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(String performanceRating) {
        this.performanceRating = performanceRating;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


