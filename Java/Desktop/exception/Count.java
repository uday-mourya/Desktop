class Test
{
	public static void main(String args[])
	{
		int a[]=new int[5];

	    int i,j,count=0;
	   try
	   {
	  		for( i=1,j=0;i<a.length&&i<args.length;i++)
	  		{
	   			 a[i]=Integer.parseInt(args[i]);
				 j++;
	  		}
	   }
	  catch(NumberFormatException r)
	  {
	  	count++;
	  }
	  System.out.println(" inValid      ="+count);
	  System.out.println(" valid      ="+j);
	
	}

}
