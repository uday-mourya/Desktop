import java.lang.*;
class P4{
    public static void main(String args[])
    {
	int r=5;
	for(int i=5;i>1;i--)
	{
	 for(int j=1;j<r-i;j++)
	 {
	   System.out.print(" ");
	 }
	  for(int k=1;k<=i;k++)
	  {
	    System.out.print("*");
	  }
	  System.out.println();
        }   
}
}
	
	
