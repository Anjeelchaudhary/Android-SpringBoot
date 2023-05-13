package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
		String name = "root";
		String url = "jdbc:mysql://localhost:3306:student";
		String password = "123456789";
		String query = "select name from student where id=1";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, name , password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		String nameOne = rs.getString("name");
		System.out.println(nameOne);
		st.close();
		con.close();
	}

}