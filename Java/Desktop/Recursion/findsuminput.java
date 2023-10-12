class Test
{
  public int sum(int x)
  {
    int p;
    if(x==0)
      p=0; 
    else                                                                              
     p=x%10+this.sum(x/10);
     return p;
  }
  public static void main(String [] args)
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("Enter Number");
     int n=sc.nextInt();
    
    Test ob =new Test();
    System.out.println(ob.sum(n));
  }
  
}   
