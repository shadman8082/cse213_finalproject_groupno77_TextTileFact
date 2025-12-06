package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import java.time.LocalDate;

public class PaymentRecord {
    public class PaymentRecord {
        private String paymentId;
        private String invoiceId;
        private String orderId;
        private double amountPaid;
        private LocalDate paymentDate;
        private String paymentMethod; // "Bank Transfer", "Cash", "Cheque", "Card"
        private String referenceNumber;
        private String status; // "Completed", "Pending", "Failed"
        private String notes;

        public PaymentRecord(String paymentId, String invoiceId, String orderId, double amountPaid, LocalDate paymentDate, String paymentMethod, String referenceNumber, String status, String notes) {
            this.paymentId = paymentId;
            this.invoiceId = invoiceId;
            this.orderId = orderId;
            this.amountPaid = amountPaid;
            this.paymentDate = paymentDate;
            this.paymentMethod = paymentMethod;
            this.referenceNumber = referenceNumber;
            this.status = status;
            this.notes = notes;
        }

        public String getPaymentId() {
            return paymentId;
        }

        public void setPaymentId(String paymentId) {
            this.paymentId = paymentId;
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

        public double getAmountPaid() {
            return amountPaid;
        }

        public void setAmountPaid(double amountPaid) {
            this.amountPaid = amountPaid;
        }

        public LocalDate getPaymentDate() {
            return paymentDate;
        }

        public void setPaymentDate(LocalDate paymentDate) {
            this.paymentDate = paymentDate;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public String getReferenceNumber() {
            return referenceNumber;
        }

        public void setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }
    }
