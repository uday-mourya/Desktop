import java.util.Scanner;
class Test{
  public static void main (String args[]){
         Scanner sc=new Scanner (System.in);
         int n=sc.nextInt();
         int i,j,k;
         for(i=n;i>=1;i--)
     	 {
           for(j=1;j>i;j++)
     	    {
     	      System.out.print(" ");
     	    }
           for(k=n;k>i;k--)
     	    {
     	      System.out.print("* ");
     	    }
 	      System.out.println(); 
         } 
         for(i=n;i>=1;i--)
 	 {
           for(j=1;j>i;j++)
            {
              System.out.print(" ");
     	    }
             for(k=1;k<=i;k++)
     	      {
     	        System.out.print("* ");
     	      }
 	        System.out.println(); 
        } 
       
}
}
