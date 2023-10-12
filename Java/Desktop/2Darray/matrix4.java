//find minimum number in matrix
import java.util.Scanner;
class Test
    {
     public static void main(String []args)
      { 
       Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][5];  	
       System.out.println("Enter dimensions");       
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
	   System.out.println("minimum number  of given matrix is");
	  int min=a[0][0];
	  for( int i=0; i<m; i++)
         {  
           for( int j=0; j<n; j++)
           {
             if(min>a[i][j]) 
	      min=a[i][j];  
	   }	                 
      }
	  System.out.println("minimum number");
		 System.out.println(min);   
    }
}    
                 
