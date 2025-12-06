package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import java.time.LocalDate;
import java.util.List;

public class Transport {
    // Vehicle properties
    private String licensePlate;
    private String VehicleType;// "Truck", "Van", "Car"
    private String VehicleStatus;
    private LocalDate Lastservicedate;
    private LocalDate Nextservicedate;
    private boolean NeedsService;

    // Route properties
    private String routeId;
    private List<String> routeAddresses;
    private double totalDistance; // km
    private double estimatedTime; // hours
    private String optimizedPath;

    // Schedule/Delivery properties
    private int scheduleId;
    private String clientName;
    private LocalDate deliveryDate;
    private String destination;
    private String assignedDriverId;
    private String scheduleStatus; // "Scheduled", "In Transit", "Delivered"
    private String shipmentStatus; // "On Time", "Delayed"


    public Transport(String licensePlate, String vehicleType, String vehicleStatus, LocalDate lastservicedate, LocalDate nextservicedate, boolean needsService, String routeId, List<String> routeAddresses, double totalDistance, String optimizedPath, double estimatedTime, int scheduleId, String clientName, LocalDate deliveryDate, String destination, String assignedDriverId, String scheduleStatus, String shipmentStatus) {
        this.licensePlate = licensePlate;
        VehicleType = vehicleType;
        VehicleStatus = vehicleStatus;
        Lastservicedate = lastservicedate;
        Nextservicedate = nextservicedate;
        NeedsService = needsService;
        this.routeId = routeId;
        this.routeAddresses = routeAddresses;
        this.totalDistance = totalDistance;
        this.optimizedPath = optimizedPath;
        this.estimatedTime = estimatedTime;
        this.scheduleId = scheduleId;
        this.clientName = clientName;
        this.deliveryDate = deliveryDate;
        this.destination = destination;
        this.assignedDriverId = assignedDriverId;
        this.scheduleStatus = scheduleStatus;
        this.shipmentStatus = shipmentStatus;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getVehicleStatus() {
        return VehicleStatus;
    }

    public void setVehicleStatus(String vehicleStatus) {
        VehicleStatus = vehicleStatus;
    }

    public LocalDate getLastservicedate() {
        return Lastservicedate;
    }

    public void setLastservicedate(LocalDate lastservicedate) {
        Lastservicedate = lastservicedate;
    }

    public LocalDate getNextservicedate() {
        return Nextservicedate;
    }

    public void setNextservicedate(LocalDate nextservicedate) {
        Nextservicedate = nextservicedate;
    }

    public boolean isNeedsService() {
        return NeedsService;
    }

    public void setNeedsService(boolean needsService) {
        NeedsService = needsService;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public List<String> getRouteAddresses() {
        return routeAddresses;
    }

    public void setRouteAddresses(List<String> routeAddresses) {
        this.routeAddresses = routeAddresses;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(double estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getOptimizedPath() {
        return optimizedPath;
    }

    public void setOptimizedPath(String optimizedPath) {
        this.optimizedPath = optimizedPath;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAssignedDriverId() {
        return assignedDriverId;
    }

    public void setAssignedDriverId(String assignedDriverId) {
        this.assignedDriverId = assignedDriverId;
    }

    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

}

