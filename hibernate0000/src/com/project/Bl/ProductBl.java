/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Bl;

/**
 *
 * @author dell
 */
import com.project.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class ProductBl {

    public static void choice(Scanner sc) {
        System.out.println("\tEnter 1 for insert");
        System.out.println("\tEnter 2 for Delete");
        System.out.println("\tEnter 3 for Update");
        System.out.println("\tEnter 4 for check data");
        System.out.println("\tEnter 5 for Exit");

        int a = sc.nextInt();

        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        if (a == 1) {
            insert(sf, sc, session);
        } else if (a == 2) {
            delete(sf, sc, session);
        } else if (a == 3) {
            update(sf, sc, session);
        } else if (a == 4) {
            display(sf, sc, session);
        } else if (a == 5) {
            System.exit(0);
        } else {
            System.out.println("Enter a valid number");
            choice(sc);
        }
    }

    public static void insert(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Product Name:");
        String productName = sc.next();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Description:");
        String description = sc.next();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        System.out.println("Enter Stock Quantity:");
        int stockQuantity = sc.nextInt();

        System.out.println("Enter Manufacturer:");
        String manufacturer = sc.next();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Category:");
        String category = sc.next();

        Product product = new Product();
        product.setProductName(productName);
        product.setDescription(description);
        product.setPrice(price);
        product.setStockQuantity(stockQuantity);
        product.setManufacturer(manufacturer);
        product.setCategory(category);

        Transaction transaction = session.beginTransaction();

        session.save(product);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void delete(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Product ID:");
        int productId = sc.nextInt();

        Product product = new Product();
        product.setProductId(productId);

        Transaction transaction = session.beginTransaction();

        session.delete(product);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void update(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Product ID:");
        int productId = sc.nextInt();

        Product product = (Product) session.get(Product.class, productId);

        if (product != null) {
            System.out.println("Enter new Product Name:");
            String newProductName = sc.next();

            System.out.println("Enter new Description:");
            String newDescription = sc.next();

            System.out.println("Enter new Price:");
            double newPrice = sc.nextDouble();

            System.out.println("Enter new Stock Quantity:");
            int newStockQuantity = sc.nextInt();

            System.out.println("Enter new Manufacturer:");
            String newManufacturer = sc.next();

            System.out.println("Enter new Category:");
            String newCategory = sc.next();

            product.setProductName(newProductName);
            product.setDescription(newDescription);
            product.setPrice(newPrice);
            product.setStockQuantity(newStockQuantity);
            product.setManufacturer(newManufacturer);
            product.setCategory(newCategory);

            Transaction transaction = session.beginTransaction();

            session.update(product);
            transaction.commit();
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void display(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Product ID:");
        int productId = sc.nextInt();

        Product product = (Product) session.get(Product.class, productId);

        if (product != null) {
            System.out.println("Product details:");
            System.out.println("ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Stock Quantity: " + product.getStockQuantity());
            System.out.println("Manufacturer: " + product.getManufacturer());
            System.out.println("Category: " + product.getCategory());
        } else {
            System.out.println("Product not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }
}
