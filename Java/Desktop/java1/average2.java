import java.util.Scanner;
class Aver{
  public static void main (String [] args)
  {  
          Scanner lm =new Scanner (System.in);
	  System.out.println("Enter First Age.....");  
          int a =lm.nextInt();
          System.out.println("Enter Second Age....."); 
          int b =lm.nextInt(); 
          System.out.println("Enter Third Age.....");
          int c =lm.nextInt();  
          System.out.println("Enter Fourth Age.....");
          int d =lm.nextInt();  
          System.out.println("Enter Fifth Age.....");
          int e=lm.nextInt(); 
          int ave=(a+b+c+d+e)/5;
          System.out.println("average = " +ave);
          
  
  }
  }
