/**
 *
 * @author vivek
 */
package collections;


import java.util.ArrayList;
import java.util.Scanner;


public class  Collection {

     private String name;
    private double price;
     private String company;
      private String color;
    

    
    public  Collection (String name, double price,String company,String color) {
        this.name = name;
        this.price = price;
          this.company = company;
            this.color = color;
             
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
     public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
     public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Collections{" + "name=" + name + ", price=" + price + ",company=" +company+ ",color=" +color+ '}';
    }
    public static void main(String[] args) {
      
        ArrayList< Collection> productList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many products  Enter");
        int n=scanner.nextInt();
     
        for (int i = 1; i <= n; i++) {
            System.out.println("Please Enter Prodyyct Detials " + i + ":");
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            scanner.nextLine();
             
            System.out.print("Enter Product Price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            
           
            System.out.print("Enter Product Company Name: ");
            String productCompany = scanner.nextLine();
            scanner.nextLine();
             
           
            System.out.print("Enter Product Color: ");
            String productColor = scanner.nextLine();
            scanner.nextLine();

            Collection product = new  Collection(productName, productPrice,productCompany , productColor);
            productList.add(product);
        }
        System.out.println("\n");
        scanner.close();

        System.out.println("This is Your ProductList :");
        for ( Collection product : productList) {
            System.out.println(product);
        }
    }
    
}