import java.util.Scanner;
class Switchweek{
  public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	
   	System.out.println("Enter day ");
   	int ch=sc.nextInt();
   	switch (ch)
   	{
	  case 1:
	    System.out.println("Monday");
	  case 2:
	     System.out.println("Tuesday");
	  case 3:
	     System.out.println("Wednusday");
	  case 4:
	     System.out.println("Thursday");
	  case 5:
	     System.out.println("Friday");
	  case 6:
	     System.out.println("Saturday");
	  case 7:
	     System.out.println("Sunday");     
	default :
	  System.out.println("You Are Wrong Person");
	    
}
}   	
