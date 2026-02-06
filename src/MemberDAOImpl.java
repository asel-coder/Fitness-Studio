import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO {

    private final String url =
            "jdbc:sqlserver://localhost:1433;databaseName=fitness_studio_db;encrypt=true;trustServerCertificate=true";
    private final String user = "gym_user";
    private final String password = "GymPass123";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    // CREATE
    @Override
    public void addMember(Member member) {
        String sql = "INSERT INTO members (name) VALUES (?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, member.getName());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                member.setId(rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ by ID
    /*@Override
    public Member getMemberById(int id) {
        String sql = "SELECT id, name FROM members WHERE id = ?";
        Member member = null;

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                member = new Member(rs.getString("name"), null);
                member.setId(rs.getInt("id"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return member;
    }*/

    // READ all
    /*@Override
    public List<Member> getAllMembers() {
        List<Member> members = new ArrayList<>();
        String sql = "SELECT id, name FROM members";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Member m = new Member(rs.getString("name"), null);
                m.setId(rs.getInt("id"));
                members.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return members;
    }*/

    // UPDATE
   /* @Override
    public void updateMember(Member member) {
        String sql = "UPDATE members SET name = ? WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, member.getName());
            ps.setInt(2, member.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    @Override
    public void deleteMember(int id) {
        String sql = "DELETE FROM members WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
}

