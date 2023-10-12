import java.util.Scanner;
class Test{ 
  //!1/x^2+!3/x^4+!5/x^6+!7/x^8
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any Number");
    int x=sc.nextInt();
    System.out.println("Enter Power");
    int y=sc.nextInt();
    double pow=x,sum=0,fact=1;
    int a=1;
    for (int i=1;a<=y;i++)
    {
      pow=pow*(x+1);
      fact=fact*i;
      if(i%2!=0)
      {
       sum=sum+pow/(fact);
       System.out.print( x+ "^" +i+ "/!" +(a*2-1));
       if(a<y)
         System.out.print("+");
         a++;
      }
       
    }  
      System.out.println(" = " +sum);
}
}      
