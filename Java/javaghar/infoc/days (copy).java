import java.util.Scanner;
class Days
{
public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int num=sc.nextInt();
  int y=num/365;
  System.out.println("year="+y);
  y=num%365;
  int m = y/31;
  System.out.println("month="+m);
   m=y%31;
  int w=m/7;
  System.out.println("Week="+w);
  int d=w;
  System.out.println("days="+d);
  }
} 
