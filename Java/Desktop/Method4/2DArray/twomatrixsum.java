import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
      new Test().input();
    }
    public void input()
    {
	   
       Scanner sc=new Scanner(System.in);
	int m,n,x,y,i,j;
	int a[][]=new int[5][5];
	int b[][]=new int[5][5];
	System.out.println("Your first matrix");
	System.out.println("Enter dimension in 1st arrry ");
	m=sc.nextInt();
	n=sc.nextInt();
	System.out.println("Enter dimension in 2nd arrry ");
	x=sc.nextInt();
	y=sc.nextInt();
        	
        System.out.println("Enter the elements");	
	  for(i=0;i<m;i++)
	  {
            for( j=0;j<n;j++)
            {   
              System.out.print("a["+i+"]["+j+"] =");
	      a[i][j]=sc.nextInt();		     
            }
	  }
	 System.out.println("Matrix elements are");
	  for( i=0;i<m;i++)
	  {
	    for( j=0;j<n;j++)
	    {  
	       System.out.print(a[i][j]+"  ");
            }
	     System.out.println();
	  }
	   
	    System.out.println("Your second matrix");
	    System.out.println("Enter the elements");	
	    for(i=0;i<m;i++)
	    {
	      for( j=0;j<n;j++)
	      { 
	        System.out.print("a["+i+"]["+j+"] = ");
		b[i][j]=sc.nextInt();		     
	      }
	    }
	   System.out.println("Matrix elements are");
	    for( i=0;i<x;i++)
	    {
	      for( j=0;j<y;j++)
	      { 
		 System.out.print(b[i][j]+"  ");
              }
		System.out.println();
	    }
	    new Test().calculation(i,n,m,a,b);	
     }
	public void calculation(int i,int n,int m,int a[][],int b[][])
	{
	  System.out.println(" Addition ");
	  for(i=0;i<m;i++)
	  {
	    for( int j=0;j<n;j++)
	    {
             System.out.print(a[i][j]+b[i][j]+"  ");
	    }
	      System.out.println();
	  }
			
	}
}
		
