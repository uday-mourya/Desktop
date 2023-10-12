import java.io.*;
import java.util.Scanner;
class BL
{
	FileOutputStream ob;
	public BL(FileOutputStream ob)
	{
		this.ob = ob;
	}
	public void operation() throws IOException, FileNotFoundException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
	 	
		String s;
	 	for(int i = 1;i<=n;i++)
	 	{
	   		for(int j = n;j>=i;j--)
	   		{
	     			 s = '*'+"\t";
				byte arr[] = s.getBytes();
				ob.write(arr);
				ob.flush();
	   		}
	  		s = "\n";	
			byte arr[] = s.getBytes();
			ob.write(arr);
			ob.flush();	
	 	}
		ob.close();
   
	}
}
class Test 
{
   	public static void main(String args[]) throws IOException, FileNotFoundException 
	{
        	File f = new File("f13.text");
        	FileOutputStream ob  = new FileOutputStream(f);
		    BL b =new BL(ob);
		    b.operation();
	}
}