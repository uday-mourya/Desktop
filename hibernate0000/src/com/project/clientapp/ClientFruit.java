/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.clientapp;

import com.project.Bl.FruitBL;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class ClientFruit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FruitBL fruit = new FruitBL();
        fruit.choice(sc);
    }

}
