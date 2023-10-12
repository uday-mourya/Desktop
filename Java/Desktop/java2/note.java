import java.util.Scanner;
class Note{
public static void main(String [] args)
{	Scanner sc =new Scanner(System.in);
        System.out.println("Enter Amount");
	int a=sc.nextInt();
	int n = a/500;
	int b= a%500;
	System.out.println("500 RS = "+n);
	 int c= b/200;
	 int d =c%200;
	System.out.println("200 RS = "+c);
	int e=d/100;
	int f =d%100;
	System.out.println("100 RS = "+e);
	int g=f/50;
	int h=f%50;
	System.out.println("50 RS = "+g);
	int i=h/20;
	int j=h%20;
	System.out.println("20 RS = "+i);
	int k= j/10;
	int w= j%10;
	System.out.println("10 RS = "+k);
	int m=w/5;
	int l=w%5;
	System.out.println("5 RS = "+m);
	int o=l/2;
	int p=l%2;
	System.out.println("2 RS = "+o);
	int q=p/1;
	int r=q%1;
	System.out.println("1 RS = "+q);
	
	
	
	
	}
	}
