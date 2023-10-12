import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Testwrite
{
	public static void main(String[]args)throws IOException
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name");
        String ob=sc.next();
		File fobj=new File (ob);
		FileOutputStream fos = new FileOutputStream(fobj);
		fos.write(98);
		fos.flush();
		fos.close();
	}
}