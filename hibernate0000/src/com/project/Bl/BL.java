/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Bl;

/**
 *
 * @author dell
 */

import com.project.pojo.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 *
 * @author user
 */
public class BL {

    Configuration cf = new Configuration().configure();
    SessionFactory sf = cf.buildSessionFactory();
    Session session = sf.openSession();
    Transaction ts = session.beginTransaction();
    int id;

    public void choice(Scanner sc, BL b) {
        System.out.println("1.For Student Table Operation");
        System.out.println("2.For Employee Table Operation");
        System.out.println("3.For Person Table Operation");
        System.out.println("4.For Product Table Operation");
        System.out.println("5.For Fruit Table Operation");
        System.out.println("6.For Animal Table Operation");
        System.out.println("7.For Mobile Table Operation");
        System.out.println("8.For Vehicle Table Operation");
        System.out.println("9.For Faculty Table Operation");
        System.out.println("10.For Account Table Operation");
        System.out.println("0.For Exit");
        System.out.print("Enter your Choice : ");
        int ch = sc.nextByte();
        switch (ch) {
            case 1: {
                b.student(sc, b);
                break;
            }
            case 2: {
                b.employee(sc, b);
                break;
            }
            case 3: {
                b.person(sc, b);
                break;
            }
            case 4: {
                b.product(sc, b);
                break;
            }
            case 5: {
                b.fruit(sc, b);
                break;
            }
            case 6: {
                b.animal(sc, b);
                break;
            }
            case 7: {
                b.mobile(sc, b);
                break;
            }
            case 8: {
                b.vehicle(sc, b);
                break;
            }
            case 9: {
                b.faculty(sc, b);
                break;
            }
            case 10: {
                b.account(sc, b);
                break;
            }
        }
    }

    public void student(Scanner sc, BL b) {
        switch (b.choiceOperation(sc)) {
            case 1: {
                System.out.println("Enter student details:");
                sc.nextLine();
                System.out.print("First Name: ");
                String firstName = sc.nextLine();

                System.out.print("Last Name: ");
                String lastName = sc.nextLine();

                Date dateOfBirth = null;
                while (dateOfBirth == null) {
                    System.out.print("Date of Birth (yyyy-MM-dd): ");
                    dateOfBirth = parseDate(sc.nextLine());
                    if (dateOfBirth == null) {
                        System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
                    }
                }

                System.out.print("Gender: ");
                String gender = sc.nextLine();

                System.out.print("Email: ");
                String email = sc.nextLine();

                System.out.print("Phone Number: ");
                String phoneNumber = sc.nextLine();

                System.out.print("Address: ");
                String address = sc.nextLine();

                Date enrollmentDate = null;
                while (enrollmentDate == null) {
                    System.out.print("Enrollment Date (yyyy-MM-dd): ");
                    enrollmentDate = parseDate(sc.nextLine());
                    if (enrollmentDate == null) {
                        System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
                    }
                }
                session = sf.openSession();
                ts = session.beginTransaction();
                Student student = new Student(firstName, lastName, dateOfBirth, gender, email, phoneNumber, address, enrollmentDate);
                session.save(student);
                ts.commit();
                System.out.println("\n Student data successfully entered \n");
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                System.out.print("Enter Student id : ");
                id = sc.nextInt();
                b.delete("delete from Student where studentId=" + id);
                break;
            }
            case 4: {
                System.out.print("Enter Student id : ");
                id = sc.nextInt();
                List<Student> li = (List) b.display("From Student where studentId = " + id);
                // Assuming 'studentList' is a List<Student> containing the student records
                System.out.println("\nList of Students:");
                System.out.println("+------------+------------+-----------+---------------+--------+------------------------+--------------+------------------+-----------------+");
                System.out.println("| Student ID | First Name | Last Name | Date of Birth | Gender | Email                  | Phone Number | Address          | Enrollment Date |");
                System.out.println("+------------+------------+-----------+---------------+--------+------------------------+--------------+------------------+-----------------+");

                for (Student student : li) {
                    System.out.println(String.format("| %-11s| %-11s | %-9s | %-13s | %-6s | %-22s | %-12s | %-16s | %-15s |",
                            student.getStudentId(), student.getFirstName(), student.getLastName(), student.getDateOfBirth(),
                            student.getGender(), student.getEmail(), student.getPhoneNumber(), student.getAddress(),
                            student.getEnrollmentDate()));
                }

                System.out.println("+------------+------------+-----------+---------------+--------+------------------------+--------------+------------------+-----------------+");

                break;
            }
            case 5: {
                List<Student> li = (List) b.display("From Student");
                // Assuming 'studentList' is a List<Student> containing the student records
                System.out.println("\nList of Students:");
                System.out.println("+------------+------------+-----------+---------------+--------+------------------------+--------------+------------------+-----------------+");
                System.out.println("| Student ID | First Name | Last Name | Date of Birth | Gender | Email                  | Phone Number | Address          | Enrollment Date |");
                System.out.println("+------------+------------+-----------+---------------+--------+------------------------+--------------+------------------+-----------------+");

                for (Student student : li) {
                    System.out.println(String.format("| %-11s| %-11s | %-9s | %-13s | %-6s | %-22s | %-12s | %-16s | %-15s |",
                            student.getStudentId(), student.getFirstName(), student.getLastName(), student.getDateOfBirth(),
                            student.getGender(), student.getEmail(), student.getPhoneNumber(), student.getAddress(),
                            student.getEnrollmentDate()));
                }

                System.out.println("+------------+------------+-----------+---------------+--------+------------------------+--------------+------------------+-----------------+");

                break;
            }
            case 6: {
                b.choice(sc, b);
                break;
            }
            case 7: {
                System.exit(0);
                break;
            }

        }
        System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
        b.student(sc, b);
    }

    public void employee(Scanner scanner, BL b) {
        switch (b.choiceOperation(scanner)) {
            case 1: {
                EmployeePOJO employee = new EmployeePOJO();

                System.out.print("Enter Salary: ");
                int salary = scanner.nextInt();
                employee.setSalary(salary);

                System.out.print("Enter Experience in year: ");
                int experience = scanner.nextInt();
                employee.setExperience(experience);
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.next();
                employee.setName(name);

                System.out.print("Enter Position: ");
                String position = scanner.next();
                employee.setPosition(position);

                System.out.print("Enter Company Name: ");
                String companyName = scanner.next();
                employee.setCompanyName(companyName);
                scanner.nextLine();
                System.out.print("Enter Address: ");
                String address = scanner.next();
                employee.setAddress(address);
                session = sf.openSession();
                ts = session.beginTransaction();
                session.save(employee);
                ts.commit();
                session.close();
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                System.out.print("Enter Employee id : ");
                id = scanner.nextInt();
                b.delete("delete from EmployeePOJO where id=" + id);
                break;
            }
            case 4: {
                System.out.print("Enter Employee id : ");
                int id = scanner.nextInt();

                List<EmployeePOJO> employeeList = (List<EmployeePOJO>) b.display("FROM EmployeePOJO WHERE id = " + id);

                if (!employeeList.isEmpty()) {
                    System.out.println("+----+--------+------------+------+----------+--------------+---------+");
                    System.out.println("| id | salary | experience | name | position | company_name | address |");
                    System.out.println("+----+--------+------------+------+----------+--------------+---------+");

                    for (EmployeePOJO employee : employeeList) {
                        System.out.println(String.format("| %-2d | %-6d | %-10d | %-4s | %-8s | %-12s | %-6s |",
                                employee.getId(), employee.getSalary(), employee.getExperience(),
                                employee.getName(), employee.getPosition(), employee.getCompanyName(), employee.getAddress()));
                    }

                    System.out.println("+----+--------+------------+------+----------+--------------+---------+");
                } else {
                    System.out.println("Employee with ID " + id + " not found.");
                }

                break;
            }
            case 5: {
                List<EmployeePOJO> employeeList = (List<EmployeePOJO>) b.display("FROM EmployeePOJO");

                if (!employeeList.isEmpty()) {
                    System.out.println("+----+--------+------------+------+----------+--------------+---------+");
                    System.out.println("| id | salary | experience | name | position | company_name | address |");
                    System.out.println("+----+--------+------------+------+----------+--------------+---------+");

                    for (EmployeePOJO employee : employeeList) {
                        System.out.println(String.format("| %-2d | %-6d | %-10d | %-4s | %-8s | %-12s | %-6s |",
                                employee.getId(), employee.getSalary(), employee.getExperience(),
                                employee.getName(), employee.getPosition(), employee.getCompanyName(), employee.getAddress()));
                    }

                    System.out.println("+----+--------+------------+------+----------+--------------+---------+");
                } else {
                    System.out.println("Employee with ID " + id + " not found.");
                }
                break;
            }
            case 6: {
                b.choice(scanner, b);
                break;
            }
            case 7: {
                System.exit(0);
                break;
            }

        }
        System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
        b.employee(scanner, b);
    }

    public void person(Scanner sc, BL b) {
        switch (b.choiceOperation(sc)) {
            case 1: {
                sc.nextLine();
                System.out.print("Enter first name: ");
                String firstName = sc.nextLine();

                System.out.print("Enter last name: ");
                String lastName = sc.nextLine();

                System.out.print("Enter date of birth (YYYY-MM-DD): ");
                String dobString = sc.nextLine();
                Date dateOfBirth = parseDate(dobString);

                System.out.print("Enter email: ");
                String email = sc.nextLine();

                System.out.print("Enter phone number: ");
                String phoneNumber = sc.nextLine();

                System.out.print("Enter address: ");
                String address = sc.nextLine();
                Person newPerson = new Person(firstName, lastName, dateOfBirth, email, phoneNumber, address);
                session = sf.openSession();
                ts = session.beginTransaction();
                session.save(newPerson);
                ts.commit();
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                System.out.print("Enter Person id : ");
                id = sc.nextInt();
                b.delete("delete from Person where personId=" + id);
                break;
            }
            case 4: {
                System.out.print("Enter Person id : ");
                int id = sc.nextInt();
                List<Person> personList = (List<Person>) b.display("FROM Person where personId=" + id);

                if (!personList.isEmpty()) {
                    System.out.println("+-----------+-------------+-----------+---------------+------------------+--------------+---------------------+");
                    System.out.println("| person_id | first_name  | last_name | date_of_birth | email            | phone_number | address             |");
                    System.out.println("+-----------+-------------+-----------+---------------+------------------+--------------+---------------------+");

                    for (Person person : personList)
                    {
                        System.out.println(String.format("| %-9d | %-11s | %-9s | %-13s | %-16s | %-12s | %-19s |",
                                person.getPersonId(), person.getFirstName(), person.getLastName(),
                                person.getDateOfBirth(), person.getEmail(), person.getPhoneNumber(), person.getAddress()));
                    }

                    System.out.println("+-----------+-------------+-----------+---------------+------------------+--------------+---------------------+");
                } else {
                    System.out.println("No records found in the Person table.");
                }
                break;
            }
            case 5: {
                List<Person> personList = (List<Person>) b.display("FROM Person");

                if (!personList.isEmpty()) {
                    System.out.println("+-----------+-------------+-----------+---------------+------------------+--------------+---------------------+");
                    System.out.println("| person_id | first_name  | last_name | date_of_birth | email            | phone_number | address             |");
                    System.out.println("+-----------+-------------+-----------+---------------+------------------+--------------+---------------------+");

                    for (Person person : personList) {
                        System.out.println(String.format("| %-9d | %-11s | %-9s | %-13s | %-16s | %-12s | %-19s |",
                                person.getPersonId(), person.getFirstName(), person.getLastName(),
                                person.getDateOfBirth(), person.getEmail(), person.getPhoneNumber(), person.getAddress()));
                    }

                    System.out.println("+-----------+-------------+-----------+---------------+------------------+--------------+---------------------+");
                } else {
                    System.out.println("No records found in the Person table.");
                }
                break;
            }
            case 6: {
                b.choice(sc, b);
                break;
            }
            case 7: {
                System.exit(0);
                break;
            }

        }
        System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
        b.person(sc, b);
    }

    public void product(Scanner scanner, BL b) {
        switch (b.choiceOperation(scanner)) {
            case 1: {
                scanner.nextLine();
                System.out.println("Enter product name:");
                String productName = scanner.nextLine();

                System.out.println("Enter product category:");
                String category = scanner.nextLine();

                System.out.println("Enter product description:");
                String description = scanner.nextLine();

                System.out.println("Enter product price:");
                double price = scanner.nextDouble();

                System.out.println("Enter quantity in stock:");
                int quantityInStock = scanner.nextInt();

                // Create a new product
                Product product = new Product();
                product.setProductName(productName);
                product.setCategory(category);
                product.setDescription(description);
                product.setPrice(price);
                product.setQuantityInStock(quantityInStock);
                session = sf.openSession();
                ts = session.beginTransaction();
                session.save(product);
                ts.commit();
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                System.out.print("Enter Product id : ");
                id = scanner.nextInt();
                b.delete("delete from Product where productId=" + id);
                break;
            }
            case 4: {
                System.out.print("Enter Product id : ");
                int id = scanner.nextInt();
                List<Product> productList = (List<Product>) b.display("FROM Product where productId=" + id);

                if (!productList.isEmpty()) {
                    System.out.println("+------------+--------------+----------+-------------+---------+-------------------+");
                    System.out.println("| product_id | product_name | category | description | price   | quantity_in_stock |");
                    System.out.println("+------------+--------------+----------+-------------+---------+-------------------+");

                    for (Product product : productList) {
                        System.out.println(String.format("| %-11d | %-12s | %-8s | %-11s | %-7.2f | %-17d |",
                                product.getProductId(), product.getProductName(), product.getCategory(),
                                product.getDescription(), product.getPrice(), product.getQuantityInStock()));
                    }

                    System.out.println("+------------+--------------+----------+-------------+---------+-------------------+");
                } else {
                    System.out.println("No records found in the Product table.");
                }

                break;
            }
            case 5: {
                List<Product> productList = (List<Product>) b.display("FROM Product");

                if (!productList.isEmpty()) {
                    System.out.println("+------------+--------------+----------+-------------+---------+-------------------+");
                    System.out.println("| product_id | product_name | category | description | price   | quantity_in_stock |");
                    System.out.println("+------------+--------------+----------+-------------+---------+-------------------+");

                    for (Product product : productList) {
                        System.out.println(String.format("| %-11d | %-12s | %-8s | %-11s | %-7.2f | %-17d |",
                                product.getProductId(), product.getProductName(), product.getCategory(),
                                product.getDescription(), product.getPrice(), product.getQuantityInStock()));
                    }

                    System.out.println("+------------+--------------+----------+-------------+---------+-------------------+");
                } else {
                    System.out.println("No records found in the Product table.");
                }

                break;
            }
            case 6: {
                b.choice(scanner, b);
                break;
            }
            case 7: {
                System.exit(0);
                break;
            }

        }
        System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
        b.product(scanner, b);
    }

    public void fruit(Scanner scanner, BL b) {
        switch (b.choiceOperation(scanner)) {
            case 1: {
                scanner.nextLine();
                System.out.print("Enter fruit name: ");
                String name = scanner.nextLine();

                System.out.print("Enter fruit color: ");
                String color = scanner.nextLine();

                System.out.print("Enter calories: ");
                int calories = scanner.nextInt();

                System.out.print("Enter price: ");
                float price = scanner.nextFloat();

                System.out.print("Enter season: ");
                String season = scanner.next();

                scanner.nextLine();

                System.out.print("Enter description: ");
                String description = scanner.nextLine();

                FruitPOJO newFruit = new FruitPOJO(name, color, calories, price, season, description);
                session = sf.openSession();
                ts = session.beginTransaction();
                session.save(newFruit);
                ts.commit();
                System.out.println("Data successfully entered");
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                System.out.print("Enter Fruit id : ");
                id = scanner.nextInt();
                b.delete("delete from FruitPOJO where fruitId=" + id);
                break;
            }
                       case 4: {
                System.out.print("Enter Fruit id : ");
                int id = scanner.nextInt();
                List<FruitPOJO> fruitList = (List<FruitPOJO>) b.display("FROM FruitPOJO where fruitId = " + id);

                if (!fruitList.isEmpty()) {
                    System.out.println("+----------+--------+--------+----------+--------+--------+-----------------+");
                    System.out.println("| fruit_id | name   | color  | calories | price  | season | description     |");
                    System.out.println("+----------+--------+--------+----------+--------+--------+-----------------+");

                    for (FruitPOJO fruit : fruitList) {
                        System.out.println(String.format("| %-8d | %-6s | %-6s | %-8d | %-6.2f | %-6s | %-15s |",
                                fruit.getFruitId(), fruit.getName(), fruit.getColor(), fruit.getCalories(),
                                fruit.getPrice(), fruit.getSeason(), fruit.getDescription()));
                    }

                    System.out.println("+----------+--------+--------+----------+--------+--------+-----------------+");
                } else {
                    System.out.println("No records found in the FruitPOJO table.");
                }

                break;
            }
            case 5: {
                List<FruitPOJO> fruitList = (List<FruitPOJO>) b.display("FROM FruitPOJO");

                if (!fruitList.isEmpty()) {
                    System.out.println("+----------+--------+--------+----------+--------+--------+-----------------+");
                    System.out.println("| fruit_id | name   | color  | calories | price  | season | description     |");
                    System.out.println("+----------+--------+--------+----------+--------+--------+-----------------+");

                    for (FruitPOJO fruit : fruitList) {
                        System.out.println(String.format("| %-8d | %-6s | %-6s | %-8d | %-6.2f | %-6s | %-15s |",
                                fruit.getFruitId(), fruit.getName(), fruit.getColor(), fruit.getCalories(),
                                fruit.getPrice(), fruit.getSeason(), fruit.getDescription()));
                    }

                    System.out.println("+----------+--------+--------+----------+--------+--------+-----------------+");
                } else {
                    System.out.println("No records found in the FruitPOJO table.");
                }

                break;
            }
            case 6: {
                b.choice(scanner, b);
                break;
            }
            case 7: {
                System.exit(0);
                break;
            }

        }
        System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
        b.fruit(scanner, b);
    }

    public void animal(Scanner scanner, BL b) {
        switch (b.choiceOperation(scanner)) {
            case 1: {
                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Breed: ");
                String breed = scanner.nextLine();

                System.out.print("Color: ");
                String color = scanner.nextLine();

                System.out.print("Weight: ");
                String weight = scanner.nextLine();

                Animal animal = new Animal();
                animal.setName(name);
                animal.setBreed(breed);
                animal.setColor(color);
                animal.setWeight(weight);
                session = sf.openSession();
                ts = session.beginTransaction();
                session.save(animal);
                ts.commit();
                System.out.println("Data successfully entered");
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                System.out.print("Enter Animal id : ");
                id = scanner.nextInt();
                b.delete("delete from Animal where animalId=" + id);
                break;
            }
            case 4: {
                System.out.print("Enter Animal id : ");
                id = scanner.nextInt();
                List<Animal> animalList = (List<Animal>) b.display("FROM Animal where animalId = " + id);

                if (!animalList.isEmpty()) {
                    System.out.println("+-----------+------+------------+--------+--------+");
                    System.out.println("| animal_id | name | breed      | color  | weight |");
                    System.out.println("+-----------+------+------------+--------+--------+");

                    for (Animal animal : animalList) {
                        System.out.println(String.format("| %-10d | %-4s | %-11s | %-6s | %-6s |",
                                animal.getAnimalId(), animal.getName(), animal.getBreed(), animal.getColor(), animal.getWeight()));
                    }

                    System.out.println("+-----------+------+------------+--------+--------+");
                } else {
                    System.out.println("No records found in the Animal table for the provided id.");
                }
                break;
            }
            case 5: {
                List<Animal> animalList = (List<Animal>) b.display("FROM Animal");
                if (!animalList.isEmpty()) {
                    System.out.println("+-----------+------+------------+--------+--------+");
                    System.out.println("| animal_id | name | breed      | color  | weight |");
                    System.out.println("+-----------+------+------------+--------+--------+");

                    for (Animal animal : animalList) {
                        System.out.println(String.format("| %-10d | %-4s | %-11s | %-6s | %-6s |",
                                animal.getAnimalId(), animal.getName(), animal.getBreed(), animal.getColor(), animal.getWeight()));
                    }

                    System.out.println("+-----------+------+------------+--------+--------+");
                } else {
                    System.out.println("No records found in the Animal table for the provided id.");
                }
                break;
            }
            case 6: {
                b.choice(scanner, b);
                break;
            }
            case 7: {
                System.exit(0);
                break;
            }

        }
        System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
        b.animal(scanner, b);
    }

    public void mobile(Scanner scanner, BL b) {
        switch (b.choiceOperation(scanner)) {
            case 1: {
                scanner.nextLine();
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.print("Enter model: ");
                String model = scanner.nextLine();
                System.out.print("Enter storage capacity in GB: ");
                int storageCapacity = scanner.nextInt();
                System.out.print("Enter RAM size in GB: ");
                int ramSize = scanner.nextInt();
                System.out.print("Enter price: ");
                float price = scanner.nextFloat();
                scanner.nextLine(); // Consume the newline character left by nextFloat()
                System.out.print("Enter color: ");
                String color = scanner.nextLine();

                // Create MobilePOJO object
                MobilePOJO mobile = new MobilePOJO();
                mobile.setBrand(brand);
                mobile.setModel(model);
                mobile.setStorageCapacity(storageCapacity);
                mobile.setRamSize(ramSize);
                mobile.setPrice(price);
                mobile.setColor(color);
                session = sf.openSession();
                ts = session.beginTransaction();
                session.save(mobile);
                ts.commit();
                System.out.println("Data successfully entered");
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                System.out.print("Enter Mobile id : ");
                id = scanner.nextInt();
                b.delete("delete from MobilePOJO where mobileId=" + id);
                break;
            }
            case 4: {
                System.out.print("Enter Mobile id : ");
                id = scanner.nextInt();
                List<MobilePOJO> mobileList = (List<MobilePOJO>) b.display("FROM MobilePOJO where mobileId = " + id);

                if (!mobileList.isEmpty()) {
                    System.out.println("+-----------+-------+-------+------------------+----------+----------+-------+");
                    System.out.println("| mobile_id | brand | model | storage_capacity | ram_size | price    | color |");
                    System.out.println("+-----------+-------+-------+------------------+----------+----------+-------+");

                    for (MobilePOJO mobile : mobileList) {
                        System.out.println(String.format("| %-10d | %-5s | %-5s | %-16d | %-8d | %-8.2f | %-5s |",
                                mobile.getMobileId(), mobile.getBrand(), mobile.getModel(), mobile.getStorageCapacity(),
                                mobile.getRamSize(), mobile.getPrice(), mobile.getColor()));
                    }

                    System.out.println("+-----------+-------+-------+------------------+----------+----------+-------+");
                } else {
                    System.out.println("No records found in the MobilePOJO table for the provided id.");
                }

                break;
            }
            case 5: {
                List<MobilePOJO> mobileList = (List<MobilePOJO>) b.display("FROM MobilePOJO");
                if (!mobileList.isEmpty()) {
                    System.out.println("+-----------+-------+-------+------------------+----------+----------+-------+");
                    System.out.println("| mobile_id | brand | model | storage_capacity | ram_size | price    | color |");
                    System.out.println("+-----------+-------+-------+------------------+----------+----------+-------+");

                    for (MobilePOJO mobile : mobileList) {
                        System.out.println(String.format("| %-10d | %-5s | %-5s | %-16d | %-8d | %-8.2f | %-5s |",
                                mobile.getMobileId(), mobile.getBrand(), mobile.getModel(), mobile.getStorageCapacity(),
                                mobile.getRamSize(), mobile.getPrice(), mobile.getColor()));
                    }

                    System.out.println("+-----------+-------+-------+------------------+----------+----------+-------+");
                } else {
                    System.out.println("No records found in the MobilePOJO table for the provided id.");
                }
                break;
            }
            case 6: {
                b.choice(scanner, b);
                break;
            }
            case 7: {
                System.exit(0);
                break;
            }

        }
        System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
        b.mobile(scanner, b);
    }

    public void vehicle(Scanner scanner, BL b) {
        switch (b.choiceOperation(scanner)) {
            case 1: {
                scanner.nextLine();
                VehiclePOJO v = new VehiclePOJO();

                System.out.println("Enter Vehicle Name:");
                v.setName(scanner.next());

                System.out.println("Enter Vehicle Brand:");
                v.setBrand(scanner.next());

                System.out.println("Enter Vehicle Type:");
                v.setType(scanner.next());

                System.out.println("Enter Vehicle Fuel Type:");
                v.setFuel(scanner.next());

                System.out.println("Enter Vehicle Transmission Type:");
                v.setTransmission(scanner.next());

                System.out.println("Enter Vehicle Price:");
                v.setPrice(scanner.nextInt());

                System.out.println("Enter Vehicle Maximum Speed:");
                v.setMaxSpeed(scanner.nextInt());

                session = sf.openSession();
                ts = session.beginTransaction();
                session.save(v);
                ts.commit();
                System.out.println("Data successfully entered");
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                System.out.print("Enter Vehicle id : ");
                id = scanner.nextInt();
                b.delete("delete from VehiclePOJO where id=" + id);
                break;
            }
            case 4: {
                System.out.print("Enter Mobile id : ");
                id = scanner.nextInt();
                List<VehiclePOJO> vechicleList = (List<VehiclePOJO>) b.display("FROM VehiclePOJO where id = " + id);
                List<VehiclePOJO> vehicleList = (List<VehiclePOJO>) b.display("FROM VehiclePOJO");

                if (!vehicleList.isEmpty()) {
                    System.out.println("+----+--------------+--------+---------+-------+--------------+-------+-----------+");
                    System.out.println("| id | name         | brand  | type    | fuel  | transmission | price | max_speed |");
                    System.out.println("+----+--------------+--------+---------+-------+--------------+-------+-----------+");

                    for (VehiclePOJO vehicle : vehicleList) {
                        System.out.println(String.format("| %-2d | %-12s | %-6s | %-7s | %-5s | %-12s | %-5d | %-9d |",
                                vehicle.getId(), vehicle.getName(), vehicle.getBrand(), vehicle.getType(),
                                vehicle.getFuel(), vehicle.getTransmission(), vehicle.getPrice(), vehicle.getMaxSpeed()));
                    }

                    System.out.println("+----+--------------+--------+---------+-------+--------------+-------+-----------+");
                } else {
                    System.out.println("No records found in the VehiclePOJO table.");
                }

                break;
            }
            case 5: {
                List<VehiclePOJO> vechicleList = (List<VehiclePOJO>) b.display("FROM VehiclePOJO");
                List<VehiclePOJO> vehicleList = (List<VehiclePOJO>) b.display("FROM VehiclePOJO");

                if (!vehicleList.isEmpty()) {
                    System.out.println("+----+--------------+--------+---------+-------+--------------+-------+-----------+");
                    System.out.println("| id | name         | brand  | type    | fuel  | transmission | price | max_speed |");
                    System.out.println("+----+--------------+--------+---------+-------+--------------+-------+-----------+");

                    for (VehiclePOJO vehicle : vehicleList) {
                        System.out.println(String.format("| %-2d | %-12s | %-6s | %-7s | %-5s | %-12s | %-5d | %-9d |",
                                vehicle.getId(), vehicle.getName(), vehicle.getBrand(), vehicle.getType(),
                                vehicle.getFuel(), vehicle.getTransmission(), vehicle.getPrice(), vehicle.getMaxSpeed()));
                    }

                    System.out.println("+----+--------------+--------+---------+-------+--------------+-------+-----------+");
                } else {
                    System.out.println("No records found in the VehiclePOJO table.");
                }

                break;
            }
            case 6: {
                b.choice(scanner, b);
                break;
            }
            case 7: {
                System.exit(0);
                break;
            }

        }
        System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
        b.vehicle(scanner, b);
    }

    public void faculty(Scanner sc, BL b) {
        
    }

    public void account(Scanner sc, BL b) {

    }

    public int choiceOperation(Scanner sc) {
        System.out.println("Press 1 for insert  data : ");
        System.out.println("Press 2 for update data : ");
        System.out.println("Press 3 for delete data : ");
        System.out.println("Press 4 for Search By ID : ");
        System.out.println("Press 5 for All Data : ");
        System.out.println("Press 6 for Home :");
        System.out.println("Press 7 for Exit");
        System.out.print("Enter your choice : ");
        int a = sc.nextInt();
        return a;
    }
    public int choiceOperationWithLike(Scanner sc) {
        System.out.println("Press 1 for insert  data : ");
        System.out.println("Press 2 for update data : ");
        System.out.println("Press 3 for delete data : ");
        System.out.println("Press 4 for Search By ID : ");
        System.out.println("Press 5 for All Data : ");
        System.out.println("Press 6 for Home :");
        System.out.println("Press 7 for Exit");
        System.out.print("Enter your choice : ");
        int a = sc.nextInt();
        return a;
    }

    public boolean delete(String query) {
        boolean b = false;
        try {
            session = sf.openSession();
            ts = session.beginTransaction();
            Query q = session.createQuery(query);
            int rowCount = q.executeUpdate();
            ts.commit();
            b = rowCount > 0;
        } finally {
            return b;
        }
    }

    public Object display(String query) {
        session = sf.openSession();
        ts = session.beginTransaction();
        List lt = session.createQuery(query).list();
        ts.commit();
        return lt;
    }

    private static Date parseDate(String inputDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(inputDate);
        } catch (ParseException e) {
            return null;
        }
    }
}
