import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCCrudOps10 {
	private static PreparedStatement  pstmt;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//  step1 : load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver load");
		
		//step -2 Establish connection
		String url = "jdbc:mysql://localhost:3306/jdbc_db";
		String user = "root";
		String pwd = "root";
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		if(con == null) {
			System.out.println("Connection is not established");
		} else {
			System.out.println("Coneection is estBLISHED TO db");
		}
//		step-3--> create a query and prepare a statement
		String query = "insert into employee values(?,?,?,?,?,?)";
		pstmt  = con.prepareStatement(query);
		pstmt.setInt(1, 3);
		pstmt.setString(2, "Charan");
		pstmt.setString(3, "TCS");
		pstmt.setInt(4, 50000);
		pstmt.setString(5, "1995-06-07");
		pstmt.setString(6, "Banglore");
		
		//STEP4 Excute the query and collect the result
		int x = pstmt.executeUpdate();
		if(x> 0) {
			System.out.println();
		}else {
	}
}
