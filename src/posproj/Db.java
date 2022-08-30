/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dstny
 */
public class Db {
    
    public static Connection mycon(){
    
        Connection con = null;
        
        try {
            //Database driver
            Class.forName("com.mysql.jdbc.Driver");
           
            //connection url
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/logindatabase","root","");
        
            //Error if database not found   
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return con;
}
    
}