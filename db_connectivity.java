
package pay_roll;

import java.sql.*;
import javax.swing.JOptionPane;

public class db_connectivity
{
    static Connection conn=null;
    
    public static Connection java_db()
    {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/payroll","root","admin");
           JOptionPane.showMessageDialog(null, "Connected to Database");
           return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
       
       
    }
    
    
}
