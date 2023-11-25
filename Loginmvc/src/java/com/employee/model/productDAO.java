package com.employee.model;

import java.io.Serializable;
import java.util.ArrayList;

public class productDAO implements Serializable {

    private int id;
    private String name, color, size, price;

    ArrayList<ArrayList<String>> al = new ArrayList<>();

    public productDAO(String name, String color, String size, String price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;

    }

    public productDAO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ArrayList getAl() {
        return al;
    }

    public void setAl(ArrayList al) {
        this.al = al;
    }

}
