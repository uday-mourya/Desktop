import java.util.*;
class Test
   {
    	public static void main(String args[])
    		{
	  	    Scanner sc=new Scanner(System.in);
	   	    System.out.println("Enter any Number");
		    int n=sc.nextInt();
		    int i=1,j=1,k=1;
		    for(i=1;i<=5;i++)
		    {  
		        for(k=i;k<=5;k++)
		        { 
		           System.out.print(" ");    	     
		        } 
		        for(j=1;j<=i*2-1;j++)
		         {
		            System.out.print("*");        
		         } 	
		         System.out.println("");
		    }
	       } 	                            
  }	       
	       
