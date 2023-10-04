import java.sql.*;

public class Tafterinsert {
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

            String tquery = "Create Trigger after_insert_details "
                    + " AFTER INSERT ON student_info FOR EACH ROW "
                    + " BEGIN "
                    + " INSERT INTO student_detail VALUES (new.stud_id, new.stud_code, new.stud_name, new.subject, new.marks, new.phone, CURTIME()); "
                    + " END";
            st.execute(tquery);

            System.out.println("---Trigger create for after insert----");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
