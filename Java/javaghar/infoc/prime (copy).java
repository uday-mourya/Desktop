import java.util.Scanner;
class Test
{
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  int i=2,sum=1;
  while(i<=n)
  {
   sum=n/i;
    System.out.println("not a prime number"+sum); 
  } 
   System.out.println("prime number"+sum); 
 }
} 
