class Test
{
  public void increase()
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("how many element you want to Enter");
     int n =sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter element in array");
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     
     System.out.println("Array Elemnets Are");
     for(int i=0;i<n;i++)
     {      
        if(i%2==0)
           {
             System.out.println(a[i]);
           } 
         else if (i%2==1)
           {
             a[i]=a[i]+5;
             System.out.println(a[i]);
           }         
     }
    
   }
    public static void main(String [] args)
    {
       Test ob=new Test();
       ob.increase();
    
    }
}
         
