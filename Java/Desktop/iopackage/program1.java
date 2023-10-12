import java.io.*;

class Testwrite
{
    public static void main(String[] args) throws IOException
    {
       File fobj= new File("f1.text");
       FileOutputStream fos=new FileOutputStream(fobj);
        fos.write(98);
        fos.flush();
        fos.close();
    }
}