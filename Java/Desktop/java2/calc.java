class Calc{
  public static void main(String[]args){
     java.util.Scanner sc =new java.util.Scanner(System.in);
	System.out.println("Your choices are:");
   	System.out.println("\t1 For Addition :\n2 For Substraction :");
   	System.out.println("\t3 For Multiplication :\n2 For Division :");
   	System.out.println("\t5 For Modulus");
   	int ch = sc.nextInt();
   	
   	if(ch==1)
   	{ 
   	System.out.println("Enter any Two Number");
   	double a = sc.nextDouble();
   	double b = sc.nextDouble();
   	double res=a+b;
   	System.out.println("addition="+res);
   	}
   	else if(ch==2)
   	{
   	System.out.println("Enter any Two Number");
   	double a = sc.nextDouble();
   	double b = sc.nextDouble();
   	double res = a-b;
   	System.out.println("Substraction="+res);
   	}
   	else if(ch==3)
   	{ 
   	System.out.println("Enter any Two Number");
   	double a = sc.nextDouble();
   	double b = sc.nextDouble();
   	double res= a*b;
   	System.out.println("Multiplication="+res);
   	}
   	else if(ch==4)
   	{ 
   	System.out.println("Enter any Two Number");
   	double a = sc.nextDouble();
   	double b = sc.nextDouble();
   	double res= a/b;
   	System.out.println("Division="+res);
   	}
   	else if(ch==5) 
   	{
   	System.out.println("Enter any Two Number");
   	double a = sc.nextDouble();
   	double b = sc.nextDouble();
   	double res = a%b;
   	System.out.println("Modulus="+res);
   	}
   	else
   	  System.out.println("You are Wrong Person");
}
}
