class Test
{
  public static void leap()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Year ");
    int a=sc.nextInt();
    if(a%100==0)
        System.out.println("This Centuary Year ");
    else
       System.out.println(" NOT CENTUARY YEAR");    
  }
 
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.leap();
   
   System.out.println("Main Method End");
  }
}
   
