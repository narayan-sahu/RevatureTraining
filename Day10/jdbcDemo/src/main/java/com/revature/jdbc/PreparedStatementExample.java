package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {
	static Connection connection=null;
	static PreparedStatement preparedStatement=null;
	static String url="jdbc:mysql://localhost:3306/college";
	static String uname="root";
	static String pwd="root";
	
	public static void main(String[] args) {
		try {
			connection=DriverManager.getConnection(url,uname,pwd);
			
			//Following the query to insert values
//			String insertSql="insert into contacts(name,email) values(?,?)";
//			preparedStatement= connection.prepareStatement(insertSql);	
//			preparedStatement.setString(1, "Siddhi");
//			preparedStatement.setString(2, "Siddhi@gmial.com");
			
			//following is the query to update values
//			String updateSql = "UPDATE contacts SET email = ? WHERE name = ?";
//			preparedStatement = connection.prepareStatement(updateSql);
//			preparedStatement.setString(1, "newemail1@gmail.com");
//			preparedStatement.setString(2, "Siddhi Singh");	
			
			//following is the query to select values
			String selectSql = "SELECT * FROM contacts WHERE name = ?";
			preparedStatement = connection.prepareStatement(selectSql);
			preparedStatement.setString(1, "Siddhi");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				
				System.out.println("Name: " + name);
				System.out.println("Email: " + email);
				System.out.println("-------------------");
			}
			
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}