package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

public class supplier {
    private String supplierId;
    private String companyName;
    private String contactPerson;
    private String phone;
    private String email;
    private String address;
    private String password;
    private String registrationDate;

    public Supplier(String supplierId, String companyName, String contactPerson,
                    String phone, String email, String address, String password) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.password = password;
        this.registrationDate = java.time.LocalDate.now().toString();
    }

    public supplier(String supplierId, String companyName, String contactPerson, String phone, String email, String address, String password, String registrationDate) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }
}
