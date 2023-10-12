import java.util.Scanner;
class Currency{
public static void main(String [] args)
{	Scanner sc =new Scanner(System.in);
        System.out.println("Enter Amount");
	int a=sc.nextInt();
	int n = a/500;
	System.out.println("500 RS= "+n);
	int t = a/200;
	System.out.println("200 RS = "+t);
	int b = a/100;
	System.out.println("100 RS = "+b);
	int c = a/50;
	System.out.println("50 RS = "+c);
	int d = a/20;
	System.out.println("20 Rs = "+d);
	int e = a/10;
	System.out.println("10 RS = "+e);
	int l = a/5;
	System.out.println("5 RS = "+l);
	int m = a/2;
	System.out.println("2 RS = "+m);
	int p = a/1;
	System.out.println("1 RS = "+p);
	
	
	
	
	
}
}
