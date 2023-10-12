import java.util.Scanner;
class Test
{//x^2/!1-x^4/!3+x^6/!5-x^8/!7
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int x=sc.nextInt();
    System.out.println("Enter any natural number");
    int y=sc.nextInt();
    double pow=x,sum=0,fact=1;
    int a=1;
    for (int i=1;a<=y;i++)
    {
      pow=pow*x;
      fact=fact*i;
      if(i%2!=0)
      {
      if(a%2!=0)
      {
        sum=sum+(pow/fact);
        System.out.print(x+"^"+i+"/!"+(a*2-1));
        if(a<y)
        System.out.print("-");
       }
       else
       {
        sum=sum-pow/fact;
        System.out.print(x+"^"+i+"/!"+(i*2-1));
        }
        if(a%2==0)
         System.out.print("+"); 
        a++;
      }
        
    }
    System.out.println(" Sum = "+sum);
  }
}
