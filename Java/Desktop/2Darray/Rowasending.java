class Test
{
  public static void main(String[]args)
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     int a[][]=new int[5][5];
     int m,n;
      System.out.println("Enter The Same Row And Colem");
     System.out.println("row");
      m =sc.nextInt();
      System.out.println("colem");
      n =sc.nextInt();
      System.out.println("\n");
       System.out.println("Enter Metix Element");
     for(int i=0;i<m;i++)
      {
         for(int j=0;j<n;j++)
          { 
          System.out.print("a["+i+"]["+j+"] = ");
            a[i][j]=sc.nextInt(); 
          }
      }
    System.out.println("actual metix");
  
    for(int i=0;i<m;i++)
     {
         for(int j=0;j<n;j++)
          { 
           System.out.print("\t"+a[i][j]); 
          
           }
           System.out.println(); 
      }
      int i,j,k;
    for( i=0;i<(m);i++)
      {
         for( j=0;j<(n-1);j++)
         {  
           for(k=0;k<(n-1);k++)
           {
           
             if(a[i][k]>a[i][k+1]) 
             {
               int temp=a[i][k+1];
                                // System.out.println("\ntemp= "+temp+"=a["+i+"]["+(k+1)+"]"+a[i][k+1]);
               a[i][k+1]=a[i][k];
                                // System.out.println("\na["+i+"]["+(k+1)+"]"+a[i][k+1]+"=a["+i+"]["+(k)+"]"+a[i][k]);
               a[i][k]=temp; 
                                //  System.out.println("\na["+i+"]["+(k)+"]"+a[i][k+1]+"=temp"+temp);
               //System.out.println("cheng");
          
             }
           }
         } 
       System.out.println("");
       }
        for( i=0;i<m;i++)
     {
         for( j=0;j<n;j++)
          { 
           System.out.print("\t"+a[i][j]); 
          
           }
           System.out.println(); 
      }
     //  System.out.println("Digonel sum = "+sum);
   }
 }  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
