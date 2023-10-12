import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
       new Test().input();
    }
    public void input()
    {
      Scanner sc=new Scanner (System.in);
      int a[][]=new int[10][10];
      int ch=1,i=0,j=0,k=1;
      
     while(k!=13)
     { 
      System.out.println("1 for matrix elements sum");
      System.out.println("2 for diagonal elements right side");
      System.out.println("3 for diagonal elements left side ");
      System.out.println("4 for mid diagonal ");
      System.out.println("5 for transpose");
      System.out.println("6 for lower triangular");
      System.out.println("7 for upper triangular");
      System.out.println("8 for 2nd minimum");
      System.out.println("9 for 2nd maximum");
      System.out.println("10 for asc dsc row col ");
      System.out.println("11 for diagonal ptrn");    
      System.out.println("12 for hollow sq. ptrn");
      System.out.println("13 for Exit ");
      System.out.println("your choices are ");
      ch=sc.nextInt();
      if(ch>=13)
      {      
       System.exit(0);      
      }
      System.out.println("enter dimensions in a matrix ");
      System.out.println("rows");
      int m=sc.nextInt();
      System.out.println("columns");
      int n=sc.nextInt();
      System.out.println("enter elements in array");
        for (  i=0;i<m;i++)
        {
            for ( j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
    switch(ch)
    {
      case 1: System.out.println(" elements sum = "+new Test().elementsum(a,m,n,j,i));
      break;
    
      case 2: System.out.print("right diagonals are "+new Test().rightdiagonal(a,m,n,j,i));
      break;
    
      case 3: System.out.println("left diagonals are "+new Test().leftdiagonal(a,m,n,j,i));  
      break;
    
      case 4: System.out.println("mid diagonals are "+new Test().middiagonal(a,m,n,j,i));
      break;
    
      case 5: System.out.println(" transpose of matrix are "+new Test().transpose(a,m,n,j,i));
      break;
    
      case 6: System.out.println(" lower triangular matrix  are "+new Test().lowertriangle(a,m,n,i,j,k));
      break;
    
      case 7: System.out.println("upper triangular matrix are "+new Test().uppertriangle(a,m,n,j,i));
      break;
    
      case 8: System.out.println(" sec minimum element "+new Test().secmin(a,m,n,i,j));
      break;
    
      case 9: System.out.println(" sec maximum element "+new Test().secmax(a,m,n,j,i));
      break;
      
      case 10: System.out.println(" diagonal ptrn "+new Test().diagonalptrn(a,m,n,i,j,k));     
      break;
      
      case 11: System.out.println(" diagonal pattern are  "+new Test().ascdscrowcol(a,m,n,i,j));
      break;
      
      case 12: System.out.println(" hollo sq. ptrn "+new Test().sqptrnmtrx(a,m,n,i,j));
      break; 
     }
     }
   }
   public int elementsum(int a[][], int m,int n,int i,int j)
   {
         int sum=0;
      for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
          { 
               sum+=a[i][j];
          }
      }
      return sum;
    
   }
   public int rightdiagonal(int a[][],int m,int n,int i,int j)
   {  
    for( i=0;i<m;i++)
      {
          for( j=0;j<n;j++)
          {            
           if(i==j)
            {
             System.out.print("  "+a[i][j]);            
            }
            else
             System.out.print("  ");
          }
          System.out.println("");
       }
       return a[i][j];
   }
   public int leftdiagonal(int a[][], int m, int n, int i,int j )
   {      
    
    for( i=0;i<m;i++)
      {
           for( j=0;j<n;j++)
           {            
           if(i+j==n-1)
            {
             System.out.print("  "+a[i][j]);
             
            }
            else
             System.out.print("   ");
          // System.out.print(" "+a[i][k]);
            
           }
       System.out.println("");
       }
       return a[i][j];
   }
   public int middiagonal(int a[][],int m,int n, int i,int j)
   {
      for( i=0;i<m;i++)
      {
         for( j=0;j<n;j++)
           {   
           System.out.print("  ");
               if(j==n/2&&i<n)
               {
                 System.out.print(" "+a[i][j]);
                
               }
               else
               {
                 System.out.print(" ");
               }
           }
           System.out.println("");
       }
       return a[i][j];
   }
   public int transpose(int a[][],int m,int n,int i,int j )
   {

    for( i=0;i<m;i++)
    {
         for( j=i+1;j<n;j++)
           {    
             int temp=a[i][j];
             a[i][j]=a[j][i];
             a[j][i]=temp;             
           }
      }
         System.out.println("Transport metix");
    for( i=0;i<m;i++)
       {
         for( j=0;j<n;j++)
            { 
              System.out.print("\t"+a[i][j]); 
            }
           System.out.println(); 
       }
      
      return a[i][j];
   }
   public int lowertriangle(int a[][],int m ,int n, int i ,int k,int j )
   {      
    for( i=0;i<m;i++)
      {
         for( j=0;j<i;j++)
           {   
            System.out.print("  ");
           }
            for( k=i;k<m;k++)
            {
              System.out.print(" "+a[j][k]);
            }
       System.out.println("");
       }
       return a[j][k];
   }
   public int uppertriangle(int a[][],int m,int n,int i,int j )
   {
    for( i=0;i<m;i++)
      {
         for( j=0;j<i+1;j++)
           {   
            System.out.print("  "+a[i][j]);            
           }
           System.out.println(" ");
       }
       return a[i][j];
   }
   public int secmin(int a[][],int m, int n, int i,int j)
   {
      
       int max = a[0][0];
	   int max2 =a[0][1]; 
	  for( i=0; i<n; i++)
	  {
	     for( j=0; j<m; j++)
	     {
	        if(max>a[i][j])
	        {
	          max2  = max;
	          max = a[i][j];
	        }
	        else if(max==max2||(max>a[i][j])&&(max2<a[i][j]))
	              max2 = a[i][j];
	     }
	  }
	  return max2;
   }
   public int secmax(int a[][], int m, int n ,int i,int j)
   {
           int max = a[0][0];
	   int max2 =a[0][1]; 
	  for( i=0; i<n; i++)
	  {
	     for( j=0; j<m; j++)
	     {
	        if(max<a[i][j])
	        {
	          max2  = max;
	          max = a[i][j];
	        }
	        else if(max==max2||(max>a[i][j])&&(max2<a[i][j]))
	              max2 = a[i][j];
	     }
	  }
	     return max2;
   }
   public int diagonalptrn(int a[][], int m, int n,int i,int j,int k)
   {
     
       
        for( i=0;i<n;i++)
      {
         for( j=0;j<(m-1);j++)
         {  
           for( k=0;k<(m-1);k++)
           {
           if(a[k][i]<a[k+1][i]) 
             {
               int temp=a[k+1][i];
               a[k+1][i]=a[k][i];
               a[k][i]=temp; 
             }
           }
         }
         System.out.println(""); 
        
       }
      for( i=0;i<(m);i++)
      {
           for( j=0;j<(n-1);j++)
           {  
             for( k=0;k<(n-1);k++)
             {
              if(a[i][k]>a[i][k+1]) 
                {
                 int temp=a[i][k+1];
                 a[i][k+1]=a[i][k];
                 a[i][k]=temp; 
                }
             }
           } 
           System.out.println("");
       }
        for( i=0;i<m;i++)
       {
         for( j=0;j<n;j++)
          { 
           System.out.print("\t"+a[i][j]); 
          }
           System.out.println(); 
       }
       return a[i][j];
    
   }
   public int ascdscrowcol(int a[][],int m,int n,int i,int j )
   {      
    
     
    int sum=0;
    for( i=0;i<m;i++)
      {
           for( j=0;j<n;j++)
           {
           int x=n/2;
            if ((i+j)==(n-1)||i==j||i+j==x+i)
            {
             System.out.print("  "+a[i][j]);
             sum=sum+a[i][j];
            }
            else
             System.out.print("   ");
            
       }
       System.out.println("");
       }
       return a[i][j];
   }
   public int sqptrnmtrx(int a[][],int m,int n,int i,int j)
   {     
      int sum=0;
    for( i=0;i<m;i++)
      {
       
           for( j=0;j<n;j++)
           {
              if((i==0&&j<n)||(i==m-1&&j<n)||(j==0&&i<n-1)||(j==n-1&&i<m))
              {
               System.out.print(" "+a[i][j]);
               sum+=a[i][j];
              }
               else
               {
                System.out.print("  ");
          //  sum=sum+a[i][k];
               }
           }
           System.out.println("");
       }
       return a[i][j];
     }
}
   
       
  
   
   
    
   

