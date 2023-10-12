class College
{
    String  name;
    Employee list;
    public College(String name,int teacher,int sweeper,int Itwork,int hod)
    {
        list=new Employee(teacher,sweeper,Itwork,hod);
        this.name=name;
    }
    public void display()
    {
        System.out.println("Name ="+name);
        this.list.show();
    }
       class Employee
       {
           int teacher,sweeper,Itwork,hod;
           public Employee(int teacher,int sweeper,int Itwork,int hod)
           {
               this.teacher=teacher;
               this.sweeper=sweeper;
               this.Itwork=Itwork;
               this.hod=hod;
           }
           public void show()
           {
               System.out.println("Teacher ="+this.teacher);
               System.out.println("sweeper ="+this.sweeper);
               System.out.println("Itwork  ="+this.Itwork);
               System.out.println(" HoD    ="+this.hod);
           }
      }
}
 class Test
 {
     public static void main(String[] args)
     {
        College ob=new College("bhabha",50,20,10,15);
        ob.display();
     }
 }
            
       
