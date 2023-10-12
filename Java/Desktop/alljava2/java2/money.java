import java.util.Scanner;
class Money
{
	public static void main(String [] args)
	{	
          Scanner sc =new Scanner(System.in);
          System.out.println("Enter Amount");
          int a=sc.nextInt();
          int b=a/500;
          if(a>=500)
            System.out.println("500 note :" +b);
          a=a%500;
           
          b=a/200;
          if(a>=200)
            System.out.println("200 note :" +b);
          a=a%200;
          
          b=a/100;
          if(a>=100)
            System.out.println("100 note :" +b); 
          a=a%100;
          
          b=a/50;
          if(a>=50)
            System.out.println("50  note :" +b);
	   a=a%50;
	   
	   b=a/20;
	   if(a>=20)
            System.out.println("20  note :" +b);
           a=a%20;
           
           b=a/10;
           if(a>=10)
            System.out.println("10  note :" +b);
           a=a%10;
           
           b=a/5;
           if(a>=5)
            System.out.println("5  note  :" +b);
           a=a%5;
           
           b=a/2;
           if(a>=2) 
            System.out.println("2   note :" +b);
           a=a%2;
           
           b=a/1;
           if(a>=1)
            System.out.println("1   note :" +b);
 
 
        }
}
