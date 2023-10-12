
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


