import java.util.Scanner;
class Test
{//-1/x^1+3/x^3-5/x^5+7/x^7
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int x=sc.nextInt();
    System.out.println("Enter any natural number");
    int y=sc.nextInt();
    double pow=1,sum=0,a=1;
    
    for (int i=1;a<=y;i++)
    {
      pow=pow*x;
      
      if(i%2!=0)
      {
      if(a%2!=0)
      {
        sum=sum-i/pow;
        System.out.print("-"+i+"/"+x+"^"+i);
       }
       else
       {
        sum=sum+i/pow;
        System.out.print("+"+i+"/"+x+"^"+i);
        }
        a++;
      }

    }
    System.out.println(" Sum = "+sum);
  }
}
