package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/* 
 * JDBC performs in 7 steps
 * 1:- loading of package
 * 2:- loading and registering
 * 3:- connecting
 * 4:- statement
 * 5:- query
 * 6:- execute query
 * 7:- close
 * 
 * */

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		String name = "";
		String url = "";
		String query = "";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, name , query);

	}

}