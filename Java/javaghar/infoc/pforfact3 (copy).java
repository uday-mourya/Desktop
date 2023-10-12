import java.util.*;
class Test
{
   public static void main(String args [])
    {
       Scanner sc =new Scanner (System.in);
       System.out.println("Enter two number");
       int x=sc.nextInt();
       int y=sc.nextInt();
       int i=1;
       double sum=0,power=1;
        
       do
        {  
          power=power*x;
          System.out.print((1*i+1)+"/"+x+"^"+i);
          sum=sum+(1*i*1)/power;
          if(i<y)
          System.out.print("+");
          i++;
        }
       while(i<=y);
          System.out.print("="+sum);
    }
    }      
