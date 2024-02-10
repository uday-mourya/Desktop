/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.clientapp;

import java.util.Scanner;
import com.project.Bl.VehicleBl;
/**
 *
 * @author dell
 */
public class ClientVehicle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        VehicleBl vehicleBl=new VehicleBl();
        vehicleBl.choice(sc);
    }
    
}
