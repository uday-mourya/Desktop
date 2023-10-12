class Test
{ 
  public void display(int x)
  {
    if(x>=1)
    this.display(x-1);
    System.out.println("Hello Displays");
  }
  public static void main(String [] args)
  {
    Test ob=new Test();
    ob.display(10);
  }  
}  
