package com.project.Bl;

import com.project.pojo.Fruit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class FruitBL {

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
        // Create a new Fruit object
        Fruit fruit = new Fruit();

        System.out.println("Enter Fruit Name:");
        String name = sc.next();
        fruit.setName(name);

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Color:");
        String color = sc.next();
        fruit.setColor(color);

        System.out.println("Enter Taste:");
        String taste = sc.next();
        fruit.setTaste(taste);

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Origin:");
        String origin = sc.next();
        fruit.setOrigin(origin);

        System.out.println("Enter Price:");
        double price = sc.nextDouble();
        fruit.setPrice(price);

        System.out.println("Enter Quantity in Stock:");
        int quantityInStock = sc.nextInt();
        fruit.setQuantityInStock(quantityInStock);

        Transaction transaction = session.beginTransaction();

        session.save(fruit);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void delete(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Fruit ID:");
        int fruitId = sc.nextInt();

        Fruit fruit = new Fruit();
        fruit.setFruitId(fruitId);

        Transaction transaction = session.beginTransaction();

        session.delete(fruit);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void update(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Fruit ID:");
        int fruitId = sc.nextInt();

        Fruit fruit = (Fruit) session.get(Fruit.class, fruitId);

        if (fruit != null) {
            System.out.println("Enter new Fruit Name:");
            String newName = sc.nextLine();

            System.out.println("Enter new Color:");
            String newColor = sc.nextLine();

            System.out.println("Enter new Taste:");
            String newTaste = sc.nextLine();

            System.out.println("Enter new Origin:");
            String newOrigin = sc.nextLine();

            System.out.println("Enter new Price:");
            double newPrice = sc.nextDouble();

            System.out.println("Enter new Quantity in Stock:");
            int newQuantityInStock = sc.nextInt();

            fruit.setName(newName);
            fruit.setColor(newColor);
            fruit.setTaste(newTaste);
            fruit.setOrigin(newOrigin);
            fruit.setPrice(newPrice);
            fruit.setQuantityInStock(newQuantityInStock);

            Transaction transaction = session.beginTransaction();

            session.update(fruit);
            transaction.commit();
            System.out.println("Fruit updated successfully!");
        } else {
            System.out.println("Fruit not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void display(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Fruit ID:");
        int fruitId = sc.nextInt();

        Fruit fruit = (Fruit) session.get(Fruit.class, fruitId);

        if (fruit != null) {
            System.out.println("Fruit details:");
            System.out.println("ID: " + fruit.getFruitId());
            System.out.println("Name: " + fruit.getName());
            System.out.println("Color: " + fruit.getColor());
            System.out.println("Taste: " + fruit.getTaste());
            System.out.println("Origin: " + fruit.getOrigin());
            System.out.println("Price: " + fruit.getPrice());
            System.out.println("Quantity in Stock: " + fruit.getQuantityInStock());
        } else {
            System.out.println("Fruit not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }
}
