import java.util.*;
class Test
  {
    public static void main(String args [])
       {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter any two number");
          int x=sc.nextInt();
          int y=sc.nextInt();
          int i=1;
          double fact=1,power=1,sum=0;
          
         for(fact=1,power=1,sum=0;(i<=y);i++)
          {
             fact=fact*i;
             power=power*x;
             System.out.print("!"+i+"/"+x+"^"+i);
             sum=sum+fact/power;
             if(i<y)
             System.out.print("+");
           }
           System.out.print("="+sum);
            
        } 
      }     
