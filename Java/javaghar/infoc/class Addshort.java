class Addshort
{
public static void main(String args[])
{
short a,b,add,sub,mul,div,mod;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
 a = sc.nextShort();
 System.out.println("Enter the second number");
 b = sc.nextShort();
 add = (short)(a+b);
 sub = (short)(a-b);
 mul = (short)(a*b);
 div = (short)(a/b);
 mod = (short)(a%b);
System.out.println("Addition = "+add);
System.out.println("Subtraction = "+sub);
System.out.println("Multiplication = "+mul);
System.out.println("Division = "+div);
System.out.println("Modulus = "+mod);
}
}
