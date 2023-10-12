import java.util.Scanner;
class Test
 {
   public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any number");
        int n=sc.nextInt();
        int i=1,j,prime=0;
        for(i=1;i<=n;i++)
         {   
              if(i%n==0)
              i=i/n;           
          System.out.println(i); 
      }
   }      
            
   }           
                        
