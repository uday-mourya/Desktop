import java.util.Scanner;
class Test{
  //x^1/1+x^3/3+x^5/5+x^7/7
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any natural number");
    int y=sc.nextInt();
    double fact=1,sum=0,a=1;
    int i=1;
   do
    {
      fact=fact*i;
      
      if(i%2==0)
      {
        sum=sum+fact/(a*2-1);
       // System.out.print(x+"^"+i+"/"+i);
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
