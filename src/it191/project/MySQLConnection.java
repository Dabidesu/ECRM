 
package it191.project;

import java.sql.Connection;
import java.sql.DriverManager;

 
public class MySQLConnection {
    public static Connection getConnection() throws Exception {
        String dbRoot = "jdbc:mysql://";
        String hostname = "localhost:3306/";
        String dbName = "db";
        String dbUrl = dbRoot+hostname+dbName;
        
        String hostUsername = "root";
        String hostPassword = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = (Connection)DriverManager.getConnection(dbUrl, hostUsername, hostPassword);
        
        return myConn;
    }
}
