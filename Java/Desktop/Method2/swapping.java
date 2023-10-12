class Test
{
  public static void sw()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int a=sc.nextInt();
    System.out.println("Enter 2nd Number");
    int b=sc.nextInt();
    int temp;
     System.out.println("Before Swap A="+a+ "B=" +b);
     temp=a;
     a=b;
     b=temp;
     System.out.println("After Swap  A="+a+ " B = "+b);
  }
    public void show(Test k)
   {
     k.sw(); 
   }
  
   public static void main(String []args)
   {
    System.out.println("Welcome to main Method....");
    Test ob=new Test();
    ob.show(ob);
    System.out.println("Main Method End....");
   }
}  
