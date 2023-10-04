import java.sql.*;
import javax.sql.rowset.*;
import java.io.*;

public class cacheddisplay {
    static Console console = System.console();
    static String answer;
    static boolean quit = false;

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mca";
        String username = "root";
        String password = "12345";
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            conn.setAutoCommit(false);
            String sql = "SELECT * FROM employee";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet rowset = factory.createCachedRowSet();
            rowset.setTableName("employee");
            rowset.populate(result);

            while (!quit) {
                if (!readStudent(rowset))
                    continue;
                askToQuit();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    static void readStudentInfo(String position, ResultSet result) throws SQLException {
        String name = result.getString("name");
        String email = result.getString("email");
        String major = result.getString("major");
        String studentInfo = "%s:%s-%s-%s\n";
        System.out.format(studentInfo, position, name, email, major);
    }

    static boolean readStudent(ResultSet result) throws SQLException {
        int row = Integer.parseInt(console.readLine("Enter student number: "));
        if (result.absolute(row)) {
            readStudentInfo("Student at row " + row + ":", result);
            return true;
        } else {
            System.out.println("There's no student at row" + row);
            return false;
        }
    }

    static void askToQuit() {
        answer = console.readLine("Do you want to quit (Y/N)?: ");
        quit = answer.equalsIgnoreCase("Y");
    }
}
