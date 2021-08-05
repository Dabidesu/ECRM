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
    
    public static void insertPerson(String personName, String personBirthday, String personPosition, String personEducational, String personParty, String personImagePath, JFrame frame){
        try{
        Connection mySqlConn = MySQLConnection.getConnection();
        String mySqlQuery = "INSERT INTO imagetest(name, birthday, position, educational, party, Image) VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = mySqlConn.prepareStatement(mySqlQuery);
        
            preparedStatement.setString(1, personName);
            preparedStatement.setString(2, personBirthday);
            preparedStatement.setString(3, personPosition);
            preparedStatement.setString(4, personEducational);
            preparedStatement.setString(5, personParty);
            
        try{
            InputStream inputStream = new FileInputStream(new File(personImagePath));
            preparedStatement.setBlob(6, inputStream);
            
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
    public static void searchRecord(String personName, String personBirthday, String personPosition, String personEducational, String personParty, String personImage, JFrame frame){
        try{
            Connection mySqlConnection = MySQLConnection.getConnection();
            PreparedStatement preparedStatement = mySqlConnection.prepareStatement("SELECT * FROM imagetest WHERE name = ?");
        }catch (Exception exception){
             JOptionPane.showMessageDialog(frame, "Data Error: " + exception.getMessage());
            return;
    }
}

}
    
    
    
    

