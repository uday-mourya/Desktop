class Person
{
	String name;
	String age;
	int weight;
	String height;
	void setData(String name,String age, int weight, String height)
	{
		this.name  = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public void getPerson()
	{
		System.out.println("Name :"+name+"\nAge :"+age+"\nWeight(in kgs) :"+weight+"\nHeight :"+height);
	}
	
}
class Teacher extends Person
{
	String subject;
	String college;
	public void setData(String name, String age, int weight, String height, String subject, String college)
	{
		this.setData(name, age, weight, height);
		this.subject  = subject;
		this.college = college;
		
	}
	public void getTeacher()
	{
	  System.out.println("Institute :"+college+"\nSubject : "+subject);
	}
	
}
class Test
{
	public static void main(String args [])
	{
		Teacher ob = new Teacher();
		ob.setData("Uday", "19", 46,"164 cms","JAVA","SGSITS-INDORE");
		ob.getPerson();
		ob.getTeacher();
	}
}
