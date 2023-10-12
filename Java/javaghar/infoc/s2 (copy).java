import java.util.Scanner;
class Test
{
 public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any natural number");
  int n=sc.nextInt();
  int sum=0;
  int i=1,fact=1;
  while(i<=n)
  {
  fact=fact*i;
  System.out.print("!"+i);
  sum=sum+fact;
  if(i<n)
  System.out.print("+");
  i++;
  }
  System.out.print("="+sum);
 }
}
