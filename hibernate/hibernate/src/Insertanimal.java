/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class Insertanimal {

    public static void main(String[] args) {
        // Hibernate setup
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // User input for insertion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Animal ID:");
        int animalId = scanner.nextInt();

        scanner.nextLine(); // Consume the newline

        System.out.println("Enter Species:");
        String species = scanner.nextLine();

        System.out.println("Enter Animal Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Animal Age:");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume the newline

        System.out.println("Enter Mobile Color:");
        String color = scanner.nextLine();

        System.out.println("Enter Animal Weight:");
        double weight = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline

        // Creating a new Mobile object with user input
       Animal animal = new Animal();
        animal.setAnimalId(animalId);
        animal.setSpecies(species);
        animal.setName(name);
        animal.setAge(age);
        animal.setColor(color);
        animal.setWeight(weight);
        

        // Hibernate transaction for data insertion
        Transaction transaction = session.beginTransaction();
        session.save(animal);
        transaction.commit();

        // Closing resources
        session.close();
        sessionFactory.close();
        scanner.close();
    }
}

