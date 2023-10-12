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
           if(max<a[i])
           max=a[i];
        }
        int smax=0;
        for(int i=0;i<n;i++)
        {
           if(smax<a[i]&&a[i]<max)
           smax=a[i];
        
        }
        return smax;
       
    }
       public void max()
       {
         System.out.println("Second max = "+this.input());
       }
       public static void main(String args[])
       { 
         Test ob=new Test();
         ob.max();
       }
}
     
