class Employee 
{
    	String name;
    	int employeeId;

    	Employee(String name, int employeeId) 
	{
        	this.name = name;
        	this.employeeId = employeeId;
    	}

    	void getEmployee() 	
	{
        	System.out.println("Name: " + name+"\nEmployee ID: " + employeeId);
    	}
}

class Manager extends Employee 
{
    	String department;

    	Manager(String name, int employeeId, String department) 
	{
        	super(name, employeeId);
        	this.department = department;
    	}

    	void getManager() 
	{
        	super.getEmployee();
        	System.out.println("Manager of Department: " + department);
    	}
}

class Developer extends Employee 
{
    	String progLanguage;

    	Developer(String name, int employeeId, String progLanguage) 
	{
        	super(name, employeeId);
        	this.progLanguage = progLanguage;
    	}

    	void getDeveloper() 
	{
        	super.getEmployee();
        	System.out.println("Programming Language: " + progLanguage);
    	}
}

class Test 
{
    	public static void main(String[] args) 
	{
        	Manager ob = new Manager("sdsc", 101, "Project");
        	ob.getManager();

        	Developer ob1 = new Developer("Uday", 201, "Java");
        	ob1.getDeveloper();
    	}
}
