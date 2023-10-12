import java.util.Scanner;
//client app
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
	System.out.println("how any sutudent result");
	int n = sc.nextInt();
	Student std[] = new Student[n];
	MarkSheet ob=new MarkSheet();
	for(int i=0;i<n;i++)
	{
	    std[i]=new Student();
	}
	for(int i=0;i<n;i++)
	{
	    std[i].setDataRoll(std,i);
	    std[i].setDataName();
	    std[i].setDataFn();
	    std[i].setDataMn();
	    std[i].setDataCourse();
	    std[i].setDataBranch();
	    std[i].setDataSem();
	    std[i].setDataYear();
	    std[i].setPhysic();
	    std[i].setChemistry();
	    std[i].setMaths();
	    std[i].setEnglish();
	    std[i].setHindi();
	    std[i].setTotalMarks();
	    std[i].setPer();
	}
	
	int ch;
	String name;
	int m;
	do
	{
	    System.out.println("\t\t\t: Your Choices :");
	    System.out.println("\t# Press 1 For Cheak Roll no");
	    System.out.println("\t# Press 2 For Cheak Name");
	    System.out.println("\t# Press 3 For Cheak Percentage");
	    System.out.println("\t# Press 4 For Exit");
	    ch=sc.nextInt();
	    sc.nextLine();
	    if(ch==1)
	    {
	        System.out.print("Enter the Roll_no : ");
	        m=sc.nextInt();
	        ob.roll1(std,n,m,ob);
	    }
	    if(ch==2)
	    {
	        System.out.print("Enter the Name : ");
	        name=sc.nextLine();
	        ob.nameCheak(std,n,name,ob);
	    }
	    if(ch==3)
	    {
	        System.out.print("Enter the Roll_no : ");
	        m=sc.nextInt();
	        ob.percentage(std,n,m,ob);
	    }
	}
	while(ch!=4);
	
    }
}
//POJO
class Student
{
    Scanner sc=new Scanner(System.in);
    private int roll,sem,year,p,c,m,e,h,tm;
    private double d;
    private String name,fn,mn,course,branch;
    public void setDataRoll(Student std[],int i)
    {
        System.out.print("\n\n\nEnter your Roll_no : ");
        this.roll=sc.nextInt();
        for(int j=0;j<i;j++)
        {
            if(std[j].roll==this.roll)
            {
                System.out.println("Roll Number Exist");
                this.setDataRoll(std,i);
            }
        }
    }
    public int getDataRoll()
    {
        return this.roll;
    }
    public void setDataName()
    {
        sc.nextLine();
        System.out.print("Enter your Name : ");
        this.name=sc.nextLine();
    }
    public String getDataName()
    {
        return this.name;
    }
    public void setDataFn()
    {
        System.out.print("Enter your Father Name : ");
        this.fn=sc.nextLine();
    }
    public String getDataFn()
    {
        return this.fn;
    }
    public void setDataMn()
    {
        System.out.print("Enter your mother Name : ");
        this.mn=sc.nextLine();
    }
    public String getDataMn()
    {
        return this.mn;
    }
    public void setDataCourse()
    {
        System.out.print("Enter your course : ");
        this.course=sc.nextLine();
    }
    public String getDataCourse()
    {
        return this.course;
    }
    public void setDataBranch()
    {
        System.out.print("Enter your branch : ");
        this.branch=sc.nextLine();
    }
    public String getDataBranch()
    {
        return this.branch;
    }
    public void setDataSem()
    {
        System.out.print("Enter your Sem : ");
        this.sem=sc.nextInt();
    }
    public int getDataSem()
    {
        return this.sem;
    }
    public void setDataYear()
    {
        System.out.print("Enter your Year : ");
        this.year=sc.nextInt();
    }
    public int getDataYear()
    {
        return this.year;
    }
    public void setPhysic()
    {
        System.out.print("Enter Marks of Physic : ");
        p=sc.nextInt();
        if(p<0||p>100)
        {
            System.out.println("Enter valid Marks");
            this.setPhysic();
        }  
    }
    public int getPhysic()
    {
        return this.p;
    }
    public void setChemistry()
    {
        System.out.print("Enter Marks of Chemistry : ");
        c=sc.nextInt();
        if(c<0||c>100)
        {
            System.out.println("Enter valid Marks");
            this.setChemistry();
        }  
    }
    public int getChemistry()
    {
        return this.c;
    }
    public void setMaths()
    {
        System.out.print("Enter Marks of Maths : ");
        m=sc.nextInt();
        if(m<0||m>100)
        {
            System.out.println("Enter valid Marks");
            this.setMaths();
        }  
    }
    public int getMaths()
    {
        return this.m;
    }
    public void setEnglish()
    {
        System.out.print("Enter Marks of English : ");
        e=sc.nextInt();
        if(e<0||e>100)
        {
            System.out.println("Enter valid Marks");
            this.setEnglish();
        }  
    }
    public int getEnglish()
    {
        return this.e;
    }
    public void setHindi()
    {
        System.out.print("Enter Marks of Hindi :");
        h=sc.nextInt();
        if(h<0||h>100)
        {
            System.out.println("Enter valid Marks");
            this.setEnglish();
        }  
    }
    public int getHindi()
    {
        return this.h;
    }
    	
    public void setTotalMarks()
    {
        this.tm=this.p+this.c+this.m+this.h+this.e;
    }
    public int getTotalMarks()
    {
        return tm;
    }
    public void setPer()
    {
        this.d=this.tm/5;
    }
    public double getPer()
    {
        return this.d;
    }

}
//Business Logic
class MarkSheet
{
    public void roll1(Student str[],int n,int m,MarkSheet ob)
    {
        for(int i=0;i<n;i++)
        {
            if(m==str[i].getDataRoll())
            {
                ob.getData(str,i);
            }
        } 
     }
     
     public void percentage(Student str[],int n,int m,MarkSheet ob)
     {
         for(int i=0;i<n;i++)
         {
             if(m<=str[i].getPer())
             {
                 ob.getData(str,i);
             }
         }  
     }
     public void nameCheak(Student str[],int n,String na,MarkSheet ob)
     {
         for(int i=0;i<n;i++)
         {
             if(na.equals(str[i].getDataName()))
             {
                 ob.getData(str,i);
             }
         }
     }
    
    public void getData(Student a[],int i)
    { 	           
    
       System.out.println("\t\t\t\t\tDavv-Indore\n");
       System.out.println("\tRoll\t:"+a[i].getDataRoll()+"\t\t\t\t       Course\t:"+a[i].getDataCourse());
       System.out.println("\tName\t:"+a[i].getDataName()+"\t\t\t\t       Branch\t:"+a[i].getDataBranch());
       System.out.println("\tFName\t:"+a[i].getDataFn()+"\t\t\t\t       Year\t:"+a[i].getDataSem());
       System.out.println("\tMName\t:"+a[i].getDataMn()+"\t\t\t\t       Sem:"+a[i].getDataYear()); 
       System.out.println("\t--------------------------------------------------------------");
       System.out.println("\tsubcode\t subname \tmaxmarks\tminimarks\tobtmarks");
       System.out.println("\t  101  \t physics \t  100    \t  33    \t "+a[i].getPhysic() );   
       System.out.println("\t  102  \tchemistry\t  100    \t  33    \t "+a[i].getChemistry() );   
       System.out.println("\t  103  \t  maths  \t  100    \t  33    \t "+a[i].getMaths() );   
       System.out.println("\t  104  \t English \t  100    \t  33    \t "+a[i].getEnglish() );   
       System.out.println("\t  105  \t  Hindi  \t  100    \t  33    \t "+a[i].getHindi() );   
       System.out.println("\t--------------------------------------------------------------");
       System.out.println("\t Total\t\t\t\t\t\t\t  "+a[i].getTotalMarks());
    
	int p=a[i].getPhysic();
	int c=a[i].getChemistry();
	int m=a[i].getMaths();
	int e=a[i].getEnglish();
	int h=a[i].getHindi();
	double d=a[i].getPer();
	if(p<33&&c<33&&m<33&&h<33&&e<33)
		System.out.println("all subject fail");
		else if((p<33&&c<33&&m<33&&h<33)||(p<33&&c<33&&m<33&&e<33)||(p<33&&c<33&&h<33&&e<33)||(p<33&&m<33&&h<33&&e<33)||(c<33&&m<33&&h<33&&e<33))
            if(p<33&&c<33&&m<33&&h<33)
            System.out.println("fail in four sub phy and chem and maths and hindi");
            else if(p<33&&c<33&&m<33&&e<33)
            System.out.println("fail in four sub is phy and chem and maths and english");
            else if(p<33&&c<33&&h<33&&e<33)
            System.out.println("fail in four sub is physics and chem and hindi and english");
            else if(p<33&&m<33&&h<33&&e<33)
            System.out.println("fail in four sub is physics and maths and hindi and english");
            else 
            System.out.println("fail in four sub is chemistry and maths and hindi and english");
			else if((p<33&&c<33&&m<33)||(p<33&&c<33&&h<33)||(p<33&&c<33&&e<33)||(c<33&&m<33&&e<33)||(c<33&&m<33&&h<33)||(m<33&&h<33&&e<33)||     (m<33&&h<33&&p<33)||(h<33&&p<33&&e<33)||(e<33&&p<33&&m<33))
			if(p<33&&c<33&&m<33)
			System.out.println("fail in three sub phy and chem and maths");
			else if(p<33&&c<33&&h<33)
			System.out.println("fail in three sub phy and chem and hindi");
			else if(p<33&&c<33&&e<33)
			System.out.println("fail in three sub phy and chem and english");
			else if(c<33&&m<33&&e<33)
			System.out.println("fail in three sub chem and maths and english");
			else if(c<33&&m<33&&h<33)
			System.out.println("fail in three sub chem and maths and hindi");
			else if(m<33&&h<33&&e<33)
			System.out.println("fail in three sub maths and hindi and english");
			else if(m<33&&h<33&&p<33)
			System.out.println("fail in three sub maths and hindi and phy");
			else if(h<33&&p<33&&e<33)
			System.out.println("fail in three sub phy and hindi and english");
			else 
			System.out.println("fail in three sub phy and maths and english");
			else if((p<33&&c<33)||(p<33&&m<33)||(p<33&&h<33)||(p<33&&e<33)||(c<33&&m<33)||(c<33&&h<33)||(c<33&&e<33)||(m<33&&h<33)||(m<33&&e<33)||(h<33&&e<33))
			if(p<33&&c<33)
			System.out.println("fail in two sub phy and chem");
			else if(p<33&&m<33)
			System.out.println("fail in two sub phy and maths");
			else if(p<33&&h<33)
			System.out.println("fail in two sub phy and hindi");
			else if(p<33&&e<33)
			System.out.println("fail in two sub phy and english");
			else if(c<33&&m<33)
			System.out.println("fail in two sub chem and maths ");
			else if(c<33&&h<33)
			System.out.println("fail in two sub chem and hindi ");
			else if(c<33&&e<33)
			System.out.println("fail in two sub chem and english");
			else if(m<33&&h<33)
			System.out.println("fail in two sub maths and hindi ");
			else if(m<33&&e<33)
			System.out.println("fail in two sub maths and english");
			else
			System.out.println("fail in two sub hindi and english");
			else  if(p<33||c<33||m<33||h<33||e<33)      
            if(p<33)
			System.out.println("fail in one sub phy"); 
			else if(c<33)
			System.out.println("fail in one sub chem"); 
			else if(m<33)
			System.out.println("fail in one sub maths");
			else if(h<33)
			System.out.println("fail in one sub hindi");
			else
            System.out.println("fail in one sub english");
			else 
				
                
                
                System.out.println("percantage is ="+d);
                if(d>=65)
                System.out.println("Pass in First Division");
                else if(d>=45)
                System.out.println("Pass in Second Division");
                else if(d>=33)
                System.out.println("Pass in Third Division");
                else
                System.out.println("you are fail"); 
        

    }
    
    
}
