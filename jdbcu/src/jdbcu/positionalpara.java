


package jdbcu;

import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class positionalpara {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "udaysql@350");

        //String sql="select * from data";
        PreparedStatement ps = con.prepareStatement("");
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter NAme");
        String n=sc.nextLine();
        
        System.out.println("ENTER EMAIL");
        String e=sc.nextLine();
        
        System.out.println("ENTER PASSWORD");
        String p=sc.nextLine();
        
        System.out.println("ENTER CITY");
        String c=sc.nextLine();
        
        ps.setString(1,n);
       
        ps.setString(2,e);
        ps.setString(3,p);
        ps.setString(4,c);
       
        int i=ps.executeUpdate();
        con.close();
    }
        
}
