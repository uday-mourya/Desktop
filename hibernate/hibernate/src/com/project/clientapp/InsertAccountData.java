/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.clientapp;

/**
 *
 * @author dell
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.Scanner;

import com.project.pojo.Account;

public class InsertAccountData {

    public static void main(String[] args) {
        // Hibernate setup
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // User input for insertion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter Account Type:");
        String accountType = scanner.nextLine();

        System.out.println("Enter Initial Balance:");
        double balance = scanner.nextDouble();

        // Clear the buffer
        scanner.nextLine();

        System.out.println("Enter Account Holder's Name:");
        String holderName = scanner.nextLine();

        System.out.println("Enter Status (Active/Inactive):");
        String status = scanner.nextLine();

        // Creating a new Account object with user input
        Account account = new Account();
        account.setAccountNumber(accountNumber);
        account.setAccountType(accountType);
        account.setBalance(balance);
        account.setHolderName(holderName);
        account.setOpenDate(new Date()); // Using the current date as open date
        account.setStatus(status);

        // Hibernate transaction for data insertion
        Transaction transaction = session.beginTransaction();
        session.save(account);
        transaction.commit();

        // Closing resources
        session.close();
        sessionFactory.close();
        scanner.close();
    }
}
