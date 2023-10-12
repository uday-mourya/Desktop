class Pet
{
	int weight;
	int height;
	String colour,age;
	void setData(String colour,String age, int weight, int height)
	{
		this.age = age;
		this.colour  = colour;
		this.weight = weight;
		this.height = height;
	}
	public void getPet()
	{
		System.out.println("colour :"+colour+"\nAge :"+age+"\nWeight :"+weight+"\nHeight :"+height);
	}
	
}
class Cat extends Pet
{
	String breed;
	public void setData(String colour,String age, int weight, int height, String breed)
	{
		this.setData(colour, age, weight, height);
		this.breed  = breed;
		
	}
	public void getCat()
	{
	  System.out.println(" BREED OF CAT:"+breed);
	}
	
}
class Test
{
	public static void main(String args [])
	{
		Cat ob = new Cat();
		ob.setData("BLACK-BROWN", "10", 35, 60, "XYZ");
		ob.getCat();
		ob.getPet();
	}
}
