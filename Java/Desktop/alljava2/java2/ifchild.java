import java.util.Scanner;
class Ifchild{
public static void main(String [] args)
{	Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Age..");
	int age=sc.nextInt();
	
	if (age<=12)
	{
	  System.out.println("You Are Child");
	}
	else
	{ 
	  if(age<=19)
	  System.out.println("You Are Teen");
	}  
	if(age<=59)
	 {   
             System.out.println("You Are Young");
         }
        else
        {   
            if(age>59)
            {
              if(age<79)
              System.out.println("You Are old");
             }  
        }

}
}
