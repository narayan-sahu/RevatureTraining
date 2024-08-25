package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertStatement {
public static void main(String[] args) {
	
	Connection connection=null;
	Statement statement=null;
	ResultSet resultSet=null;
	
	String url="jdbc:mysql://localhost:3306/college";
	String uname="root";
	String pwd="root";
	
	// STEP -1 : LOADING THE DRIVER 
	try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		// STEP 2 - Create the connection Object
		connection=DriverManager.getConnection(url,uname,pwd);
		
		// STEP 3- Create a Statement/PS /CS Object
		statement=connection.createStatement();
		
		//Query to show previous table
		String query3="select * from student";
		System.out.println("Previous Table-->");
		resultSet=statement.executeQuery(query3);
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("stu_id")+" , "+
					resultSet.getString(2)+" , "+resultSet.getString("city")+" , "
					+resultSet.getInt("marks")+" , "+resultSet.getString("grade"));
		}
		
		String query1 = "insert into student values (4,'Prathmesh','Haridwar',68,'K'), (6,'Prince','Mumbai',84,'B'),"
				+ "(8,'Siddhi','Sangli',80,'M'),(7,'Manasi','Nashik',40,'D')";
		
		// Step 4 - Execute Query and get ResultSet
		int rowsAffected = statement.executeUpdate(query1);
		//resultSet=statement.executeQuery(query1);
		
		// Step 5 - Process the result set
		System.out.println("Rows affected: " + rowsAffected);
		
		//query to display records
		String query2="select * from student";
		System.out.println("Updated Table-->");
		resultSet=statement.executeQuery(query2);
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("stu_id")+" , "+
					resultSet.getString(2)+" , "+resultSet.getString("city")+" , "
					+resultSet.getInt("marks")+" , "+resultSet.getString("grade"));
		}
		
		connection.close();
	} catch ( SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}