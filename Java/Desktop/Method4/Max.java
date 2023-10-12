import java.util.Scanner;

class Test
 {
   public int myMethod(int a[],int n)
   { 
     System.out.println("MAX no. is");
     int max=a[0];
      for (int i=0;i<n;i++ )
      {
        if(max<a[i])
         {         
           max=a[i]; 
         }
      }
      return max;
   }
   
   public void input()
   {
   
   Scanner sc=new Scanner (System.in);

       int a[]=new int[10];
      
      System.out.println("How many element u want 2 enter");
      
      int n=sc.nextInt();
      
      System.out.println("Enter elements in an arrray");
      
   
      for ( int i=0;i<n;i++) 
      {
         a[i]=sc.nextInt();
      }
      System.out.println("max= "+new Test().myMethod(a,n));
       
   }

   public static void main(String args[])
   {
      Test ob=new Test();
      ob.input();     
     
     
   }  




}
