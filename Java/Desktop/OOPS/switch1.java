import java.util.Scanner;
class Arrayoperation
{   
  public void choice()
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("YOUR CHOICES ARE.......");
       System.out.println("\tPRESS 1.SHOW ARRAY       \tPRESS 2.MAX OF ARRAY");
       System.out.println("\tPRESS 3.MIN OF ARRAY     \tPRESS 4.SUM OF ARRAY");
       System.out.println("\tPRESS 5.SECOND MAX       \tPRESS 6.SECOND MIN");
       System.out.println("\tPRESS 7.reverse OF ARRAY \tPRESS 8.Even Odd Count");
       System.out.println("\tPRESS 9.BUBBLE SORT      \tPRESS 10.SELECTION SORT");
       System.out.println("\tPRESS 11.EXIT.......     \tPRESS 12.EXIT.......");
       System.out.println("ENTER YOUR CHOICE.......");
       int ch=sc.nextInt();
       switch(ch)
       {
         case 1:this.showArray();
          break;
         case 2:this.max();
          break;
         case 3:this.min();
          break;
         case 4:this.sum();
          break;
         case 5:this.smax();
          break;
         case 6:this.smin();
          break;
         case 7:this.reverse();
          break;
         case 8:this.count();
          break;
         case 9:this.bubble();
          break;
         case 10:this.selection();
          break;
         case 11:System.exit(0);
          break;
         case 12:System.exit(0);
       }
  }
    private int a[];
    private int len;
    public void setData(int len)
    {
       this.a=new int [10]; 
       this.len=len;
    }
    public int len()
    {
       return a.length;
    }
    public void inputArray()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER ARRAY ELEMNETS.......");
      for(int i=0;i<this.len;i++)
        a[i]=sc.nextInt(); 
        this.choice(); 
    }
   
    public void showArray()
    { 
       System.out.println("ARRAY ELEMENTS ARE");
      for(int i=0;i<this.len;i++)
      {
         System.out.println(a[i]); 
      }  
    }   
    public void max()
    { 
       int max;
       max=a[0];
      for(int i=0;i<this.len;i++)
      {
         if(max<a[i])
         max=a[i];
      } 
        System.out.println("Max : "+max); 
    }
    public void min()
    {
      int min;
      min=a[0];
     for(int i=0;i<this.len;i++)
     {
        if(a[i]<min)
        min=a[i];
     }
     System.out.println("MINIMUM NUMBER = "+min);
    }
    public void sum()
    {
     int sum=0;
     for(int i=0;i<this.len;i++)
     {
        sum=sum+a[i];
     }
     System.out.println("SUM OF ARRAY IS = "+sum);
    }
    public void smax()
    {
      int max;
      max=a[0];
     for(int i=0;i<this.len;i++)
     {
        if(a[i]>max)
        max=a[i];
     }
     int smax;
     smax=0;
     for(int i=0;i<this.len;i++)
     {
       if(smax<a[i]&&a[i]<max)
       smax=a[i];
     }
     System.out.println("SECOND MAX = "+smax);
    }
    public void smin()
    {
      int min;
      min=a[0];
      for(int i=0;i<this.len;i++)
      {
        if(a[i]<min)
         min=a[i];
      }
      int smin=0;
      for(int i=0;i<this.len;i++)
      {
        if(a[i]<smin&&a[i]>min)
        smin=a[i];
      }
      System.out.println("SECOND MIN = "+smin);
    }
    public void reverse()
    {  
       int i;
       int temp=0;
       for(i=0;i<this.len;i++)
       { 
         temp=a[i];
         a[i]=a[this.len-i-1];
         a[this.len-i-1]=temp;
         System.out.println("\t a["+i+"] = "+a[i]);
       }
    }
    public void count()
    {  
        int i,c=0,b=0;
        for(i=0;i<this.len;i++)
        {        
           if(a[i]%2==0)
            c++;
           else  
            b++;
        }
       System.out.println("EVEN NO= "+c); 
       System.out.println("ODD  NO = "+b); 
    }
    public void bubble()
    {   
        int i,j,temp=0;
	for( i=0;i<this.len-1;i++)
	{  
	  for(j=i+1;j<this.len-i-1;j++)
	  {
	     if(a[j]>a[j+1])
	     {
	       temp=a[j];
	       a[j]=a[j+1];
	       a[j+1]=temp;
	     }  
	  } 
        }	
	for (i=0;i<this.len;i++){
	  System.out.println("\t"+a[i]);
	}     
    }
    public void selection()
    {
      int i,j,pos=0;
      for( i=0;i<this.len;i++)
	{  
	  int min=a[i];
	      pos=i;
	  for(j=i+1;j<this.len;j++)
	  {
	    if(min>a[j])
	    {
	      min=a[j];
	      pos=j;
	    }  
	  }  
	   
	   a[pos]=a[i];
	   a[i]=min;
	 
       }	
	  for (i=0;i<this.len;i++){
	  System.out.println("\t"+a[i]);
	}  
    }
}
class Test
{    
    public static void main(String [] args)
    { 
      Scanner sc=new Scanner(System.in);
      System.out.println("HOW MANY ELEMENTS YOU WANTS TO ENTERED");
      int k=sc.nextInt();
      Arrayoperation ob=new Arrayoperation();
      ob.setData(k);
      ob.len();
      ob.inputArray();
    }
}
   
