import java.util.Scanner;
class First
{   private int n;  
    public void setData(int n)
    { 
      this.n=n;  
    }
    public void Table()
     {
       int i=1;
   	while(i<=n)
   	{       
   	   System.out.println("\t" +i);
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
      ob.Table();
   	   
    }
 }  	  
