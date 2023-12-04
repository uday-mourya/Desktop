/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;


import java.util.ArrayList;
import java.util.Scanner;

class ElectronicProduct {
    private int id;
    private String name;
    private double price;
    private String brand;

    public ElectronicProduct(int id, String name, double price, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }
    
    // Getters and toString method...

    @Override
    public String toString() {
       return id + "\t|\t" + name + "\t|\t" + price + "\t|\t" + brand + "\t|";
    }

}

public class arraylist {

    public static void main(String[] args) {
        ArrayList<ElectronicProduct> electronicProducts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Electronic Product #" + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Brand: ");
            String brand = sc.nextLine();

            ElectronicProduct product = new ElectronicProduct(id, name, price, brand);
            electronicProducts.add(product);
        }

        System.out.println("\nList of Electronic Products:");
        System.out.println("+-------+---------------+---------------+---------------+");
        System.out.println("|   ID  | Name          |     Price     | Brand         |");
        System.out.println("+-------+---------------+---------------+---------------+");

        for (ElectronicProduct product : electronicProducts) {
            System.out.println(product);
        }

        System.out.println("+-------+---------------+---------------+---------------+");

        sc.close();
    }
}

