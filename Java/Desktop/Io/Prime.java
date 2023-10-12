import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
class Prime
{
    public static void main(String[]args) throws IOException,FileNotFoundException
      {
	  	File fobj =new File ("primeF.text");
	  	FileOutputStream fos=new FileOutputStream(fobj);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
  		int n = sc.nextInt();
 	 	int count = 0;
	 	String s; 
 	 	for (int i=1; i<=n; i++)
 		{
 	   		if ( n % i == 0 )
  	     	count++;
        }
    	 if (count == 2 )
      	 	s="Prime";
      	 else 
         	s="Not Prime";
      
        	byte arr[] = s.getBytes();
     		fos.write(arr);
 			fos.flush();
 			fos.close();
      }

}
