import java.util.Scanner;
class Series11{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  double fact=1;
   	  double sum=0;
   	  for(i=1;i<=n;i++)
   	  { 
   	  
   	    fact=fact*i; 
   	    if(i%2==0){   
   	       sum=sum-((i+1)/fact);
   	       System.out.print((i+1)+ "/!" +i);
   	       if(i<n){
   	         System.out.print("+");
   	       }
   	       }
   	      
   	    else 
   	     { 
   	      
   	      sum=sum+((i+1)/fact);
   	      System.out.print((i+1)+"/!" +i);
   	      if(i<n){
   	          System.out.print("-");
   	      }
   	      } 
   	  
   	    } 
   	
   	      System.out.println( "="+sum);
   	    
 }
 }  	 
