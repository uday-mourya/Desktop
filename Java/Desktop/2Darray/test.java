import java.util.Scanner;
class Test
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any natural number : ");
    int n=sc.nextInt();
    int fact=1,sum=0,i=1,a=1;
    
    while(a<=n)
    {
      fact=fact*i;
        if(i%2==0)
        {
          if(a%2==0)
          {
            sum=sum-fact;
          }
          else
          {
            sum=sum+fact;
          }
        a++;
        }
      i++;
    }
    System.out.println(sum);
  }
}