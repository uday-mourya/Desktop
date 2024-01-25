/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.client;

import com.pojo.FruitPOJO;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author user
 */
public class ClientPOJO {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();

        // Build a session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Open a session
        Session session = sessionFactory.openSession();

        // Begin a transaction
        Transaction transaction = session.beginTransaction();

        try {
           Scanner scanner = new Scanner(System.in);

            // Prompt user for fruit details
            System.out.print("Enter fruit name: ");
            String name = scanner.nextLine();

            System.out.print("Enter fruit color: ");
            String color = scanner.nextLine();

            System.out.print("Enter calories: ");
            int calories = scanner.nextInt();

            System.out.print("Enter price: ");
            float price = scanner.nextFloat();

            System.out.print("Enter season: ");
            String season = scanner.next();

            scanner.nextLine();

            System.out.print("Enter description: ");
            String description = scanner.nextLine();

            FruitPOJO newFruit = new FruitPOJO(name, color, calories, price, season, description);
            session.save(newFruit);
            transaction.commit();
            FruitPOJO retrievedFruit = (FruitPOJO)session.get(FruitPOJO.class, newFruit.getFruitId());
            System.out.println("Retrieved Fruit: " + retrievedFruit);
            session.close();
        } catch (Exception e) {
            transaction.rollback();
        } 
            
        

    }
}
