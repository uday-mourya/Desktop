import java.util.Scanner;
class Test
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Any number");
  int n=sc.nextInt();
  int i=1,sum=0,fact=1;
  do
  {
   fact=fact*i;
   if(i%2==0)
   {
   sum=sum-fact;
    System.out.print("!"+i+"+"); 
   } 
   else
   {
   sum=sum+fact;
   System.out.print("!"+i);
   if(i<n)
   System.out.print("-");
   }
   i++;
   }
   while(i<=n);
   System.out.print("="+sum);
   }
   }
