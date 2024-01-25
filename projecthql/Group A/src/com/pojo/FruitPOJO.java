/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pojo;

import javax.persistence.*;

@Entity
@Table(name = "fruit")
public class FruitPOJO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fruit_id")
    private int fruitId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "color")
    private String color;

    @Column(name = "calories")
    private int calories;

    @Column(name = "price")
    private float price;

    @Column(name = "season")
    private String season;

    @Column(name = "description", length = 1000)
    private String description;

    public FruitPOJO() {
    }

    public FruitPOJO(String name, String color, int calories, float price, String season, String description) {
        this.name = name;
        this.color = color;
        this.calories = calories;
        this.price = price;
        this.season = season;
        this.description = description;
    }


    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
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

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitId=" + fruitId +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", season='" + season + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

