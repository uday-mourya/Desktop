import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class Sum
 {
    public static void main(String[] args) throws IOException
     {
        File fobj = new File("inputsum.txt");
        FileOutputStream fos = new FileOutputStream(fobj);
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER AYN NUMBER");
        int n= sc.nextInt();
        int sum = 0;
        while(n>0)
	    {
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }

        String d = Integer.toString(sum);
        byte[] arr = d.getBytes();
        fos.write(arr);

        fos.flush();
        fos.close();
   
    }
}
