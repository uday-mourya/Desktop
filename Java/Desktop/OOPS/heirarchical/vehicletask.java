abstract class Vehicle 
{
    String name;
    String brand;
    String color;
    int seatingCapacity;
    double cost;

    public Vehicle(String name, String brand, String color, int seatingCapacity, double cost) 
    {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.seatingCapacity = seatingCapacity;
        this.cost = cost;
    }
    public void display()
    { 
      System.out.println("NAME    ="+this.name);
      System.out.println("BRAND   ="+this.brand);
      System.out.println("COLOUR  ="+this.color);
      System.out.println("SEATING ="+this.seatingCapacity);
      System.out.println("COST    ="+this.cost);
    }
    abstract void drive();
    abstract void brake();
    //abstract void displayInfo();
}

abstract class LandTransport extends Vehicle
{
    int numberOfWheels;

    public LandTransport(String name, String brand, String color, int seatingCapacity, double cost, int numberOfWheels) 
    {
        super(name, brand, color, seatingCapacity, cost);
        this.numberOfWheels = numberOfWheels;
    }
      public int getNumberOfWheels()
      {   
       return numberofWheels; 
    
      }
}

class Cycle extends LandTransport 
{
    public Cycle(String name, String brand, String color, int seatingCapacity, double cost, int numberOfWheels)
      {
        super(name, brand, color, seatingCapacity, cost, numberOfWheels);
      }
      void drive() 
      {
        // Implementation specific to land transport
        System.out.println("Driving on land.");
      }
      public void display()
      {
        
      }
    void brake() 
    {
        // Implementation specific to land transport
        System.out.println("Applying brakes on land.");
    }
}

class Bike extends LandTransport 
{
    public Bike(String name, String brand, String color, int seatingCapacity, double cost, int numberOfWheels)
    {
        super(name, brand, color, seatingCapacity, cost, numberOfWheels);
    }
    void drive() 
      {
        // Implementation specific to land transport
        System.out.println("Driving on land.");
      }

     
    void brake() 
    {
        // Implementation specific to land transport
        System.out.println("Applying brakes on land.");
    }
}

class Car extends LandTransport
{
    public Car(String name, String brand, String color, int seatingCapacity, double cost, int numberOfWheels) 
    {
        super(name, brand, color, seatingCapacity, cost, numberOfWheels);
    }
    void drive() 
      {
        // Implementation specific to land transport
        System.out.println("Driving on land.");
      }

     
    void brake() 
    {
        // Implementation specific to land transport
        System.out.println("Applying brakes on land.");
    }
}

abstract class WaterTransport extends Vehicle
{
    boolean hasPropellers;
    
    public WaterTransport(String name, String brand, String color, int seatingCapacity, double cost, boolean hasPropellers) 
    {
        super(name, brand, color, seatingCapacity, cost);
        this.hasPropellers = hasPropellers;
    }
    
     
    void drive()
    {
        
        System.out.println("Driving on water.");
    }

     
    void brake() 
    {
        
        System.out.println("Applying brakes on water.");
    }
}

class Ship extends WaterTransport
 {
    public Ship(String name, String brand, String color, int seatingCapacity, double cost, boolean hasPropellers)
    {
        super(name, brand, color, seatingCapacity, cost, hasPropellers);
    }
}

class Submarine extends WaterTransport
{
    public Submarine(String name, String brand, String color, int seatingCapacity, double cost, boolean hasPropellers) 
    {
        super(name, brand, color, seatingCapacity, cost, hasPropellers);
    }
}

class Boat extends WaterTransport 
{
    public Boat(String name, String brand, String color, int seatingCapacity, double cost, boolean hasPropellers) 
    {
        super(name, brand, color, seatingCapacity, cost, hasPropellers);
    }
}

class Main 
{
    public static void main(String[] args) 
    {
        
        Cycle cycle = new Cycle("Cycle", "Brand", "Red", 1, 100.0, 2);
        Bike bike = new Bike("Bike", "Brand", "Blue", 2, 200.0, 2);
        Car car = new Car("Car", "Brand", "Black", 4, 10000.0, 4);
        Ship ship = new Ship("Ship", "Brand", "White", 100, 1000000.0, true);
        Submarine submarine = new Submarine("Submarine", "Brand", "Yellow", 20, 500000.0, false);
        Boat boat = new Boat("Boat", "Brand", "Green", 5, 5000.0, false);
        
        // Accessing the attributes and methods of the created objects
        System.out.println(cycle.name);
        System.out.println(bike.color);
        System.out.println(car.seatingCapacity);
        System.out.println(ship.brand);
        
        cycle.drive();
        bike.brake();
        car.drive();
        ship.drive();
        submarine.brake();
        boat.drive();
    }
}
