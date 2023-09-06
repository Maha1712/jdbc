import java.sql.*;
public class Create {
	public static void main(String[]args) throws Exception{
		selectdata();
	}
	public static void selectdata() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/travelling";
		String username="root";
		String password="Maha@171";
		String Query="select * from user";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(Query);
		while(rs.next()) {
			System.out.println("student id:"+rs.getInt(1));
			System.out.println("student name:"+rs.getString(2));
			System.out.println("stuudent address:"+rs.getString(3));
		}
		con.close();
		
		
	}

}
