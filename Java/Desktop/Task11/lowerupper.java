import java.util.Scanner;
class Test
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY STRING");
	        String s=sc.nextLine();
	        char[] array=s.toCharArray();
	        for(int i=0;i<array.length;i++)
	        {
	        	if(array[i]>='a'&& array[i]<='z')
	        	array[i]=(char)(array[i]-32);
	        	
	        }
	        s=new String(array);
	        System.out.println(s);
	}

}
