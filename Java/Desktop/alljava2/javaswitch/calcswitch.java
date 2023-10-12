class Calcswitch{
  public static void main(String[]args){
     java.util.Scanner sc =new java.util.Scanner(System.in);
	System.out.println("Your choices are:");
   	System.out.println("\t1 For Addition :\n\t2 For Substraction :");
   	System.out.println("\t3 For Multiplication :\n\t4 For Division :");
   	System.out.println("\t5 For Modulus");
   	int ch = sc.nextInt();
   	double a,b,res;
   	switch (ch)
   	{ 
   	case 1:
   	System.out.println("Enter any Two Number");
   	 a = sc.nextDouble();
   	 b = sc.nextDouble();
   	 res=a+b;
   	System.out.println("addition="+res);
   	
   	case 2:
   	
   	System.out.println("Enter any Two Number");
   	 a = sc.nextDouble();
   	 b = sc.nextDouble();
   	 res = a-b;
   	 System.out.println("Substraction="+res);
   	
   	case 3:
   	
   	System.out.println("Enter any Two Number");
   	a = sc.nextDouble();
   	b = sc.nextDouble();
   	res= a*b;
   	System.out.println("Multiplication="+res);
   	
   	case 4:
   	
   	System.out.println("Enter any Two Number");
   	a = sc.nextDouble();
   	b = sc.nextDouble();
   	res= a/b;
   	System.out.println("Division="+res);
   	break;
   	case 5: 
   	
   	System.out.println("Enter any Two Number");
   	a = sc.nextDouble();
   	b = sc.nextDouble();
   	res = a%b;
   	System.out.println("Modulus="+res);
   	break;
   	default:
   	  System.out.println("You are Wrong Person");
}
}
}
