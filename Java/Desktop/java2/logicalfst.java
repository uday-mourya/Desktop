import java.util.Scanner;
class Logicalfst{
  public static void main (String [] args)
{
  	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR PERCENTAGE");
	int per=sc.nextInt();
	
	if(per<0||per>100)
	     System.out.println("INVALID PERCENTAGE....");
	else if(per>=60)
	     System.out.println("you pass in first division....");
	else if(per>=45)
	     System.out.println("you pass in second division");
	else if(per>=33)  
	     System.out.println("you pass in third division");
	else
	     System.out.println("....FAIL...."); 
	      
	 	
}
}
