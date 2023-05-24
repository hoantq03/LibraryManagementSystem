/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ambivert
 */
public class DataAccess {
    static Connection conn;
    
    public static Connection getConnect(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=LibaryManager;user=sa;password=123;encrypt=true;trustServerCertificate=true;");
            return conn;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
}
