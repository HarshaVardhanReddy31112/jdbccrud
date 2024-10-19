package com.klu.jdbccrud;
import java.sql.*;

public class CallableStatmentDemo {
	public static void main(String args[]) throws Exception{
		String url="jdbc:mysql://localhost:3306/klu";
		String username="root";
		String password="ayazsalaar786";
		Connection con=DriverManager.getConnection(url, username, password);
		CallableStatement cs=con.prepareCall("{call_getDetails()}");
		ResultSet rs=cs.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2));	
		}
		con.close();	
	}
}