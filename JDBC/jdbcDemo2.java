//Step :1
import java.sql.*;

public class jdbcDemo2 {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/JDBC";//Total 3 steps here
        //Java will connect with jdbc
        //which type of database using "mysql"
        //database name before that mention localhost and number because mysql works on network.
        System.out.println("Connection Established...");
        String userName = "root";
        String password = "0000";
        String query = "select * from students";

        //Step-4
        Connection conn = DriverManager.getConnection(url ,userName , password);

        //Step-5
        Statement statement = conn.createStatement();

        //Step-6
        ResultSet rs = statement.executeQuery(query);
        while(rs.next()){
            System.out.print(rs.getInt("id") + " - ");
            System.out.print(rs.getString("name") + " -");
            System.out.println(rs.getInt("marks"));
        }
        conn.close();
        System.out.println("Connection Closed...");
    }
}
