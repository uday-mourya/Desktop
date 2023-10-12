import java.util.Scanner;
class Test
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int [5][5];
    System.out.println("Enter Row");
    int row=sc.nextInt();
    System.out.println("Enter column");
    int col=sc.nextInt();
    int i,j=0,sum=0;
    

      for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
        {
          System.out.print("a["+i+"]["+j+"]=");
          a[i][j]=sc.nextInt();
        }
      }
      System.out.println("Matrix are \n");
      int max=a[i][j];
      for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
        {
          System.out.print("\t"+a[i][j]);
          if(a[i][j]>max)
             {
               max=a[i][j];
             }
        }
        System.out.println();
      }
      System.out.println("Diagonal Matrix are \n ");
      
      int second=a[0][0];
      for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
        {
          if(a[i][j]>second && a[i][j]<max)
          {
             second=a[i][j];
          }
        }
      }
      System.out.println("Max is = "+second);
    
      
  }
}
