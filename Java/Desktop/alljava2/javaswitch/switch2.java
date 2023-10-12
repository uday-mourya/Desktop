import java.util.Scanner;
class switchmlkg2{
  public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Your choices are:");
   	System.out.println("\t1 ml To l :\n\t2 gm to kg :");
   	System.out.println("\t3 l To ml :\n\t4 kg to gm :");
   	
   	System.out.println("enter your choices");
	int a=sc.nextInt();
	switch(a)
	{ case 1:
	  System.out.println("Enter ml value" );
	  int b=sc.nextInt();
	  int c=b/1000;
	  System.out.println("l = "+c );

	case 2:
	
	  System.out.println("Enter gm value" );
	  int b=sc.nextInt();
	  int c=b/1000;
	  System.out.println("Kg = "+c );
	
	
   	case 3:
	
	  System.out.println("Enter l value" );
	  int b=sc.nextInt();
	  int c=b*1000;
	  System.out.println("ml = "+c );
	
	case 4:
	
	  System.out.println("Enter kg value" );
	  int b=sc.nextInt();
	  int c=b*1000;
	  System.out.println("gm = "+c );
	
	default :
	  System.out.println("Enter You are Wrong" );
	
	
}

}	
