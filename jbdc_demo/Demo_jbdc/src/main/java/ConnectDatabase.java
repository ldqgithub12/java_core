import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    private String hostName = "localhost:8080";
    private String dbName = "user_test";
    private String username = "root";
    private String password = "123";

    private String url = "jdbc:mysql://"+hostName+"/"+dbName;
    public Connection getConnect(){
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(url,username,password);
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("Connect fail");
        }
        return  conn;
    }
}
