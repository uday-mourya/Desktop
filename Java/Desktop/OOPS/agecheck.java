import java.util.Scanner;
class Voter
{   private int age;
    public void setData(int age)
     {
      this.age=age;
     }


  public int check()
   {
      if(age<=0)
      System.out.println("invaild age");
     else if (age<=12)
       System.out.println("Child");
     else if (age<=19)
      System.out.println("Teen Age");
     else if (age<=59)
      System.out.println("Young");
     else
     System.out.println("Old");
       
      return age;
    }

}

class Test
{
   public static void main(String arg[])
      {
	java.util.Scanner sc= new java.util.Scanner(System.in);
	System.out.println("Enter your age");
	int age=sc.nextInt();
        Voter ob=new Voter();
        ob.setData(age);
        int k=ob.check();
        //System.out.println(age+"Age="+k);    
      }	
	
}


