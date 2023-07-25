package com.divya.JDBC;
import java.sql.*;

public class MySQLConnection {
    Connection con=null;

    public MySQLConnection(){

       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store","root","abc@123");
          /* ("jdbc:mysql://localhost/test?" +
                   "user=minty&password=greatsqldb");*/
          // "jdbc:mysql://localhost:3306/sonoo","root","root"); ;
           System.out.println("connection ok.");
        }
       catch(Exception e){
           e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String selectSQL= "SELECT * FROM Purchases";
        MySQLConnection mySQLConnection= new MySQLConnection();
        try(PreparedStatement ps=mySQLConnection.con.prepareStatement(selectSQL)){
            ResultSet rs = ps.executeQuery();
            System.out.println(rs);
            rs.getArray(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
