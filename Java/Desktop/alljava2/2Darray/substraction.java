import java.util.Scanner;
class Test{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
        int a[] [] =new int[5] [5];
        System.out.println("Enter 1st Matrix Dimensions");
        int n=sc.nextInt();
        int m=sc.nextInt();
     
        System.out.println("Enter 2nd Matrix Dimensions");
        int x=sc.nextInt();
        int y=sc.nextInt();
    
        int i,j;
       if(n==x&&m==y){   
        System.out.println("\tEnter 1st Matrix Elemnets : ");
       for( i=0;i<n;i++)
       {
         for(j=0;j<m;j++)
        {
          a[i] [j]=sc.nextInt();
        }
      }  
        System.out.println("\t Array Elements Are: ");
       for( i=0;i<n;i++)
       {
         for(j=0;j<m;j++)
         {
           System.out.print("\t"+(a[i] [j])); 
         }
            System.out.println(" ");
        
       }   
      
        int b[] [] =new int [5] [5];
        int c[] [] =new int [5] [5];
        System.out.println("\tEnter 2nd Matrix Elements : ");
       for( i=0;i<x;i++)
       {
         for(j=0;j<y;j++)
       {
         b[i] [j]=sc.nextInt();
       }
      }  
       System.out.println("\t Array Elements Are: ");
       for( i=0;i<x;i++)
       {
         for(j=0;j<y;j++)
         {
           System.out.print("\t"+(b[i] [j])); 
         }
           System.out.println(" ");
        
       }   
      
        System.out.println("\t Substraction of Two Matrix");
   
        for(i=0;i<n;i++)
        { 
         for(j=0;j<m;j++)
          {
          c [i] [j]=a[i] [j]- b[i] [j];
          System.out.print("\t"+(c [i] [j]));
          }
          System.out.println(" ");
        }
        }
        else
       {
         System.out.println("Not Possible");
         System.out.println("Please Try again Later");
       } 
      
  }
}    
