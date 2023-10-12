import java.util.Scanner;
class Test
{
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  int i=1,c=0;
  while(i<=n)
  {
    int sum=i*i*i;
    System.out.print(" "+sum);
     c=c+sum;
    System.out.print("+");
    i++;  
  }  
  if(i<=n)
      System.out.print("="+c);
 }
} 
