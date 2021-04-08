import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GroupDAO groupDAO = new GroupDAO(getConnection());
        ArrayList<Group>  n = groupDAO.getGroups(1);
        System.out.println(n);
    }


    private static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:resources/jdbc-demo.sqlite3");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
