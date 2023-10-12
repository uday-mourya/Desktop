import java.util.Scanner;
class Test{
  //x^1/!2-x^3/!4+x^5/!6-x^7/!8
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int y=sc.nextInt();
    double pow=1,sum=0,a=1,fact=1;
    int i=1;
    while(a<=y)
    {
      fact=fact*i;
      if(i%2==0)
      {
      if(a%2==0)
      {
        sum=sum+a/fact;
        System.out.print("!" +i+ "/" +a);
        if(a<y)
        System.out.print("-");
       }
       else
       {
        sum=sum-(a/fact);
        System.out.print("!" +i+ "/" +a);
        
        if(a<y)
         System.out.print("+");
       }   
        a++;
      }
        i++;
    }
    System.out.println(" = "+sum);
  }
}
