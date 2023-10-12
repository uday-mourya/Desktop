import java.util.Scanner;
class Test
{//1/!1+3/!3+5/!5
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int n=sc.nextInt();
    double fact=1,sum=0,a=1;
    int i=1;
   do
    {
      fact=fact*i;
     
      if(i%2!=0)
      {
      
        sum=sum+i/fact;
        System.out.print((a*2-1)+"/"+"!"+(a*2-1));
        if(a<n)
        System.out.print("+");
        a++;
      }
        i++;
    }
    while(a<=n);
    System.out.println(" Sum = "+sum);
  }
}
