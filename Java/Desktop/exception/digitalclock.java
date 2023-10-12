class MyThread extends Thread
{
	public MyThread(){}
	/*public FirstThread(String name)
	{
		super(name);
	}*/

	public void run()
	{
		for(int i=0; i<=23; i++)
		{
			for(int j=0;j<60; j++)
			{
				for(int k=0; k<60;k++)
				try
				{
						System.out.println(i+":"+j+":"+k);
				}
				catch(Exception e){}
			}
		}
	}
	/*public void clock()
	{
		for(int i=0,j=0,k=0; k<24;k++)
		{
            System.out.println(i+":"+j+":"+k+""/r");
			try{
				if(k==60)
			}
		}
	}*/
}
class Test
{
	public static void main(String args[])
	{
		MyThread ob = new MyThread();
		
		ob.start();
		
	}
}
