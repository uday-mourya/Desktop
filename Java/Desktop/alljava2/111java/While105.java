import java.util.Scanner;
class Test
{//-!1/x^2+!3/x^4-!5/x^6+!7/x^8
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int x=sc.nextInt();
    System.out.println("Enter any natural number");
    int y=sc.nextInt();
    double pow=x,sum=0,a=1,fact=1;
    int i=1;
    while(a<=y)
    {
      pow=pow*x;
      fact=fact*i;
      
      if(i%2!=0)
      {
      if(a%2!=0)
      {
        sum=sum-fact/pow;
        System.out.print("-"+"!"+i+"/"+x+"^"+(i+1));
       }
       else
       {
        sum=sum+fact/pow;
        System.out.print("+"+"!"+i+"/"+x+"^"+(i+1));
        }
        a++;
      }
        i++;
    }
    System.out.println(" Sum = "+sum);
  }
}
