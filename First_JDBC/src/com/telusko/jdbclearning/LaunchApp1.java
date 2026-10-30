package com.telusko.jdbclearning;
import java.sql.*;
import java.util.*;
public class LaunchApp1 {
    public static void main(String []ar) throws ClassNotFoundException, SQLException {
        // Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish The Connection
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String name="root";
        String pass="root";
       Connection connect =DriverManager.getConnection(url,name,pass);

       //Create the statement
        Statement  statement=connect.createStatement();

        // Execute Query
        String sql="update studentInfo set sage=18 where id=2";
       int noOfRowsAffected= statement.executeUpdate(sql);

       //Process the result
        if(noOfRowsAffected==0){
            System.out.println("Unable to insert data into db");
        }
        else{
            System.out.println("Data Insertion Successful");
        }

        // Close the resources
        statement.close();
        connect.close();
    }
}
