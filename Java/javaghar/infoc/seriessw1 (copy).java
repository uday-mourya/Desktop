import java.util.Scanner;
class Test
{
  public static void main(String args[])
  { 
   
   Scanner sc=new Scanner(System.in);
   System.out.println("you are choice..");
   System.out.println("\t1.!1/2+!2/3+!3/4+!4/5+!5/6:");
   System.out.println("\t2.!1/2-!2/3+!3/4-!4/5+!5/6:");
   System.out.println("\t3.-!1/2+!2/3-!3/4+!4/5-!5/6:");
   System.out.println("\t4.2/!1+3/!2+4/!3+5/!4+6/!5:");
   System.out.println("\t5.2/!1-3/!2+4/!3-5/!4+6/!5:");
   System.out.println("\t6.-2/!1+3/!2-4/!3+5/!4-6/!5:");   
    System.out.println("Enter your choice..");
    int ch=sc.nextInt();
    int i=1;
    double a=1,s=0,sum=0,fact=1;
    System.out.println("Enter any natural number");
    int n=sc.nextInt();
    switch(ch)
    {
     
     case 1:
            while(i<=n)
           {
           fact =fact*i;
           sum=fact/(i+1);
           System.out.print("!"+i+"/"+(i+1));
           s=sum+s; 
           i++;
          if(i<=n)
          System.out.print("+");
          } 
          System.out.print("=" +s); 
          break;   
     case 2:
           while(i<=n)
          {
          fact =fact*i;  
          if(i%2==0)
          {
          sum=sum-fact/(i+1);
          System.out.print("!"+i+"/"+(i+1)+"+");
          }
          else
          {
          sum=sum+fact/(i+1);
          System.out.print("!"+i+"/"+(i+1));
          if(i<n) 
          System.out.print("-");
          }
          i++;
          }
          System.out.print("="+sum);
         break;
     case 3:
           while(i<=n)
           {
           fact =fact*i;
           if(i%2==0)
           {
           sum=sum+fact/(i+1);
           System.out.print("!"+i+"/"+(i+1));
           }
           else
           {
           sum=sum-fact/(i+1);
           System.out.print("-"+"!"+i+"/"+(i+1));
           if(i<n) 
           System.out.print("+");
           }
           i++;
           }
           System.out.print("="+sum);
          break;
      case 4:
             while(i<=n)
             {
             fact=fact*i;
             sum=(i+1)/fact;
             System.out.print((i+1)+"/"+"!"+i);
             s=sum+s; 
             i++;
             if(i<=n)
             System.out.print("+");
             } 
             System.out.print("=" +s);     
           break;
       case 5:
            while(i<=n)
            {
            fact =fact*i;  
            if(i%2==0)
            {
            sum=sum-(i+1)/fact;
            System.out.print((i+1)+"/"+"!"+i+"+");
            }
            else
            {
            sum=sum+(i+1)/fact;
            System.out.print((i+1)+"/"+"!"+i);
            if(i<n) 
            System.out.print("-");
            }
            i++;
            }
            System.out.print("="+sum);       
            break;
        case 6:
            while(i<=n)
            {
            fact =fact*i;  
            if(i%2==0)
            {
            sum=sum+(i+1)/fact;
            System.out.print((i+1)+"/"+"!"+i );
            }
            else
            {
            sum=sum-(i+1)/fact;
            System.out.print("-"+(i+1)+"/"+"!"+i);
            if(i<n) 
            System.out.print("+");
            }
            i++;
            }
            System.out.print("="+sum);
  }
 }     
} 
