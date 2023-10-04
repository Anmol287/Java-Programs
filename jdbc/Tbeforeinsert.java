import java.sql.*;

public class Tbeforeinsert {
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
            String tquery = "Create Trigger before_insert_empworkinghours BEFORE INSERT ON employee FOR EACH ROW BEGIN IF NEW.working_hours < 0 THEN "
                    + " SET "
                    + " NEW.working_hours = 0; "
                    + "END IF;"
                    + "END";
            st.execute(tquery);

            System.out.println("---Trigger create for before insert modify----");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
