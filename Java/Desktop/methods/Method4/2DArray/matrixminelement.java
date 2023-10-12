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
     this.min(a,m,n);
  }
     
  public int min(int a[] [],int m,int n)
  {
    int min=a[0][0];
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      { 
        if(min>a[i][j])
        min=a[i][j];
      }
        //System.out.println();
    }
     System.out.println("Minimum= "+min);
     return min;
  }
 
  public static void main(String [] args)
  {
    Test ob=new Test();
    ob.input();  
  }  
}  
