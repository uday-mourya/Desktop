package com.project.Bl;

import com.project.pojo.Mobile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.Scanner;

public class MobileBl {

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
        System.out.println("Enter Mobile ID:");
        int mobileId = sc.nextInt();

        System.out.println("Enter Brand:");
        String brand = sc.next();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Model:");
        String model = sc.nextLine();

        System.out.println("Enter Storage Capacity:");
        int storageCapacity = sc.nextInt();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Color:");
        String color = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        System.out.println("Enter Release Date (in yyyy-MM-dd format):");
        String releaseDateStr = sc.next();
        Date releaseDate = new Date(); // Assuming the current date as the open date

        Mobile mobile = new Mobile(mobileId, brand, model, storageCapacity, color, price, releaseDate);

        Transaction transaction = session.beginTransaction();

        session.save(mobile);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void delete(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Mobile ID:");
        int mobileId = sc.nextInt();

        Mobile mobile = new Mobile();
        mobile.setMobileId(mobileId);

        Transaction transaction = session.beginTransaction();

        session.delete(mobile);
        transaction.commit();

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void update(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Mobile ID:");
        int mobileId = sc.nextInt();

        Mobile mobile = (Mobile) session.get(Mobile.class, mobileId);

        if (mobile != null) {
            System.out.println("Enter new Brand:");
            String newBrand = sc.nextLine();

            System.out.println("Enter new Model:");
            String newModel = sc.nextLine();

            System.out.println("Enter new Storage Capacity:");
            int newStorageCapacity = sc.nextInt();

            sc.nextLine(); // Consume the newline

            System.out.println("Enter new Color:");
            String newColor = sc.nextLine();

            System.out.println("Enter new Price:");
            double newPrice = sc.nextDouble();

            System.out.println("Enter new Release Date (in yyyy-MM-dd format):");
            Date newReleaseDate = new Date(); // Assuming the current date as the open date

            mobile.setBrand(newBrand);
            mobile.setModel(newModel);
            mobile.setStorageCapacity(newStorageCapacity);
            mobile.setColor(newColor);
            mobile.setPrice(newPrice);
            mobile.setReleaseDate(newReleaseDate);

            Transaction transaction = session.beginTransaction();

            session.update(mobile);
            transaction.commit();
            System.out.println("Mobile updated successfully!");
        } else {
            System.out.println("Mobile not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }

    public static void display(SessionFactory sf, Scanner sc, Session session) {
        System.out.println("Enter Mobile ID:");
        int mobileId = sc.nextInt();

        Mobile mobile = (Mobile) session.get(Mobile.class, mobileId);

        if (mobile != null) {
            System.out.println("Mobile details:");
            System.out.println("ID: " + mobile.getMobileId());
            System.out.println("Brand: " + mobile.getBrand());
            System.out.println("Model: " + mobile.getModel());
            System.out.println("Storage Capacity: " + mobile.getStorageCapacity());
            System.out.println("Color: " + mobile.getColor());
            System.out.println("Price: " + mobile.getPrice());
            System.out.println("Release Date: " + mobile.getReleaseDate());
        } else {
            System.out.println("Mobile not found!");
        }

        // Close resources
        session.close();
        sf.close();
        sc.close();
    }
}
