package com.revature.jdbc.utils;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
	private static DatabaseConnection instance;
    private Connection connection;
   
    Properties properties = new Properties();
    InputStream fileInputStream = null;
    private DatabaseConnection()  {
    	try {
    		 fileInputStream = ClassLoader.getSystemResourceAsStream("utils.properties");
			//fileInputStream = new FileInputStream("utils.properties");
    		properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String url = properties.getProperty("db.url");
    	
    	    String username = properties.getProperty("db.username");
    	    String password = properties.getProperty("db.password");
    	    System.out.println(url);
       try {
		this.connection = DriverManager.getConnection(url, username, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }

    public Connection getConnection() {
        return connection;
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }

        return instance;
    }
}