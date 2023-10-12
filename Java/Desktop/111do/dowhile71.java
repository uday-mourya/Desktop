import java.util.Scanner;
class Test{
  //x^1/1-x^3/3+x^5/5-x^7/7
  public static void main(String args[]){
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
      {
        sum=sum+a/pow;
        System.out.print(x+"^"+i+"/"+i);
        if(a<y)
        System.out.print("-");
       }
       else
       {
        sum=sum-(a/pow);
        System.out.print(x+"^"+i+"/"+i);
        }
        if(a%2==0)
      System.out.print("+"); 
        a++;
      }
        i++;
    }
      while(a<=y);
        System.out.println(" = "+sum);
  }
}
