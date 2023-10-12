class Student
{
	
	int rno;
	String name;
	public Student()
	{
		 
	}
	public Student(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}	
	public void display()
	{
		 System.out.println("ROLL NO    ="+this.rno);
		 System.out.println("NAME       ="+this.name);
		
	}
	interface Extra
	{
		 int total();
	}
}
class Marks extends Student
{   
   	int p,c,m;
   	public Marks()
  	{

        }
	public Marks(int p,int c,int m,int rno,String name) 
	{
	
           super(rno,name);
           this.p=p;
           this.c=c;
           this.m=m;

        }

        public void display()
        {
          super.display();
	  System.out.println("PHYSICS  ="+this.p);
  	  System.out.println("CHEMISTRY="+this.c);
	  System.out.println("MATHS    ="+this.m);
        }
}
class Result extends Marks implements Extra
{
	public Result()
	{
		
		
	}
	public Result (int p,int c,int m,int rno,String name)
	{
		super(p,c,m,rno,name);	
	}
	public int total()
	{
		return this.p+this.c+this.m;
		
	}
	public double percentage(int tot)
	{
		
		return tot/3.0;
	}
}
class  Studentclient
{
	public static void main(String [ ]  args)
	{
		  Result ob=new Result(70,85,90,213," xyz");
		  ob.display();
		  int tot=ob.total();
		  double per=ob.percentage(tot);
		  System.out.println("TOTAL ="+tot);
		  System.out.println("PERCENTAGE ="+per);
	}
}
