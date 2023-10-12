import java.util.Scanner;
class Test
{//!1/1+!3/3+!5/5
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int n=sc.nextInt();
    int fact=1,sum=0,i=1,a=1;
    
    while(a<=n)
    {
      fact=fact*i;
     
      if(i%2!=0)
      {
      
        sum=sum+fact/i;
        System.out.print("!"+(a*2-1)+"/"+(a*2-1));
        if(a<n)
        System.out.print("+");
        a++;
      }
        i++;
    }
    System.out.println(" Sum = "+sum);
  }
}
