/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.pojo;

/**
 *
 * @author dell
 */



public class Studentpojo {
    
    private int rno;
    private String name;
    private float fee;

    public Studentpojo() {
    }

    public Studentpojo(int rno, String name, float fee) {
        this.rno = rno;
        this.name = name;
        this.fee = fee;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "{" + "rno=" + rno + ", name=" + name + ", fee=" + fee + '}';
    }
    
}

