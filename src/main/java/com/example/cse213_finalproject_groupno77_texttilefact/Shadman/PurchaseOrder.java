package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import java.time.LocalDate;

public class PurchaseOrder {
    private String orderId;
    private String materialName;
    private String materialType;
    private int quantity;
    private double pricePerUnit;
    private double totalAmount;
    private LocalDate orderDate;
    private LocalDate requiredDate;
    private LocalDate confirmedDate;
    private LocalDate deliveryDate;
    private String status; // "Pending", "Confirmed", "Dispatched", "Delivered", "Cancelled"
    private String supplierId;
    private String notes;

    public PurchaseOrder(String orderId, String materialName, String materialType, int quantity, double pricePerUnit, double totalAmount, LocalDate orderDate, LocalDate requiredDate, LocalDate confirmedDate, LocalDate deliveryDate, String status, String supplierId, String notes) {
        this.orderId = orderId;
        this.materialName = materialName;
        this.materialType = materialType;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.confirmedDate = confirmedDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.supplierId = supplierId;
        this.notes = notes;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(LocalDate requiredDate) {
        this.requiredDate = requiredDate;
    }

    public LocalDate getConfirmedDate() {
        return confirmedDate;
    }

    public void setConfirmedDate(LocalDate confirmedDate) {
        this.confirmedDate = confirmedDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
