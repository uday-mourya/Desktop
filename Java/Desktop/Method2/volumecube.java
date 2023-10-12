class Test
{
  public static void volume()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Side");
    int  a =sc.nextInt();
    int s=a*a*a;
    System.out.println("VOLUME Of Cube is : "+s);
  }
   public void show(Test k)
  {
    k.volume(); 
  }
  public static void main(String [] args)
  {  
    System.out.println("Welcome in main Method");
    Test ob =new Test();
    ob.show(ob);
   
   System.out.println("Main Method End");
  }
}
   
