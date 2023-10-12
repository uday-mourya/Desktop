import java.util.Scanner;
class Bigage{
  public static void main(String [] args)
{	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Ram age");
	int a= nextInt();
	System.out.println("Enter Mohan age");
	int b= nextInt();
	System.out.println("Enter Kamal age");
	int c= nextInt();
	System.out.println("Enter Raj age");
	int d= nextInt();
	if (a>b)
	 {
	   if(a>c)
	   {
	      System.out.println("a is greatest");
	      System.out.println("c is greatest");
	      
	   }   
	   else
	      if(b>c)
	      {
	      System.out.prinln("B is greatest");
	      }
	      else
	      System.out.println("c is greatest");
	 }

}
}
