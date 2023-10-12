import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
       new Test().input();
    }
    public void input(){
      Scanner sc=new Scanner (System.in);
      int a[]=new int[20];
      int i,ch=1,k=1;
      
     while(k!=13)
     { 
      System.out.println("1 for evenoddsum");
      System.out.println("2 for duplicate element");
      System.out.println("3 for items found  ");
      System.out.println("4 for index value enter");
      System.out.println("5 for repeate element");
      System.out.println("6 for small element");
      System.out.println("7 for large element");
      System.out.println("8 for bubble sort element");
      System.out.println("9 for selection sort element");
      System.out.println("10 for 2nd small element in array");
      System.out.println("11 for 2nd large element in array");    
      System.out.println("12 for pascal print");
      System.out.println("13 for Exit ");
      System.out.println("your choices are ");
      ch=sc.nextInt();
      if(ch>=13)
      {      
      System.exit(0);      
      }
      System.out.println("how many elements want to enter ");
      int n=sc.nextInt();
      System.out.println("enter elements in array");
        for ( i=0;i<n;i++)
        a[i]=sc.nextInt();
      
    switch(ch)
    {
      case 1: new Test().evenodd(a,n,i);
      break;
    
      case 2: new Test().duplicate(a,n,i);
      break;
    
      case 3: new Test().items(a,n,i,sc);  
      break;
    
      case 4: new Test().invalue(a,n,i,sc);
      break;
    
      case 5: new Test().repeate(a,n,i);
      break;
    
      case 6: new Test().minimum(a,n,i);
      break;
    
      case 7: new Test().maximum(a,n,i);
      break;
    
      case 8: new Test().bubble(a,n,i);
      break;
    
      case 9: new Test().select(a,n,i);
      break;
      
      case 10: new Test().secmin(a,n,i);
      break;
      
      case 11: new Test().secmax(a,n,i);
      break;
      
      case 12: new Test().pascal(a,n,i);
      break; 
         
     }
     }
   }
   public void evenodd(int a[], int n,int i)
   {  
      int b=0,c=0,esum=0,osum=0;
      for( i=0;i<n;i++)
      {      
           if(a[i]%2==0)
           {
               esum=esum+a[i];
               c++;
           }
           else
           {
               osum=osum+a[i];
               b++;                
           }
       }
       System.out.println("Even esum =  "+esum);
       
       System.out.println("Odd osum = "+osum); 
   }
   public void duplicate(int a[], int n,int i )
   {   int x;
       for(i=0,x=0;i<n;i++)
	{
	  if(a[i]!=-1)
	  {
	    for(int j=i+1;j<n;j++)
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
    System.out.println("Updated array is :");
    for( i=0;i<x;System.out.println("a["+i+"]="+a[i]),i++);
   }
   public void items(int a[], int n, int i,Scanner in)
   {    
       System.out.println("Enter item");
       int item=in.nextInt();
	boolean b=false; 
	for( i=0;i<n;i++)
	{
	  if(a[i]==item)
	  {
	    b=true;
	  }
	}
	if(b)
	System.out.println("item fOUND");
	else
	System.out.println("item not found ");
   }
   public void invalue(int a[],int n,int i,Scanner in)
   {
    System.out.println("\n\nArray is:");
    for (i=0;i<n;i++)
    {
       System.out.println("a["+i+"]="+a[i]); 
    }
      System.out.println("Enter value you wnt to enter");
      int x=in.nextInt();
      System.out.println("Enter index for where you wnt value ");
      int y=in.nextInt();
   if(y<n)
   {
      int temp=0;
      for(i=0;i<n;i++)
      {
        if(i==y)
        {
          temp=a[y];
          a[y]=temp;
          a[y]=x;
        }
      }
      System.out.println("your updated array is ");
      
      for(i=0;i<n;i++)
      {
         System.out.println(" "+a[i]);
      }
   }
   else
   {
      System.out.print("wrong index.");
   }
   }
   public void repeate(int a[],int n,int i )
   {
         int count=0,c=0,j,k;
     for( i=0;i<n;i++)
     { 
       for( count=1,j=i;j<(n-1);j++)
       {  
         for(c=0,k=(i-1);k>=0;k--)
         {
           if(a[i]==a[k])
           {
             c++;
             break;
           }
         }        
             if(c==0&&a[i]==a[j+1])
             {
               count++;
             }
       }
         if(count!=1)
         {
            System.out.println(a[i]+" = "+count+" time");
         }
      }
   }
   public void minimum(int a[],int n, int i )
   {
        int min=a[0];
        for( i=0; i<n; i++)
        {
           if(a[i]<min)
               min=a[i];
        }
        System.out.println("min = "+min);
   }
   public void maximum(int a[],int n, int i)
   {
          int max=a[0];
        for( i=0; i<n; i++)
        {
          if(a[i]>max)
           max=a[i];
        }
        System.out.println("max = "+max);
   }
   public void bubble(int a[], int n, int i)
   {
        for ( i=0;i<n;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if (a[j]>a[j+1])
                {
                int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for ( i=0;i<n;i++)
        {
         System.out.println(" "+a[i]);
        }
   }
   public void select(int a[], int n, int i )
   {
     
     for ( i=0;i<n;i++)
        {
            int min=a[i];
            int k=i;
            for (int j=i+1;j<n;j++) 
            {
                if (min>a[j])
                {
                    min=a[j];
                    k=j;
                }
            }
            a[k]=a[i];
            a[i]=min;
        }
        for ( i=0;i<n;i++)
        {
           System.out.println(" "+a[i]);
        }
   }
   public void secmin(int a[], int n, int i)
   {
   
        int b=a[0],sec=a[1];
     for( i=0;i<n;i++)
     {      
             if(b>a[i])
             {
                sec=b;
                b=a[i];
              }
              else if(a[i]<sec&&a[i]>b)
                  {
                      sec=a[i];
                  }
      }
      System.out.println("second Min nunber");
      System.out.println(sec);          
   }
   public void secmax(int a[],int n,int i)
   {
        int b=a[0],sec=0;
     for( i=0;i<n;i++)
     {      
             if(b<a[i])
             {
                sec=b;
                b=a[i];
              }
              else if(a[i]>sec&&a[i]<b)
                  {
                      sec=a[i];
                  }
      }
       System.out.println("second Max nunber");
      System.out.println(sec); 
   }
   public void pascal(int a[],int n,int i)
   {     
         int k; 
         for(k=0,i=0;i<=n;i++)
        {
         int x=1;
           for(int j=1;j<=i;j++,k++)
           {
            a[k]=x;
            x=x*(i-j)/j;
           }
        }
         for(i=1,k=0;i<=n;i++)
        {
          for(int r=0;r<=n-i;r++)
          { 
           System.out.print("   ");     
          }
          for(int j=0;j<i;j++,k++)
          {
           System.out.print("   "+a[k]+"   ");
          }
          System.out.println();
        }
     
   }
}
