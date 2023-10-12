class Test
{
  public static void peri()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Side");
    int  a =sc.nextInt();
    int s=6*a;
    System.out.println("Perimeter Of Cube is : "+s);
  }
   public void show(Test k)
  {
    k.peri(); 
  }
  public static void main(String [] args)
  {  
    System.out.println("Welcome in main Method");
    Test ob =new Test();
    ob.show(ob);
   
   System.out.println("Main Method End");
  }
}
   
