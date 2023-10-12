class Test
{
  public static void rev()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int n=sc.nextInt();
    
    int i=1;
    int rev=0;
    while(n>0)
    {
     int r=n%10;
     rev=rev*10+r;
     n=n/10;
    
    }
    System.out.println("Reverse = "+rev);
  }
    public void show(Test k)
    {
      k.rev(); 
    }
   public static void main(String []args)
   {
    System.out.println("Welcome to main Method....");
    Test ob=new Test();
    ob.show(ob);
    System.out.println("Main Method End....");
   }
}  
