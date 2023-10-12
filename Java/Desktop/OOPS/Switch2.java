import java.util.Scanner;
class Array
{
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
             System.out.println("Enter elements in array");
             for(int i=0;i<this.length;i++)
             {
                 for(int j=0;j<this.width;j++)
                 {
                    a[i][j]=sc.nextInt();
                 }
                 System.out.println();
             }   
       }
       
     public void showArray()
       {
            System.out.println("Array elements are:");
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
       
      public void secondmax()
       {    
           int max = a[0][0];
	   int max2 =a[0][1]; 
	  for(int i=0; i<this.length; i++)
	  {
	     for(int j=0; j<this.width; j++)
	     {
	        if(max<a[i][j])
	        {
	          max2  = max;
	          max = a[i][j];
	        }
	        else if(max==max2 || (max>a[i][j])&&(max2<a[i][j]))
	              max2 = a[i][j];
	     }
	     
	  
	  }
	  System.out.println("Second max element is :"+max2);
	  
       }      
       
     public void secondmin()
        {    
           int min = a[0][0];
	   int min2 =a[0][1];   
	   for(int i=1; i<this.length; i++)
	    {
	     for(int j=1; j<width; j++)
	      {
	       if(min>a[i][j])
	        {
	         min2  = min;
	         min = a[i][j];
	        }
		else if((min<a[i][j])&&(min2>a[i][j]))
	              min2 = a[i][j];	       
	     }
	     
	  
	  }
	  System.out.println("Second minimum element is :"+min2);
       }       
     
     public void pattern()
       { 
        int sum=0;
        System.out.println("your pattern :");
          for(int i=0;i<this .length;i++)
           {
            for(int j=0;j<=i;j++)
              { 
               sum=sum+a[i][j];
               System.out.print(a[i][j]);
              }
             System.out.println();
           }
         System.out.println("Sum of matrix="+sum);
       }    
     
      public void patternb()
       { 
         int sum=0;
         System.out.println("your pattern :");
          for(int i=0;i<this.length;i++)
           {
            for(int j=0;j<this.width;j++)
              { 
            
               if(i!=0 && j!=0 && i!=this.length-1 && j!=this.width-1)
                 {
                  sum=sum+a[i][j];
                  System.out.print("\t"+a[i][j]);
                 }              
                else
                  System.out.print("\t");
              }
            
             System.out.println();
           }
         System.out.println("Sum of matrix="+sum);
       } 
       
    public void patternf()
       { 
         int sum=0;
         System.out.println("your pattern :");
          for(int i=0;i<this.length;i++)
           {
            for(int j=0;j<this.width;j++)
                {
                  sum=sum+a[i][j];
                  System.out.print("\t"+a[i][j]);
                }
            
             System.out.println();
           }
         System.out.println("Sum of matrix="+sum);
       }      
       
    public void patterns()
       { 
         int sum=0;
          System.out.println("your pattern :");
          for(int i=0;i<this.length;i++)
           {
            for(int j=0;j<this.width;j++)
              { 
            
               if(i==0||j==0||i==this.length-1||j==this.width-1)
                 {
                  sum=sum+a[i][j];
                  System.out.print("\t"+a[i][j]);
                 }              
                else
                  System.out.print("\t");
              }
            
             System.out.println();
           }
         System.out.println("Sum of matrix="+sum);
        
       }    
       
     public void pattern2d()
       { 
        int sum=0;
        System.out.println("your pattern :");
          for(int i=0;i<this.length;i++)
           {
            for(int j=0;j<this.width;j++)
              { 
  
               if(i==j||i+j==(this.width-1))
                 {
                  sum=sum+a[i][j];
                  System.out.print("\t"+a[i][j]);
                 }              
                else
                  System.out.print("\t");
              }
            
             System.out.println();
           }
         System.out.println("Sum of matrix="+sum);
       }    
       
     public void pattern3d()
       { 
        int sum=0;
        System.out.println("your pattern :");
          for(int i=0;i<this.length;i++)
           {
            for(int j=0;j<this.width;j++)
              { 
               int x=this.width/2;
               if(i==j||i+j==(this.width-1)||i+j==x+i)
                 {
                  sum=sum+a[i][j];
                  System.out.print("\t"+a[i][j]);
                 }              
                else
                  System.out.print("\t");
              }
            
             System.out.println();
           }
         System.out.println("Sum of matrix="+sum);
            
       }
 }    
       
class Test
  {
       public static void main(String[] args)
        {
           Scanner sc=new Scanner(System.in);
           Array ob=new Array();
           System.out.println("Enter many row you want to print ");
           int n=sc.nextInt();
           System.out.println("Enter many column you want to print");
           int m=sc.nextInt();
           ob.setData(n,m);       
           ob.inputArray();
           ob.showArray();
           int ch;
         do
          {
           System.out.println("\n\t Your choices are:-"); 
           System.out.println("1 for Maximum \t\t 2 for Minimum");
           System.out.println("3 for Second Max\t 4 for Second Min");
           System.out.println("5 for DPattern\t\t 6 for FPattern");
           System.out.println("7 for SPattern \t\t 8 for BPattern");
           System.out.println("9 for DPattern2D \t 10 for DPattern3D");
           System.out.println("11 for exit" );
           System.out.println("Enter your choice:-");
           ch=sc.nextInt();
           switch(ch)
            {
             case 1:
                  //  ob.setData(n,m);
                  //  ob.inputArray();
                    ob.maxArray();
                    break;
                    
             case 2:
                    ob.setData(n,m);
                    ob.inputArray();
                    ob.minArray();
                    break;
            
             case 3:
                    ob.setData(n,m);
                    ob.inputArray();
                    ob.secondmax();
                    
             case 4:
                    ob.setData(n,m);
                    ob.inputArray();
                    ob.secondmin();
                    break;
                    
            case 5:
                    ob.setData(n,m);
                    ob.inputArray();
                    ob.pattern();
                    break;
                    
            case 6:
                    ob.setData(n,m);
                    ob.inputArray();
                    ob.patternb();
                    break;
            
            case 7:
                    ob.setData(n,m);
                    ob.inputArray();
                    ob.patternf();
                    
            case 8:
                    ob.setData(n,m);
                    ob.inputArray();
                    ob.patterns();
                    break;
                           
            case 9:
                    ob.setData(n,m);
                    ob.inputArray();
                    ob.pattern2d();
                    break;
                    
             case 10:
                    ob.setData(n,m);
                    ob.inputArray();
                    ob.pattern3d();
                    break;
                    
          }
        }
       while(ch!=11);
     }
 }  
            
            
                             
                    
                    
                    
