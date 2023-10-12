class Test
{
  public static void peri()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Side");
    int  a =sc.nextInt();
    int s=4*a*a;
    System.out.println("CSA Of Cube is : "+s);
  }
 
  public static void main(String [] args)
  {  
    System.out.println("Welcome in main Method");
    Test ob =new Test();
    ob.peri();
   
   System.out.println("Main Method End");
  }
}
   
