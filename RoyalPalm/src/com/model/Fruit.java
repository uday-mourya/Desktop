/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author hp
 */
public class Fruit {
    private int Fruitid,Quantity;
    
    private String name,color,taste,origin;
    
    private double price;
     
    public Fruit() {
    }
    
    public Fruit(int Fruitid, int Quantity, String name, String color, String taste, String origin, double price) {
        this.Fruitid = Fruitid;
        this.Quantity = Quantity;
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.origin = origin;
        this.price = price;
    }

    public int getFruitid() {
        return Fruitid;
    }

    public void setFruitid(int Fruitid) {
        this.Fruitid = Fruitid;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
