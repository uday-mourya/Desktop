import java.util.Scanner;
class Test
{//x^1/!2-x^3/!4+x^5/!6-x^7/!8
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
      fact=fact*(i+1);
      if(i%2!=0)
      {
      if(a%2!=0)
      {
        sum=sum+pow/fact;
        System.out.print(x+"^"+i+"/!"+(i+1));
        if(a<y)
        System.out.print("-");
       }
       else
       {
        sum=sum-pow/fact;
        System.out.print(x+"^"+i+"/!"+(i+1));
        }
        if(a%2==0)
         System.out.print("+"); 
        a++;
      }
        i++;
    }
    System.out.println(" Sum = "+sum);
  }
}
