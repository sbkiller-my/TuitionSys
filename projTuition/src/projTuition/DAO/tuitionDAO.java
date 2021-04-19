package projTuition.DAO;
import java.sql.*;
import projTuition.model.*;

// import admin.bean.adminBean;

public class tuitionDAO {
	public void signupTuition(adminBean tuition)
	{
		String username = tuition.getUsername();
		String password = tuition.getPassword();
		String email = tuition.getEmail();
		String firstname = tuition.getFirst();
		String lastname = tuition.getLast();
		
		try {
		// load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// create connection object
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TUITION", "1234");
		// create statement object
		Statement stat = con.createStatement();
		String sql = "INSERT INTO USERS(USERNAME,PASSWORD,EMAIL,FIRSTNAME,LASTNAME)VALUES(admin,1234,admin@mail.com.com,ad,min)";
		// execute query
		stat.executeUpdate(sql);
		// close connection object
		con.close();
		}catch(Exception e) {
			System.out.println(e);
		
		}
	}
}
