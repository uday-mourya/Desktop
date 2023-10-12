import java.util.Scanner;
class Calc
{
  public static void main(String args[])
  { 
   double a,b,res;
   Scanner sc=new Scanner(System.in);
   System.out.println("you are choice..");
   System.out.println("\t1 for Addition:\n\t2 for Subtraction:");
   System.out.println("\t3 for Multiplication:\n\t4 for Division");
   System.out.println("\t5 for Modulas:");
   System.out.print("Enter your choice ");
   int ch=sc.nextInt();
   switch (ch)
      {   
      case 1:
      
      System.out.println("Enter any two number");    
      a=sc.nextDouble();
      b=sc.nextDouble();
      res=a+b;
      System.out.println("Addition ="+res);
      System.exit(0);
      case 2:
      
      System.out.println("Enter any two number");    
      a=sc.nextDouble();
      b=sc.nextDouble();
      res=a-b;
      System.out.println("Subtract ="+res); 
      break;
      case 3:
          
      System.out.println("Enter any two number");    
      a=sc.nextDouble();
      b=sc.nextDouble();
      res=a*b;
      System.out.println("Multiplication ="+res); 
      System.exit(0);      
      case 4:
    
      System.out.println("Enter any two number");    
      a=sc.nextDouble();
      b=sc.nextDouble();
      res=a/b;
      System.out.println("Division ="+res); 
      break;     
      case 5:  
         
      System.out.println("Enter any two number");    
      a=sc.nextDouble();
      b=sc.nextDouble();
      res=a%b;
      System.out.println("Modulas ="+res);
      break;
      default:   
       System.out.println("you are wrong person 🙆‍♂️️"); 
    }
    }
   } 
