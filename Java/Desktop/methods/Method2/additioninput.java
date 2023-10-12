class Test
{ 

  public void show(Test k)
  {
    System.out.print("HEllo show1");
    k.add();
  }
  public static void add()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter first Number");
    int a=sc.nextInt();
    System.out.println("Enter Second Number");
    int b=sc.nextInt();
    int c=a+b;
    System.out.println("Addition = "+c);
  }
  
  public static void main(String [] args)
  {
    
   Test ob =new Test();
   ob.show(ob);
   
  }
}
   
