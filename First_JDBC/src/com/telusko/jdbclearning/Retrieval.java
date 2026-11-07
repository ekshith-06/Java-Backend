package com.telusko.jdbclearning;
import java.sql.*;
public class Retrieval {
    public static void main(String []ar) throws ClassNotFoundException, SQLException {

        //Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish The  Connection
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String userName="root";
        String pass="root";

        Connection connect=DriverManager.getConnection(url,userName,pass);


        // Create the statement
        Statement statement=connect.createStatement();

        //Execute Query
        String sql="select * from studentInfo";
       ResultSet rs= statement.executeQuery(sql);
       while(rs.next()){
           System.out.println("Id : "+rs.getInt("id") + " sname : "+rs.getString("sname")+ " Age : "+rs.getInt("sage")+" Location : "+rs.getString("scity"));
       }
        statement.close();
        connect.close();


    }
}
