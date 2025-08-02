import java.sql.*;
public class jdbcdemo6 {
    public static void main(String[] args) throws  SQLException{

        String url = "jdbc:mysql://localhost:3306/JDBC";
        String username = "root";
        String password = "0000";
        System.out.println("Connected...");
        int id = 6;
        String name = "Poco";
        int marks = 60;
        String sql = "insert into students values (?,?,?)";

        Connection conn = DriverManager.getConnection(url,username,password);
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setInt(3,marks);
        preparedStatement.execute();
        conn.close();
        System.out.println("Disconnected...");
    }
}