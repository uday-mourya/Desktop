class Array
{
	public static void main(String args[])
	{
	  java.util.Scanner sc = new java.util.Scanner(System.in);
	   int a[] = new int[10];
	   int sum =0, i,temp;
	   System.out.println("how many elements you want to enter");
	   int n = sc.nextInt();
	    System.out.println("Enter elements of array");
	   
	   
	   for(i = 0; i<n; i++)
	   {
	     a[i] = sc.nextInt();
	   }
	    System.out.println("Actual elements of array are :");
	   
	   for( i = 0; i<n; i++)
	   {
	     System.out.println("\ta["+i+"]="+a[i]);
	   
	   }
	     System.out.println("After reversing elements are: ");
	   
	   for(i = 0; i<n/2; i++)
	   {
	     
	      temp = a[i];
	      a[i] = a[n-(i+1)];
	      a[n-(i+1)] = temp;
	      
	      
	   }
	   for(i = 0; i<n; i++)
	   
	     System.out.println("\ta["+i+"]="+a[i]);
	}
}
