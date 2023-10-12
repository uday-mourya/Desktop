import java.util.Scanner;
class While{
  public static void main(String[] args){
   	  Scanner sc = new Scanner(System.in);
   	  System.out.println("Enter Any Number.....");
   	  int n = sc.nextInt();
   	  int i=1,sum=0;
   	  
   	  while(i<=n)
   	  {
   	   if(i<n)
   	   {
   	     System.out.print(i+"+");
   	   }      
   	   sum=sum+i;
   	   i++;
   	   
   	  } 
   	    System.out.println(n+"=" +sum );
   	   
   	   
}
}   	  
