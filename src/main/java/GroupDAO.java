import java.sql.*;
import java.util.ArrayList;

public class GroupDAO implements DAO<Group> {

    public static final String INSERT = "INSERT INTO groups(id, name, description) VALUES (?, ?, ?)";
    public static final String SELECT = "SELECT * from groups WHERE id = ?";
    public static final String UPDATE_SQL = "UPDATE groups SET name = ? , description = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM groups WHERE id = ";
    public static final String SELECT_GROUPS_FROM_USER_GROUPS = "SELECT groups_id from userGroups WHERE users_id = ?";
    public static final String DELETE_FROM_USER_GROUPS_BY_GROUP = "DELETE FROM userGroups WHERE groups_id = ";


    private final Connection con;

    public GroupDAO(Connection con) {
        this.con = con;
    }

    @Override
    public void create(Group entity) {
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
    public Group read(long id) {
        Group group = null;
        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT)) {
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                String name = resultSet.getString("name");
                String description = resultSet.getString("description");


                group = new Group(id, name, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return group;
    }

    @Override
    public void update(Group entity) {
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


    public void DeleteFromUserGroupsByGroup(long group) {
        try (Statement stmt = con.createStatement()) {
            stmt.execute(DELETE_FROM_USER_GROUPS_BY_GROUP + group);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Group> getGroups(long userId) {
        ArrayList<Group> groups = new ArrayList<>();
        GroupDAO groupDAO = new GroupDAO(con);
        try (PreparedStatement preparedStatement = con.prepareStatement(SELECT_GROUPS_FROM_USER_GROUPS)) {
            preparedStatement.setLong(1, userId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    groups.add(groupDAO.read(resultSet.getLong("groups_id")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return groups;

    }

}
