import java.sql.*;
import java.io.Console;
class conupdate {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/mca";
        String username = "root";
        String password = "12345";
        Console console = System.console();
        try (Connection conn = DriverManager.getConnection(url,username,password)) {
            DatabaseMetaData metadata = conn.getMetaData();
            boolean isUpdatable = metadata.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            if (!isUpdatable) {
                System.out.println("\nThe database does not support updatable result sets.");
                return;
            }
            String sql = "SELECT * FROM employee";
            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet result = statement.executeQuery(sql);
            int row = -1;
            while (row != 0) {
                row = Integer.parseInt(console.readLine("\nEnter row number: "));
                if (result.absolute(row)) {

                    readStudentInfo("\nStudent at row" + row + ":", result);
                    String answer = console.readLine("\nDo you want to update this row(Y/N)?:");
                    if (answer.equalsIgnoreCase("Y")) {
                        String name = console.readLine("\tUpdate name:");
                        String email = console.readLine("\tUpdate email:");
                        String major = console.readLine("\tUpdate major:");
                        result.updateString("name", name);
                        result.updateString("email", email);
                        result.updateString("major", major);
                        result.updateRow();
                        System.out.println("\nThe Student at row" + row + "has been updated");
                    }
                    answer = console.readLine("\nDo you want to delete this row(Y/N)?");
                    if (answer.equalsIgnoreCase("Y")) {
                        result.deleteRow();
                        System.out.println("\nThe Student at row" + row + "has been Deleted ");
                    }

                    answer = console.readLine("\nDo you want to insert new row(Y/N)?");
                    if (answer.equalsIgnoreCase("Y")) {
                        result.moveToInsertRow();
                        String name = console.readLine("\tUpdate name:");
                        String email = console.readLine("\tUpdate email:");
                        String major = console.readLine("\tUpdate major:");
                        result.updateString("name", name);
                        result.updateString("email", email);
                        result.updateString("major", major);
                        result.insertRow();
                        result.moveToCurrentRow();
                        System.out.println("\nThe new student has been inserted.");
                    }
                } else {
                    System.out.println("\nThere's no Student at row " + row);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void readStudentInfo(String position, ResultSet result) throws SQLException {
        String name = result.getString("name");
        String email = result.getString("email");
        String major = result.getString("major");
        String studentinfo = "%s:%s-%s-%s/n";
        System.out.format(studentinfo, position, name, email, major);
    }
}
