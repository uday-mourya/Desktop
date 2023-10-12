 import java.util.Scanner;
 class Absolute
   {
  	public static void main(String args[])
  	    {
		   Scanner input=new Scanner(System.in);
		   System.out.println("Enter the number");
		   int num=input.nextInt();
		   if(num>0)
		      num=-1*num;
		      System.out.println("Absolute number="+num);
            }
   }  
