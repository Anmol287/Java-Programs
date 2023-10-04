import java.sql.*;

public class mysqlupdate {
    public static void main(String args[]) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");
            Statement stmt = conn.createStatement();
            System.out.println("Update the records from the table...\n");

            String sql = "update student set name='Anmol' where roll=7";
            stmt.executeUpdate(sql);

            System.out.println("....Record Updated....");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
