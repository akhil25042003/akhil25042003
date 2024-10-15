import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCrudOps8 {
	private static Statement statement;
	private static ResultSet res;
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//  step1 : load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver load");
		
		//step -2 Establish connection
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String user = "root";
		String pwd = "root";
		Connection con = DriverManager.getConnection(url, user, pwd);
		String str = "Select * from employee";
		res = statement.executeQuery(str);
		while(res.next()==true) {
			System.out.println(res.getInt(1));
			System.out.println(res.getString(2));
			System.out.println(res.getString(3));
			System.out.println(res.getInt(4));
			System.out.println(res.getString(5));
			System.out.println(res.getString(6));
			System.out.println("================");
		}
		// step -5 close all active connections
					res.close();
					statement.close();
					con.close();
		
	}

}
