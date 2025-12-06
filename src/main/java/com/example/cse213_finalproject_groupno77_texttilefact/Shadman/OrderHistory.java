package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import java.time.LocalDate;

public class OrderHistory {
    public class OrderHistory {
        private String orderId;
        private String materialName;
        private int quantity;
        private double amount;
        private LocalDate orderDate;
        private LocalDate deliveryDate;
        private String orderStatus;
        private String paymentStatus;
        private String supplierId;]

        public OrderHistory(String orderId, String materialName, int quantity, double amount, LocalDate orderDate, LocalDate deliveryDate, String orderStatus, String paymentStatus, String supplierId) {
            this.orderId = orderId;
            this.materialName = materialName;
            this.quantity = quantity;
            this.amount = amount;
            this.orderDate = orderDate;
            this.deliveryDate = deliveryDate;
            this.orderStatus = orderStatus;
            this.paymentStatus = paymentStatus;
            this.supplierId = supplierId;
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

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public LocalDate getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(LocalDate orderDate) {
            this.orderDate = orderDate;
        }

        public LocalDate getDeliveryDate() {
            return deliveryDate;
        }

        public void setDeliveryDate(LocalDate deliveryDate) {
            this.deliveryDate = deliveryDate;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getPaymentStatus() {
            return paymentStatus;
        }

        public void setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
        }

        public String getSupplierId() {
            return supplierId;
        }

        public void setSupplierId(String supplierId) {
            this.supplierId = supplierId;
        }
    }
