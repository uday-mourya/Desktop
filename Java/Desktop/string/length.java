import java.util.Scanner;
class Test
{       
	public static int  length(String s)
	{
		int length=0;
	        char[] array=s.toCharArray();
		for(char c:array)
		{
		 	length++;
	        }
	        return length;
	}
	public static void main(String [] uday)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY STRING");
		String s=new String(sc.nextLine());
		System.out.println("LENGTH OF STRING = "+length(s));
	          
	}

}
