class Test
{
  public static void ch()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter first Number");
    int a=sc.nextInt();
    System.out.println("Enter Second Number");
    int b=sc.nextInt();
    if(a==b)
       System.out.println("Both Are same.....");
    else
       System.out.println("Both  Are Different");   
       System.out.println("Good Job.....");
  }
  
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.ch();
   System.out.println("Main Method End");
  }
}
   
