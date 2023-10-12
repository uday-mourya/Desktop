import java.io.*;

class Testwrite1
{
    public static void main(String[] args) throws IOException
    {
       File fobj= new File("f2.text");
       FileOutputStream fos=new FileOutputStream(fobj);
       byte arr[]={65,66,67,68,69,70,71,72,73,74,75};
       for(int x:arr){
        fos.write(arr);
        fos.flush();
       }
        fos.close();
    }
}