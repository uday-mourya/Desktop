import java.util.Scanner;
class Test
{
  public static void main(String args[])
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("enter two value");
  int x=sc.nextInt();
  int y=sc.nextInt();
  int i=1,power=1;
  while(i<=y)
  {
   power=power*x;
   i++;
   }
   System.out.println("="+power);
   }
   }
