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
   	 int sum =0;
   	while(i<=10)
   	{ 
   	   int m=this.n*i;      
   	   System.out.println(this.n+ "*" +i+ "="+m);
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
