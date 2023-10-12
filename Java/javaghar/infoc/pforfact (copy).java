import java.util.*;
class Test
{
  public static void main(String args [])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter two Number");
     int x=sc.nextInt();
     int y=sc.nextInt();
     int i=1;
     double sum=0,power=1;
     
      do
      {  
         power=power*x;
         System.out.print(x+"^"+i+"/"+(1*i+1));
         sum=sum+power/(1*i+1);
         if(i<y)
         System.out.print("+");
         i++;
      }
     while(i<=y);
         System.out.print("="+sum);
         
  }    
}        
