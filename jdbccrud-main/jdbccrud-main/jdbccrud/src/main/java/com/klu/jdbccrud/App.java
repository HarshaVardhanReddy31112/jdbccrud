package com.klu.jdbccrud;

import java.sql.*;
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String url="jdbc:mysql://localhost:3306/klu";
    	String username="root";
    	String password="ayazsalaar786";
    	Connection con=DriverManager.getConnection(url,username,password);
    	Statement st=con.createStatement();
    //	String query="Insert into student values('salaar',12)";
    	String query="Delete from student where age = 28";
    //	String query="Update student set name='kishore' where  age=28";
    	st.executeUpdate(query);
    	con.close();
    	System.out.println("Done..");
    }
}