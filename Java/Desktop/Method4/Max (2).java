import java.util.Scanner;
class Test
    {
    
      public int input()
      {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("how many number you want to Enter");
        int a[]=new int[10];
        int n=sc.nextInt();
        System.out.println("enter digit");
        for( int i=0; i<n; i++)
        {
        a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0; i<n; i++)
        {
          if(a[i]>max)
           max=a[i];
        }
       
       return max;
       
       }
       public void max()
       {
        System.out.println(" max = "+this.input());
       }
     public static void main(String args[])
      { 
      Test ob=new Test();
      ob.max();
      }
      }
     
