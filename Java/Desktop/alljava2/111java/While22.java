import java.util.Scanner;
class Test
{//x^2/2+x^4/4+x^6/6+x^8/8
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
      
      if(i%2==0)
      {
        sum=sum+pow/i;
        System.out.print(x+"^"+i+"/"+i);
        if(a<y)
       System.out.print("+"); 
        a++;
      }
        i++;
    }
    System.out.println(" Sum = "+sum);
  }
}
