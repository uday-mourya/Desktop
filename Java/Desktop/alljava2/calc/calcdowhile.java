class Calc{
  public static void main(String[]args){
     java.util.Scanner sc =new java.util.Scanner(System.in);
     double a,b,res;
     int k=1;
     do
     {
	System.out.println("Your choices are:");
	System.out.println("\t+ For Addition");
	System.out.println("\t- For Substraction");
	System.out.println("\t* For Multiplication");
	System.out.println("\t/ For Division");
	System.out.println("\t% For Modulus");
	
	System.out.println("Enter Any Choice");
   	char ch = sc.next().charAt(0);
   	//double a,b,res;
   	 k=(char)(ch);
   	switch (ch)
   	{ 
   	case '+':
   	System.out.println("\033[2J\033[H");
   	System.out.flush();
   	System.out.println("\033[33m Enter any Two Number ");
   	 a = sc.nextDouble();
   	 b = sc.nextDouble();
   	 res=a+b;
   	System.out.println("addition="+res);
   	break;
   	
   	case '-':
   	System.out.println("\033[2J\033[H");
   	System.out.flush();
   	System.out.println("\033[32mEnter any Two Number");
   	 a = sc.nextDouble();
   	 b = sc.nextDouble();
   	 res = a-b;
   	 System.out.println("Substraction="+res);
   	 
   	  System.exit(0);
   	case '*':
   	System.out.println("\033[2J\033[H");
   	System.out.flush();
   	System.out.println("\033[32mEnter any Two Number");
   	a = sc.nextDouble();
   	b = sc.nextDouble();
   	res= a*b;
   	System.out.println("\033[34mMultiplication="+res);
   	break;
   	
   	case '/':
   	System.out.println("\033[2J\033[H");
   	System.out.flush();
   	System.out.println("\033[35mEnter any Two Number");
   	a = sc.nextDouble();
   	b = sc.nextDouble();
   	res= a/b;
   	System.out.println("Division="+res);
   	break;
   	
   	case '%': 
   	System.out.println("\033[2J\033[H");
   	System.out.flush();
   	System.out.println("\033[37mEnter any Two Number");
   	a = sc.nextDouble();
   	b = sc.nextDouble();
   	res = a%b;
   	System.out.println("Modulus="+res);
   	break;
   	default:
   	  System.out.println("You are Wrong ");
   	 } 
 }  	  
   	 while(k<'`'); 
}
}
