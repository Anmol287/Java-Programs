import java.sql.*;

public class JDBCDAO {
    public static void main(String args[]) {

        StudentDao dao = new StudentDao();
        student s1 = dao.getStudent(2);
        System.out.println(s1.name);
    }
}

class StudentDao {
    public student getStudent(int roll) {
        try {
            String query = "select name from student where roll=" + roll;
            student s = new student();
            s.roll = roll;

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            String name = rs.getString(1);
            s.name = name;
            return s;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

class student {
    int roll;
    String name;
}
