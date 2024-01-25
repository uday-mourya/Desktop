/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.client;

import com.bl.BL;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Client {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BL b=new BL(); 
        b.choice(sc,b);
    }
}
