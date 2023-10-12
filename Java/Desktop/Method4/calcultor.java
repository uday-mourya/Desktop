import java.util.Scanner;
class Test
{
     public static void main(String args[])
      {
        Test ob=new Test();
        ob.choice();
      }
          public void add( int a, int  b)
           {
		int add=a+b; 
		System.out.println("Addition="+add);
           }
	   public void sub(int a, int b)
	   {
		int sub=a-b; 
		System.out.println("substraction="+sub);
	   }
           public void mul(int a,int  b)
	   {
	      int mul=a*b; 
              System.out.println("Multipication="+mul);
           }
           public void div(int a,int b)
           {
              int div=a/b; 
              System.out.println("div="+div);
           }
           public void mod(int a,int b)
           {
              int mod=a%b;
              System.out.println("modulous="+mod);
           }
   public void choice()
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first and second number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.print("your choices are");
	System.out.println("1-addition\n\t2-substraction\n\t3-multipication");
	System.out.println("\t4-division\n\t5-modulous");
	System.out.println("enter your choice");
	int ch=sc.nextInt();
	Test ob=new Test();
	switch(ch)
      {
	case 1:
	this.add(a,b);
	break;
	case 2:
	this.sub(a,b);
	break;
	case 3:
	this.div(a,b);
	break;
	case 4:
	this.mul(a,b);
	break;
	case 5:
	this.mod(a,b);
	break;
	default:
	System.out.println("wrong choice");
     }
  }
}





