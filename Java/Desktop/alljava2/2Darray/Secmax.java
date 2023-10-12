  class Test
{
  //Second max
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     int a[][]=new int[5][5];
     System.out.println("Enter Diamensions");
     System.out.println("Enter Row");
     int m =sc.nextInt();
      System.out.println("Enter Columnm");
     int n =sc.nextInt();
     
     int i,j,sec=1,max;
     
     for(i=0;i<m;i++)
      {
         for(j=0;j<n;j++)
          { 
              System.out.print("a["+i+"]["+j+"] = ");
            a[i][j]=sc.nextInt(); 
          }
      }
     System.out.println("actual metix");
     for(i=0;i<m;i++)
       {
           for(j=0;j<n;j++)
            { 
             System.out.print("\t"+a[i][j]); 
            } 
             System.out.println(); 
        }
        
      for(max=a[0][0],i=0;i<m;i++)
      {
        for(j=0;j<n;j++)
        {
           if(a[i][j]>max)
           {
             max=a[i][j];
           }
        }
      }
      for(sec=a[0][0],i=0;i<m;i++)
      {
        for(j=0;j<n;j++)
        {
           if(max==sec||(sec<a[i][j]&&a[i][j]<max))
           {
             sec=a[i][j];
           }
        }
      }
      
      System.out.println("Second max = "+sec);

   }
 }     
