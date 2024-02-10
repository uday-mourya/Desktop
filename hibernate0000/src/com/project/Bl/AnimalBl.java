package com.project.Bl;

import com.project.pojo.Animal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class AnimalBl {

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

        System.out.println("Enter Animal ID:");
        int animalId = sc.nextInt();

        System.out.println("Enter Species:");
        String species = sc.next();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Color:");
        String color = sc.nextLine();

        System.out.println("Enter Weight:");
        double weight = sc.nextDouble();

        Animal animal = new Animal(animalId, species, name, age, color, weight);

        Transaction transaction = session.beginTransaction();

        session.save(animal);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void delete(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Animal ID:");
        int animalId = sc.nextInt();

        Animal animal = new Animal();
        animal.setAnimalId(animalId);

        Transaction transaction = session.beginTransaction();

        session.delete(animal);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void update(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Animal ID:");
        int animalId = sc.nextInt();

        Animal animal = (Animal) session.get(Animal.class, animalId);

        if (animal != null) {
            System.out.println("Enter new Species:");
            String newSpecies = sc.nextLine();

            System.out.println("Enter new Name:");
            String newName = sc.nextLine();

            System.out.println("Enter new Age:");
            int newAge = sc.nextInt();

            sc.nextLine(); // Consume the newline

            System.out.println("Enter new Color:");
            String newColor = sc.nextLine();

            System.out.println("Enter new Weight:");
            double newWeight = sc.nextDouble();

            animal.setSpecies(newSpecies);
            animal.setName(newName);
            animal.setAge(newAge);
            animal.setColor(newColor);
            animal.setWeight(newWeight);

            Transaction transaction = session.beginTransaction();

            session.update(animal);
            transaction.commit();
            System.out.println("Animal updated successfully!");
        } else {
            System.out.println("Animal not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void display(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Animal ID:");
        int animalId = sc.nextInt();

        Animal animal = (Animal) session.get(Animal.class, animalId);

        if (animal != null) {
            System.out.println("Animal details:");
            System.out.println("ID: " + animal.getAnimalId());
            System.out.println("Species: " + animal.getSpecies());
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            System.out.println("Color: " + animal.getColor());
            System.out.println("Weight: " + animal.getWeight());
        } else {
            System.out.println("Animal not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }
}
