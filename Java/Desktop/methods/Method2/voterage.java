class Test
{
  public static void voter()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Any Number ");
    int age=sc.nextInt();
    if(age<=0)
       System.out.println("INVALID AGE ");
    else if(age<12)  
       System.out.println("You Are Child"); 
    else if (age<18&&age>=12)
       System.out.println("YOU ARE Teen");
    else if (age>=18&&age<=59)
       System.out.println("YOU ARE YOUNGER");   
    else
      System.out.println("YOU ARE OLD ");   
  }
   public void show(Test k)
  {
    k.voter(); 
  }
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.show(ob);
   
   System.out.println("Main Method End");
  }
}
   
