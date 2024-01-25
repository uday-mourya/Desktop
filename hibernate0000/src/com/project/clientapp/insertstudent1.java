package com.project.clientapp;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.pojo.Student1;

public class insertstudent1 {

    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.configure();
        SessionFactory sf = config.buildSessionFactory();
        Session ss = sf.openSession();

        Scanner scanner = new Scanner(System.in);
        
        
        int ch;
        do {

            System.out.println("Enter your choice 1-5");

            System.out.println("1.insert");
            System.out.println("2.read");
            System.out.println("3.update");
            System.out.println("4.delete");
            System.out.println("5.exit");

            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    Transaction t = ss.beginTransaction();

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

                    Student1 s = new Student1(stuid, firstName, lastName, age, gender, grade);
                    ss.save(s);
                    t.commit();
                    break;

                case 2:
                    System.out.println("Enter StudentId:");
                    stuid = scanner.nextInt();

                    scanner.nextLine();
                    s = (Student1) ss.get(Student1.class, stuid);
                    if (s == null) {
                        System.out.println("roll no. not found");
                    } else {
                        System.out.println("------------------");
                        System.out.println("Id    : " + s.getStudentId());
                        System.out.println("Name  : " + s.getFirstName());
                        System.out.println("Class : " + s.getLastName());
                        System.out.println("Id    : " + s.getAge());
                        System.out.println("Class : " + s.getGender());
                        System.out.println("Id    : " + s.getGrade());

                        System.out.println("------------------");

                    }
                    break;

                case 3:

                    t = ss.beginTransaction();

                    System.out.println("Enter StudentId:");
                    stuid = scanner.nextInt();

                    // Consume the newline character left in the buffer
                    scanner.nextLine();

                    System.out.println("Enter First Name:");
                    firstName = scanner.nextLine();

                    System.out.println("Enter Last Name:");
                    lastName = scanner.nextLine();

                    System.out.println("Enter Your Age:");
                    age = scanner.nextInt();

                    // Consume the newline character left in the buffer
                    scanner.nextLine();

                    System.out.println("Enter Gender:");
                    gender = scanner.nextLine();

                    System.out.println("Enter Grade:");
                    grade = scanner.nextFloat();

                    s = new Student1(stuid, firstName, lastName, age, gender, grade);
                    ss.update(s);
                    System.out.println("Data updated....");
                    t.commit();
                    break;

                case 4:

                    System.out.println("Enter StudentId:");
                    stuid = scanner.nextInt();

                    s = (Student1) ss.get(Student1.class, stuid);
                    if (s == null) {
                        System.out.println("roll no. not found");
                    } else {
                        t = ss.beginTransaction();
                        ss.delete(s);
                        System.out.println("successfully deleted");
                        t.commit();
                    }
                    break;

                case 5:

                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;

            }
        } while (ch < 6);
        if (ss != null) {
            ss.close();
        }
    }
}
