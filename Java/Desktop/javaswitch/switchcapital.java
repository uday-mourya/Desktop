import java.util.Scanner;
class Switchcapital{
  public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Q Who is the capital of india");
   	System.out.println("\t1 indore\n\t2 delhi :");
   	System.out.println("\t3 mumbai\n\t4 lucknow :");
   	
   	System.out.println("Enter Your choice ");
   	int ch=sc.nextInt();
   	switch (ch)
   	{
	  case 2:
	    System.out.println("Your Answer is Correct");
	  case 1:
	  case 3:
	  case 4:
	    System.out.println(" Wrong Answer ");
	default :
	  System.out.println("You Are Wrong Person");
	    
}
}   	
