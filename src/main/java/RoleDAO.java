import java.sql.*;
import java.util.ArrayList;

public class RoleDAO implements DAO<Role>{



    public static final String INSERT = "INSERT INTO roles(id, name, description) VALUES (?, ?, ?)";
    public static final String SELECT = "SELECT * from roles WHERE id = ?";
    public static final String UPDATE_SQL = "UPDATE roles SET name = ? , description = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM roles WHERE id = ";
    public static final String SELECT_USER_BY_ROLE = "SELECT * from users WHERE roles_id = ?";

    private final Connection con;

    public RoleDAO(Connection con) {
        this.con = con;
    }
    @Override
    public void create(Role entity) {
        try (PreparedStatement ps = con.prepareStatement(INSERT)) {
            ps.setLong(1, entity.getId());
            ps.setString(2, entity.getName());
            ps.setString(3, entity.getDescription());

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Role read(long id) {
        Role role = null;
        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT)) {
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                String name = resultSet.getString("name");
                String description = resultSet.getString("description");


                role = new Role(id, name, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return role;
    }

    @Override
    public void update(Role entity) {
        try (PreparedStatement ps = con.prepareStatement(UPDATE_SQL)) {
            ps.setString(1, entity.getName());
            ps.setString(2, entity.getDescription());
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
    public ArrayList<User> getUsers(long roleId){
        UserDao userDao = new UserDao(con);
        ArrayList<User> users = new ArrayList<>();
        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_USER_BY_ROLE)) {
            preparedStatement.setLong(1, roleId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    users.add(userDao.read(resultSet.getLong("id")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
