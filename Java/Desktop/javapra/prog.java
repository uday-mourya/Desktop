// repetation in array
import java.util.Scanner;
class Test
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    int i,j,count;
    
    System.out.print("Enter how many element in array : ");
    int n=sc.nextInt();
    
    for(i=0;i<n;i++)
    {
       System.out.print("n["+i+"]=");
       a[i]=sc.nextInt();
    }
    System.out.println("\n\n\n");
    
    for(i=0;i<n;i++)
    {
      for(count=1,j=i+1;j<n;j++)
      {
        
        if(a[i]==a[j])
        {
          for(int k=0;k<i;k++)
          {
            if(a[i]==a[k])
            {
              count=1;
              break;
            }
            count++;
          }
          
        }
        if(count>1)
        System.out.println(a[i]+"="+count+"Times");
        
      }
      
    }
  }
}
