import java.util.Scanner;
class Test
{ 
public static void main(String args[])
 { 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Any Number");
 int n=sc.nextInt();
 int i=1,a=0,b=1,c=0;
 while(i<=n)
 { 
   System.out.println(+i+"="+c);
   a=b;
   b=c;
   c=a+b;
   i++;
  }
 }
 }  
