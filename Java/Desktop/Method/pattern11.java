class Test
{
  public static void patt()
  { 
     int i,j,k;
	for(i=1;i<=5;i++)
	{
	 for(j=5;j>i;j--)
	 {
	   System.out.print(" ");
	 }
	  for(k=1;k<=i;k++)
	  {
	    System.out.print(" * ");
	  }
	    System.out.println();  
         }
   }
		
  public static void main(String [] args)
  {
    
   System.out.println("Welcome in main Method");
   Test ob =new Test();
   ob.patt();
 
   System.out.println("Main Method End");
  }

}   
