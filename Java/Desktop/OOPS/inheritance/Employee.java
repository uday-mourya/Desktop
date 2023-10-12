class Employe
{
	private int salary,increment;
	public void setData(int s, int i)
	{
		this.salary = s;
		this.increment = i;
	}
	public int getSalary()
	{
		return salary;
	}
	public int getIncrement()
	{
		return increment;
	}
	public int getSum()
	{
		return this.getSalary()+this.getIncrement();
	}
}
class Bonus extends Employe
{
	private int bonus ;
	public void setData(int s,int i, int b)
	{
		this.setData(s,i);
		this.bonus = b;
	}
	public int getBonus()
	{
		return bonus;
	}
	public int getTotal()
	{
		return getSum()+getBonus();
	}

}
class Test 
{
	public static void main(String args[])
	{
		Bonus ob  = new Bonus();
		ob.setData(20000,800);
		ob.setData(20000,800,500);
		System.out.println("Salary with increament  = "+ob.getSum());
		System.out.println("Salary with increament and bonus  = "+ob.getTotal());
	}
}