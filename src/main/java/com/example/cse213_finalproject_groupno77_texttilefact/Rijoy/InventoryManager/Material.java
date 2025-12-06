package com.example.cse213_finalproject_groupno77_texttilefactory.InventoryManager;

public class Material {
    private String name;
    private int quantity;
    private double price; // make sure it's double if you want decimal prices

    public Material(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {   // <-- This was missing
        return price;
    }

    // Optional: setter methods if needed
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
