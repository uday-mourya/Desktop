import java.util.Scanner;
class Force{
public static void main (String [] args)
{
	  Scanner sc= new Scanner(System.in);
  	  System.out.println("Enter Mass");
	  int a =sc.nextInt();
	  System.out.println("Enter Accelaration");
	  int b =sc.nextInt();
	  int d=a*b;
	  System.out.println("Force Is"+d);
}
}
