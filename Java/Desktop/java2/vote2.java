import java.util.Scanner;
class Vote2{
public static void main(String [] args)
{	Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Age..");
	int age=sc.nextInt();
	
	if (age<=0)
	  System.out.println("Invalid Age");
	if(age>=18)
	{
	  System.out.println("You Are Eligible For Vote");
	}
        if(age<18)
        {
          System.out.println("You Are Not Eligibe for Vote");
        }

}
}
