import java.util.Scanner;
class First
  {  
    private int m,n;    
    public void setData(int n)
    {  
       this.n=n;
       this.m=n;
      
    }
    public void palindrome()
    {
          int rev=0;
   	  while (this.n>0)
   	  {
   	    int r=this.n%10;
   	    rev =rev*10+r;
   	    this.n=this.n/10;
   	         
   	  }
   	  if(rev==this.m)
   	     System.out.println("NO. Is Palindrome"); 
   	 else 
   	     System.out.println("Not Palindrome"); 
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
    ob.palindrome();
   	  
  }
}   	  
