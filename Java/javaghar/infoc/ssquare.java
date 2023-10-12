import java.util.Scanner;
class Test
{
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  int i=1,sum=1;
  int a=0;
  while(i<=n)
  {
    sum=i*i;
    a=a+sum;
    System.out.print(sum);
    i++;  
    if(i<=n)
    System.out.print("+");
  }  
  System.out.print("="+a);
 }
} 
