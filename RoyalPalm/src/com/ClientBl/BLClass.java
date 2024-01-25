/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ClientBl;

import com.model.Account;
import com.model.Animal;
import com.model.Fruit;
import com.model.Mobile;
import com.model.Person;
import com.model.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BLClass {

    public static void work(Scanner sc) {
        System.out.println("Choose a table to work with:");
        System.out.println("1. Student");
        System.out.println("2. Animal");
        System.out.println("3. Mobile");
        System.out.println("4. Person");
        System.out.println("5. Account");
        System.out.println("6. Fruit");
        System.out.println("0. Exit");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Working with the Student table.");
                choice(sc, choice);
                break;

            case 2:
                System.out.println("Working with the Animal table.");
                choice(sc, choice);
                break;

            case 3:
                System.out.println("Working with the Mobile table.");
                choice(sc, choice);
                break;

            case 4:
                System.out.println("Working with the Person table.");
                choice(sc, choice);
                break;

            case 5:
                System.out.println("Working with the Account table.");
                choice(sc, choice);
                break;
            case 6:
                System.out.println("Working with the Fruit table.");
                choice(sc, choice);
                break;

            case 0:
                System.exit(choice);
                break;

            default:
                System.out.println("Invalid choice. Exiting.");
        }
    }

    public static void choice(Scanner sc, int choice) {
        System.out.println("\tEnter 1 for insert");
        System.out.println("\tEnter 2 for update");
        System.out.println("\tEnter 3 for Delete");
        System.out.println("\tEnter 4 for Exit");
        System.out.println("\tEnter 5 for Data");

        int a = sc.nextInt();

        Configuration cfg = new Configuration();
        cfg.configure("com/Hibernate/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();

        switch (a) {
            case 2:
                update(sf, sc, choice);
                break;
            case 1:
                insert(sf, sc, choice);
                break;
            case 4:
                System.exit(0);
            case 3:
                delete(sf, sc, choice);
                break;
            case 5:
                display(sf, sc, choice);
                break;
            default:
                System.out.println("Enter a valid number");
                choice(sc, choice);
        }
    }

    public static void insert(SessionFactory sf, Scanner sc, int tableChoice) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        switch (tableChoice) {
            case 1:
                insertStudent(session, sc);
                break;
            case 2:
                insertAnimal(session, sc);
                break;
            case 3:
                insertMobile(session, sc);
                break;
            case 4:
                insertPerson(session, sc);
                break;
            case 5:
                insertAccount(session, sc);
                break;
            case 6:
                insertFruit(session, sc);
                break;
            default:
                System.out.println("Invalid table choice.");
                transaction.rollback();
                break;
        }

        transaction.commit();
        session.close();
        work(sc);
    }

    public static void update(SessionFactory sf, Scanner sc, int tableChoice) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        switch (tableChoice) {
            case 1:
                updateStudent(session, sc);
                break;
            case 2:
                updateAnimal(session, sc);
                break;
            case 3:
                updateMobile(session, sc);
                break;
            case 4:
                updatePerson(session, sc);
                break;
            case 5:
                updateAccount(session, sc);
                break;
            case 6:
                updateFruit(session, sc);
                break;
            default:
                System.out.println("Invalid table choice.");
                transaction.rollback();
                break;
        }

        transaction.commit();
        session.close();
    }

    public static void delete(SessionFactory sf, Scanner sc, int tableChoice) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        switch (tableChoice) {
            case 1:
                deleteStudent(session, sc);
                break;
            case 2:
                deleteAnimal(session, sc);
                break;
            case 3:
                deleteMobile(session, sc);
                break;
            case 4:
                deletePerson(session, sc);
                break;
            case 5:
                deleteAccount(session, sc);
                break;
            case 6:
                deleteFruit(session, sc);
                break;
            default:
                System.out.println("Invalid table choice.");
                transaction.rollback();
                break;
        }

        transaction.commit();
        session.close();
    }

    
    
    public static void display(SessionFactory sf, Scanner sc, int tableChoice) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        switch (tableChoice) {
            case 1:
                displayStudent(session, sc);
                break;
            case 2:
                displayStudent(session, sc);
                break;
            case 3:
                deleteMobile(session, sc);
                break;
            case 4:
                deletePerson(session, sc);
                break;
            case 5:
                deleteAccount(session, sc);
                break;
            case 6:
                deleteFruit(session, sc);
                break;
            default:
                System.out.println("Invalid table choice.");
                transaction.rollback();
                break;
        }

        transaction.commit();
        session.close();

    }

//    private static void displayStudent(Session session, Scanner sc) {
//        System.out.println("Enter Roll You Want to Retrieve");
//        int roll = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("What information do you want to retrieve?");
//        System.out.println("1. Name");
//        System.out.println("2. Fee");
//        System.out.println("3. Marks");
//        System.out.print("Enter your choice (1, 2, or 3): ");
//        int choice = sc.nextInt();
//
//        Transaction ts = session.beginTransaction();
//        String hql = "";
//        switch (choice) {
//            case 1:
//                hql = "SELECT name FROM Student WHERE roll = :roll";
//                break;
//            case 2:
//                hql = "SELECT fee FROM Student WHERE roll = :roll";
//                break;
//            case 3:
//                hql = "SELECT marks FROM Student WHERE roll = :roll";
//                break;
//            default:
//                System.out.println("Invalid choice");
//                ts.rollback();
//        }
//
//        if (!hql.isEmpty()) {
//            Query query = session.createQuery(hql);
//            query.setParameter("roll", roll);
//
//            List<?> resultList = query.list();
//            ts.commit();
//
//            if (!resultList.isEmpty()) {
//                System.out.println("Result:");
//                System.out.println(resultList.get(0));
//            } else {
//                System.out.println("No matching record found for the provided roll number.");
//            }
//        }
//
//        session.close();
//        work(sc);
//    }
    
 

    public static void displayStudent(Session ss, Scanner sc) {
        System.out.println("What information do you want to display?");
        System.out.println("1. Display All Students");
        System.out.println("2. Display by Roll");
        System.out.println("3. Display by Name");
        System.out.println("4. Display by Marks");
        System.out.println("5. Display by Fees");
        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();

        String hql = "";
        Class<?> resultType = null;

        switch (choice) {
            case 1:
                hql = "FROM Student";
                resultType = Student.class;
                break;
            case 2:
                hql = "SELECT s.roll FROM Student s WHERE s.roll = ?";
                resultType = Integer.class;
                break;
            case 3:
                hql = "SELECT s.name FROM Student s WHERE s.name = ?";
                resultType = String.class;
                break;
            case 4:
                hql = "SELECT s.marks FROM Student s WHERE s.marks = ?";
                resultType = Integer.class;
                break;
            case 5:
                hql = "SELECT s.fee FROM Student s WHERE s.fee = ?";
                resultType = Integer.class;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        Query query = ss.createQuery(hql);

        if (choice > 1 && choice <= 5) {
            System.out.println("Enter the value:");
            if (choice == 4 || choice == 5) {
                query.setParameter(0, sc.nextInt());
            } else {
                query.setParameter(0, sc.next());
            }
        }

        List<Student> result = query.list();
        if (!result.isEmpty()) {
            if (resultType.equals(Student.class)) {
                // Displaying all students in a table format
                System.out.printf("%-10s %-20s %-10s %-10s\n", "Roll", "Name", "Marks", "Fee");
                System.out.println("-----------------------------------------------");
                for (Object obj : result) {
                    Student student = (Student) obj;
                    System.out.printf("%-10d %-20s %-10d %-10d\n",
                            student.getRoll(), student.getName(), student.getMarks(), student.getFee());
                }
            } else {
                // Displaying a specific attribute
                System.out.printf("Result: %s\n", result.get(0));
            }
        } else {
            System.out.println("No matching records found.");
        }

    }

    
    public static void insertFruit(Session ss, Scanner sc) {
        System.out.println("Enter Fruit id");
        int id = sc.nextInt();
        System.out.println("Enter Name");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter Fruit Color");
        String color = sc.nextLine();
        System.out.println("Enter Fruit Taste");
        String taste = sc.nextLine();

        System.out.println("Enter Fruit Origin");
        String origin = sc.nextLine();
        System.out.println("Enter Fruit Price");
        double price = sc.nextDouble();
        System.out.println("Enter Fruit Quantity");
        int Quantity = sc.nextInt();

        Transaction ts = ss.beginTransaction();
        Fruit fruit = new Fruit(id, Quantity, name, color, taste, origin, price);
        ss.save(fruit);
        ts.commit();
        System.out.println("Data inserted.....");
        ss.close();
        work(sc);
    }

    public static void insertStudent(Session ss, Scanner sc) {
        System.out.println("Enter Roll You Want insert");
        int r = sc.nextInt();
        System.out.println("Enter Name");
        sc.nextLine();
        String n = sc.nextLine();
        System.out.println("Enter Fee");
        int f = sc.nextInt();
        System.out.println("Enter Marks");
        int m = sc.nextInt();

        Transaction ts = ss.beginTransaction();
        Student st = new Student(r, f, m, n);
        ss.save(st);
        ts.commit();
        System.out.println("Data inserted.....");
        ss.close();
        work(sc);

    }

    public static void insertAnimal(Session ss, Scanner sc) {
        try {
            System.out.println("Enter Animal Id");
            int id = Integer.parseInt(sc.next());

            System.out.println("Enter Animal species");
            String speci = sc.next();

            System.out.println("Enter Animal Age");
            int age = Integer.parseInt(sc.next());

            System.out.println("Enter Animal Weight");
            int weight = Integer.parseInt(sc.next());

            System.out.println("Enter Animal Name");
            String name = sc.next();

            System.out.println("Enter Animal Color");
            String color = sc.next();

            Transaction st = ss.beginTransaction();
            Animal animal = new Animal();
            animal.setAnimalid(id);
            animal.setAge(age);
            animal.setColor(color);
            animal.setSpecies(speci);
            animal.setWeight(weight);
            animal.setName(name);
            ss.save(animal);
            System.out.println("Data inserted.....");
            st.commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            ss.close();

        }
    }

    public static void insertMobile(Session ss, Scanner sc) {
        System.out.println("Enter Mobile ID:");
        int mobileId = sc.nextInt();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Mobile Brand:");
        String brand = sc.nextLine();

        System.out.println("Enter Mobile Model:");
        String model = sc.nextLine();

        System.out.println("Enter Mobile Storage Capacity:");
        int storageCapacity = sc.nextInt();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Mobile Color:");
        String color = sc.nextLine();

        System.out.println("Enter Mobile Price:");
        double price = sc.nextDouble();

        sc.nextLine(); // Consume the newline

        System.out.println("Enter Mobile Release Date (YYYY-MM-DD):");
        String releaseDateStr = sc.nextLine();

        Date releaseDate = null;
        try {
            releaseDate = new SimpleDateFormat("yyyy-MM-dd").parse(releaseDateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Exiting program.");
            System.exit(1);
        }

        Mobile mobile = new Mobile();
        mobile.setMobileId(mobileId);
        mobile.setBrand(brand);
        mobile.setModel(model);
        mobile.setStorageCapacity(storageCapacity);
        mobile.setColor(color);
        mobile.setPrice(price);
        mobile.setReleaseDate(releaseDate);

        Transaction transaction = ss.beginTransaction();
        ss.save(mobile);
        transaction.commit();
        System.out.println("Data inserted.....");
        ss.close();
        work(sc);
    }

    public static void insertAccount(Session ss, Scanner sc) {
        System.out.println("Enter Account ID");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account  Name");
        String name = sc.nextLine();

        System.out.println("Enter account type ");
        String type = sc.nextLine();

        System.out.println("Enter Account number");
        String number = sc.nextLine();

        System.out.println("Enter Account  Status ");
        String status = sc.nextLine();

        System.out.println("Enter Your bank name");
        String address = sc.nextLine();

        System.out.println("Enter Your branch name");
        String branch = sc.nextLine();

        System.out.println("Enter your Account Balance");
        Double bal = sc.nextDouble();

        Transaction ts = ss.beginTransaction();
        Account acc = new Account();

        acc.setId(id);
        acc.setName(name);
        acc.setType(type);
        acc.setNumber(number);
        acc.setStatus(status);
        acc.setBank(branch);
        acc.setBranch(branch);
        acc.setBalance(bal);
        ss.save(acc);
        ts.commit();
        System.out.println("Data inserted.....");
        ss.close();
        work(sc);

    }

    public static void insertPerson(Session ss, Scanner sc) {
        System.out.println("Enter Person ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Person Name");
        String name = sc.nextLine();

        System.out.println("Enter Person Dob");
        String dob = sc.nextLine();

        System.out.println("Enter Person Email");
        String email = sc.nextLine();

        System.out.println("Enter Person Number ");
        String number = sc.nextLine();

        System.out.println("Enter Person Address");
        String address = sc.nextLine();

        Transaction ts = ss.beginTransaction();
        Person por = new Person();
        por.setId(id);
        por.setName(name);
        por.setEmail(email);
        por.setDob(dob);
        por.setNumber(number);
        por.setAddress(address);

        ss.save(por);
        ts.commit();
        System.out.println("Data inserted.....");
        ss.close();
        work(sc);

    }

    private static void updateStudent(Session session, Scanner sc) {
        System.out.println("Enter Roll You Want to Update");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.println("What information do you want to update?");
        System.out.println("1. Name");
        System.out.println("2. Fee");
        System.out.println("3. Marks");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = sc.nextInt();

        Transaction ts = session.beginTransaction();
        String hql = "";
        String update = "";

        switch (choice) {
            case 1:
                System.out.println("Enter Updated Name");
                update = sc.next();
                hql = "UPDATE Student SET name = ? WHERE roll = ?";
                break;
            case 2:
                System.out.println("Enter Updated Fee");
                update = sc.next();
                hql = "UPDATE Student SET fee = ? WHERE roll = ?";
                break;
            case 3:
                System.out.println("Enter Updated Marks");
                update = sc.next();
                hql = "UPDATE Student SET marks = ? WHERE roll = ?";
                break;
            default:
                System.out.println("Invalid choice");
                ts.rollback();
        }

        if (!hql.isEmpty()) {
            Query query = session.createQuery(hql);
            query.setParameter(0, update);
            query.setParameter(1, roll);

            int rowsUpdated = query.executeUpdate();

            ts.commit();

            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully in the database.");
            } else {
                System.out.println("No matching record found for the provided roll number.");
            }
        }

        session.close();
        work(sc);
    }

    public static void updateAnimal(Session ss, Scanner sc) {
        try {
            System.out.println("Enter Animal Id to Update:");
            int idToUpdate = Integer.parseInt(sc.next());

            Transaction ts = ss.beginTransaction();

            System.out.println("What information do you want to update?");
            System.out.println("1. Animal Species");
            System.out.println("2. Animal Age");
            System.out.println("3. Animal Weight");
            System.out.println("4. Animal Name");
            System.out.println("5. Animal Color");
            System.out.print("Enter your choice (1-5): ");

            int choice = Integer.parseInt(sc.next());

            String hql = "";
            String updatedValue = "";

            switch (choice) {
                case 1:
                    System.out.println("Enter Updated Animal Species:");
                    updatedValue = sc.next();
                    hql = "UPDATE Animal SET species = ? WHERE animalid = ?";
                    break;
                case 2:
                    System.out.println("Enter Updated Animal Age:");
                    updatedValue = sc.next();
                    hql = "UPDATE Animal SET age = ? WHERE animalid = ?";
                    break;
                case 3:
                    System.out.println("Enter Updated Animal Weight:");
                    updatedValue = sc.next();
                    hql = "UPDATE Animal SET weight = ? WHERE animalid = ?";
                    break;
                case 4:
                    System.out.println("Enter Updated Animal Name:");
                    updatedValue = sc.next();
                    hql = "UPDATE Animal SET name = ? WHERE animalid = ?";
                    break;
                case 5:
                    System.out.println("Enter Updated Animal Color:");
                    updatedValue = sc.next();
                    hql = "UPDATE Animal SET color = ? WHERE animalid = ?";
                    break;
                default:
                    System.out.println("Invalid choice");
                    ts.rollback();
                    return;
            }

            if (!hql.isEmpty()) {
                Query query = ss.createQuery(hql);
                query.setParameter(0, updatedValue);
                query.setParameter(1, idToUpdate);

                int rowsUpdated = query.executeUpdate();

                ts.commit();

                if (rowsUpdated > 0) {
                    System.out.println("Data updated successfully for Animal Id: " + idToUpdate);
                } else {
                    System.out.println("No matching record found for the provided Animal Id.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            ss.close();
            work(sc);
        }
    }

    public static void updateFruit(Session ss, Scanner sc) {
        System.out.println("Enter Fruit ID to Update");
        int id = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Transaction ts = ss.beginTransaction();

        Fruit fruit = (Fruit) ss.get(Fruit.class, id);

        if (fruit != null) {
            System.out.println("What information do you want to update?");
            System.out.println("1. Fruit Name");
            System.out.println("2. Fruit Color");
            System.out.println("3. Fruit Taste");
            System.out.println("4. Fruit Origin");
            System.out.println("5. Fruit Price");
            System.out.println("6. Fruit Quantity");
            System.out.print("Enter your choice (1-6): ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Updated Fruit Name");
                    String updatedName = sc.nextLine();
                    fruit.setName(updatedName);
                    break;
                case 2:
                    System.out.println("Enter Updated Fruit Color");
                    String updatedColor = sc.nextLine();
                    fruit.setColor(updatedColor);
                    break;
                case 3:
                    System.out.println("Enter Updated Fruit Taste");
                    String updatedTaste = sc.nextLine();
                    fruit.setTaste(updatedTaste);
                    break;
                case 4:
                    System.out.println("Enter Updated Fruit Origin");
                    String updatedOrigin = sc.nextLine();
                    fruit.setOrigin(updatedOrigin);
                    break;
                case 5:
                    System.out.println("Enter Updated Fruit Price");
                    double updatedPrice = sc.nextDouble();
                    fruit.setPrice(updatedPrice);
                    break;
                case 6:
                    System.out.println("Enter Updated Fruit Quantity");
                    int updatedQuantity = sc.nextInt();
                    fruit.setQuantity(updatedQuantity);
                    break;
                default:
                    System.out.println("Invalid choice");
                    ts.rollback();
                    ss.close();
                    return;
            }

            ss.update(fruit);
            ts.commit();
            System.out.println("updated successfully in the table.");
        } else {
            System.out.println("No matching record found for the provided Fruit ID.");
        }

        ss.close();
        work(sc);
    }

    public static void updateMobile(Session ss, Scanner sc) {
        System.out.println("Enter Mobile ID to Update:");
        int mobileId = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Transaction ts = ss.beginTransaction();

        System.out.println("What information do you want to update?");
        System.out.println("1. Mobile Brand");
        System.out.println("2. Mobile Model");
        System.out.println("3. Mobile Storage Capacity");
        System.out.println("4. Mobile Color");
        System.out.println("5. Mobile Price");
        System.out.println("6. Mobile Release Date (YYYY-MM-DD)");
        System.out.print("Enter your choice (1-6): ");

        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String hql = "";

        switch (choice) {
            case 1:
                System.out.println("Enter Updated Mobile Brand:");
                String updatedBrand = sc.nextLine();
                hql = "UPDATE Mobile SET brand = ? WHERE mobileId = ?";
                updateMobileValue(ss, ts, hql, updatedBrand, mobileId);
                work(sc);
                break;

            case 2:
                System.out.println("Enter Updated Mobile Model:");
                String updatedModel = sc.nextLine();
                hql = "UPDATE Mobile SET model = ? WHERE mobileId = ?";
                updateMobileValue(ss, ts, hql, updatedModel, mobileId);
                work(sc);
                break;

            case 3:
                System.out.println("Enter Updated Mobile Storage Capacity:");
                int updatedStorageCapacity = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                hql = "UPDATE Mobile SET storageCapacity = ? WHERE mobileId = ?";
                updateMobileValue(ss, ts, hql, updatedStorageCapacity, mobileId);
                work(sc);
                break;

            case 4:
                System.out.println("Enter Updated Mobile Color:");
                String updatedColor = sc.nextLine();
                hql = "UPDATE Mobile SET color = ? WHERE mobileId = ?";
                updateMobileValue(ss, ts, hql, updatedColor, mobileId);
                work(sc);
                break;

            case 5:
                System.out.println("Enter Updated Mobile Price:");
                double updatedPrice = sc.nextDouble();
                sc.nextLine(); // Consume the newline character
                hql = "UPDATE Mobile SET price = ? WHERE mobileId = ?";
                updateMobileValue(ss, ts, hql, updatedPrice, mobileId);
                work(sc);
                break;

            case 6:
                System.out.println("Enter Updated Mobile Release Date (YYYY-MM-DD):");
                String updatedReleaseDateStr = sc.nextLine();
                try {
                    Date updatedReleaseDate = new SimpleDateFormat("yyyy-MM-dd").parse(updatedReleaseDateStr);
                    hql = "UPDATE Mobile SET releaseDate = ? WHERE mobileId = ?";
                    updateMobileValue(ss, ts, hql, updatedReleaseDate, mobileId);
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Exiting program.");
                    ts.rollback();
                    ss.close();
                    work(sc);
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice");
                ts.rollback();
                ss.close();
                work(sc);
                return;
        }
    }

    private static void updateMobileValue(Session ss, Transaction ts, String hql, Object updatedValue, int mobileId) {
        if (!hql.isEmpty()) {
            Query query = ss.createQuery(hql);
            query.setParameter(0, updatedValue);
            query.setParameter(1, mobileId);

            int rowsUpdated = query.executeUpdate();

            ts.commit();

            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully for Mobile ID: " + mobileId);
            } else {
                System.out.println("No matching record found for the provided Mobile ID.");
            }
        }

        ss.close();

    }

    public static void updatePerson(Session ss, Scanner sc) {
        System.out.println("Enter Person ID to Update:");
        int idToUpdate = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Transaction ts = ss.beginTransaction();

        System.out.println("What information do you want to update?");
        System.out.println("1. Person Name");
        System.out.println("2. Person Dob");
        System.out.println("3. Person Email");
        System.out.println("4. Person Number");
        System.out.println("5. Person Address");
        System.out.print("Enter your choice (1-5): ");

        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String hql = "";
        String updatedValue = "";

        switch (choice) {
            case 1:
                System.out.println("Enter Updated Person Name:");
                updatedValue = sc.nextLine();
                hql = "UPDATE Person SET name = ? WHERE id = ?";
                break;
            case 2:
                System.out.println("Enter Updated Person Dob:");
                updatedValue = sc.nextLine();
                hql = "UPDATE Person SET dob = ? WHERE id = ?";
                break;
            case 3:
                System.out.println("Enter Updated Person Email:");
                updatedValue = sc.nextLine();
                hql = "UPDATE Person SET email = ? WHERE id = ?";
                break;
            case 4:
                System.out.println("Enter Updated Person Number:");
                updatedValue = sc.nextLine();
                hql = "UPDATE Person SET number = ? WHERE id = ?";
                break;
            case 5:
                System.out.println("Enter Updated Person Address:");
                updatedValue = sc.nextLine();
                hql = "UPDATE Person SET address = ? WHERE id = ?";
                break;
            default:
                System.out.println("Invalid choice");
                ts.rollback();
                return;
        }

        if (!hql.isEmpty()) {
            Query query = ss.createQuery(hql);
            query.setParameter(0, updatedValue);
            query.setParameter(1, idToUpdate);

            int rowsUpdated = query.executeUpdate();

            ts.commit();

            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully for Person ID: " + idToUpdate);
            } else {
                System.out.println("No matching record found for the provided Person ID.");
            }
        }

        ss.close();
        work(sc);
    }

    private static void updateAccount(Session ss, Scanner sc) {
        System.out.println("Enter Account ID to Update");
        int id = sc.nextInt();
        sc.nextLine();
        Transaction ts = ss.beginTransaction();

        System.out.println("What information do you want to update?");
        System.out.println("1. Account Name");
        System.out.println("2. Account Type");
        System.out.println("3. Account Number");
        System.out.println("4. Account Status");
        System.out.println("5. Bank Name");
        System.out.println("6. Branch Name");
        System.out.println("7. Account Balance");
        System.out.print("Enter your choice (1-7): ");

        int choice = sc.nextInt();
        sc.nextLine();

        String hql = "";

        switch (choice) {
            case 1:
                System.out.println("Enter Updated Account Name");
                String updatedName = sc.nextLine();
                hql = "UPDATE Account SET name = ? WHERE id = ?";
                executeUpdate(ss, ts, hql, updatedName, id);
                break;
            case 2:
                System.out.println("Enter Updated Account Type");
                String updatedType = sc.nextLine();
                hql = "UPDATE Account SET type = ? WHERE id = ?";
                executeUpdate(ss, ts, hql, updatedType, id);
                break;
            case 3:
                System.out.println("Enter Updated Account Number");
                String updatedNumber = sc.nextLine();
                hql = "UPDATE Account SET number = ? WHERE id = ?";
                executeUpdate(ss, ts, hql, updatedNumber, id);
                break;
            case 4:
                System.out.println("Enter Updated Account Status");
                String updatedStatus = sc.nextLine();
                hql = "UPDATE Account SET status = ? WHERE id = ?";
                executeUpdate(ss, ts, hql, updatedStatus, id);
                break;
            case 5:
                System.out.println("Enter Updated Bank Name");
                String updatedBank = sc.nextLine();
                hql = "UPDATE Account SET bank = ? WHERE id = ?";
                executeUpdate(ss, ts, hql, updatedBank, id);
                break;
            case 6:
                System.out.println("Enter Updated Branch Name");
                String updatedBranch = sc.nextLine();
                hql = "UPDATE Account SET branch = ? WHERE id = ?";
                executeUpdate(ss, ts, hql, updatedBranch, id);
                break;
            case 7:
                System.out.println("Enter Updated Account Balance");
                double updatedBalance = sc.nextDouble();
                sc.nextLine(); // Consume the newline character
                hql = "UPDATE Account SET balance = ? WHERE id = ?";
                executeUpdate(ss, ts, hql, updatedBalance, id);
                break;
            default:
                System.out.println("Invalid choice");
                ts.rollback();
                ss.close();
                work(sc);
        }
    }

    private static void executeUpdate(Session ss, Transaction ts, String hql, Object updatedValue, int id) {
        if (!hql.isEmpty()) {
            Query query = ss.createQuery(hql);
            query.setParameter(0, updatedValue);
            query.setParameter(1, id);

            int rowsUpdated = query.executeUpdate();

            ts.commit();

            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully in the table.");
            } else {
                System.out.println("No matching record found for the provided Account ID.");
            }
        }
        ss.close();
    }

    public static void deleteAnimal(Session ss, Scanner sc) {
        System.out.println("Enter Animal ID You Want to Delete:");
        int id = sc.nextInt();

        Transaction ts = ss.beginTransaction();

        System.out.println("What criteria do you want to use for deletion?");
        System.out.println("1. Delete by ID");
        System.out.println("2. Delete by Species");
        System.out.println("3. Delete by Age");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = sc.nextInt();

        String hql = "DELETE FROM Animal WHERE animalId = ?";
        Object parameterValue = null;

        switch (choice) {
            case 1:
                System.out.println("Enter ID for deletion:");
                int animalId = sc.nextInt();
                hql = "DELETE FROM Animal WHERE animalId = ?";
                parameterValue = animalId;
                break;
            case 2:
                System.out.println("Enter Species for deletion:");
                String species = sc.next();
                hql = "DELETE FROM Animal WHERE animalId = ? AND species = ?";
                parameterValue = species;
                break;
            case 3:
                System.out.println("Enter Age for deletion:");
                int age = sc.nextInt();
                hql = "DELETE FROM Animal WHERE animalId = ? AND age = ?";
                parameterValue = age;
                break;
            default:
                System.out.println("Invalid choice");
                ts.rollback();
                ss.close();
                return;
        }

        Query query = ss.createQuery(hql);
        query.setParameter(0, id);
        if (parameterValue != null) {
            query.setParameter(1, parameterValue);
        }

        int rowsDeleted = query.executeUpdate();
        ts.commit();

        if (rowsDeleted > 0) {
            System.out.println("Data deleted successfully.");
        } else {
            System.out.println("No matching record found for the provided criteria.");
        }

        ss.close();
        work(sc);
    }

    public static void deletePerson(Session ss, Scanner sc) {
        System.out.println("Enter Person ID You Want to Delete:");
        int id = sc.nextInt();

        Transaction ts = ss.beginTransaction();

        System.out.println("What criteria do you want to use for deletion?");
        System.out.println("1. Delete by ID");
        System.out.println("2. Delete by Email");
        System.out.println("3. Delete by Address");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = sc.nextInt();

        String hql = "DELETE FROM Person WHERE id = ?";
        Object parameterValue = null;

        switch (choice) {
            case 1:
                System.out.println("Enter ID for deletion:");
                int personId = sc.nextInt();
                hql = "DELETE FROM Person WHERE id = ?";
                parameterValue = personId;
                break;
            case 2:
                System.out.println("Enter Email for deletion:");
                String email = sc.next();
                hql = "DELETE FROM Person WHERE id = ? AND email = ?";
                parameterValue = email;
                break;
            case 3:
                System.out.println("Enter Address for deletion:");
                String address = sc.next();
                hql = "DELETE FROM Person WHERE id = ? AND address = ?";
                parameterValue = address;
                break;
            default:
                System.out.println("Invalid choice");
                ts.rollback();
                ss.close();
                return;
        }

        Query query = ss.createQuery(hql);
        query.setParameter(0, id);
        if (parameterValue != null) {
            query.setParameter(1, parameterValue);
        }

        int rowsDeleted = query.executeUpdate();
        ts.commit();

        if (rowsDeleted > 0) {
            System.out.println("Data deleted successfully.");
        } else {
            System.out.println("No matching record found for the provided criteria.");
        }

        ss.close();
        work(sc);
    }

    public static void deleteAccount(Session ss, Scanner sc) {
        System.out.println("Enter Account ID You Want to Delete:");
        int id = sc.nextInt();

        Transaction ts = ss.beginTransaction();

        System.out.println("What criteria do you want to use for deletion?");
        System.out.println("1. Delete by ID");
        System.out.println("2. Delete by Type");
        System.out.println("3. Delete by Status");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = sc.nextInt();

        String hql = "DELETE FROM Account WHERE id = ?";
        Object parameterValue = null;

        switch (choice) {
            case 1:
                System.out.println("Deleting by ID");
                break;
            case 2:
                System.out.println("Enter Type for deletion:");
                String type = sc.next();
                hql = "DELETE FROM Account WHERE id = ? AND type = ?";
                parameterValue = type;
                break;
            case 3:
                System.out.println("Enter Status for deletion:");
                String status = sc.next();
                hql = "DELETE FROM Account WHERE id = ? AND status = ?";
                parameterValue = status;
                break;
            default:
                System.out.println("Invalid choice");
                ts.rollback();
                ss.close();
                return;
        }

        Query query = ss.createQuery(hql);
        query.setParameter(0, id);
        if (parameterValue != null) {
            query.setParameter(1, parameterValue);
        }

        int rowsDeleted = query.executeUpdate();
        ts.commit();

        if (rowsDeleted > 0) {
            System.out.println("Data deleted successfully.");
        } else {
            System.out.println("No matching record found for the provided criteria.");
        }

        ss.close();
        work(sc);
    }

    public static void deleteFruit(Session ss, Scanner sc) {
        System.out.println("Enter Fruit ID to Delete:");
        int id = sc.nextInt();

        Transaction ts = ss.beginTransaction();

        System.out.println("What criteria do you want to use for deletion?");
        System.out.println("1. Delete by ID");
        System.out.println("2. Delete by Name");
        System.out.println("3. Delete by Color");
        System.out.println("4. Delete by Taste");
        System.out.println("5. Delete by Origin");
        System.out.println("6. Delete by Price");
        System.out.println("7. Delete by Quantity");
        System.out.print("Enter your choice (1-7): ");
        int choice = sc.nextInt();

        String hql = "DELETE FROM Fruit WHERE id = ?";
        Query query = ss.createQuery(hql);
        query.setParameter(0, id);

        switch (choice) {
            case 1:
                break;
            case 2:
                hql = "DELETE FROM Fruit WHERE name = ?";
                System.out.println("Enter Fruit Name for deletion:");
                query = ss.createQuery(hql);
                query.setParameter(0, sc.next());
                break;
            case 3:
                hql = "DELETE FROM Fruit WHERE color = ?";
                System.out.println("Enter Fruit Color for deletion:");
                query = ss.createQuery(hql);
                query.setParameter(0, sc.next());
                break;
            case 4:
                hql = "DELETE FROM Fruit WHERE taste = ?";
                System.out.println("Enter Fruit Taste for deletion:");
                query = ss.createQuery(hql);
                query.setParameter(0, sc.next());
                break;
            case 5:
                hql = "DELETE FROM Fruit WHERE origin = ?";
                System.out.println("Enter Fruit Origin for deletion:");
                query = ss.createQuery(hql);
                query.setParameter(0, sc.next());
                break;
            case 6:
                hql = "DELETE FROM Fruit WHERE price = ?";
                System.out.println("Enter Fruit Price for deletion:");
                query = ss.createQuery(hql);
                query.setParameter(0, sc.nextDouble());
                break;
            case 7:
                hql = "DELETE FROM Fruit WHERE quantity = ?";
                System.out.println("Enter Fruit Quantity for deletion:");
                query = ss.createQuery(hql);
                query.setParameter(0, sc.nextInt());
                break;
            default:
                System.out.println("Invalid choice");
                ts.rollback();
                ss.close();
                return;
        }

        int rowsDeleted = query.executeUpdate();
        ts.commit();

        if (rowsDeleted > 0) {
            System.out.println("Data deleted successfully.");
        } else {
            System.out.println("No matching record found for the provided criteria.");
        }

        ss.close();
        work(sc);
    }

    public static void deleteStudent(Session ss, Scanner sc) {
        System.out.println("Enter Roll You Want to Delete:");
        int roll = sc.nextInt();

        Transaction ts = ss.beginTransaction();

        System.out.println("What criteria do you want to use for deletion?");
        System.out.println("1. Delete by ID");
        System.out.println("2. Delete by Marks");
        System.out.println("3. Delete by Fees");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = sc.nextInt();

        String hql = "DELETE FROM Student WHERE roll = ?";
        Object parameterValue = null;

        switch (choice) {
            case 1:
                System.out.println("Enter ID for deletion:");
                int id = sc.nextInt();
                hql = "DELETE FROM Student WHERE roll = ? AND id = ?";
                parameterValue = id;
                break;
            case 2:
                System.out.println("Enter Marks for deletion:");
                int marks = sc.nextInt();
                hql = "DELETE FROM Student WHERE roll = ? AND marks = ?";
                parameterValue = marks;
                break;
            case 3:
                System.out.println("Enter Fees for deletion:");
                float fees = sc.nextFloat();
                hql = "DELETE FROM Student WHERE roll = ? AND fees = ?";
                parameterValue = fees;
                break;
            default:
                System.out.println("Invalid choice");
                ts.rollback();
                ss.close();
                return;
        }

        Query query = ss.createQuery(hql);
        query.setParameter(0, roll);
        if (parameterValue != null) {
            query.setParameter(1, parameterValue);
        }

        int rowsDeleted = query.executeUpdate();
        ts.commit();

        if (rowsDeleted > 0) {
            System.out.println("Data deleted successfully.");
        } else {
            System.out.println("No matching record found for the provided criteria.");
        }

        ss.close();
        work(sc);
    }

    public static void deleteMobile(Session ss, Scanner sc) {
        System.out.println("Enter Mobile ID to Delete:");
        int mobileId = sc.nextInt();

        Transaction ts = ss.beginTransaction();

        System.out.println("What criteria do you want to use for deletion?");
        System.out.println("1. Delete by Brand");
        System.out.println("2. Delete by Color");
        System.out.println("3. Delete by Price");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = sc.nextInt();

        String hql = "DELETE FROM Mobile WHERE mobileId = ?";
        Object parameterValue = null;

        switch (choice) {
            case 1:
                System.out.println("Enter Brand for deletion:");
                String brand = sc.next();
                hql = "DELETE FROM Mobile WHERE mobileId = ? AND brand = ?";
                parameterValue = brand;
                break;
            case 2:
                System.out.println("Enter Color for deletion:");
                String color = sc.next();
                hql = "DELETE FROM Mobile WHERE mobileId = ? AND color = ?";
                parameterValue = color;
                break;
            case 3:
                System.out.println("Enter Price for deletion:");
                double price = sc.nextDouble();
                hql = "DELETE FROM Mobile WHERE mobileId = ? AND price = ?";
                parameterValue = price;
                break;
            default:
                System.out.println("Invalid choice");
                ts.rollback();
                ss.close();
                return;
        }

        Query query = ss.createQuery(hql);
        query.setParameter(0, mobileId);
        if (parameterValue != null) {
            query.setParameter(1, parameterValue);
        }

        int rowsDeleted = query.executeUpdate();
        ts.commit();

        if (rowsDeleted > 0) {
            System.out.println("Data deleted successfully.");
        } else {
            System.out.println("No matching record found for the provided criteria.");
        }

        ss.close();
        work(sc);
    }

}
