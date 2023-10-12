class Threadsyn
{
	synchronized public void test(String name)
	{
		System.out.print("India is a "+name);
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println(" Country");
	}
}

class ChildThread implements Runnable
{
	String message;
	Threadsyn tob;
	
	public ChildThread(Threadsyn tob, String msg)
	{
		this.tob = tob;
		this.message = msg;
		new Thread(this).start();
	}
	
	public void run()
	{
		tob.test(message);
	}
}

class A3
{
	public static void main(String[] args)
	{
		Threadsyn ts = new Threadsyn();
		ChildThread ob = new ChildThread(ts, "Great");
		ChildThread ob1 = new ChildThread(ts, "big");
	}
}
