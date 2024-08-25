package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCUserInputToInsert {
    public static void main(String[] args) {
        
        Connection connection = null;
        Statement statement = null;
        Scanner scanner = new Scanner(System.in);
        
        String url = "jdbc:mysql://localhost:3306/college";
        String uname = "root";
        String pwd = "root";
        
        try {
            connection = DriverManager.getConnection(url, uname, pwd);
            statement = connection.createStatement();
            
            System.out.print("Enter Student ID: ");
            int stu_id = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Enter Student Name: ");
            String student_name = scanner.nextLine();
            
            System.out.print("Enter City: ");
            String city = scanner.nextLine();
            
            System.out.print("Enter Marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Grade: ");
            String grade = scanner.nextLine();
            
            // Constructing the insert query
            String insertQuery = "INSERT INTO student (stu_id, student_name, city, marks, grade) " +
                                 "VALUES (" + stu_id + ", '" + student_name + "', '" + city + "', " + marks + ", '" + grade + "')";
            
            int rowsAffected = statement.executeUpdate(insertQuery);
            
            System.out.println("Rows affected: " + rowsAffected);
            
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
