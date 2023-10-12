import java.util.Scanner;
class Vcylender{
public static void main (String [] args)
{
	  Scanner sc= new Scanner(System.in);
  	  System.out.println("Enter Radius");
	  float a =sc.nextFloat();
	  System.out.println("Enter Height");
	  float b =sc.nextFloat();
	  float volume=3.14*a*a*b;
	  System.out.println(" Volume of Cylender is "+volume);
}
}
