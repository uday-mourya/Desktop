import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;;
import java.io.FileInputStream;
import java.io.IOException;

Class Armstrong
{
    public static void main(String[] args) {
        File fobj=new File("f3.text");
        FileOutputStream fos=new FileOutputStream(fobj);
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int n=sc.nextInt();
        String s;
        int m=n,sum=0;
        do
        {
            int r=n%10;
            int k=r*r*r;
            sum=sum+k;
            n=n/10;

        }
        if(m==sum)
      		    s = "number Armstrom";
     		 else
       		   s = "number not Armstrom";
		byte arr[] = s.getBytes();
     		fos.write(arr);
            fos.flush();
            fos.close();
    }
}
