import java.util.Scanner;
class Doseries7{
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
   	       sum=sum+(i/fact);
   	       System.out.print("!" +i+ "/" +i);
   	       if(i<n){
   	          System.out.print("+");
   	       }
   	       
   	     i++; 
   	    }
   	    while(i<=n);
   	    {
   	      System.out.println("="+sum); 
   	      
   	    }
   	    
   	   
 }
 }  	 
