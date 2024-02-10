/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Bl;

/**
 *
 * @author dell
 */
import com.project.pojo.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class EmployeeBl {

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
        System.out.println("Enter Employee Name:");
        String empName = sc.next();

        System.out.println("Enter Employee Age:");
        int empAge = sc.nextInt();

        System.out.println("Enter Employee Salary:");
        int empSalary = sc.nextInt();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Employee Designation:");
        String empDesignation = sc.nextLine();

        System.out.println("Enter Employee Address:");
        String empAddress = sc.nextLine();

        System.out.println("Enter Employee Phone Number:");
        int empPhoneNumber = sc.nextInt();

        Employee employee = new Employee();
        employee.setEmpName(empName);
        employee.setEmpAge(empAge);
        employee.setEmpSalary(empSalary);
        employee.setEmpDesignation(empDesignation);
        employee.setEmpAddress(empAddress);
        employee.setEmpPhoneNumber(empPhoneNumber);

        Transaction transaction = session.beginTransaction();

        session.save(employee);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void delete(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Employee ID:");
        int empId = sc.nextInt();

        Employee employee = new Employee();
        employee.setEmpId(empId);

        Transaction transaction = session.beginTransaction();

        session.delete(employee);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void update(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Employee ID:");
        int empId = sc.nextInt();

        Employee employee = (Employee) session.get(Employee.class, empId);

        if (employee != null) {
            System.out.println("Enter new Employee Name:");
            String newEmpName = sc.next();

            System.out.println("Enter new Employee Age:");
            int newEmpAge = sc.nextInt();

            System.out.println("Enter new Employee Salary:");
            int newEmpSalary = sc.nextInt();

            sc.nextLine(); // Consume the newline

            System.out.println("Enter new Employee Designation:");
            String newEmpDesignation = sc.nextLine();

            System.out.println("Enter new Employee Address:");
            String newEmpAddress = sc.nextLine();

            System.out.println("Enter new Employee Phone Number:");
            int newEmpPhoneNumber = sc.nextInt();

            employee.setEmpName(newEmpName);
            employee.setEmpAge(newEmpAge);
            employee.setEmpSalary(newEmpSalary);
            employee.setEmpDesignation(newEmpDesignation);
            employee.setEmpAddress(newEmpAddress);
            employee.setEmpPhoneNumber(newEmpPhoneNumber);

            Transaction transaction = session.beginTransaction();

            session.update(employee);
            transaction.commit();
            System.out.println("Employee updated successfully!");
        } else {
            System.out.println("Employee not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void display(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Employee ID:");
        int empId = sc.nextInt();

        Employee employee = (Employee) session.get(Employee.class, empId);

        if (employee != null) {
            System.out.println("Employee details:");
            System.out.println("ID: " + employee.getEmpId());
            System.out.println("Name: " + employee.getEmpName());
            System.out.println("Age: " + employee.getEmpAge());
            System.out.println("Salary: " + employee.getEmpSalary());
            System.out.println("Designation: " + employee.getEmpDesignation());
            System.out.println("Address: " + employee.getEmpAddress());
            System.out.println("Phone Number: " + employee.getEmpPhoneNumber());
        } else {
            System.out.println("Employee not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }
}
