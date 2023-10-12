class Swap
{
 public static void main(String args[])
 { 
 java.util.Scanner sc = new java.util.Scanner(System.in);
 System.out.println("enter two number");
 int a = sc.nextInt();
 int b = sc.nextInt();
 a=a^b;
 b=a^b;
 a=a^b; 
 System.out.println("a ="+a+ "b ="+b);
 }
 }
 
     
