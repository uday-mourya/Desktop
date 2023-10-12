import java.util.Scanner;
class Doseries{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int fact=1;
   	  int sum=0;
   	  do
   	  { 
   	    fact=fact*i;   
   	    if(i%2==0){   
   	       sum=sum+fact;
   	       System.out.print("+!" +i);
   	       i++;
   	    }  
   	    else
   	     {
   	      sum=sum-fact;
   	      System.out.print("-!"+i);
   	      i++;
   	     }  
   	  
   	    } 
   	    while(i<=n);
   	    {
   	    System.out.println("="+sum); 
   	    }
 }
 }  	 
