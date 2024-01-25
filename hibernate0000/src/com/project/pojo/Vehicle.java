package com.project.pojo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T460
 */
public class Vehicle {

    private int vehicleId;
    private String company;

    private String model;
    private int year;
    private String color;
    private String registrationNumber;
    private String ownerName;

    // Constructors, getters, setters (omitted for brevity)

    public Vehicle() {
    }
    
    public Vehicle(int vehicleId, String company, String model, int year, String color, String registrationNumber, String ownerName) {
        this.vehicleId = vehicleId;
        this.company = company;
        this.model = model;
        this.year = year;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }
    
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
}
