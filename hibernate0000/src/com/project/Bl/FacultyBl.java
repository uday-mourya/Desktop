/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Bl;

/**
 *
 * @author dell
 */
import com.project.pojo.Faculty;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.util.Scanner;

public class FacultyBl {

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

        System.out.println("Enter Department:");
        String department = sc.next();

        System.out.println("Enter Position:");
        String position = sc.next();

        System.out.println("Enter Joining Date (in yyyy-MM-dd format):");
        String joiningDateStr = sc.next();
        Date joiningDate = Date.valueOf(joiningDateStr);

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        Faculty faculty = new Faculty();
        faculty.setFirstName(firstName);
        faculty.setLastName(lastName);
        faculty.setDepartment(department);
        faculty.setPosition(position);
        faculty.setJoiningDate(joiningDate);
        faculty.setSalary(salary);

        Transaction transaction = session.beginTransaction();

        session.save(faculty);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void delete(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Faculty ID:");
        int facultyId = sc.nextInt();

        Faculty faculty = new Faculty();
        faculty.setFacultyId(facultyId);

        Transaction transaction = session.beginTransaction();

        session.delete(faculty);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void update(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Faculty ID:");
        int facultyId = sc.nextInt();

        Faculty faculty = new Faculty();
        faculty.setFacultyId(facultyId);
        if (faculty != null) {
            System.out.println("Enter new First Name:");
            String newFirstName = sc.next();

            System.out.println("Enter new Last Name:");
            String newLastName = sc.next();

            System.out.println("Enter new Department:");
            String newDepartment = sc.next();

            System.out.println("Enter new Position:");
            String newPosition = sc.next();

            System.out.println("Enter new Joining Date (in yyyy-MM-dd format):");
            String newJoiningDateStr = sc.next();
            Date newJoiningDate = Date.valueOf(newJoiningDateStr);

            System.out.println("Enter new Salary:");
            double newSalary = sc.nextDouble();

            faculty.setFirstName(newFirstName);
            faculty.setLastName(newLastName);
            faculty.setDepartment(newDepartment);
            faculty.setPosition(newPosition);
            faculty.setJoiningDate(newJoiningDate);
            faculty.setSalary(newSalary);

            Transaction transaction = session.beginTransaction();

            session.update(faculty);
            transaction.commit();
            System.out.println("Faculty updated successfully!");
        } else {
            System.out.println("Faculty not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void display(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Faculty ID:");
        int facultyId = sc.nextInt();

        Faculty faculty = new Faculty();
        faculty.setFacultyId(facultyId);
        if (faculty != null) {
            System.out.println("Faculty details:");
            System.out.println("ID: " + faculty.getFacultyId());
            System.out.println("First Name: " + faculty.getFirstName());
            System.out.println("Last Name: " + faculty.getLastName());
            System.out.println("Department: " + faculty.getDepartment());
            System.out.println("Position: " + faculty.getPosition());
            System.out.println("Joining Date: " + faculty.getJoiningDate());
            System.out.println("Salary: " + faculty.getSalary());
        } else {
            System.out.println("Faculty not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }
}
