import java.util.*;
class Test
{
public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter any Number");
 int n=sc.nextInt();
 int i=1;
 double sum=0,fact=1;
 do
 {
  fact=fact*i;
  if(i%2==0)
  {
  System.out.print("!"+i+"/"+(i+1));
  sum=sum+fact/(i+1);
  }
  else
  {
   System.out.print("-"+"!"+i+"/"+(i+1));
   if(i<n)
   System.out.print("+");
   sum=sum-fact/(i+1);
  }
  i++;
  }
  while(i<=n);
  System.out.print("="+sum);
  }
  }
