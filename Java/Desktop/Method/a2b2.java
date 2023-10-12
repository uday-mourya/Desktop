class Test
{
  public void display(Test k)
  {
    System.out.println("Hello Display 1");
    this.show();
  }
  public void show()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Any Number");
    int a=sc.nextInt();
    System.out.println("Enter Any Number");
    int b=sc.nextInt();
    int x=a*a+b*b+2*a*b;
    System.out.println("(a+b)^2 = "+x);
    
  }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.display(ob);
   
   System.out.println("Main Method End");
  }
}
   
