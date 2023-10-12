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
             if(i%2==0)
              {
                System.out.print("!"+i+"/"+x+"^"+i+"+");
                sum=sum-fact/power;
              } 
             else
              {
                System.out.print("!"+i+"/"+x+"^"+i);
                if(i<y)
                   System.out.print("-");
                sum=sum+fact/power;
              }
          }
          System.out.print("="+sum);      
      }    
   }   
