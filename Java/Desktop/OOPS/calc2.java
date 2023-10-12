import java.util.Scanner;
class Calculator
 {
   
	private int a,b;
	public void setData(int a,int b)
	{
	  this.a=a;
	  this.b=b;
	}
	public void getData(int a,int b)
	{
	  System.out.println("A="+a+  "B="+b);
	}
	public int add()
	{
	  int c=this.a+this.b;
	  return c;

	}
	public int sub()
	{
	  int c=this.a-this.b;
	  return c;


	}
	public int mul()
	{
	  int c=this.a*this.b;
	  return c;

	}
	public int div()
	{
	  int c=this.a/this.b;
	  return c;

	}
	public int mod()
	{
	  int c=this.a%this.b;
	  return c;

	}
   }
  class Test
  {
    public static void main(String args[])
    {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res;    
        System.out.println("Your Choice are");
        System.out.println("\tPRESS 1.ADDITION      :\tPRESS 2.SUBTRACTION");
        System.out.println("\tPRESS 3.MULTIPLICATION:\tPRESS 3.DIVISION");
        System.out.println("\tPRESS 5.MODULES       :\tPRESS 6.EXIT");
        System.out.println("ENTER YOUR Choice ");
        int ch=sc.nextInt();
        Calculator ob=new Calculator();
        ob.setData(a,b);
        ob.getData(a,b);
      //  do
       //{
        switch(ch)
        {
	  case 1: res=ob.add();
	       System.out.println("Addition= "+res);
	  break;
	  case 2: res=ob.sub();
	       System.out.println("Subtraction= "+res);
	       break;    
	  case 3: res=ob.mul();
	       System.out.println("Multiplication= "+res);
	       break;
	  case 4: res=ob.div();
	       System.out.println("Division= "+res);
	       break;
	  case 5: res=ob.mod();
	       System.out.println("Modules= "+res);
	       break;
	  case 6: System.exit(0);
      
        }
     //}
     //while(ch!=6);
  }
}	 
		

