import java.util.Scanner;
class Even{
public static void main(String [] args)
{	Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any Number..");
	int a=sc.nextInt();
	
	if(a%2==0)
	{
	  System.out.println("Your No Is Even");
	}
        if(a%2!=0)
        {
          System.out.println("Your No Is Odd");
        }

}
}
