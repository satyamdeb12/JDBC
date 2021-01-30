import java.sql.*;

public class Pstatement {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/student";
		String uname = "root";
		String pass = "1432";
		String queryUpdate = "insert into studentData values(?,?)";
		String name = "Dip";
		String clg = "RKM";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		//Prepared Statement
		PreparedStatement st = con.prepareStatement(queryUpdate);
		//set values to the ? ?
		st.setString(1, name);
		st.setString(2, clg);
		
		int affectedRowsCount = st.executeUpdate();
		
		System.out.println(affectedRowsCount+" Rows affected");
		
		st.close();
		con.close();
	}

}
