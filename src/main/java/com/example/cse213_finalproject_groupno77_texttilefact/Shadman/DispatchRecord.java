package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DispatchRecord {
    private String dispatchId;
    private String orderId;
    private LocalDate dispatchDate;
    private String vehicleNumber;
    private String driverName;
    private String trackingNumber;
    private String status; // "Ready", "Dispatched", "In Transit", "Delivered"
    private LocalDateTime dispatchTime;
    private String notes;

    public DispatchRecord(String dispatchId, String orderId, LocalDate dispatchDate, String vehicleNumber, String driverName, String trackingNumber, String status, LocalDateTime dispatchTime, String notes) {
        this.dispatchId = dispatchId;
        this.orderId = orderId;
        this.dispatchDate = dispatchDate;
        this.vehicleNumber = vehicleNumber;
        this.driverName = driverName;
        this.trackingNumber = trackingNumber;
        this.status = status;
        this.dispatchTime = dispatchTime;
        this.notes = notes;
    }

    public String getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(String dispatchId) {
        this.dispatchId = dispatchId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(LocalDate dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(LocalDateTime dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
