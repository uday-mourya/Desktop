class Test
{
  public static void add()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter first Number");
    int a=sc.nextInt();
    System.out.println("Enter Second Number");
    int b=sc.nextInt();
    int c=a+b;
    System.out.println("Addition = "+c);
  }
  public static void subs()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter first Number");
    int a=sc.nextInt();
    System.out.println("Enter Second Number");
    int b=sc.nextInt();
    int c=a-b;
    System.out.println("Substraction = "+c);
  }
  public static void multi()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter first Number");
    int a=sc.nextInt();
    System.out.println("Enter Second Number");
    int b=sc.nextInt();
    int c=a*b;
    System.out.println("Multiplication = "+c);
  }
  public static void div()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter first Number");
    int a=sc.nextInt();
    System.out.println("Enter Second Number");
    int b=sc.nextInt();
    int c=a/b;
    System.out.println("Division = "+c);
  }
  public static void mod()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter first Number");
    int a=sc.nextInt();
    System.out.println("Enter Second Number");
    int b=sc.nextInt();
    int c=a%b;
    System.out.println("Modules = "+c);
  }
  public static void main(String [] args)
  {
    java.util.Scanner sc =new java.util.Scanner(System.in);
	System.out.println("Your choices are:");
   	System.out.println("\t1 For Addition :\n\t2 For Substraction :");
   	System.out.println("\t3 For Multiplication :\n\t4 For Division :");
   	System.out.println("\t5 For Modulus");
   	int ch = sc.nextInt();
   	Test ob=new Test();
   	switch(ch)
   	{
   	 case 1:
   	 ob.add();
   	 break;
   	 case 2:
   	 ob.subs();
   	 break;
   	 case 3:
   	 ob.multi();
   	 break;
   	 case 4:
   	 ob.div();
   	 break;
   	 case 5:
   	 ob.mod();
   	 break;
   	 
        }
  }
}
   
