package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import java.time.LocalDate;

public class MaintenanceRecord {
    private int recordId;
    private String itemId; // Could be vehicle license or equipment ID
    private String itemType; // "Vehicle", "Machine", "Equipment"
    private LocalDate serviceDate;
    private String serviceType; // "Routine", "Emergency", "Preventive"
    private String description;
    private double cost;
    private String performedBy;
    private LocalDate nextServiceDate;
    private String status; // "Completed", "Scheduled", "Cancelled"

    public MaintenanceRecord(int recordId, String itemId, String itemType, LocalDate serviceDate, String serviceType, String description, double cost, String performedBy, LocalDate nextServiceDate, String status) {
        this.recordId = recordId;
        this.itemId = itemId;
        this.itemType = itemType;
        this.serviceDate = serviceDate;
        this.serviceType = serviceType;
        this.description = description;
        this.cost = cost;
        this.performedBy = performedBy;
        this.nextServiceDate = nextServiceDate;
        this.status = status;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public LocalDate getNextServiceDate() {
        return nextServiceDate;
    }

    public void setNextServiceDate(LocalDate nextServiceDate) {
        this.nextServiceDate = nextServiceDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
