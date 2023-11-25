/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.ArrayList;
import java.util.Scanner;


public class collections {

     private String name;
    private double price;

    // Constructor
    public collections (String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters (if needed)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Collections{" + "name=" + name + ", price=" + price + '}';
    }
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<collections> productList = new ArrayList<>();

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many products you want to Enter");
        int n=scanner.nextInt();
        // Add products based on user input
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for Product " + i + ":");
            System.out.print("Name: ");
            String productName = scanner.nextLine();
             scanner.nextLine();
             
            System.out.print("Price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            collections product = new collections(productName, productPrice);
            productList.add(product);
        }
        System.out.println("\n");

        // Close the scanner
        scanner.close();

        // Display the products
        System.out.println("List of Products:");
        for (collections product : productList) {
            System.out.println(product);
        }
    }
    
}