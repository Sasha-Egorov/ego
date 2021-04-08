import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo {
    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS WHERE login = 'alex'");

            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");

                Role r = new Role(1l,"name","desc");
                ArrayList<Group> list= new ArrayList<>();
//                users.add(new User(id, name, login, password));



            }
            for (User s:users) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


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