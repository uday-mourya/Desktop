import java.util.Scanner;
class Bs{
public static void main(String [] args)
{	Scanner sc =new Scanner(System.in);
        System.out.println("Enter Salary");
	int a=sc.nextInt();
	float b = a*12/100;
	System.out.println("Your Pf Amount Is :"+b);
	float c= a*7.8f/100;
	System.out.println("Your Da Amount Is :"+c);
	float d= a*3.6f/100;
	System.out.println("Your Ta Amount Is :"+d);
	float e=c+d;
	float g=a+e;
	//float h=g;
	System.out.println("Deducted Amount:"+b);
	System.out.println("Your gross Salary :"+g);
	
	
	
	
}
}
