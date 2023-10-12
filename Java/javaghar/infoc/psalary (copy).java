import java.util.Scanner;
class Test
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your salary");
  int salary=sc.nextInt();
  System.out.println("Enter your service year");
  int year=sc.nextInt();
  int sum,gross;
  if(year>=5)
  {
  sum=salary/100*5;
  gross=sum+salary;
  System.out.println("Net bonus:"+sum);
  System.out.println("Gross Salary:"+gross);
  } 
  else
   System.out.println("Not complete five year service");
  }
 }  
