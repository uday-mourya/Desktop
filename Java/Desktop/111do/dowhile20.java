import java.util.Scanner;
class Test
{//x^2-x^4+x^3-x^4
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int x=sc.nextInt();
    System.out.println("Enter any natural number");
    int y=sc.nextInt();
    double pow=1,sum=0,a=1;
    int i=1;
   do
    {
      pow=pow*x;
      
      if(i%2==0)
      {
      if(a%2==0)
        sum=sum-pow;
      else
        sum=sum+pow;
        a++;
      }
        i++;
    }
    while(a<=y);
    System.out.println(" Sum = "+sum);
  }
}
