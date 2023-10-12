import java.util.Scanner;
 class Test//Binary short algo in array
 {
    public static void main(String [] args)
    {
      Scanner sc = new Scanner(System.in);
      int a[] = new int [10];
      
      System.out.println("Enter the value of insert array :");
      int n = sc.nextInt();
      System.out.println("Enter the element of array");
      for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        int temp=a[i];
        int j;
        for(j=i-1;j>=0&&a[j]>temp;j--)
        a[j+1]=a[j];
        
        a[j+1]=temp;
      }
         for(int i=0;i<n;i++)
         System.out.println("\ta["+i+"]"+a[i]);
     } 
 }    
