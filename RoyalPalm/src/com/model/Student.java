/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author hp
 */
public class Student {
    private int Roll,fee,marks;
    private String Name;

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int Roll) {
        this.Roll = Roll;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Student(int Roll, int fee, int marks, String Name) {
        this.Roll = Roll;
        this.fee = fee;
        this.marks = marks;
        this.Name = Name;
    }

    public Student() {
    }
    

   
    

}
