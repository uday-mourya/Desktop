import java.util.Scanner;
class Bill{
  public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("\t   Google Pay ");	
	System.out.println("\tName: Uday Mourya" );
	System.out.println("\tBank: SBI" );
	System.out.println("\t1 for pay" );
	System.out.println("\t2 for check balance:" );
	
	System.out.println("enter your choices");
	int a=sc.nextInt();
	case 1
	{
	System.out.println("enter pay amt." );
	int c=sc.nextInt();
	System.out.println("enter upi pin" );
	int d=sc.nextInt();
	   if(d==5250&&c<=20000)
	     {
	       System.out.println("your payment process....." );
	       System.out.println("your payment success" );
	     }
        else if(d!=5250)
	{
	System.out.println("payment failed" );
	}
	
	else if(a==2)
	{
	System.out.println("your balance = 20000");
	}
	}
	else
	{
	System.out.println("wrong choice");
	}
	     
}
}
