class Test
{
  public void show(Test b)
  {
  
    b.leap();
  }
  public static void leap()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Year ");
    int a=sc.nextInt();
    if(a%4==0&&a%100!=0||a%400==0)
        System.out.println("This Year Leap Year ");
    else
       System.out.println(" NOT LEAP YEAR");    
  }
 
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.show(ob);
   
   System.out.println("Main Method End");
  }
}
   
