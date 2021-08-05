/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it191.project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kylea
 */
public class MySQLConnection {
    public static Connection getConnection() throws Exception {
        String dbRoot = "jdbc:mysql://";
        String hostname = "localhost:3306/";
        String dbName = "imagetest";
        String dbUrl = dbRoot+hostname+dbName;
        
        String hostUsername = "root";
        String hostPassword = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = (Connection)DriverManager.getConnection(dbUrl, hostUsername, hostPassword);
        
        return myConn;
    }
}
