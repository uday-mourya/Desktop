import java.util.Scanner;
class Vsphere{
public static void main (String [] args)
{
	  Scanner sc= new Scanner(System.in);
  	  System.out.println("Enter Radius");
	  int a =sc.nextInt();
	  int volume=4/3*a*a*a;
	  System.out.println(" Volume of sphere is "+volume);
}
}
