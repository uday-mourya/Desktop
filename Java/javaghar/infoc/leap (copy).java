import java.util.Scanner;
class Leap 
{
 public static void main(String Args[])
 { 
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any  age ");
  int Age=sc.nextInt();
  if(Age>=18)
   System.out.println("Eligible for vote");
  if(Age<18)
   System.out.println("Not adult for vote");
  }
 }
