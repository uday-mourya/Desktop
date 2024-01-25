/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class InsertFruitData {

    public static void main(String[] args) {
        // Hibernate setup
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // User input for insertion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fruit Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Fruit Color:");
        String color = scanner.nextLine();

        System.out.println("Enter Fruit Taste:");
        String taste = scanner.nextLine();

        System.out.println("Enter Fruit Origin:");
        String origin = scanner.nextLine();

        System.out.println("Enter Fruit Price:");
        double price = scanner.nextDouble();

        System.out.println("Enter Quantity in Stock:");
        int quantityInStock = scanner.nextInt();

        // Creating a new Fruit object with user input
        Fruit fruit = new Fruit();
        fruit.setName(name);
        fruit.setColor(color);
        fruit.setTaste(taste);
        fruit.setOrigin(origin);
        fruit.setPrice(price);
        fruit.setQuantityInStock(quantityInStock);

        // Hibernate transaction for data insertion
        Transaction transaction = session.beginTransaction();
        session.save(fruit);
        transaction.commit();

        // Closing resources
        session.close();
        sessionFactory.close();
        scanner.close();
    }
}

