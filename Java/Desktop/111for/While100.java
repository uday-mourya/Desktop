import java.util.Scanner;
class Test{
  //x^2/!1-x^4/!3+x^6/!5-x^8/!7
  public static void main(String args[]){
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
      fact=fact*(i+1);
      if(i%2!=0)
      {
        sum=sum+pow/fact;
        a++;
      }
      
    }
      System.out.println(" = " +sum);
    
}
}      
