package com.project.Bl;

import com.project.pojo.Student1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class StudentBl {

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

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Enter Gender:");
        String gender = sc.next();

        System.out.println("Enter Grade:");
        float grade = sc.nextFloat();

       Student1 student = new Student1();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setAge(age);
        student.setGender(gender);
        student.setGrade(grade);

        Transaction transaction = session.beginTransaction();

        session.save(student);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void delete(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Student ID:");
        int studentId = sc.nextInt();

        Student1 student = new Student1();
        student.setStudentId(studentId);

        Transaction transaction = session.beginTransaction();

        session.delete(student);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void update(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Student ID:");
        int studentId = sc.nextInt();

        Student1 student = (Student1) session.get(Student1.class, studentId);

        if (student != null) {
            System.out.println("Enter new First Name:");
            String newFirstName = sc.next();

            System.out.println("Enter new Last Name:");
            String newLastName = sc.next();

            System.out.println("Enter new Age:");
            int newAge = sc.nextInt();

            System.out.println("Enter new Gender:");
            String newGender = sc.next();

            System.out.println("Enter new Grade:");
            float newGrade = sc.nextFloat();

            student.setFirstName(newFirstName);
            student.setLastName(newLastName);
            student.setAge(newAge);
            student.setGender(newGender);
            student.setGrade(newGrade);

            Transaction transaction = session.beginTransaction();

            session.update(student);
            transaction.commit();
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void display(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Student ID:");
        int studentId = sc.nextInt();

        Student1 student = (Student1) session.get(Student1.class, studentId);

        if (student != null) {
            System.out.println("Student details:");
            System.out.println("ID: " + student.getStudentId());
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Gender: " + student.getGender());
            System.out.println("Grade: " + student.getGrade());
        } else {
            System.out.println("Student not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }
}
