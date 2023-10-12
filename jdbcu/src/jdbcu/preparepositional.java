package jdbcu;
import java.sql.*;
import java.util.Scanner;

class preparepositional{
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "udaysql@350");
       //satement st= con.createStatement();
       
       String sql="insert into student values(?,?,?,?,?)";
       PreparedStatement ps = con.prepareStatement(sql);
       
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Id");
       int id=sc.nextInt();
       System.out.println("Enter Rollno");
       int rno=sc.nextInt();
        System.out.println("Enter name");
       String name=sc.next();
       System.out.println("Enter Age");
       int age=sc.nextInt();
        System.out.println("Enter Fees");
       int fees=sc.nextInt();
       
       
       ps.setInt(1, id);
       ps.setInt(2,rno);
       ps.setString(3, name);
       ps.setInt(4, age);
       ps.setInt(5,fees);
       int i=ps.executeUpdate();
       con.close();
       
        
    }
    
}
