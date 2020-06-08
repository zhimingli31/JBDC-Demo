package li.DBSUPPORT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	public static Connection establishDBConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connect = null;
		Properties connectProp = new Properties();
		connectProp.put("dbms", "mysql");
		connectProp.put("user","root");
		connectProp.put("password", "root");
		connectProp.put("useSSL", "false");
		
		connect = DriverManager.getConnection(
				"jdbc:" + "mysql" + "://" + "localhost" + ":" + 3306 + "/", connectProp
				);
		
		//System.out.println("Connected to database");
		return connect;
		
	}
}
