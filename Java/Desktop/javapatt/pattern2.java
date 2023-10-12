class Test
{ //Swastik Pattren
	public static void main(String args[])
	{
	   int i,j,k ;
	   
	   for(i=1; i<=5; i++)
	   {
	      for(j=1; j<=5; j++)
	      {
	      if(i==3 || j==3||i==1&&j>3||i==5&&j<3||j==1&&i<3||j==5&&i>3)
	        System.out.print("*"+" ");
	         else 
	         System.out.print("  ");
	      }
	      System.out.println();
	   }
	}
}
