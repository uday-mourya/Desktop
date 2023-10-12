//find maximum number in matrix
import java.util.Scanner;
class Test
    {
     public static void main(String []args)
      { 
       Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][5];  	
       System.out.println("Enter diagonal");       
       int n=sc.nextInt();
       int m=sc.nextInt();	   
       System.out.println("enter matrix element");
       for(int  i=0; i<m; i++)
	{	
         for(int j=0; j<n; j++)	
	 {
           a[i][j]=sc.nextInt();  
	  }		 
        } 
          System.out.println("Given  matrix is");
          for(int  i=0; i<m; i++)
          {		 
	    for(int j=0; j<n; j++)
	   {
             System.out.print("\t"+a[i][j]); 
	   }
              System.out.println(" ");			
          }     	  
	   System.out.println("Max number of given matrix is");
	   int max=0; 
	  for(int  i=0; i<m; i++)
          {   	 
           for(int j=0; j<n; j++)
	    {
             if(a[i][j]>max)   
	      max=a[i][j];
	    }	 
                  
          }
	   System.out.println("maximum number");
	   System.out.println(max);   
    }
}    
                 
