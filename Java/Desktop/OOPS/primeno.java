import java.util.Scanner;
class Prime
{
	static int x;
	public void getValue(int a)
	{
		x=a;
	}		
	public int prime()
	{
		int count =0;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				count++;
				break;
			}
		}
		return count;
	}
}
class Test
{
	public static void main(String args[])
	{
		Prime ob=new Prime();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ob.getValue(n);
		int res=ob.prime();
		if(res==0&&n!=1)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}
