package com.project.clientapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;


import com.project.pojo.Vehicle;
public class InsertVehicleData {

    public static void main(String[] args) {
        // Hibernate setup
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // User input for insertion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Vehicle Company:");
        String company = scanner.nextLine();

        System.out.println("Enter Vehicle Model:");
        String model = scanner.nextLine();

        System.out.println("Enter Vehicle Year:");
        int year = scanner.nextInt();

        scanner.nextLine(); // Consume the newline

        System.out.println("Enter Vehicle Color:");
        String color = scanner.nextLine();

        System.out.println("Enter Vehicle Registration Number:");
        String registrationNumber = scanner.nextLine();

        System.out.println("Enter Owner Name:");
        String ownerName = scanner.nextLine();

        // Creating a new Vehicle object with user input
        Vehicle vehicle = new Vehicle();
        vehicle.setCompany(company);
        vehicle.setModel(model);
        vehicle.setYear(year);
        vehicle.setColor(color);
        vehicle.setRegistrationNumber(registrationNumber);
        vehicle.setOwnerName(ownerName);

        // Hibernate transaction for data insertion
        Transaction transaction = session.beginTransaction();
        session.save(vehicle);
        transaction.commit();

        // Closing resources
        session.close();
        sessionFactory.close();
        scanner.close();
    }
}

