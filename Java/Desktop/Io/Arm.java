import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
class Arms
{
    public static void main(String[]args) throws IOException,FileNotFoundException
      {
	   	File fobj =new File ("f3.text");
		FileOutputStream fos=new FileOutputStream(fobj);
       	Scanner sc = new Scanner(System.in);
      	System.out.println(" Enter number");
        int n = sc.nextInt();
	    String s;
        int m=n,sum=0;
        do
        	{
        	   int r=n%10;
        	   int k =r*r*r;
         	   sum=sum+k;
                   n=n/10;           
       	    }
     	    while(n>0);
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
