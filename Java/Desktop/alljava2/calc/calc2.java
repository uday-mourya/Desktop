class Calc2{
  public static void main(String[]args){
     java.util.Scanner sc =new java.util.Scanner(System.in);
	System.out.println("Your choices are:");
	System.out.println("\t+ For Addition");
	System.out.println("\t- For Substraction");
	System.out.println("\t* For Multiplication");
	System.out.println("\t/ For Division");
	System.out.println("\t% For Modulus");
   	char ch = sc.next().charAt(0);
   	double a,b,res;
   	
   	System.out.println("Enter First Number");
   	 a =sc.nextDouble();
   	System.out.println("Enter Second Number");
         b =sc.nextDouble();
   	switch (ch)
   	{ 
   	case '+':
   	System.out.println("\033[2J\033[H");
   	System.out.flush();
   	
   	res= a+b;
   	System.out.println("addition="+res);
   	break;
   	
   	case '-':
   	System.out.println("\033[2J\033[H");
   	System.out.flush();
 
   	 res = a-b;
   	 System.out.println("Substraction="+res);
   	 
   	  System.exit(0);
   	case '*':
   	System.out.println("\033[2J\033[H");
   	System.out.flush();
   	
   	res= a*b;
   	System.out.println("\033[34mMultiplication="+res);
   	break;
   	
   	case '/':
   	System.out.println("\033[2J\033[H");
   	System.out.flush();
   	
   	res= a/b;
   	System.out.println("Division="+res);
   	break;
   	
   	case '%': 
   	System.out.println("\033[2J\033[H");
   	System.out.flush();
   	
   	res = a%b;
   	System.out.println("Modulus="+res);
   	break;
   	default:
   	  System.out.println("You are Wrong ");
}
}
}
