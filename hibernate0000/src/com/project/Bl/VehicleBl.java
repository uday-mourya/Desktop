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
public class VehicleBl {

    public static void choice(Scanner sc) {
        System.out.println("\tEnter 1 for insert");
        System.out.println("\tEnter 2 for Delete");
        System.out.println("\tEnter 3 for Update");
        System.out.println("\tEnter 4 for check data");
        System.out.println("\t Enter 5 for Exit");

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
            System.out.println("Enter valid number");
            choice(sc);
        }
    }

    public static void insert(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Vehicle id");
        int id = sc.nextInt();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Vehicle Company:");
        String company = sc.nextLine();

        sc.nextLine(); // Consume the newline

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

        Vehicle vehi = new Vehicle(id, company, model, year, color, registrationNumber, ownerName);

        Transaction transaction = session.beginTransaction();

        session.save(vehi);
        transaction.commit();

//        close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void delete(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Vehicle ID:");
        int id = sc.nextInt();
        sc.nextLine(); // Consume the newline

        Vehicle vehi = (Vehicle) session.get(Vehicle.class, id);

        if (vehi == null) {
            System.out.println("Vehicle not found with ID: " + id);
            return;
        }

        Transaction transaction = session.beginTransaction();
        session.delete(vehi);
        transaction.commit();

        System.out.println("Vehicle with ID " + id + " deleted successfully!");

        // close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void update(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Vehicle ID:");
        int id = sc.nextInt();
        sc.nextLine(); // Consume the newline

        Vehicle vehi = (Vehicle) session.get(Vehicle.class, id);

        if (vehi == null) {
            System.out.println("Vehicle not found with ID: " + id);
            return;
        }

        System.out.println("Enter updated Vehicle Company:");
        String updatedCompany = sc.nextLine();
        vehi.setCompany(updatedCompany);

        System.out.println("Enter updated Vehicle Model:");
        String updatedModel = sc.nextLine();
        vehi.setModel(updatedModel);

        System.out.println("Enter updated Vehicle Year:");
        int updatedYear = sc.nextInt();
        vehi.setYear(updatedYear);

        sc.nextLine(); // Consume the newline

        System.out.println("Enter updated Vehicle Color:");
        String updatedColor = sc.nextLine();
        vehi.setColor(updatedColor);

        System.out.println("Enter updated Vehicle Registration Number:");
        String updatedRegistrationNumber = sc.nextLine();
        vehi.setRegistrationNumber(updatedRegistrationNumber);

        System.out.println("Enter updated Owner Name:");
        String updatedOwnerName = sc.nextLine();
        vehi.setOwnerName(updatedOwnerName);

        Transaction transaction = session.beginTransaction();
        session.update(vehi);
        transaction.commit();

        System.out.println("Vehicle with ID " + id + " updated successfully!");

        // close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void display(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Vehicle ID:");
        int id = sc.nextInt();

        Vehicle vehi = (Vehicle) session.get(Vehicle.class, id);

        if (vehi != null) {
            System.out.println("Vehicle details:");
            System.out.println("ID: " + vehi.getVehicleId());
            System.out.println("Company: " + vehi.getCompany());
            System.out.println("Model: " + vehi.getModel());
            System.out.println("Year: " + vehi.getYear());
            System.out.println("Color: " + vehi.getColor());
            System.out.println("Registration Number: " + vehi.getRegistrationNumber());
            System.out.println("Owner Name: " + vehi.getOwnerName());
        } else {
            System.out.println("Vehicle not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

}
