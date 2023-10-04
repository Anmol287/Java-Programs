import java.sql.*;

public class Tafterdelete {
    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/mca1";
            String user = "root";
            String pass = "12345";

            Connection conn = DriverManager.getConnection(url, user, pass);
            if (conn != null)
                System.out.println("Connection established");
            else
                System.out.println("Connection failed");

            Statement st = conn.createStatement();

            String tquery = "CREATE TRIGGER after_delete_salaries "
                    + " AFTER DELETE  "
                    + " ON salaries FOR EACH ROW "
                    + " BEGIN "
                    + " UPDATE total_salary_budget SET total_budget = total_budget - old.amount;  "
                    + " END";

            st.execute(tquery);
            System.out.println("---Trigger create for After delete---\n");

            st.executeUpdate("DELETE FROM salaries WHERE emp_num = 107;");
            System.out.println("---Calling the Trigger---\n");
            ResultSet rs = st.executeQuery("SELECT * FROM total_salary_budget; ");
            System.out.println("\n-----------Table contains--------");

            while (rs.next()) {
                System.out.println(rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
