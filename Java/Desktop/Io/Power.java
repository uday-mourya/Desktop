import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class Power
 {
    public static void main(String[] args) throws IOException,FileNotFoundException
     {
        File fobj = new File("powerf.txt");
        FileOutputStream fos = new FileOutputStream(fobj);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the power value");
        int p = sc.nextInt();
        System.out.println("Enter the base value");
        int b = sc.nextInt();

        int pow = 1;
        for (int i = 1; i <= p; i++)
	 {
            pow *= b;
         }

        String d = Integer.toString(pow);
        byte[] arr = d.getBytes();
        fos.write(arr);

        fos.flush();
        fos.close();
   
    }
}