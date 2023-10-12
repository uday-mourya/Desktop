import java.util.Scanner;
class Electri{
 public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Last Month Ebil Unit");
	int a=sc.nextInt();
	System.out.println("Enter Current month Ebill Unit");
	int b=sc.nextInt();
	int cunit=b-a;
	System.out.println("Current Month Unit :"+cunit);
	int c=cunit*5;
	float d=cunit*7.5f;
	float e=cunit*12.5f;
	int f=cunit*16;
	if(cunit<=100)
	{
	   System.out.println("Your Current Month Bill Amount : "+c);
	}
	else
	  {
	    if(cunit>100&&cunit<200)
	       System.out.println("Your Current Month Bill Amount : "+d); 
	    else if(cunit>200&&cunit<300){
	       System.out.println("Your Current Month Bill Amount : "+e);
	       }   
	    else if (cunit>300)
	       System.out.println("Your Current Month Bill Amount : "+f);
	  }        
	       
}
}
