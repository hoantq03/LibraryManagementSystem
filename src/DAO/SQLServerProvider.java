/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoant
 */
public class SQLServerProvider {
    public static void main(String[] args) {}
    
    static Connection connection;
    public static void open(){
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String user = "sa";
        String password = "123";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=LibaryManager";
        
        try {
            Class.forName(driver);
            System.out.println("Loaded");
      
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connected !");

        } catch (Exception ex) {
            System.out.println("Loi khi ket noi database");
        }
    }
    
    public void close(){
        try {
            this.connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet executeQuery(String sql){
        ResultSet rs = null;
        try{
            Statement sm = connection.createStatement();
            rs = sm.executeQuery(sql);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    
    
    public int executeUpdate(String sql)
    {
        int n = -1;
        try{
            Statement sm = connection.createStatement();
            n = sm.executeUpdate(sql);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    return n;
    }
    
}
   
