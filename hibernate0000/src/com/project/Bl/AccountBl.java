package com.project.Bl;

import com.project.pojo.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.Scanner;

public class AccountBl {

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
        System.out.println("Enter Account Number:");
        String accountNumber = sc.nextLine();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Account Type:");
        String accountType = sc.nextLine();


        System.out.println("Enter Balance:");
        double balance = sc.nextDouble();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Holder Name:");
        String holderName = sc.nextLine();

        System.out.println("Enter Account open date");
        Date openDate = new Date(); // Assuming the current date as the open date

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Status:");
        String status = sc.nextLine();

        Account bankAccount = new Account(accountNumber, accountType, balance, holderName, openDate, status);

        Transaction transaction = session.beginTransaction();

        session.save(bankAccount);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void delete(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Account Number:");
        String accountNumber = sc.nextLine();

        Account bankAccount = new Account();
        bankAccount.setAccountNumber(accountNumber);

        Transaction transaction = session.beginTransaction();

        session.delete(bankAccount);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void update(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Account Number:");
        String accountNumber = sc.nextLine();

        Account bankAccount = new Account();
        bankAccount.setAccountNumber(accountNumber);
        if (bankAccount != null) {
            System.out.println("Enter new Account Number:");
            String newAccountNumber = sc.nextLine();

            System.out.println("Enter new Account Type:");
            String newAccountType = sc.nextLine();

            System.out.println("Enter new Balance:");
            double newBalance = sc.nextDouble();

            sc.nextLine(); // Consume the newline

            System.out.println("Enter new Holder Name:");
            String newHolderName = sc.nextLine();

            System.out.println("Enter new Status:");
            String newStatus = sc.nextLine();

            bankAccount.setAccountNumber(newAccountNumber);
            bankAccount.setAccountType(newAccountType);
            bankAccount.setBalance(newBalance);
            bankAccount.setHolderName(newHolderName);
            bankAccount.setStatus(newStatus);

            Transaction transaction = session.beginTransaction();

            session.update(bankAccount);
            transaction.commit();
            System.out.println("Bank Account updated successfully!");
        } else {
            System.out.println("Bank Account not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void display(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Account Number:");
        String accountNumber = sc.nextLine();

        Account bankAccount = new Account();
        bankAccount.setAccountNumber(accountNumber);

        if (bankAccount != null) {
            System.out.println("Bank Account details:");
            System.out.println("Account Number: " + bankAccount.getAccountNumber());
            System.out.println("Account Type: " + bankAccount.getAccountType());
            System.out.println("Balance: " + bankAccount.getBalance());
            System.out.println("Holder Name: " + bankAccount.getHolderName());
            System.out.println("Open Date: " + bankAccount.getOpenDate());
            System.out.println("Status: " + bankAccount.getStatus());
        } else {
            System.out.println("Bank Account not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }
}
