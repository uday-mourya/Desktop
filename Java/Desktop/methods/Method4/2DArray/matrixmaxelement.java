class Test
{ 
  public void input()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int a[] [] =new int [10] [10];
    System.out.println("Enter Diamentions ");
    int m=sc.nextInt();
    int n=sc.nextInt();
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      { 
        System.out.print("a["+i+"]["+j+"] = ");
        a[i][j]=sc.nextInt();
      }
    } 
    System.out.println("1st matrix Elemenet");
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      { 
        System.out.print("\t"+(a[i][j])+ " ");
      }
        System.out.println();
    }
     this.max(a,m,n);
  }
     
  public int max(int a[] [],int m,int n)
  {
    int max=0;
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      { 
        if(max<a[i][j])
        max=a[i][j];
      }
        //System.out.println();
    }
     System.out.println("Maximum = "+max);
      return max;
  }
 
  public static void main(String [] args)
  {
    Test ob=new Test();
    ob.input();  
  }  
}  
