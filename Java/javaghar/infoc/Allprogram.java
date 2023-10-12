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

class Addbyte
{
public static void main(String args[])
{
byte a,b,add,Sub,mul,div,mod;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
 a = sc.nextByte();
 System.out.println("Enter the second number");
 b = sc.nextByte();
  add = (byte)(a+b);
  Sub = (byte)(a-b);
 mul = (byte)(a*b);
 div = (byte)(a/b);
 mod = (byte)(a%b);
System.out.println("Addition = "+add);
System.out.println("Subtraction = "+Sub);
System.out.println("Multiplication = "+mul);
System.out.println("Division = "+div);
System.out.println("Modulus = "+mod);
  
}
}

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

class Addlong
{
public static void main(String args[])
{
long a,b,add,sub,mul,div,mod;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
 a = sc.nextLong();
 System.out.println("Enter the second number");
 b = sc.nextLong();
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

class Adddouble
{
public static void main(String args[])
{
double a,b,add,sub,mul,div,mod;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
 a = sc.nextDouble();
 System.out.println("Enter the second number");
 b = sc.nextDouble();
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
//ASCCI value
class Ascci
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of the character");
char a = sc.next().charAt(0);
int Asccivalue = a;
System.out.println("ASCCI value is =" +Asccivalue);
}
}

class Ascci1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of the character");
int a = sc.nextInt();
char Asccivalue = (char)(a);
System.out.println("ASCCI value is =" +Asccivalue);
}
}
// Compound interest
 class Ci
 {
  public static void main(String Args[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the principal");
   float p = sc.nextfloat();
   System.out.println("Enter the rate ");
   float r = sc.nextflaot();
   System.out.println("Enter the time");
   float t = sc.nextflaot();
   float A = P*(T+R/100);
   float CI = A-P;
   System.out.println("Compound Interest="+CI); 
   }
  } 
