
//JDBC Connectivity
package bank.management.system;
import java.sql.*;

public class Conn {
    Connection c = null;
    Statement s = null;
    public Conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankManagementSystem", "root", "bootstrap@123");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
