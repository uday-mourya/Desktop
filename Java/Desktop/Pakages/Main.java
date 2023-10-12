import java.util.Scanner;
import packpojo.Pojo;
import packarea.Area;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       Area ob=new Area();
       Pojo ob1=new Pojo();
       System.out.println("Enter length :");
       double l=sc.nextDouble();
       System.out.println("Enter width  :");
       double b=sc.nextDouble();
       System.out.println("Enter height :");
       double h=sc.nextDouble();
       ob1.setData(l,b);
       ob.areaSquare(ob1);
    }
}
