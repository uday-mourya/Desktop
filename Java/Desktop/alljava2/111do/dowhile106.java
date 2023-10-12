import java.util.Scanner;
class Test{ 
  //!1/x^2+!3/x^4+!5/x^6+!7/x^8
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any Number");
    int x=sc.nextInt();
    System.out.println("Enter Power");
    int y=sc.nextInt();
    double pow=x,sum=0,fact=1,a=1;
    int i=1;
   do
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
       i++; 
    } 
      while(a<=y); 
      System.out.println(" = " +sum);
}
}      
