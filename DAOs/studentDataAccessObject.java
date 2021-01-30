package DAOs;

import java.sql.*;

public class studentDataAccessObject {

	public static void main(String[] args) {
		StudentDAO dao =  new StudentDAO();
		Student s1 = dao.getStudent(2);
		System.out.println(s1.sname);
	}

}
class StudentDAO{
	public Student getStudent(int rollno) {
		try {
			
			Student s = new Student();
			s.rollno = rollno;
			//7 steps to get the name
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1432");
			Statement st = con.createStatement();
			String query = "select sname from student where rollno="+rollno;
			ResultSet rs = st.executeQuery(query);
			
			rs.next();
			String output = rs.getString(1);
			s.sname = output;
			return s;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		return null;
		
	}
}

class Student{
	int rollno;
	String sname;
}