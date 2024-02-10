/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Bl;

/**
 *
 * @author dell
 */

import com.project.pojo.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.util.Scanner;

public class PersonBl {

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
        System.out.println("Enter First Name:");
        String firstName = sc.next();

        System.out.println("Enter Last Name:");
        String lastName = sc.next();

        System.out.println("Enter Date of Birth (in yyyy-MM-dd format):");
        String dateOfBirthStr = sc.next();
        Date dateOfBirth = Date.valueOf(dateOfBirthStr);

        System.out.println("Enter Email:");
        String email = sc.next();

        System.out.println("Enter Phone Number:");
        String phoneNumber = sc.next();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setDateOfBirth(dateOfBirth);
        person.setEmail(email);
        person.setPhoneNumber(phoneNumber);
        person.setAddress(address);

        Transaction transaction = session.beginTransaction();

        session.save(person);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void delete(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Person ID:");
        int personId = sc.nextInt();

        Person person = new Person();
        person.setPersonId(personId);

        Transaction transaction = session.beginTransaction();

        session.delete(person);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void update(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Person ID:");
        int personId = sc.nextInt();

        Person person = (Person) session.get(Person.class, personId);

        if (person != null) {
            System.out.println("Enter new First Name:");
            String newFirstName = sc.next();

            System.out.println("Enter new Last Name:");
            String newLastName = sc.next();

            System.out.println("Enter new Date of Birth (in yyyy-MM-dd format):");
            String newDateOfBirthStr = sc.next();
            Date newDateOfBirth = Date.valueOf(newDateOfBirthStr);

            System.out.println("Enter new Email:");
            String newEmail = sc.next();

            System.out.println("Enter new Phone Number:");
            String newPhoneNumber = sc.next();

            sc.nextLine(); // Consume the newline

            System.out.println("Enter new Address:");
            String newAddress = sc.nextLine();

            person.setFirstName(newFirstName);
            person.setLastName(newLastName);
            person.setDateOfBirth(newDateOfBirth);
            person.setEmail(newEmail);
            person.setPhoneNumber(newPhoneNumber);
            person.setAddress(newAddress);

            Transaction transaction = session.beginTransaction();

            session.update(person);
            transaction.commit();
            System.out.println("Person updated successfully!");
        } else {
            System.out.println("Person not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void display(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Person ID:");
        int personId = sc.nextInt();

        Person person = (Person) session.get(Person.class, personId);

        if (person != null) {
            System.out.println("Person details:");
            System.out.println("ID: " + person.getPersonId());
            System.out.println("First Name: " + person.getFirstName());
            System.out.println("Last Name: " + person.getLastName());
            System.out.println("Date of Birth: " + person.getDateOfBirth());
            System.out.println("Email: " + person.getEmail());
            System.out.println("Phone Number: " + person.getPhoneNumber());
            System.out.println("Address: " + person.getAddress());
        } else {
            System.out.println("Person not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }
}
