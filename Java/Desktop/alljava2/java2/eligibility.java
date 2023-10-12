import java.util.Scanner;
class Cat{
public static void main(String [] args)
{	Scanner sc =new Scanner(System.in);
	System.out.println("Enter First year Agpa");
	int a=sc.nextInt();
	System.out.println("Enter Second year Agpa");
	int b=sc.nextInt();
	
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
