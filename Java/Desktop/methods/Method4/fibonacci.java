import java.util.Scanner;
class Test
{ 
    public int input()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter any number");
	  int n=sc.nextInt();
	  int  i=1, a=-1, b=1, c=0;
	  int x=7;
	  this.method( i, a, b, c,n);
	  return x;
	}
	 
     public int method(int i,int a,int b,int c,int n )
	{
	 while(i<=n)
	 {
	   c=a+b;
	   System.out.println(i+ "term=" +c);
	   a=b;
	   b=c;
	   i++;	 
        }
       return c;
      }
    public static void main(String args[])
    {
      Test ob=new Test();
      ob.input();
    }
  
