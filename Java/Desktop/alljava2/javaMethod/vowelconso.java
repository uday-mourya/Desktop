class Test
{
  public static void multi()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Any Character");
    char z=sc.next().charAt(0);
    if(z=='a'||z=='e'||z=='i'||z=='o'||z=='u'||z=='A'||z=='E'||z=='I'||z=='O'||z=='U')
       System.out.println(" Vowel ");
    else
      System.out.println(" Consonant");   
  }
  
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.multi();
   
   System.out.println("Main Method End");
  }
}
   
