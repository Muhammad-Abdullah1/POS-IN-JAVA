/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestpossystem;

import java.sql.*;
import javax.swing.*;

public class sql{
    Connection conn = null;
    
   public static Connection ConnectDB(){
        try{
   String driver = "com.mysql.cj.jdbc.Driver";
   String url = "jdbc:mysql://localhost:3306/bestpos";
   String username = "root";
   String password = "12345";
   Class.forName(driver);
    
       Connection conn = DriverManager.getConnection(url,username,password);
       System.out.println("YES,SQL is Connected Successfully");
       //JOptionPane.showMessageDialog(null, "CONNECTED TO MYSQL");
        return conn;
        }
        catch(Exception e){
            System.out.println("Not Connected");
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    
}
