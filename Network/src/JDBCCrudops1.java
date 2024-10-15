import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCrudops1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step - 1: Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		//step-2 Establish connection 
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String user = "root";
		String pwd = "root";
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		if(con == null) {
			System.out.println("Connection is not establised");
		}
		else {
			System.out.println("Connection established to db");
		}
		//step-3 -> Create the query and prepare the statement
		String query = "Create database jdbc_june_26";
		Statement statement = con.createStatement();
		
//		step-4 -> Excute the query and collect the result
		int x = statement.executeUpdate(query);
		
		if(x>=0) {
			System.out.println("Database Created");
		}else {
			System.out.println("Database creation failed");
		}
//		step-5:- Close all active connections
		statement.close();
		con.close();
	}

}
