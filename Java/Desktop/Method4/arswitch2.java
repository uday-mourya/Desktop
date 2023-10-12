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
      int a[]=new int[20];
      int i;
      System.out.println("1 for selection sort");
      System.out.println("2 for bubble sort");      
      System.out.println("your choices are");
      int ch=sc.nextInt();
      System.out.println("how many elements want to enter");
      int n=sc.nextInt();
      System.out.println("enter elements in array");
      for ( i=0;i<n;i++)
      a[i]=sc.nextInt();  

    switch(ch)
    {
    case 1: new Test().select(a,n,i);
    break;
    
    case 2: new Test().bubble(a,n,i);
    break;
    
    case 3: new Test().evodsum(a,n,i); 
    break;
    }
    }
   public int select(int a[], int n,int i)
   {   
            int k=0;
         for (  i=0;i<n;i++)
        {
            int min=a[i];
            k=i;
            for (int j=i+1;j<n;j++) 
            {
                if (min>a[j])
                {
                    min=a[j];
                    k=j;
                }
            }
            a[k]=a[i];
            a[i]=min;
        }
        for (  i=0;i<n;i++)
        {
         System.out.println(" "+a[i]);
        }
        return a[i];
   }
   public int bubble(int a[], int n,int i )
   {
      int temp;
        for ( i=0;i<n;i++)
        {
            for (int j=0;j<n-i-1;j++) 
            {
                if (a[j]>a[j+1])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (  i=0;i<n;i++)
        {
         System.out.println(" "+a[i]);
        }
        return a[i];
   }
  
}
