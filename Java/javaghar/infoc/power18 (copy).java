import java.util.Scanner;
class Test
{
  public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("enter two value");
  int x=sc.nextInt();
  int y=sc.nextInt();
  int i=1;
  double power=1,sum=0,k=0;
  while(i<=y)
  {
   power=power*x;
   System.out.print((2*i-1)+"/"+x+"^"+i);
   k=(2*i-1)/power;
   sum=sum+k;
   if(i<y)
   System.out.print("+");
   i++;
   }
   System.out.print("="+sum);
   }
   }
