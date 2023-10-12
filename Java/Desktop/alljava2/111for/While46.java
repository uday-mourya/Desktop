import java.util.Scanner;
class Test{
   //!2/x^1+!4/x^3+!6/x^5+!8/x^7
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int x=sc.nextInt();
    System.out.println("Enter Power");
    int y=sc.nextInt();
    double pow=1,sum=0,fact=1,a=1;
  
    for (int i=1;a<=y;i++)
    {
      pow=pow*(x*2-1);
      fact=fact*(i+1);
      
      if(i%2==0)
      {
        sum=sum+fact/pow;
        System.out.print("!"+(i+1)+"/"+x+"^"+i);
        if(a<y)
       System.out.print("+"); 
        a++;
      } 
       
    }
    System.out.println(" Sum = "+sum);
  }
}
