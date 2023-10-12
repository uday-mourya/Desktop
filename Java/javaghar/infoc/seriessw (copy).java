import java.util.Scanner;
class Test
{
  public static void main(String args[])
  { 
   
   Scanner sc=new Scanner(System.in);
   System.out.println("you are choice..");
   System.out.println("\t1.!1+!2+!3+!4+!5:");
   System.out.println("\t2.!1-!2+!3-!4+!5:");
   System.out.println("\t3.-!1+!2-!3+!4-!5:");
   System.out.println("\t4.!1/1+!2/2+!3/3+!4/4+!5/5:");
   System.out.println("\t5.!1/1-!2/2+!3/3-!4/4+!5/5:");
   System.out.println("\t6.-!1/1+!2/2-!3/3+!4/4-!5/5:");   
    System.out.println("Enter your choice..");
    int ch=sc.nextInt();
    int i=1,fact=1;
    int s=0,sum=0;
    System.out.println("Enter any natural number");
    int n=sc.nextInt();
  switch(ch)
    {
   case 1:
    
    while(i<=n)
     {
      fact=fact*i;
      System.out.print("!"+i);
      sum=sum+fact;
      if(i<n)
      System.out.print("+");
      i++;
      }
      System.out.print("="+sum);
      break;
    case 2:
     
    while(i<=n)
     {
        fact =fact*i;
        System.out.print("!"+i);
        if(i%2==0)
        {
          sum=sum-fact;
          System.out.print("+");
        }
        else
        {
          sum=sum+fact;
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
         System.out.print("+!"+i);
         sum=sum+fact;   
        }
        else
        { 
         System.out.print("-!"+i);
         sum=sum-fact;
        }
         i++;
      } 
         System.out.print("="+sum);
         break;
      case 4:
      
       while(i<=n)
       {
        fact =fact*i;
        System.out.print("!"+i+"/"+i);
        sum=fact/i;
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
         sum=sum-(fact/i);
         System.out.print("!"+i+"/"+i+"+");
        }
        else
        {
        sum=sum+(fact/i);
        System.out.print("!"+i+"/"+i);
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
       sum=sum+(fact/i);
       System.out.print("+!"+i+"/"+i);
      }
      else
      {
      sum=sum-(fact/i);
      System.out.print("-!"+i+"/"+i);
      }
      i++;
      }
      System.out.print("="+sum);   
    }  
   } 
  } 
