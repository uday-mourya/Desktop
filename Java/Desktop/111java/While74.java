import java.util.Scanner;
class Test{
   //!1/x^1-!3/x^3+!5/x^5-!7/x^7
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int y=sc.nextInt();
    double sum=0,a=1,fact=1;
    int i=1;
    while(a<=y)
    {
      fact=fact*i;
      if(i%2==0)
      {
      if(a%2==0)
      {
        sum=sum+fact/(a*2-1); 
       }
       else
       {
        sum=sum-fact/(a*2-1); 
        
       }
        a++;
        
        }
        i++;
    }
   
    System.out.println(" = "+sum);
  }
}
