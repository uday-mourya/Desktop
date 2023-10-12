import java.util.Scanner;
class Test
{
 public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Any number");
  int n=sc.nextInt();
  int i=1,sum=0,fact=1;
  do
  {
   fact=i*i*i;
   System.out.print(fact);
   if(i<n)
   System.out.print("+");
   sum=sum+fact;
   i++;
   }
   while(i<=n);
   System.out.print("="+sum);
  }
}
   
   
 
