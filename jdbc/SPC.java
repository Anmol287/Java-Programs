import java.sql.*;

public class SPC {
    public static void main(String args[]) {
        String dburl = "jdbc:mysql://localhost:3306/mca";
        String username = "root";
        String password = "12345";
        try (
                Connection conn = DriverManager.getConnection(dburl, username, password);
                Statement statement = conn.createStatement();) {
            String queryDrop = "DROP PROCEDURE IF EXISTS delete_student";
            String queryCreate = "CREATE PROCEDURE delete_student(IN rollno INT) "
                    + "BEGIN "
                    + " DELETE from student1 where roll=rollno; "
                    + "END";

            statement.execute(queryDrop);
            statement.execute(queryCreate);
            statement.close();

            System.out.println("Stored procedure created successfully");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}