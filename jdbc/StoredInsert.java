import java.sql.*;

public class StoredInsert {
    public static void main(String args[]) {
        try {
            String url = "jdbc:mysql://localhost/mca";
            String user = "root";
            String pass = "12345";

            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement st = conn.createStatement();
            String dropque = "Drop procedure if exists insertStudent";
            String createque = "Create procedure insertStudent(in id int, name varchar(20), rol int, sub varchar(20)) "
                    + "Begin insert into student1 values (id, name, rol, sub); "
                    + "end";

            st.execute(dropque);
            st.execute(createque);
            st.close();
            System.out.println("Stored procedure created successfully for insert");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
