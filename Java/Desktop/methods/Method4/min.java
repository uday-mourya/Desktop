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
        int a[]=new int[n];
        System.out.println("enter digit");
        for( int i=0; i<n; i++)
        {
        a[i]=sc.nextInt();
        }
        System.out.println("minimum="+this.method(a,n));
       }
       public int method(int a[],int n)
       {
        int max=a[0];
        for(int i=0; i<n; i++)
        {
          if(a[i]<max)
           max=a[i];
        }
        return max;
       }
      }
     
