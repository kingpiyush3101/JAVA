package JDBC;
import java.sql.*;
import java.util.*;
public class insertion {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter id: ");
//		int id = sc.nextInt();
//		System.out.println("Enter name: ");
//		String name = sc.next();
//		System.out.println("Enter age: ");
//		int age = sc.nextInt();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
			Statement st = con.createStatement();
			
//			String str = "INSERT INTO `student`(`Id`, `Name`, `age`) VALUES ("+id+",'"+name+"',"+age+")";
//			st.executeUpdate(str);
			
//			String str = "INSERT INTO student (Id, Name, age) VALUES (?,?,?)";
//			PreparedStatement ps = con.prepareStatement(str);
//			ps.setInt(1,id);
//			ps.setString(2,name);
//			ps.setInt(3,age);
//			ps.executeUpdate();
			
			String d = "delete from `student` where id = 101";
			st.executeUpdate(d);
		
			String f = "SELECT * FROM `student` ";
			ResultSet rs = st.executeQuery(f);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
		}
		
		catch(Exception e) {
			System.out.println("Exception aa gyi");
			System.out.println(e);
		}
	}
}
