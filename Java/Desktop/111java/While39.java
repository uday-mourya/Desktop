import java.util.Scanner;
class Test
{//-x^1/!1+x^3/!3-x^5/!5+x^7/!7
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int x=sc.nextInt();
    System.out.println("Enter any natural number");
    int y=sc.nextInt();
    double pow=1,sum=0,a=1,fact=1;
    int i=1;
    while(a<=y)
    {
      pow=pow*x;
      fact=fact*i;
      
      if(i%2!=0)
      {
      if(a%2!=0)
      {
        sum=sum-pow/fact;
        System.out.print("-"+x+"^"+i+"/!"+i);
       }
       else
       {
        sum=sum+pow/fact;
        System.out.print("+"+x+"^"+i+"/!"+i);
        }
        a++;
      }
        i++;
    }
    System.out.println(" Sum = "+sum);
  }
}
