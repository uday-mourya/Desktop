import java.util.Scanner;
class Test{
  //x^1/1+x^3/3+x^5/5+x^7/7
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int x=sc.nextInt();
    System.out.println("Enter Power");
    int y=sc.nextInt();
    double pow=1,sum=0,a=1;
    
    for (int i=1;a<=y;i++)
    {
      pow=pow*x;
      
      if(i%2==0)
      {
        sum=sum+a/pow;
        System.out.print(x+"^"+i+"/"+i);
        if(a<y)
       System.out.print("+"); 
        a++;
      }
       
    }
    System.out.println(" Sum = "+sum);
  }
}
