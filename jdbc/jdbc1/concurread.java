import java.sql.*;

public class concurread {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");
            if (conn != null) {
                System.out.println("Connection Established\n");
            } else {
                System.out.println("Connection to database is failed");
            }
            String sqlquery = "Select * from student";

            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery(sqlquery);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getInt(2));
            }
            rs.absolute(6);
            System.out.println(rs.getString(1) + " " + rs.getInt(2));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
