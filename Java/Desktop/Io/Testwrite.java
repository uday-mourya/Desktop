import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Testwrite
{
	public static void main(String[]args)throws IOException
	{
		File fobj=new File ("f1.text");
		FileOutputStream fos = new FileOutputStream(fobj);
		fos.write(98);
		fos.flush();
		fos.close();
	}
}