class Animal 
{
	String colour;
	int age, weight, height;
	public Animal(String colour,int weight, int age, int height)
	{
		this.age = age;
		this.colour  = colour;
		this.weight = weight;
		this.height = height;
	}
	public void getAnimal()
	{
		System.out.println("colour :"+colour+"\nAge :"+age+"\nWeight :"+weight+"\nHeight :"+height);
	}
} 
class Mammel extends Animal
{
	int legs;
	public Mammel(String colour,int weight, int age, int height, int legs)
	{
		super(colour, weight, age, height);
		this.legs  = legs;
	}
	public void getMammel()
	{       
	       // super.getAnimal();
		System.out.println("Number of legs : "+legs);
	}
	
}
class Dog extends Animal
{
	String breed;
	public Dog(String colour,int age, int weight, int height,int legs, String breed)
	{
		super(colour, age, weight, height,legs);
		this.breed  = breed;
		
	}
	public void getDog()
	{
	  System.out.println("Dog of breed :"+breed);
	}
}
class Test
{
	public static void main(String args [])
	{
		Dog ob = new Dog();
		ob.setData("black", 10, 35, 60,4, "xyz");
		ob.getDog();
		//ob.getMammel();
		//ob.getAnimal();
	}
}
