class Vehicle
{
	String brand;
	public void setData(String brand)
	{
		this.brand = brand;
	}
	public void getVehicle()
	{
		System.out.println("Brand "+brand);
	}
} 
class Car extends Vehicle
{
	int wheels, mirrors,seat;
	public void setData(int wheels, int mirrors, int seat, String brand)
	{
		this.setData(brand);
		this.wheels = wheels;
		this.mirrors = mirrors;
		this.seat = seat;
	}
	public void getCar()
	{
		System.out.println("Number of wheels : "+wheels+"\nNumber of mirrors : "+mirrors+"\nNumber of seats : "+seat);
	}
	
}
class ElectricCar extends Car
{
	int battery,charger;
	public void setData(int wheels, int mirrors, int seat, String brand, int battery, int charger)
	{
		this.setData(wheels, mirrors, seat, brand);
		this.battery = battery;
		this.charger = charger;
	}
	public void getElectricCar()
	{
		System.out.println("Battery Capacity : "+battery+" (in kWh)"+"\nCharging capacity : "+charger+" (in volt)");	
	}
}
class Test
{
	public static void main(String args [])
	{
		ElectricCar ob = new ElectricCar();
		ob.setData(4,4,4,"XUV 200",75,480);
		ob.getVehicle();
		ob.getCar();
		ob.getElectricCar();
	}
}
