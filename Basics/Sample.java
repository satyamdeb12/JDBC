import java.sql.*;
/**
 * 
 * @author Satyam
 * 1. import java.sql
 * 2. Load and register the driver ---> 
 * 		(load means download and configure the jar file inbuild path)
 * 		Register means ---> com.mysql.jdbc.Driver
 * 3. Create Connection
 * 4. Create Statement
 * 5. Execute the querry
 * 6. Process the result
 * 7. close()
 *
 */
public class Sample {

	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/student";
		String uname = "root";
		String pass = "1432";
		String query = "select * from studentData";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		String name;
		
		rs.next();
		name = rs.getString(1) + ": "+ rs.getString(2);
		System.out.println(name);
		
		
		st.close();
		con.close();
	}

}
