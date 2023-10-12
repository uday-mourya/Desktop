class Test
{
  public static void patt()
  { 
	java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter Any Number ");
        int num=sc.nextInt();
        int mid=(num/2)+1;
        for(int i=1;i<=num;i++)
        {
         for(int j=1;j<=num;j++)
        { 
         if(i==mid||j==mid||(i==1&&j>mid)||i==num&&j<mid||j==1&&i<mid||j==num&&i>mid)
          System.out.print("*");
         else
          System.out.print(" ");
        }
          System.out.println();
        }
     
   }
       public void show(Test k)
       {
         k.patt(); 
       }
	public static void main(String [] args)
       {
        System.out.println("Welcome in main Method");
        Test ob =new Test();
        ob.show(ob);
 
        System.out.println("Main Method End");
       }
}
   
