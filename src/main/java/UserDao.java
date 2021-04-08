import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDao implements DAO<User> {

    public static final String INSERT_USER = "INSERT INTO users(id, name, login, password) VALUES (?, ?, ?, ?)";
    public static final String SELECT_USER = "SELECT * from users WHERE id = ?";
    public static final String UPDATE_SQL = "UPDATE users SET name = ? , login = ?, password = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM users WHERE id = ";
    public static final String INSERT_USER_GROUPS = "INSERT INTO userGroups (users_id, groups_id) VALUES (?, ?)";
    public static final String SELECT_USERS_FROM_USER_GROUPS = "SELECT users_id from userGroups WHERE groups_id = ?";
    public static final String DELETE_USERS_FROM_USER_GROUPS = "Delete from userGroups WHERE users_id = ";

    private final Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }

    @Override
    public void create(User entity) {
        try (PreparedStatement ps = con.prepareStatement(INSERT_USER)) {
            ps.setLong(1, entity.getId());
            ps.setString(2, entity.getName());
            ps.setString(3, entity.getLogin());
            ps.setString(4, entity.getPassword());
            ps.setLong(5, entity.getRole().getId());
            addUserInUserGroups(entity);

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User read(long id) {
        User user = null;
        RoleDAO roleDAO = new RoleDAO(con);
        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_USER)) {
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                String name = resultSet.getString("name");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");
                Role role = roleDAO.read(resultSet.getLong("roles_id"));
                ArrayList arrayList = getUsers(id);
                user = new User(id, name, login, password, role,arrayList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void update(User entity) {
        try (PreparedStatement ps = con.prepareStatement(UPDATE_SQL)) {
            ps.setString(1, entity.getName());
            ps.setString(2, entity.getLogin());
            ps.setString(3, entity.getPassword());
            ps.setLong(4, entity.getId());

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(long id) {
        try (Statement stmt = con.createStatement()) {
            stmt.execute(DELETE_SQL + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addUserInUserGroups(User user) {
        ArrayList<Group> groups = user.getGroups();
        for (Group group : groups) {
            try (PreparedStatement ps = con.prepareStatement(INSERT_USER_GROUPS)) {
                ps.setLong(1, group.getId());
                ps.setLong(2, user.getId());

                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public ArrayList<User> getUsers(long groupId) {
        ArrayList<User> users = new ArrayList<>();
        UserDao userDao = new UserDao(con);
        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_USERS_FROM_USER_GROUPS)) {
            preparedStatement.setLong(1, groupId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    users.add(userDao.read(resultSet.getLong("users_id")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;

    }

    public void deleteUserFromUserGroups(long userId) {
        try (Statement stmt = con.createStatement()) {
            stmt.execute(DELETE_USERS_FROM_USER_GROUPS + userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}