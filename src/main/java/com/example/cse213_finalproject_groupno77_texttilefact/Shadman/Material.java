package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

public class Material {
    private String materialId;
    private String materialName;
    private String materialType; // "Raw", "Finished", "Semi-finished"
    private String category; // "Fabric", "Yarn", "Thread", "Dye", "Chemical"
    private String unit; // "kg", "meter", "piece", "roll"
    private double currentStock;
    private double minimumStock;
    private String supplierId;
    private double unitPrice;

    public Material(String materialId, String materialName, String materialType, String category, String unit, double currentStock, double minimumStock, String supplierId, double unitPrice) {
        this.materialId = materialId;
        this.materialName = materialName;
        this.materialType = materialType;
        this.category = category;
        this.unit = unit;
        this.currentStock = currentStock;
        this.minimumStock = minimumStock;
        this.supplierId = supplierId;
        this.unitPrice = unitPrice;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(double currentStock) {
        this.currentStock = currentStock;
    }

    public double getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(double minimumStock) {
        this.minimumStock = minimumStock;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
