import java.util.Scanner;
class Test{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
        int a[] [] =new int[5] [5];
        int b[] [] =new int [5] [5];
        int c[] [] =new int [5] [5];
        
        int i,j,k;
        System.out.println("Enter 1st Matrix Dimensions");
        int m=sc.nextInt();
        int n=sc.nextInt();
     
        System.out.println("Enter 2nd Matrix Dimensions");
        int p=sc.nextInt();
        int q=sc.nextInt();
    
       
       if(n==p){   
        System.out.println("\tEnter 1st Matrix Elemnets : ");
       for( i=0;i<m;i++)
       {
         for(j=0;j<n;j++)
        {
          a[i] [j]=sc.nextInt();
        }
      }  
        System.out.println("\t 1St Array Elements Are: ");
       for( i=0;i<m;i++)
       {
         for(j=0;j<n;j++)
         {
           System.out.print("\t"+(a[i] [j])); 
         }
            System.out.println(" ");
        
       }   
      
        System.out.println("\tEnter 2nd Matrix Elements : ");
       for( i=0;i<p;i++)
       {
         for(j=0;j<q;j++)
       {
         b[i] [j]=sc.nextInt();
       }
      }  
       System.out.println("\t 2nd  Array Elements Are: ");
       for( i=0;i<p;i++)
       {
         for(j=0;j<q;j++)
         {
           System.out.print("\t"+(b[i] [j])); 
         }
           System.out.println(" ");
        
       }   
      
        System.out.println("\t Multiplication of Two Matrix");
   
        for(i=0;i<n;i++)
        { 
         for(j=0;j<q;j++)
          {
           for(k=0,c[i] [j]=0;k<n;k++)
           {
             c [i] [j]= c[i] [j]+a[i] [k]*b[k] [j];
           }
          }
        }
        
         System.out.println("Multiplication Is");
         for(i=0;i<n;i++)
         { 
          for(j=0;j<q;j++)
          {
           System.out.print((c[i] [j])+ " ");
          }
           System.out.println( );
        }
        }  
        else
       {
         System.out.println("Not Possible");
         System.out.println("Please Try again Later");
       } 
      
  }
}    
