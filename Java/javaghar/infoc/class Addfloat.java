class Addfloat
{
public static void main(String args[])
{
float a,b,add,sub,mul,div,mod;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
 a = sc.nextFloat();
 System.out.println("Enter the second number");
 b = sc.nextFloat();
  add = a+b;
 sub = a-b;
 mul = a*b;
 div = a/b;
 mod = a%b;
System.out.println("Addition = "+add);
System.out.println("Subtraction = "+sub);
System.out.println("Multiplication = "+mul);
System.out.println("Division = "+div);
System.out.println("Modulus = "+mod);
}
}
