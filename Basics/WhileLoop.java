import java.sql.*;

public class WhileLoop {

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/student";
		String uname = "root";
		String pass = "1432";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		String query = "select * from studentData";
		ResultSet rs = st.executeQuery(query);
		
		String studentData = "";
		while(rs.next()) {
			studentData = rs.getString(1) + ": "+ rs.getString(2);
			System.out.println(studentData);
		}
		st.close();
		con.close();
	}
}
