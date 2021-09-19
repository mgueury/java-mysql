import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Mysql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn =  DriverManager.getConnection(args[0]);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, name FROM person");
            while (rs.next()) {
              System.out.println( rs.getString(1) + " , " + rs.getString(2));
            }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println( e );
            e.printStackTrace();
        } 
    }
}





