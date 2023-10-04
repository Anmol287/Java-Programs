import java.sql.*;

public class Tbeforedelete {
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

            String tquery = "CREATE TRIGGER before_delete_salaries "
                    + " BEFORE DELETE"
                    + " ON salaries FOR EACH ROW  "
                    + " BEGIN "
                    + " INSERT INTO salary_archives (emp_num, valid_from, amount) VALUES(OLD. emp_num, OLD.valid_from, OLD.amount); "
                    + " END;";

            st.execute(tquery);
            System.out.println("---Trigger create for before delete---");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
