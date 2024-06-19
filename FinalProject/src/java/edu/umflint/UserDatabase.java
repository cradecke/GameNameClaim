/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package edu.umflint;
import java.sql.*;
import com.mysql.jdbc.Driver;
/**
 *
 * @author admin
 */
public class UserDatabase {
    public boolean IsUserExists(String sname)
    {
        boolean result = false;
        
       //Integate with the MySQL Database;
       
       String myCommand = "select * from finalproject.user where sname LIKE '"+sname+"%'";
     
       try
       {
            //Connection to JDBC Adapter
            //Initialize the driver
            Driver mySQLDriver = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver(mySQLDriver);
            
            //Opening the database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","root");
            
             //Create Statement placeholder
             Statement stmt=conn.createStatement();
             
            //Fill the Query into the placeholder
            ResultSet rs=stmt.executeQuery(myCommand);
            
            if(rs.next())
                result = true;
            else
                result = false;
            
            conn.close();
       }
       catch(Exception ex)
       {
           result = false;
       }
          
        return result;
    }
    
    
    
    public boolean NewUser(String email, String sname, String pwd, String platforms, String dob){
        //creates a new user
        
        boolean result = false;//is there a result
        
        //add user in SQL
        
        String myCommand = "INSERT INTO finalproject.user (email, sname, pwd, platforms, dob) VALUES ('"+ email +"','"+ sname +"','"+ pwd +"','"+platforms+"','"+ dob+"')";
       try
       {
            //Connection to JDBC Adapter
            //Initialize the driver
            Driver mySQLDriver = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver(mySQLDriver);
            
            //Opening the database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","root");
            
             //Create Statement placeholder
             Statement stmt=conn.createStatement();
            
             
            //Fill the Query into the placeholder
            stmt.executeUpdate(myCommand);
            conn.commit();
            conn.close();
       }
       catch(Exception ex)
       {
           result = false;
       }
        
        return result;
    }

    
    public boolean IsUserAuthenticated(String sname, String pwd) 
    {
        boolean result = false;
        
       //Integate with the MySQL Database;
       
       String myCommand = "SELECT * FROM finalproject.user where sname ='" + sname + "' and pwd = '" + pwd +"'";
     
       try
       {
            //Connection to JDBC Adapter
            //Initialize the driver
            Driver mySQLDriver = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver(mySQLDriver);
            
            //Opening the database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","root");
            
             //Create Statement placeholder
             Statement stmt=conn.createStatement();
             
            //Fill the Query into the placeholder
            ResultSet rs=stmt.executeQuery(myCommand);
            
            if(rs.next())
                result = true;
            else
                result = false;
            
            conn.close();
       }
       catch(Exception ex)
       {
           result = false;
       }
          
        return result;
    }
    public String userPlatform(String sname) 
    {
        String result = null;
        
       //Integate with the MySQL Database;
       
       String myCommand = "SELECT platforms FROM finalproject.user where sname ='" + sname + "'";
     
       try
       {
            //Connection to JDBC Adapter
            //Initialize the driver
            Driver mySQLDriver = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver(mySQLDriver);
            
            //Opening the database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","root");
            
             //Create Statement placeholder
             Statement stmt=conn.createStatement();
             
            //Fill the Query into the placeholder
            ResultSet rs=stmt.executeQuery(myCommand);
            
            if(rs.next())
                result = rs.getString("platforms");
            else
                result = null;
            
            conn.close();
       }
       catch(Exception ex)
       {
           result = null;
       }
          
        return result;
    }
}
