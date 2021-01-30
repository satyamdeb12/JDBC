import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class variableInsert {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/student";
		String uname = "root";
		String pass = "1432";
		
		String name = "Ali";
		String clg = "JNU";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
															//('name','clg')
		String queryUpdate = "insert into studentData values ('"+name+"','"+clg+"')";
		
		int affectedRowsCount = st.executeUpdate(queryUpdate);
		
		System.out.println(affectedRowsCount+" Rows affected");
		
		st.close();
		con.close();
	}

}
