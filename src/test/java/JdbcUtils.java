import java.sql.*;

public class JdbcUtils {

    public static Connection connection;
    public static Statement statement;
    public static PreparedStatement prst;
    public static ResultSet rs;

    public static Connection setConnection() {

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/myDatabase", "tester", "tester");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static Statement setStatement() {

        try {
            statement = setConnection().createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return statement;
    }

    public static PreparedStatement setPrst(String sql) {

        try {
            prst = setConnection().prepareStatement(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return prst;
    }

    public static ResultSet executeQuery(String sql) {

        try {
            rs = setStatement().executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return rs;
    }

    public static void close(){

        try {
            connection.close();
            statement.close();
           // prst.close(); testte hata veriyor
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
