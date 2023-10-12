import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class First
{
	public static void main (String []args) throws IOException,FileNotFoundException
	{   
		File fobj =new File ("f2.text");
		FileOutputStream fos=new FileOutputStream(fobj);
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter any number");
		int x=sc.nextInt();
		fos.write(x);
		fos.flush();
		fos.close();
	}
}