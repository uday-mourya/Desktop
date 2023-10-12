import java.util.Scanner;
class Test
{//x^1-x^3+x^5-x^7
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int x=sc.nextInt();
    System.out.println("Enter any natural number");
    int y=sc.nextInt();
    double pow=1,sum=0,a=1;
    int i=1;
    while(a<=y)
    {
      pow=pow*x;
      
      if(i%2!=0)
      {
      if(a%2!=0)
      {
        sum=sum+i/pow;
        System.out.print(i+"/"+x+"^"+i);
        if(a<y)
        System.out.print("-");
       }
       else
       {
        sum=sum-i/pow;
        System.out.print(i+"/"+x+"^"+i);
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
