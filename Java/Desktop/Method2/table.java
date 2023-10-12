class Test
{
  public static void table()
  { 
   java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter any Number");
    int n=sc.nextInt();
    int i=1;
    while(i<=10)
    {
     System.out.println("\t"+n+ "*"+i+ "=" +(n*i));
     i++;
    }
  }
   public void show(Test k)
  {
    k.table(); 
  }
   public static void main(String []args)
   {
    System.out.println("Welcome to main Method....");
    Test ob=new Test();
    ob.show(ob);
    System.out.println("Main Method End....");
   }
}  
