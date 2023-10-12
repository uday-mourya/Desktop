class Test
{
  public int sum(int x)
  {
    int p=0;
    if(x==1)
    return x; 
    else
     p=x+this.sum(x-1);
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
