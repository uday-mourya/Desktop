/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class InsertProductDataWithInput {

    public static void main(String[] args) {
        // Hibernate setup
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // User input for insertion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product ID:");
        int productId = scanner.nextInt();

        scanner.nextLine(); // Consume the newline

        System.out.println("Enter Product Name:");
        String productName = scanner.nextLine();

        System.out.println("Enter Product Description:");
        String description = scanner.nextLine();

        System.out.println("Enter Product Price:");
        double price = scanner.nextDouble();

        System.out.println("Enter Product Stock Quantity:");
        int stockQuantity = scanner.nextInt();

        scanner.nextLine(); // Consume the newline

        System.out.println("Enter Product Manufacturer:");
        String manufacturer = scanner.nextLine();

        System.out.println("Enter Product Category:");
        String category = scanner.nextLine();

        // Creating a new Product object with user input
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setDescription(description);
        product.setPrice(price);
        product.setStockQuantity(stockQuantity);
        product.setManufacturer(manufacturer);
        product.setCategory(category);

        // Hibernate transaction for data insertion
        Transaction transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();

        // Closing resources
        session.close();
        sessionFactory.close();
        scanner.close();
    }
}

