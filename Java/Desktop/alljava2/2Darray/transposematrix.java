import java.util.Scanner;
class Test{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int a[] [] =new int[5] [5];
     System.out.print("\tEnter Row : ");
     int n=sc.nextInt();
     System.out.print("\tEnter Column : ");
     int m=sc.nextInt();
    
     int i,j;
    
     System.out.println("\tEnter element in Array : ");
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
      System.out.println("\tTranspose Matrix");
        //transpose matrix
        int temp;
      for( i=0;i<n;i++)
      {
        for(j=i+1;j<m;j++)
        {
          temp =a[i] [j];
          a[i] [j]=a[j] [i];
          a[j] [i]=temp;
           
        }
      }
      
      for( i=0;i<n;i++)
      {
        for(j=0;j<m;j++)
        {
          System.out.print("\t"+(a[i] [j])); 
        }
           System.out.println(" ");
        
      }      
  }
}    
