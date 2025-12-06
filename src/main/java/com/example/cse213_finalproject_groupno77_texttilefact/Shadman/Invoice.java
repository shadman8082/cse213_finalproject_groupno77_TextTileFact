package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import java.time.LocalDate;

public class Invoice {
    private String invoiceId;
    private String orderId;
    private LocalDate invoiceDate;
    private double totalAmount;
    private double taxAmount;
    private double grandTotal;
    private String paymentTerms;
    private LocalDate dueDate;
    private String paymentStatus; // "Pending", "Paid", "Overdue", "Partial"
    private LocalDate paymentDate;
    private String filePath; // Path to uploaded PDF
    private String notes;

    public Invoice(String invoiceId, String orderId, LocalDate invoiceDate, double totalAmount, double taxAmount, double grandTotal, String paymentTerms, LocalDate dueDate, String paymentStatus, LocalDate paymentDate, String filePath, String notes) {
        this.invoiceId = invoiceId;
        this.orderId = orderId;
        this.invoiceDate = invoiceDate;
        this.totalAmount = totalAmount;
        this.taxAmount = taxAmount;
        this.grandTotal = grandTotal;
        this.paymentTerms = paymentTerms;
        this.dueDate = dueDate;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
        this.filePath = filePath;
        this.notes = notes;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
