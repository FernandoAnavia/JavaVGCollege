/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.pk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author feran
 */
public class MySQLConnection {
    
    
    public static Connection getConnection() throws Exception {
        
    
    String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost/vgccollege?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String USER = "root";
    String PASS = "F3rn4nd0An4v142019";
    
             
    Class.forName(JDBC_DRIVER);
            
    System.out.println("Connecting to database...");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
        if (conn !=null){
                             
            System.out.println("Database connected!");
               
            }
            
            return conn;
    
}
    
    }
