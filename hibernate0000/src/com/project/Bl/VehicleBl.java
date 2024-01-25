/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Bl;

import com.project.pojo.Vehicle;
import java.util.Scanner;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
  
/**
 *
 * @author dell
 */
public class VehicleBl 
{
    public static void choice(Scanner sc){
         System.out.println("\tEnter 1 for insert");
        System.out.println("\tEnter 2 for update");
         System.out.println("\tEnter 3 for Delete");
        System.out.println("\tEnter 4 for Exite");
        System.out.println("\t Enter 5 for check data");
       

        int a = sc.nextInt();

        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session=sf.openSession();

        
        
        
        
        if (a == 2) {
//            update(sf, sc);
        } else if (a == 1) {
            insert(sf, sc,session);
        } else if (a == 4) {
            System.exit(0);
        } else if (a == 3) {
//            delete(sf, sc);
        } 
        else if(a==5){
//            display(sf,sc);
        }
        else {
            System.out.println("Enter valid number");
            choice(sc);
        }
    }
    
    public static void insert(SessionFactory sf,Scanner sc,Session session){
         System.out.println("Enter Vehicle Company:");
         int id = sc.nextInt();
        
         System.out.println("Enter Vehicle Company:");
        String company = sc.nextLine();

        System.out.println("Enter Vehicle Model:");
        String model = sc.nextLine();

        System.out.println("Enter Vehicle Year:");
        int year = sc.nextInt();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Vehicle Color:");
        String color = sc.nextLine();

        System.out.println("Enter Vehicle Registration Number:");
        String registrationNumber = sc.nextLine();

        System.out.println("Enter Owner Name:");
        String ownerName = sc.nextLine();
        

        
        Vehicle vehi=new Vehicle(id,company,model,year,color,registrationNumber,ownerName);

        Transaction transaction = session.beginTransaction();

        session.save(vehi);
        transaction.commit();;
        
        
//        close resources
        session.close();
        sf.close();;
        sc.close();;
    }
    
}
