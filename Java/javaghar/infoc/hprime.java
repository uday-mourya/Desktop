import java.util.Scanner;
class Test
 {
    public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number");
      int n=sc.nextInt();
      int i=2,flag=1;
      while(i<n)
     { 
        if(n%i==0)
        { 
          flag=0;
          break;
        }
        i++;
     }
     if(flag==1)
       System.out.println("prime");
     else
       System.out.println("not prime");
  }
}
  
  
  
  
