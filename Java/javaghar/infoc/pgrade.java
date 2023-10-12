import java.util.Scanner;
class Test
{
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the your (%) percentage");
  int per=sc.nextInt();
  if(per<=0)
  System.out.println("invalid (%) percentage");
  else if(per<=25)
  System.out.println("Your Grade is:'F'");
  else if(per<=45)
  System.out.println("Your Grade is:'E'");
  else if(per<=50)
  System.out.println("Your Grade is:'D'");
  else if(per<=60)
  System.out.println("Your Grade is:'C'");
  else if(per<=80)
  System.out.println("Your Grade is:'B'");
  else if(per<=100)
  System.out.println("Your Grade is:'A'");
  else
  System.out.println("invalid (%) percentage");
  }
  }
