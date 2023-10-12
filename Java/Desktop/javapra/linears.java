import java.util.Scanner;
class Test{
  public static void main(String [] args){
  	Scanner sc=new Scanner(System.in);
  	int a[]=new int [10];
  	System.out.println("How Mant Elements You Wants To Entered");
  	int n=sc.nextInt();
  	int i;
  	boolean b=false;
  	System.out.println("Enter array Elements");
  	for(i=0;i<n;i++)
  	{
  	  a[i]=sc.nextInt();
  	  
  	}
  	 System.out.println("Enter item You want to Search");
  	 int item=sc.nextInt();
         for(i=0;i<n;i++)
         { 	  
          if(a[i]==item)
          b=true;
         }
         if(b)
         {
           System.out.println("Item found");
         }
         else
          System.out.println("Not Found item");
}
}  
