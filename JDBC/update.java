package jdbcInsertDemo;
//import java.lang.NoClassDefFoundError;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class insert {
	public static void main(String []args) throws Exception {
		
//		String name = "ABC";
		String email = "abc@gmail.com";
//		String password = "ab";
//		String gender = "Male";
		String city = "Yavatmad";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","tejas@mysql123");
		System.out.println("Driver class loaded successfully");
		
		
//		Three ways to add in the database
//		one
//		PreparedStatement ps = con.prepareStatement("insert into register values('tejas','tejas@gmail.com','deepak123','male','nagpur')");
//		two
//		PreparedStatement ps = con.prepareStatement("insert into register values('"+name+"','"+email+"','"+password+"','"+gender+"','"+city+"')");
//		three
//		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");

		PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
//		ps.setString(1, name);
		ps.setString(1, city);
//		ps.setString(3, password);
//		ps.setString(4, gender);
		ps.setString(2, email);
		int i = ps.executeUpdate();
		if(i>0) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
		ps.close();
		con.close();
	}
}
