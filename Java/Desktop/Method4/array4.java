import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
       new Test().input();
    }
    public void input()
    {
      Scanner sc=new Scanner (System.in);
      int a[]=new int[20];
      int i;
      System.out.println("1 for evenoddsum");
      System.out.println("2 for duplicate element");
      System.out.println("3 for items found  ");
      System.out.println("4 for index value enter");
      System.out.println("5 for repeate element");      
      System.out.println("Your choices are");
      int ch=sc.nextInt();
      System.out.println("How many elements want to enter");
      int n=sc.nextInt();
      System.out.println("Enter elements in array");
      for ( i=0;i<n;i++)
      {
        System.out.print("a["+i+"] =");
        a[i]=sc.nextInt();  
      }
    switch(ch)
    {
    case 1: new Test().evenodd(a,n,i);
    break;
    
    case 2: new Test().duplicate(a,n,i);
    break;
    
    case 3: new Test().items(a,n,i);  
    break;
    
    case 4: new Test().invalue(a,n,i);
    break;
    
    case 5: new Test().repeate(a,n,i);
    break;
    
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
   public void items(int a[], int n, int i)
   {    Scanner sc=new Scanner(System.in);
        System.out.println("Enter item");
        int item=sc.nextInt();
	boolean b=false; 
	for( i=0;i<n;i++)
	{
	 if(a[i]==item){
	 b=true;
	 
	 }
	
	}
	if(b)
	System.out.println("item fOUND");
	else
	System.out.println("item not found ");
	
   
   
   }
   public void invalue(int a[],int n,int i)
   {
   Scanner sc=new Scanner(System.in); 
    System.out.println("\n\nArray is:");
    
    for (i=0;i<n;i++)
    {
      System.out.println("a["+i+"]="+a[i]); 
    }
      System.out.println("Enter value you wnt to enter");
      int x=sc.nextInt();
      System.out.println("Enter index for where you wnt value ");    
      int y=sc.nextInt();
      
   if(y<n){
      int temp=0;
    for(i=0;i<n;i++)
    {
      if(i==y){
       temp=a[y];
       a[y]=temp;
       a[y]=x;
      }
    }
    System.out.println("your updated array is ");
    for(i=0;i<n;i++){
       System.out.print("a["+i+"] =");
       System.out.println(" "+a[i]);
    
    }
   
   }
   else{
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
}
