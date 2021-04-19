package projTuition.model;
import java.sql.*;
public class selectQuery {
	public static void main(String args[]) {
		try {
			//load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TUITION", "1234");
			// statement object
			Statement stmt=con.createStatement();
			//execute query
			ResultSet rs = stmt.executeQuery("SELECT * FROM USERS");
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+ " "+rs.getString(4)+" "+rs.getString(5));
				//close connection object
				con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


