package com.coma.comaexjobb.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.coma.comaexjobb.client.DBConnection;
import com.coma.comaexjobb.client.User;

public class MySQLConnection extends RemoteServiceServlet implements
		DBConnection {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Connection conn = null;
	private String status;
	private String url = "jdbc:mysql://localhost:3306/comadatabase";
	private String user = "admin";
	private String pass = "admin";

	public MySQLConnection() {
		System.out.println("MysQLCONNC");
	}
	
	public void Connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println(conn);
		} catch (Exception e) {
			// NEVER catch exceptions like this
			System.out.println("error connection");
		}
	}
	
	public void test(){

		System.out.println("jshdfjkhf");
	}

	public void authenticateUser(String user, String pass) {
		//User user;
		try {
			PreparedStatement ps = conn.prepareStatement(
					"select * from users where");
		
				System.out.println("jshdfjkhf");
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				String user1 = result.getString(1);
				//result.getString(2));
				System.out.println(user1);
			}

			result.close();
			ps.close();
		} catch (SQLException sqle) {
		//do stuff on fail
		}
	}
}