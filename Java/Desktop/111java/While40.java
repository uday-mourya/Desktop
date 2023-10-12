import java.util.Scanner;
class Test
{//!1/x^1+!3/x^3+!5/x^5+!7/x^7
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int x=sc.nextInt();
    System.out.println("Enter any natural number");
    int y=sc.nextInt();
    double pow=1,sum=0,fact=1,a=1;
    int i=1;
    while(a<=y)
    {
      pow=pow*x;
      fact=fact*i;
      
      if(i%2!=0)
      {
        sum=sum+fact/pow;
        System.out.print("!"+i+"/"+x+"^"+i);
        if(a<y)
       System.out.print("+"); 
        a++;
      }
        i++;
    }
    System.out.println(" Sum = "+sum);
  }
}
