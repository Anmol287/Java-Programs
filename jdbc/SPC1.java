import java.sql.*;

public class SPC1 {
    public static void main(String args[]) {
        String dburl = "jdbc:mysql://localhost:3306/mca";
        String user = "root";
        String password = "12345";
        try (Connection con = DriverManager.getConnection(dburl, user, password);
                CallableStatement statement = con.prepareCall("{call delete_student(?)}");) {
            statement.setInt(1, 11);
            statement.execute();
            statement.close();

            System.out.println("Stored procedure called successfully");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}