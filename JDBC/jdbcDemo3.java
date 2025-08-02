//Step :1
import java.sql.*;

public class jdbcDemo3 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Step-2 and 3
        Class.forName("com.mysql.cj.jdbc.Driver");//Optional


        String url = "jdbc:mysql://localhost:3306/JDBC";//Total 3 steps here
        //Java will connect with jdbc
        //which type of database using "mysql"
        //database name before that mention localhost and number because mysql works on network.
        System.out.println("Connection Established...");
        String userName = "root";
        String password = "0000";
        String query = "insert into students values (5,'oppo',49)"; // ->Here it must update

        //Step-4
        Connection conn = DriverManager.getConnection(url ,userName , password);

        //Step-5
        Statement statement = conn.createStatement();
        boolean status = statement.execute(query);
        System.out.println(status);//returns false if the data can be store in the database/

        conn.close();
        System.out.println("Connection Closed...");
    }
}
