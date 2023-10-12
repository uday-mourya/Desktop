import java.util.Scanner;
class Vote{
public static void main(String [] args)
{	Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Age..");
	int a=sc.nextInt();
	
	if(a>=18)
	{
	  System.out.println("You Are Eligible For Vote");
	}
        if(a<18)
        {
          System.out.println("You Are Not Eligibe for Vote");
        }

}
}
