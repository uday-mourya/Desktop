import java.util.Scanner;
class Test
{
     public static void main(String args[])
      {  
          Test ob=new Test();
          ob.input();
      }
      public void input()
      {
           Scanner sc=new Scanner(System.in);
           System.out.println("how many number you want to Enter");
           int n=sc.nextInt();
           int a[]=new int[10];
           System.out.println("enter digit");
           for(int i=0; i<n; i++)
           {
          	 a[i]=sc.nextInt();
           }
           Test ob=new Test();
           int max=a[n-1];
           max=ob.max(a,max,n-1);
           System.out.println("Maximum is :"+max);
      }
      public int max(int a[],int max,int n)
      {
          int x=0;
            if(n>0)
               {
                 if(max<a[n-1])
                  {
                     max=a[n-1];
                  }
                  x=max(a,max,n-1);
               }
               else if (n==0)
                 x=max;
               return x;
        }
}
   

