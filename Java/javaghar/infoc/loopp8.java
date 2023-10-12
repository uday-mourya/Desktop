import java.util.*;
class Test
   {
       public static void main(String args[])
           {
	  	    Scanner sc=new Scanner(System.in);
	   	    System.out.println("Enter any Number");
		    int n=sc.nextInt();
		    int i=1,j=1,m=1,k=1,s=1;
		    for(i=1;i<=5;i++)
		    {   
		      for(k=i;k<=4;k++)
		      {
		        System.out.print(" ");
		       }
		      for(j=1;j<=i*2-1;j++)
		      { 
		         System.out.print(j);
		      } 
	              System.out.println("");
	              for(s=i;s<=4;s++)
	              {
	                System.out.print(" ");
	              }  
                      for(m=1;m<=i*2-1;m++)
                      {
                         System.out.print(m);
                      } 
                     
                      System.out.println("");
                      	            
                   }
            }          	            
   }
		      
