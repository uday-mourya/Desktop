import java.util.Scanner;
class Calc
{
  public static void main(String args[])
  { 
   
   Scanner sc=new Scanner(System.in);
   System.out.println("you are choice..");
   System.out.println("\t1.Natural no. series and sum:");
   System.out.println("\t2.Even no.series and sum:");
   System.out.println("\t3.Odd no.series and sum:");
   System.out.println("\t4.square of natural no.series and sum:");
   System.out.println("\t5.cube of natural no.series and sum:");
   int i,j,sum;
   System.out.print("Enter your choice ");
   int ch=sc.nextInt();
   System.out.println("Enter any natural number");
     int n= sc.nextInt();
   switch (ch)
   {
  
   case 1:
  
      i=1;
      sum=0;
     while(i<=n)
     { 
     System.out.print(i);
     if(i<n)
     System.out.print("+");
     sum=sum+i;
     i++;  
     } 
     System.out.print("="+sum);
     break;
   case 2:
  
     i=1;
     j=0;sum=0;
     while(i<=n)
     {    
      j=i*2; 
      sum=sum+j;
      System.out.print(j);
      i++;  
      if(i<=n)
      System.out.print("+");
      }
      System.out.print("="+sum);  
      break;
   case 3:
  
       i=1;
       j=0;sum=0;
      while(i<=n)
      {    
      j=2*i-1; 
      sum=sum+j;
      System.out.print(j);
      i++; 
      if(i<=n)
      System.out.print("+");
      }  
      System.out.print("="+sum);
      break;
   case 4:
  
       i=1;sum=1;
      j=0;
      while(i<=n)
      {
      sum=i*i;
      j=j+sum;
      System.out.print(sum);
      i++;  
      if(i<=n)
      System.out.print("+");
       }  
      System.out.print("="+j);
       break;
   case 5:
  
      i=1;sum=1;
      j=0;
     while(i<=n)
     {
      sum=i*i*i;
      j= j+sum;
      System.out.print(sum);
      i++;
      if(i<=n)
      System.out.print("+"); 
     }  
      System.out.print("="+j);
      break;
    default:
     System.out.println("invalid choice:"); 
    break;
  }     
   }
   }
