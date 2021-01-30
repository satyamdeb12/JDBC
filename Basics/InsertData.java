import java.sql.*;

public class InsertData {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/student";
		String uname = "root";
		String pass = "1432";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		String queryUpdate = "insert into studentData values ('Ram', 'Ayodhya')";
		
		int affectedRowsCount = st.executeUpdate(queryUpdate);
		
		System.out.println(affectedRowsCount+" Rows affected");
		
		st.close();
		con.close();
	}

}
