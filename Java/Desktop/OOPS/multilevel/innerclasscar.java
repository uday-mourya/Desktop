class Car
{ 
    String name;
    int capacity;
    Engine parts;
    public Car(String name,int capcity,int cylinderhead,int  sparkplug,int pistonring )
    {
      
        this.name=name;
        this.capacity=capacity;
        parts =new Engine(cylinderhead,sparkplug,pistonring); 
    }
    public void display()
    {
        System.out.println("name     :"+this.name);
        System.out.println("capacity :"+this.capacity);
        this.parts.show();
    }
    class Engine 
    {
        int  cylinderhead,sparkplug,pistonring;
        public Engine(int  cylinderhead,int  sparkplug,int pistonring )
        {
            this.cylinderhead=cylinderhead;
            this.sparkplug=sparkplug;
            this.pistonring=pistonring;
          
        }
        public void show()
        {
            System.out.println("Cylinderhead :"+this.cylinderhead);
            System.out.println("sparkplug    :"+this.sparkplug);
            System.out.println("pistonring   :"+this.pistonring);
    
       }
    
    }
}
//clint class 
class Test
{
    public static void main(String args[])
    {
        Car ob=new Car("Maruti 800",4,1,3,3);
        ob.display();
    }
}
        
            
        
         
