import java.util.Scanner;
class Test
{
 public static void main(String args[])
 {
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter Your age");
  int age=sc.nextInt();
  System.out.println("Enter Your weight");
  int wei=sc.nextInt();
  if(age>=18)
   {
     if(wei>=50)
        System.out.println("you are eligible to donate blood");
     else 
        System.out.println("you are not eligible to donate blood");
    }else
         System.out.println("you are not eligible to donate blood"); 
  }
  }  
