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
          int i;
          
          System.out.println("how many number you want to Enter");
          int n=sc.nextInt(); 
          int a[]=new int[n];
          System.out.println("enter digit");           
          for( i=0; i<n; i++)          
          a[i]=sc.nextInt();
          System.out.println("\n\t1-maximum number in the given number\n\t2-sum of array elements");
          System.out.println("your choices are");
          int ch=sc.nextInt();
          switch(ch)
          {
            case 1:
            System.out.println("Maximum number is"+new Test().max(n,a,i));
            break;
            case 2:
            System.out.println("sum of element is"+new Test().sum(n,a,i));
            break;
          }  
      }     
      public int max(int n,int a[], int i)
      {
        int max=0;
        for(i=0; i<n; i++)
        {
          if(a[i]>max)
          max=a[i];
        }
        return max;       
     } 
     public  int sum(int n,int a[],int i)
     {
            int sum=a[0];     
           for( i=0; i<n; i++)
        {
          sum=sum+a[i];
        }
        return sum;
    } 
 }    
