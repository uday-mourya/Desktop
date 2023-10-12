import java.util.Scanner;
class Test
{
  public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("enter two value");
  int x=sc.nextInt();
  int y=sc.nextInt();
  int i=1,power=1,sum=0;
  while(i<=y)
  {
   power=power*x;
   if(i%2==0)
   {
   System.out.print(x+"^"+i+"+");
   sum=sum-power;
   }
   else
   {
   System.out.print(x+"^"+i);
   sum=sum+power;
   if(i<y)
   System.out.print("-");
   }
   i++;
   }
   System.out.print("="+sum);
   }
   }
