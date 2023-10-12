import java.util.Scanner;
class Company
{
    String name,contact,email;
    int net_worth;
    
    public void setData(String name,String contact,String email,int net_worth)
    {
        this.name=name;
        this.contact=contact;
        this.email=email;
        this.net_worth=net_worth;
    } 

}
class Employee extends Company
{
    String e_name,e_contact,e_position;
    int e_id,e_age;
    
    public void setData(String e_name,String e_contact,String e_position,int e_id,int e_age,String name,String contact,String email,int net_worth)
    {
        this.setData(name,contact,email,net_worth);
        this.e_name=e_name;
        this.e_contact=e_contact;
        this.e_position=e_position;
        this.e_id=e_id;
        this.e_age=e_age;
        
    }
}
class Salary extends Employee
{
    int salary,bonus;
   
    public void setData(int salary,int bonus,String e_name,String e_contact,String e_position,int e_id,int e_age,String name,String contact,String email,int  net_worth)
    {
        this.setData(e_name,e_contact,e_position,e_id,e_age,name,contact,email,net_worth);
        this.salary=salary;
        this.bonus=bonus;
    }
}
class Test
{
    static int a=0;
    Salary ob=new Salary();
    public static void main(String args[ ])
    {
        Test ob1=new Test();
        ob1.input(ob1);        
    }
    public void input(Test ob1)
    {
        ob.setData(90000,200,"UDAY MOURYA","7777804100","manager",11223,23,"infobeans","9345934534,9562357432","udaymourya01@gtmail.com",100000000);
        ob1.ans();
        ob.setData(90000,200,"2ND PERSON","9406600054","CEO",11223,23,"CODIANT A YASH TECHNOLIES  COMPANY ","9345934534,9562357432","abcd2020@gmail.com",2000000000);
        ob1.ans();
        ob.setData(90000,200,"3rd PERSON","9766804100","manager",11290,23,"infobeans","9345934534,9562357432","info2323@gmail.com",600000000);
        ob1.ans();

    }
     public void ans()
     { 
        a++;
        System.out.println("---------------------------------------------------------");
        System.out.println("                   "+a+" : Person");
        System.out.println("---------------------------------------------------------");
        System.out.println("\n\nCompany Name       :    "+ob.name);
        System.out.println("Company Contact    :    "+ob.contact);
        System.out.println("Company Email      :    "+ob.email);
        System.out.println("Company Net Worth  :    "+ob.net_worth);
        System.out.println("\n\nEmployee Name      :    "+ob.e_name);
        System.out.println("Employee Contact   :    "+ob.e_contact);
        System.out.println("Employee Position  :    "+ob.e_position);
        System.out.println("Employee Id        :    "+ob.e_id);
        System.out.println("Employee Age       :    "+ob.e_age);
        System.out.println("Employee Salary    :    "+ob.salary);
        System.out.println("Employee Bonus     :    "+ob.bonus);     
        System.out.println("---------------------------------------------------------\n\n");
    }
}
