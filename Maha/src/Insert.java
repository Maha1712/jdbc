import java.sql.*;
public class Insert {
	public static void insertData() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/travelling";
		String username="root";
		String password="Maha@171";
		String Query="insert into user values(?,?,?)";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement pst =con.prepareStatement(Query);
		pst.setInt(1,1);
		pst.setString(2,"maha");
		pst.setString(3,"chennai");
		pst.executeUpdate();
		con.close();
		
		
	}
	
	
	public static void main(String[]args) throws Exception{
		insertData();
	}

}
