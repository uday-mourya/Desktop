import java.util.Scanner;
class Donate
{
  public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter person age");
     int age=sc.nextInt();
     System.out.println("Enter person Weight");
     int wei=sc.nextInt();
     if(age>=18)
       { 
         if(wei>=50)
            System.out.println("You are eligible to donate Blood");  
         else
               System.out.println("You are not eligible to donate Blood");  
       }        
     else
         System.out.println(" age must be greater then 18");
     }        
  }   
