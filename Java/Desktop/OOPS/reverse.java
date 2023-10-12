import java.util.Scanner;
class First
  {  
    private int m,n;    
    public void setData(int n)
    {  
       this.n=n;
       this.m=n;
      
    }
    public void reverse()
    {
          int rev=0;
   	  while (this.n>0)
   	  {
   	    int r=this.n%10;
   	    rev =rev*10+r;
   	    this.n=this.n/10;
   	         
   	  }
      System.out.println("Reverse = "+rev); 
   	 
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
    ob.reverse();
   	  
  }
}   	  
