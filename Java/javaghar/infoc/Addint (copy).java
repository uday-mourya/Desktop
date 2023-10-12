import java.util.Scanner;
class Addint
   {
	public static void main(String args[])
     	    {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			int a = sc.nextInt();
			System.out.println("Enter the second number");
			int b = sc.nextInt();
			int Add = a+b;
			int Sub = a-b;
			int mul = a*b;
			int div = a/b;
			int mod = a%b;
			System.out.println("Addition = "+Add);
			System.out.println("Subtraction = "+Sub);
			System.out.println("Multiplication = "+mul);
			System.out.println("Division = "+div);
			System.out.println("Modulus = "+mod);

            }
    } 
