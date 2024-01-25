/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.client;

import com.pojo.FacultyPOJO;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.pojo.FacultyPOJO;

/**
 *
 * @author user
 */
public class ClientFaculty {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int choice;
        Configuration config = new Configuration().configure();
        SessionFactory sf = config.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction ts = ss.beginTransaction();

        System.out.println("Press 1 for insert data: ");
        System.out.println("Press 2 for update data: ");
        System.out.println("Press 3 for delete data: ");
        System.out.println("Press 4 for Exit");
        choice = sc.nextInt();

        if (choice == 1) {
            sc.nextLine();
            System.out.print("Enter Faculty First Name: ");
            String firstName = sc.nextLine();
            System.out.print("Enter Faculty Last Name: ");
            String lastName = sc.nextLine();
            System.out.print("Enter Faculty Email: ");
            String email = sc.nextLine();
            System.out.print("Enter Faculty Phone Number: ");
            String phoneNumber = sc.nextLine();
            System.out.print("Enter Faculty Department: ");
            String department = sc.nextLine();
            System.out.print("Enter Faculty Salary: ");
            double salary = sc.nextDouble();
            FacultyPOJO faculty=new FacultyPOJO(firstName, lastName, email, phoneNumber, department, salary);
            
            ss.save(faculty);
            ts.commit();
            FacultyPOJO retrievedFruit = (FacultyPOJO)ss.get(FacultyPOJO.class, faculty.getFacultyId());
            System.out.println("Retrieved Faculty: " + retrievedFruit);
        }

        ss.close();
    

    }
}
