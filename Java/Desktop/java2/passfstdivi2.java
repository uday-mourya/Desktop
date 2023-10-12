import java.util.Scanner;
class Passfst2{
  public static void main (String [] args)
{
  	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR PERCENTAGE");
	int per=sc.nextInt();
	
	if(per<0)
	  System.out.println("INVALID PERCENTAGE....");
	else if(per>100) 	
	     System.out.println("INVALID PERCENTAGE....");
	else if(per>=60)
	     System.out.println("you pass in first division....");
	else if(per>=45)
	     System.out.println("you pass second division");
	else if(per>=33)  
	     System.out.println("you pass in third division");
	else
	     System.out.println("....FAIL...."); 
	      
	 	
}
}
