import java.util.Scanner;
class Task3{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter any Number");
   	  int n = sc.nextInt();
   	  int i=1;
   	  int pro=1;
   	  int sum=0;
   	  while(i<=n)
   	  { 
   	       pro=pro*i;
   	       sum=sum+pro;
   	       i++;
   	     
   	   }
   	    System.out.println(+sum); 
 }
 }  	 
