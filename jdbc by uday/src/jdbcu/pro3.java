package jdbcu;

/**
 *
 * @author Dell
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;
public class pro3{
 
    public static void main(String[] args) throws ClassNotFoundException, SQLException ,Exception
    {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Connection");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","udaysql@350");
            String str="Select * From data Where  Name Like ?";
                    PreparedStatement ps = con.prepareStatement(str);
                    
                    Scanner sc=new Scanner(System.in);
                
                    System.out.println("Enter Name");
                    String name=sc.next();
                    ps.setString(1,name+"%" );
                    ResultSet rs=ps.executeQuery();
                    while(rs.next())
                    {
                        System.out.println("\t"+rs.getString(2));
                    }
                    con.close();
        }
    }
 
