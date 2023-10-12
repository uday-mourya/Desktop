import java.util.Scanner;
class Test
{
  public void duplicate(int a[],int r)
  {
    int x=0,i;
      for(x=0,i=0;i<r;i++)
      {
	if(a[i]!=-1)
	{
	  for(int j=(i+1);j<r;j++)
	 {
	   if(a[i]==a[j])
	   {
	     a[j]=-1;
						
	   }		
	 }
	   a[x]=a[i];
	   x++;
	}
      }
      
        System.out.println("After Duplicate Elements Delete Array");
	for(i=0;i<x;i++)
       {
	 System.out.println("a["+i+"]"+a[i]);
       }
		
  }
    public void input()
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("How Many Elements You Want To Entered ");
      int n=sc.nextInt();
      int a[]=new int[10];
       System.out.println("Enter Array Elements ");
       for(int i=0;i<n;i++)
        {
	    System.out.print("a["+i+"]=");
	    a[i]=sc.nextInt();
	 }
	this.duplicate(a,n);
      }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Test ob=new Test();
      ob.input();
    }
}
