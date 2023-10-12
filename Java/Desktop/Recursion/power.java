class Test
{
  public int power(int x,int y)
  {
    int p;
    if(y==1)
   return x; 
    else
     p=x*power(x,y-1);
     return p;
  }
  public static void main(String [] args)
  {
    /*java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("Enter Number");
     int n=sc.nextInt();
    */
    Test ob =new Test();
    System.out.println(ob.power(6,2));
  }
  
}   
