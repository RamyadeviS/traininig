package org.chainsys.E_pass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getConnection();
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
		//System.out.println(connection);
		return connection;
	}
}
