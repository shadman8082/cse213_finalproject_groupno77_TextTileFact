package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
    private int orderId;
    private String orderType; // "Shipment", "Inventory Transfer", "Delivery"
    private String clientName;
    private String itemDescription;
    private int quantity;
    private String destination;
    private LocalDate dueDate;
    private LocalDateTime actualCompletionDate;
    private String status; // "Pending", "In Progress", "Completed", "Delayed", "Cancelled"
    private String assignedTo; // Driver/Employee ID
    private String priority; // "High", "Medium", "Low"
    private String notes;
    private double cost;
    private String sourceLocation; // For inventory transfers

    public Order(int orderId, String orderType, String clientName, String itemDescription, int quantity, String destination, LocalDate dueDate, LocalDateTime actualCompletionDate, String status, String assignedTo, String priority, String notes, double cost, String sourceLocation) {
        this.orderId = orderId;
        this.orderType = orderType;
        this.clientName = clientName;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
        this.destination = destination;
        this.dueDate = dueDate;
        this.actualCompletionDate = actualCompletionDate;
        this.status = status;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.notes = notes;
        this.cost = cost;
        this.sourceLocation = sourceLocation;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getActualCompletionDate() {
        return actualCompletionDate;
    }

    public void setActualCompletionDate(LocalDateTime actualCompletionDate) {
        this.actualCompletionDate = actualCompletionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }
}

