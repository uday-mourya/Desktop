interface MyLambda
{
   void display();
   
}
class Test
{
	public static void main(String [] args)
	{
	   MyLambda ob=()->
	   {
	      System.out.println("Hello Display");
	   };
	   //ob.display();
	   MyLambda ob1=()->
	   {
	      System.out.println("Hello ");
	   };
	   ob.display();
	   ob1.display();
	}
}
