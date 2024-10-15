import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCrudops4 {
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
		String query = "update sample set name = 'arjun' where id=1";
		Statement statement = con.createStatement();
		
//		step-4 -> Excute the query and collect the result
		int x = statement.executeUpdate(query);
		
		if(x>=0) {
			System.out.println("VAlues update");
		}else {
			System.out.println("values not update");
		}
//		step-5:- Close all active connections
		statement.close();
		con.close();
	}

}
