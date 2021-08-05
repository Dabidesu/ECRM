/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it191.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author kylea
 */
public class Operations {
    
    public static void insertPerson(String personImagePath, JFrame frame){
        try{
        Connection mySqlConn = MySQLConnection.getConnection();
        String mySqlQuery = "INSERT INTO imagetest(Image) VALUES(?)";
        PreparedStatement preparedStatement = mySqlConn.prepareStatement(mySqlQuery);
        
        try{
            InputStream inputStream = new FileInputStream(new File(personImagePath));
            preparedStatement.setBlob(1, inputStream);
            
        }catch (Exception exception){  
            JOptionPane.showMessageDialog(frame, "Image Error: " + exception.getMessage());
            return;
        }
        try{
            preparedStatement.execute();
             JOptionPane.showMessageDialog(frame, "Record Has Been Saved!");
            
        }catch (Exception exception){
             JOptionPane.showMessageDialog(frame, "Image Error: " + exception.getMessage());
            return;
        }
        
        }catch (Exception exception){
            JOptionPane.showMessageDialog(frame, "Data Error:" + exception.getMessage());
            return;
        }
    }
}
