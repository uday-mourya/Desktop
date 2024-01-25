package com.project.clientapp;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.pojo.Student1;

public class insertstudent1 {

    public static void main(String[] args) {
        // Hibernate setup
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // User input for insertion
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter StudentId:");
        int stuid = scanner.nextInt();

        // Consume the newline character left in the buffer
        scanner.nextLine();

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Your Age:");
        int age = scanner.nextInt();

        // Consume the newline character left in the buffer
        scanner.nextLine();

        System.out.println("Enter Gender:");
        String gender = scanner.nextLine();

        System.out.println("Enter Grade:");
        float grade = scanner.nextFloat();

        // Creating a new Student1 object with user input
        Student1 person = new Student1();
        person.setStudentId(stuid);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setGender(gender);
        person.setGrade(grade);

        // Hibernate transaction for data insertion
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();

        // Closing resources
        session.close();
        sessionFactory.close();
        scanner.close();
    }
}
