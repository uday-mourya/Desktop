class Test
{
  public static void add()
  { 
    //perfect No.
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Number");
    int n=sc.nextInt();
     int i=1;
     int sum=0;
     while(i<n)
     {
      if(n%i==0)
      {
        sum+=i;
      }  
      i++;
     }
  
      if(sum==n)
        System.out.println("Perfact No...");
      else
        System.out.println("Not Perfact No.. ");   
   } 
  public static void main(String [] args)
  {
    
   Test ob =new Test();
   ob.add();
   
  }
}
   
