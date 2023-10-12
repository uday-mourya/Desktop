import java.util.Scanner;
class Test
{
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  int i=1;
  while(i<=n)
  {    
   int j=2*i-1; 
    System.out.print(" "+j);
    i++;  
  }  
 }
} 
