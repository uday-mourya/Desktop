class Test
{ 
  int rev=0;
  public int sum(int x)
  {
    int rem;
    if(x==0)
      rem=0; 
    else
    {
      rem=x%10;                                                                              
      rev=rev*10+rem;
      this.sum(x/10);
    }
     return rev;   
    
  }      
  public static void main(String [] args)
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Number");
    int n=sc.nextInt();
    int m=n; 
    Test ob =new Test();
    int res=ob.sum(n);
    if(m==res)
     System.out.println("This Is Palindrome No.");
    else
     System.out.println("Not Palindrome");
  }
  
}   
