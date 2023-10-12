import java.io.*;
import java.util.Scanner;
class TwoFileMarg
{
	public static void main(String []args) throws Exception,IOException
	{
		File f =new File ("first.text");
		FileInputStream i = new FileInputStream(f);
	
		File f1 =new File ("second.text");
		FileInputStream i1 = new FileInputStream(f1);
		
		FileOutputStream r = new FileOutputStream("copy.text",true);
		
		int x,y;
		while((x=i.read()) !=-1)
		{
			r.write(x);
			r.flush();
		}
		while((y=i.read()) !=-1)
		{
			r.write(y);
			r.flush();
		}
		r.close();
	}
}