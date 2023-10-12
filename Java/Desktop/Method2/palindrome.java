class Test
{
  public static void palindrome()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int n=sc.nextInt();
    
    int i=1;
    int rev=0;
    int m=n;
    while(n>0)
    {
     int r=n%10;
     rev=rev*10+r;
     n=n/10;
    
    }
    if(rev==m)
    System.out.println(" No. Is Palindrome");
    else
      System.out.println("No.Not Palindrome ");
  }
   public void show(Test k)
  {
    k.palindrome(); 
  }
   public static void main(String []args)
   {
    System.out.println("Welcome to main Method....");
    Test ob=new Test();
    ob.show(ob);
    System.out.println("Main Method End....");
   }
}  
