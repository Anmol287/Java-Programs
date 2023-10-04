import java.sql.*;

public class Tafterupdate {
    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/mca1";
            String user = "root";
            String pass = "12345";

            Connection conn = DriverManager.getConnection(url, user, pass);
            if (conn != null)
                System.out.println("Connection established\n");
            else
                System.out.println("Connection failed");

            Statement st = conn.createStatement();

            String tquery = "CREATE TRIGGER after_update_studentsInfo  "
                    + "AFTER UPDATE  "
                    + "ON students FOR EACH ROW  "
                    + "BEGIN  "
                    + "INSERT into students_log VALUES (user(), CONCAT('Update Student Record ', OLD.name, ' Previous Class :', OLD.class, ' Present Class ', NEW.class));  "
                    + " END ;";
            st.execute(tquery);

            System.out.println("---Trigger create for after update----");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
