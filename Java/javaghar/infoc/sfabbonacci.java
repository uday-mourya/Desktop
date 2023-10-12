import java.util.Scanner;
class Test
{ 
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter any number");
 int n=sc.nextInt();
 int i=1,a=-1,b=1;
 while(i<=n)
 {
  int c=a+b;
  System.out.println(+i+"="+c);
  a=b;
  b=c;
  i++;
  }
  }
  }
  
  
