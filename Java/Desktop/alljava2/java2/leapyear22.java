import java.util.Scanner;
class Leapy{
public static void main(String [] args)
{       Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any Year..");
        int a=sc.nextInt();
	
	if(a%4==0||a%400==0&&a%100==0)
	{
	  System.out.println("This is Leap Year");
	}
        else
        {
          System.out.println("This is Not leap year");
        }

}
}
