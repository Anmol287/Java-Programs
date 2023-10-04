import java.io.*;
import java.sql.*;

class mysqlprep {
	public static void main(String args[]) throws Exception {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca", "root", "12345");

			PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do {

				System.out.println("Enter Student id: ");
				int id = Integer.parseInt(br.readLine());

				System.out.println("Enter Student name:");
				String name = br.readLine();

				System.out.println("Enter Student address: ");
				String addr = br.readLine();

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, addr);
				int i = ps.executeUpdate();

				System.out.println(i + " records affected");
				System.out.println("Do you want to continue: y/n");

				String s = br.readLine();
				if (s.startsWith("n")) {

					break;
				}
			}while (true);

			System.out.println("-----------Now Table Contains following  data -----------");
			ResultSet rs = ps.executeQuery("select * from student");

			while (rs.next())

				System.out.println(rs.getInt(1) + " " + rs.getString(2) + "         " + rs.getString(3));

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
