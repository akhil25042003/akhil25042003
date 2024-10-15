import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCCrudOps9 {
	    private static Statement statement;
		private static PreparedStatement  pstmt;
		private static ResultSet res;
		public static void main(String[] args) throws ClassNotFoundException, SQLException{
			//  step1 : load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver load");
			
			//step -2 Establish connection
			String url = "jdbc:mysql://localhost:3306/jdbc_db";
			String user = "root";
			String pwd = "root";
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			String str = "select * from employee where city = ?";
			pstmt = con.prepareStatement(str);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the city");
			String city = sc.next();
			
			pstmt.setString(1, city);
			
			res = pstmt.executeQuery();
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
