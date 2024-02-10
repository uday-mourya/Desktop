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


import com.project.pojo.Employee;
public class InsertEmployeeData {

    public static void main(String[] args) {
        // Hibernate setup
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // User input for insertion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        int empId = scanner.nextInt();

        scanner.nextLine(); // Consume the newline

        System.out.println("Enter Employee Name:");
        String empName = scanner.nextLine();

        System.out.println("Enter Employee Age:");
        int empAge = scanner.nextInt();

        System.out.println("Enter Employee Salary:");
        int empSalary = scanner.nextInt();

        scanner.nextLine(); // Consume the newline

        System.out.println("Enter Employee Designation:");
        String empDesignation = scanner.nextLine();

        System.out.println("Enter Employee Address:");
        String empAddress = scanner.nextLine();

        System.out.println("Enter Employee Phone Number:");
        int empPhoneNumber = scanner.nextInt();

        // Creating a new Employee object with user input
        Employee employee = new Employee();
        employee.setEmpId(empId);
        employee.setEmpName(empName);
        employee.setEmpAge(empAge);
        employee.setEmpSalary(empSalary);
        employee.setEmpDesignation(empDesignation);
        employee.setEmpAddress(empAddress);
        employee.setEmpPhoneNumber(empPhoneNumber);

        // Hibernate transaction for data insertion
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();

        // Closing resources
        session.close();
        sessionFactory.close();
        scanner.close();
    }
}

