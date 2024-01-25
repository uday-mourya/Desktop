/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class MobilePOJO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mobileId;
    private String brand;
    private String model;
    private int storageCapacity;
    private int ramSize;
    private float price;
    private String color;

    public MobilePOJO(int mobileId, String brand, String model, int storageCapacity, int ramSize, float price, String color) {
        this.mobileId = mobileId;
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.ramSize = ramSize;
        this.price = price;
        this.color = color;
    }

    public MobilePOJO() {
    }

    public int getMobileId() {
        return mobileId;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MobilePOJO{" + "mobileId=" + mobileId + ", brand=" + brand + ", model=" + model + ", storageCapacity=" + storageCapacity + ", ramSize=" + ramSize + ", price=" + price + ", color=" + color + '}';
    }
    
}
