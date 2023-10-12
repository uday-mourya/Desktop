
class A 
{
	public void printA()
	 { System.out.println("Class A"); }
}

class B extends A 
{
	public void printB() 
	{ 
	  System.out.println("Class B"); 
	}
}

class C extends A 
{
	public void printC()
	 { 
	    System.out.println("Class C"); 
	 }
}

class D extends A 
{
	public void printD() 
	{ 
	   System.out.println("Class D"); 
	}
}
class Test
{
	public static void main(String[] args)
	{
		B ob1 = new B();
		ob1.printA();
		ob1.printB();

		C ob2 = new C();
		ob2.printA();
		ob2.printC();

		D ob3 = new D();
		ob3.printA();
		ob3.printD();
	}
}

