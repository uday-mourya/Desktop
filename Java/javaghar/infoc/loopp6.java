import java.util.*;
class Test
   {
       public static void main(String args[])
           {
	  	    Scanner sc=new Scanner(System.in);
	   	    System.out.println("Enter any Number");
		    int n=sc.nextInt();
		    int i=1,j=1,k=1,m=1;
		    for(i=1;i<=5;i++)
		    {  
		      for(j=1;j<=i*2-1;j++)
		      { 
		        System.out.print("*");
		      } 
	              System.out.println("");
	            }
	            for(k=4;k>=0;k--)
                     {
                         for(m=1;m<=k*2-1;m++)
                         {
                           System.out.print("*");
                         } 
                         System.out.println("");	            
                     }
            }          	            
   }
		      
