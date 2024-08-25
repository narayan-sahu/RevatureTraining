package com.revature.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.jdbc.model.Contacts;
import com.revature.jdbc.utils.DatabaseConnection;

public class PreparedStatementDemo {
	
	public static void main(String[] args) {
		  DatabaseConnection databaseConnection = null;
		  Connection connection=null;
		  PreparedStatement preparedStatement=null;
		  Contacts contactOne=null;
		  String sql="select * from contacts where id=?";
		try {
			// Using Connection Util here
			databaseConnection = DatabaseConnection.getInstance();
			  connection = databaseConnection.getConnection();
			  preparedStatement=connection.prepareStatement(sql);
			  preparedStatement.setInt(1, 1);
			  ResultSet resultSet=preparedStatement.executeQuery();
			  while(resultSet.next()) {
				 contactOne=new Contacts();
				 contactOne.setId(resultSet.getInt(1));
				 contactOne.setName(resultSet.getString(2));
				 contactOne.setEmail(resultSet.getString(3));
				 contactOne.setUserName(resultSet.getString(4));
				 System.out.println(contactOne);
			  }
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	}
}