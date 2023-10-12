import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class Palindrome
 {
    public static void main(String[] args) throws IOException
     {
        File fobj = new File("palindrome.txt");
        FileOutputStream fos = new FileOutputStream(fobj);
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ANY NUMBER");
        int n= sc.nextInt();
        int rev = 0;
        String s;
        while(n>0)
	    {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }   
       // String d = Integer.toString(rev);
        //byte[] arr = s.getBytes();
        fos.write(arr);

        fos.flush();
        fos.close();
   
    }
}

