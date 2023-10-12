import java.util.Scanner;
class First
{   private int n;  
    public void setData(int n)
    { 
      this.n=n;  
    }
    public void odd()
     {
        int i=1;
   	while(i<=this.n)
   	{ 
   	   int m=i*2-1;      
   	   System.out.println("\t"+m);
   	   i++;
   	}  
     }
}    
class Test
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any Number");
      int n = sc.nextInt();
      First ob=new First();
      ob.setData(n);
      ob.odd();
   	   
    }
 }  	  
