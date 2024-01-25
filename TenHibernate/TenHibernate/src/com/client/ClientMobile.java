/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.client;

import com.pojo.MobilePOJO;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author user
 */
public class ClientMobile {

    public static void main(String[] args) {
        Configuration config = new Configuration();// --> 1 Configuration
        config.configure();//--> call configure Method
        SessionFactory sf = config.buildSessionFactory(); // -->get SessionFactory Object
        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            System.out.println("Press 1 for insert  data : ");
            System.out.println("Press 2 for update data : ");
            System.out.println("Press 3 for delete data : ");
            System.out.println("Press 4 for Exit");
            choice = sc.nextInt();
            if (choice == 1) {
                sc.nextLine(); // Consume the newline character left by nextInt()
                System.out.print("Enter brand: ");
                String brand = sc.nextLine();
                System.out.print("Enter model: ");
                String model = sc.nextLine();
                System.out.print("Enter storage capacity in GB: ");
                int storageCapacity = sc.nextInt();
                System.out.print("Enter RAM size in GB: ");
                int ramSize = sc.nextInt();
                System.out.print("Enter price: ");
                float price = sc.nextFloat();
                sc.nextLine(); // Consume the newline character left by nextFloat()
                System.out.print("Enter color: ");
                String color = sc.nextLine();

                // Create MobilePOJO object
                MobilePOJO mobile = new MobilePOJO();
                mobile.setBrand(brand);
                mobile.setModel(model);
                mobile.setStorageCapacity(storageCapacity);
                mobile.setRamSize(ramSize);
                mobile.setPrice(price);
                mobile.setColor(color);
                Session ss = sf.openSession();
                Transaction ts = ss.beginTransaction(); // get Transaction object
                try {
                    ss.save(mobile);
                    ts.commit();
                    System.out.println("\nSuccessFully Entered\n");
                } catch (Exception e) {
                    System.out.println("\nUnSucessFull\n");
                }
                ss.clear();
                ss.close();

            } else if (choice == 2) {

            } else if (choice == 3) {

            }

        } while (choice != 4);
    }
}
