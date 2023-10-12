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
     this.inputs();
  }
  public void inputs()
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int b[] [] =new int [10] [10];
    System.out.println("Enter Diamentions ");
    int p=sc.nextInt();
    int q=sc.nextInt();
    for(int i=0;i<p;i++)
    {
      for(int j=0;j<q;j++)
      { 
        System.out.print("b["+i+"]["+j+"] = ");
        b[i][j]=sc.nextInt();
      }
    }
    System.out.println("2nd matrix Elemenet"); 
    for(int i=0;i<p;i++)
    {
      for(int j=0;j<q;j++)
      { 
        System.out.print("\t"+(b[i][j])+ " ");
      }
        System.out.println();
    }
  
  }  
  public static void main(String [] args)
  {
    Test ob=new Test();
    ob.input();  
  }  
}  
