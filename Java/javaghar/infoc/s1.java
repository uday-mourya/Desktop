import java.util.Scanner;
class Test
{
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  int i=1;
  int j=0,a=0;
  while(i<=n)
  {    
    j=2*i-1;
    a=a+j;    
    System.out.print(j);
    i++; 
    if(i<=n)
      System.out.print("+");
  }  
    System.out.print("="+a);
 }
} 
