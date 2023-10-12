import java.util.Scanner;
class Test{
  // 2/2!-4/4!+6/6!....n
  public static void main(String[] args)
  {
	 Scanner sc = new Scanner(System.in);
   	 System.out.println("Enter any Number");
   	 int n=sc.nextInt();
   	 double fact=1,a=1,sum=0;
   	 int i=1;
   	 
   	 while(a<=n)
   	 {
   	  fact=fact*i;
   	  if(i%2==0)
   	   {
   	     if(a%2==0)
   	       {
   	         sum=sum+(i/fact);    
   	       } 
   	       else
   	       {
   	         sum=sum-(i/fact);
   	       }
   	     a++;
   	   }
   	   i++;
   	 }
   	 System.out.println(sum);   	 
    }
 }    	    
   	 
   	      
   	      
