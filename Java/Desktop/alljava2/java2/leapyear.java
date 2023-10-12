import java.util.Scanner;
class Leap{
public static void main(String [] args)
{	Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any Year..");
	int a=sc.nextInt();
	
	if(a%4==0)
	{
	  System.out.println("This is Leap Year");
	}
        if(a%4!=0)
        {
          System.out.println("This is Not leap year");
        }

}
}
