package com.example.pracfinalprojectg77texttilefact;

public class SalesManager {
}

public class SalesManagerModel {

    public String client;
    public String product;
    public String region;

    public String item;
    public String price;
    public String tax;
    public String discount;

    public String orderId;
    public String products;
    public String completation;
    public String productionStage;

    public String invoice;
    public String price;

    public String sl;
    public String clientName;
    public String status;
    public String orderProducts;
    public String currentStatus;
    public String date;

    public String name;
    public String number;
    public String address;
    public String contact;

    public String chosenProduct;
    public String fabric;
    public String quantity;
    public String deliveryDate;
    public String price;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(String orderProducts) {
        this.orderProducts = orderProducts;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getChosenProduct() {
        return chosenProduct;
    }

    public void setChosenProduct(String chosenProduct) {
        this.chosenProduct = chosenProduct;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getCompletation() {
        return completation;
    }

    public void setCompletation(String completation) {
        this.completation = completation;
    }

    public String getProductionStage() {
        return productionStage;
    }

    public void setProductionStage(String productionStage) {
        this.productionStage = productionStage;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "SalesManagerModel{" +
                "client='" + client + '\'' +
                ", product='" + product + '\'' +
                ", region='" + region + '\'' +
                ", item='" + item + '\'' +
                ", price='" + price + '\'' +
                ", tax='" + tax + '\'' +
                ", discount='" + discount + '\'' +
                ", orderId='" + orderId + '\'' +
                ", products='" + products + '\'' +
                ", completation='" + completation + '\'' +
                ", productionStage='" + productionStage + '\'' +
                ", invoice='" + invoice + '\'' +
                ", price='" + price + '\'' +
                ", sl='" + sl + '\'' +
                ", clientName='" + clientName + '\'' +
                ", status='" + status + '\'' +
                ", orderProducts='" + orderProducts + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", chosenProduct='" + chosenProduct + '\'' +
                ", fabric='" + fabric + '\'' +
                ", quantity='" + quantity + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public SalesManagerModel(String client, String product, String region, String item, String price, String tax, String discount, String orderId, String products, String completation, String productionStage, String invoice, String price1, String sl, String clientName, String status, String orderProducts, String currentStatus, String date, String name, String number, String address, String contact, String chosenProduct, String fabric, String quantity, String deliveryDate, String price2) {
        this.client = client;
        this.product = product;
        this.region = region;
        this.item = item;
        this.price = price;
        this.tax = tax;
        this.discount = discount;
        this.orderId = orderId;
        this.products = products;
        this.completation = completation;
        this.productionStage = productionStage;
        this.invoice = invoice;
        this.price = price1;
        this.sl = sl;
        this.clientName = clientName;
        this.status = status;
        this.orderProducts = orderProducts;
        this.currentStatus = currentStatus;
        this.date = date;
        this.name = name;
        this.number = number;
        this.address = address;
        this.contact = contact;
        this.chosenProduct = chosenProduct;
        this.fabric = fabric;
        this.quantity = quantity;
        this.deliveryDate = deliveryDate;
        this.price = price2;
    }
}

