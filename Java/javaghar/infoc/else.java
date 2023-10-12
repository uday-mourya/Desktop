import java.util.Scanner;
class Leap 
{
 public static void main(String Args[])
 { 
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any  age ");
  int Age=sc.nextInt();
  if(Age<=0)
    {  
   System.out.println("invalid age");
    }
  else 
   { 
   if(Age>=18)
   System.out.println("you can vote");
   else
   
   if(Age<=18)
   System.out.println("you can't vote");
   }
 }
 }
