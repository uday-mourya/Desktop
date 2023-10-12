import java.util.Scanner;
class Arrayoperation
{   
  public void choice()
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("YOUR CHOICES ARE :");
       System.out.println("\tPRESS 1.SHOW ARRAY       \tPRESS 2.MAX OF ARRAY");
       System.out.println("\tPRESS 3.MIN OF ARRAY     \tPRESS 4.SUM OF ARRAY");
       System.out.println("\tPRESS 5.SECOND MAX       \tPRESS 6.SECOND MIN");
       System.out.println("\tPRESS 7.PATTERN 1        \tPRESS 8.PATTERN 2");
       System.out.println("\tPRESS 9.PATTERN 3        \tPRESS 10.PATTERN 4");
       System.out.println("\tPRESS 11.PATTERN 5       \tPRESS 12.PATTERN 6");
       System.out.println("\tPRESS 13.PATTERN 7       \tPRESS 14.PATTERN 8");
       System.out.println("\tPRESS 15.PATTERN 9       \tPRESS 16.EXIT.....");
       System.out.println("ENTER YOUR CHOICE");
       int ch=sc.nextInt();
       switch(ch)
       {
         case 1:this.showArray();
          break;
         case 2:this.maxArray();
          break;
         case 3:this.minArray();
          break;
         case 4:this.sum();
          break;
         case 5:this.secmax();
          break;
         case 6:this.secmin();
          break;  
         case 7:this.pattern1();
          break;   
         case 8:this.pattern2();
          break;
         case 9:this.pattern3();
          break;
         case 10:this.pattern4();
          break;
         case 11:this.pattern5();
          break;       
         case 12:this.pattern6();
          break;
         case 13:this.pattern7();
          break;
         case 14:this.pattern8();
          break;
         case 15:this.pattern9();
          break;
         case 16:System.exit(0); 
       }
  }
   
        private int a[][];
        private int length;
        private int width;
    
       public void setData(int length,int width)
       {
             this.a=new int[10][10];
             this.length=length;
             this.width=width;
       }
       public void inputArray()
       {
             Scanner sc=new Scanner(System.in);
             System.out.println("ENTER ELEMNTS IN ARRAY");
             for(int i=0;i<this.length;i++)
             {
                 for(int j=0;j<this.width;j++)
                 {
                    a[i][j]=sc.nextInt();
                 }
                 System.out.println();
             }  
              this.choice();  
       }
       
     public void showArray()
       {
            System.out.println("ARRAY ELEMENTS ARE :");
            for(int i=0;i<this.length;i++)
            {   
                for(int j=0;j<this.width;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }                
       }
       
      public void maxArray()
       {    
            int max=a[0][0];
            for(int i=0;i<this.length;i++)
            {   
              for(int j=0;j<this.width;j++)
              {
                if(max<a[i][j])
                {
                  max=a[i][j];    
                }
              }            
            }
            System.out.println("Maximum element ="+max);
               
       }    
       
     public void minArray()
       {    
            int min=a[0][0];
            for(int i=0;i<this.length;i++)
            {   
              for(int j=0;j<this.width;j++)
              {
                if(min>a[i][j])
                 {
                          min=a[i][j];    
                 }
              }            
            }
           System.out.println("Minimum element="+min);    
       }
       public void sum()
       {
         int sum=0;
         for(int i=0;i<this.length;i++)
         {
           for(int j=0;j<this.width;j++)
           { 
             sum=sum+a[i] [j]; 
           } 
         }
        System.out.println("\t Matrix Sum = " +sum);
      } 
       public void secmax()
       {
         int i,j;
         int max=a[0][0];
         for(i=0;i<this.length;i++)
         {
           for(j=0;j<this.width;j++)
           {
             System.out.print("\t"+a[i][j]);
             if(a[i][j]>max)
             {
               max=a[i][j];
             }
           }
          System.out.println();
        } 
        int second=0;
        for(i=0;i<this.length;i++)
        {
          for(j=0;j<this.width;j++)
           {
             if(a[i][j]>second && a[i][j]<max)
             {
              second=a[i][j];
             }
           }
         }
        System.out.println("Second Max is = "+second);     
    }
    public void secmin()
       {
         int i,j;
         int min=a[0][0];
         for(i=0;i<this.length;i++)
         {
           for(j=0;j<this.width;j++)
           {
             System.out.print("\t"+a[i][j]);
             if(a[i][j]<min)
             {
               min=a[i][j];
             }
           }
          System.out.println();
         } 
         int second=0;
         for(i=0;i<this.length;i++)
         {
           for(j=0;j<this.width;j++)
           {
             if(a[i][j]>second && a[i][j]<min)
             {
              second=a[i][j];
             }
           }
         }
        System.out.println("Second Min is = "+second);     
      }
  
     public void pattern1()
     {   
       System.out.println("Pattern ");
       for(int i=0;i<this.length;i++)
       {
         //j<=i
         for(int j=0;j<=i;j++)
         {   
           System.out.print("  "+a[i][j]);    
         }
         System.out.println(" ");
       } 
     }
     public void pattern2()
     {   
       System.out.println("Pattern ");
       for(int i=0;i<this.length;i++)
       {
         for(int j=0;j<this.length-i;j++)
         {   
           System.out.print("  "+a[i][j]);    
         }
         System.out.println(" ");
       } 
     }
     public void pattern3()
      {
       for(int i=0;i<this.length;i++)
        {
          for(int j=0;j<this.width;j++)
          {  
            if(i==0||j==0||i==this.width-1||j==this.width-1)
            {
              System.out.print("\t"+a[i][j]); 
            }
            else
              System.out.print("\t"); 
          }
           System.out.println(" "); 
        }
      }
      public void pattern4()
      {
       for(int i=0;i<this.length;i++)
        {
          for(int j=0;j<this.width;j++)
          {  
            if(i!=0&&j!=0&&i!=(this.width-1)&&j!=(this.width-1))
            {
              System.out.print("\t"+a[i][j]); 
            }
            else
              System.out.print("\t"); 
          }
           System.out.println(" "); 
        }
      }
       public void pattern5()
      {
       for(int i=0;i<this.length;i++)
        {
          for(int j=0;j<this.width;j++)
          {  
            if(i==j)
            {
              System.out.print("\t"+a[i][j]); 
            }
            else
              System.out.print("\t"); 
          }
           System.out.println(" "); 
        }
      }
      public void pattern6()
      {
       for(int i=0;i<this.length;i++)
        {
          for(int j=0;j<this.width;j++)
          {  
            if(i+j==this.width-1)
            {
              System.out.print("\t"+a[i][j]); 
            }
            else
              System.out.print("\t"); 
          }
           System.out.println(" "); 
        }
      }
      public void pattern7()
      {
       for(int i=0;i<this.length;i++)
        {
          for(int j=0;j<this.width;j++)
          {  
            if(j==this.width/2)
            {
              System.out.print("\t"+a[i][j]); 
            }
            else
              System.out.print("\t"); 
          }
           System.out.println(" "); 
        }
      }
      public void pattern8()
      {
       for(int i=0;i<this.length;i++)
        {
          for(int j=0;j<this.width;j++)
          {  
            if(i==j||i+j==this.width-1)
            {
              System.out.print("\t"+a[i][j]); 
            }
            else
              System.out.print("\t"); 
          }
           System.out.println(" "); 
        }
      }
      public void pattern9()
      {
       for(int i=0;i<this.length;i++)
       {
          for(int j=0;j<this.width;j++)
          {  
            if(i==j||i+j==this.width-1||j==this.width/2)
            {
              System.out.print("\t"+a[i][j]); 
            }
            else
              System.out.print("\t"); 
          }
           System.out.println(" "); 
        }
      }
}              
class Test
{    
    public static void main(String [] args)
    { 
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER DIAMENTIONS");
      int k=sc.nextInt();
      int s=sc.nextInt();
      Arrayoperation ob=new Arrayoperation();
      ob.setData(k,s);
      ob.inputArray();
    }
}
   
