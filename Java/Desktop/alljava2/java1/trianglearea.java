import java.util.Scanner;
class Triangle{
public static void main (String [] args)
{
	  Scanner sc= new Scanner(System.in);
  	  System.out.println("Enter Base");
	  int a =sc.nextInt();
	  System.out.println("Enter Height");
	  int b =sc.nextInt();
	  int s=1/2*a*b;
	  System.out.println(" area of Trianle is "+s);
}
}
