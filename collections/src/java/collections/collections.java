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
        
         ArrayList<collections> productList = new ArrayList<>();

        
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
            scanner.nextLine(); 

            collections product = new collections(productName, productPrice);
            productList.add(product);
        }
        System.out.println("\n");

        
        scanner.close();

        
        System.out.println("List of Products:");
        for (collections product : productList) {
            System.out.println(product);
        }
    }
    
}