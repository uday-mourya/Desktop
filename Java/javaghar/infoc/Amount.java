import java.util.Scanner;
class Even
	{
 		public static void main(String Args[])
 			{ 
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter any amount");
				 int n= sc.nextInt();
				 int a,b,c,d,e,f,g,h,i,s;
				 s= n/2000; 
				 a= n%2000/500; 
				 b= n%500/200;
				 c= n%500%200/100;
				 d= n%500%200%100/50;
				 e= n%500%200%100%50/20;
				 f= n%500%200%100%50%20/10;
				 g= n%500%200%100%50%20%10/5;
				 h= n%500%200%100%50%20%10%5/2;
				 i= n%500%200%100%50%20%10%5%2/1;
				 System.out.println("2000="+s);  
				 System.out.println("500="+a);  
				 System.out.println("200="+b);  
				 System.out.println("100="+c);  
				 System.out.println("50="+d);  
				 System.out.println("20="+e);  
				 System.out.println("10="+f);  
				 System.out.println("5="+g);  
				 System.out.println("2="+h);  
				 System.out.println("1="+i);    
			}
	}
