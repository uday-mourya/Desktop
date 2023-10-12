import java.util.Scanner;
class Test
{//!2/2-!4/4+!6/6
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int n=sc.nextInt();
    int fact=1,sum=0,i=1,a=1;
   do
    {
      fact=fact*i;
      
      if(i%2==0)
      {
      if(a%2==0)
      {
        sum=sum-(fact/i);
      }
      else
      {
         sum=sum+fact/i;
      }
      a++;
      }
        i++;
    }
     while(a<=n);
    System.out.println(" Sum = "+sum);
  }
}
