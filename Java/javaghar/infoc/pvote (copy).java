import java.util.Scanner;
class Test
{
public static void main(String args[])
{
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter Your age");
 int age=sc.nextInt();
 if(age>=18)
  System.out.println("You are Eligible for vote");
 else
 System.out.println("you are not Eligible for vote");
 }
 } 
