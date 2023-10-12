import java.util.Scanner;
class Test{
   //!2/x^1+!4/x^3+!6/x^5+!8/x^7
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int y=sc.nextInt();
    double pow=1,sum=0,fact=1,a=1;
    int i=1;
    do
    {
      
      fact=fact*i;
      
      if(i%2!=0)
      { 
        sum=sum+a/fact;
        System.out.print(a+"/!" +i);
        if(a<y)
        System.out.print("+"); 
        a++;
      }
        i++;
    }
      while(a<=y);
     System.out.println(" = "+sum);
  }
}
