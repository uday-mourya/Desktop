import java.lang.String;
import java.util.Scanner;
class Daadhar
{
 public static void main(String args[])
  {  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Choice");
    System.out.println("1 for Aadhar");
    String a = sc.nextLine();
    switch(a)
    {
    case "a":     
    	System.out.println("Enter Your Name");
    	String Name = sc.next();
    	
    	System.out.println("Enter Your Date of Birth");
    	String DOB = sc.nextLine();
    	
    	System.out.println("Enter Your Gender");
    	String GEN = sc.next();
    	
    	System.out.println("Enter Your Aadhar Number");
    	int AN = sc.nextInt();
    	
    	System.out.println(" ____________________________________________________________");
    	System.out.println("| \t\tGovernment\tOf\tIndia\t|");
    	System.out.println("|                                                           |");
    	System.out.println("| ---------"+Name+"\t\t\t\t\t|");
    	System.out.println("| |\t  |DOB:"+DOB+"\t\t\t\t\t|");
    	System.out.println("| |\t  |"+GEN+"  \t\t\t\t\t|");    
    	System.out.println("| |\t  |\t\t\t\t\t\t|");
    	System.out.println("| ---------  \t\t\t\t\t\t|");
    	System.out.println("|\t\t\t\t\t\t\t\t|");
    	System.out.println("| \t\t     "+AN+"\t\t\t\t\t             |");
    	System.out.println("|_____________________________________________________________|");
    	}
 }
}     
