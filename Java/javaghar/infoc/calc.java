import java.util.Scanner;
class Cal
{
  public static void main(String args[])
  { 
	   Scanner sc=new Scanner(System.in);
	   System.out.println("you are choice..");
	   System.out.println("\t1 for Addition:\n\t2 for Subtraction:");
	   System.out.println("\t3 for Multiplication:\n\t4 for Division");
	   System.out.println("\t5 for Modulas:\n\t6 for Exit");
	   System.out.print("Enter your choice");
	   int ch=sc.nextInt();
           if(ch==1)
	     {
		      System.out.println("Enter any two number");    
		      double a=sc.nextDouble();
		      double b=sc.nextDouble();
		      double res=a+b;
		      System.out.println("Addition ="+res);
 	     }
           else if(ch==2)
    	     {
		      System.out.println("Enter any two number");    
		      double a=sc.nextDouble();
		      double b=sc.nextDouble();
		      double res=a-b;
		      System.out.println("Subtract ="+res); 
             } 
           else if(ch==3)
             {
		      System.out.println("Enter any two number");    
		      double a=sc.nextDouble();
		      double b=sc.nextDouble();
		      double res=a*b;
		      System.out.println("Multiplication ="+res); 
	     }  
    	   else if(ch==4)
    	     {
		      System.out.println("Enter any two number");    
		      double a=sc.nextDouble();
		      double b=sc.nextDouble();
		      double res=a/b;
		      System.out.println("Division ="+res); 
  	     } 
    	   else if(ch==5)
    	     {
		      System.out.println("Enter any two number");    
		      double a=sc.nextDouble();
		      double b=sc.nextDouble();
		      double res=a%b;
		      System.out.println("Modulas ="+res); 
		      System.out.println(" YOU ARE WRONG PERSON");
             }
    	   else if(ch==6)
                      exit(0);	   
      }
  } 
