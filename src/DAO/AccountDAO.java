/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.Account;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hoant
 */
public class AccountDAO {
       public static Account searchAccountByUserName(String userName){
        Account acc = new Account();
        try{
            String sql = "SELECT * FROM account WHERE account.userName = '"+userName+"'";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if(rs.next())
            {
                acc.setUserName(rs.getString("userName"));
                acc.setName(rs.getString("name"));
                acc.setPassword(rs.getString("password"));
                acc.setSecQuestion((int)rs.getInt("secQuestion"));
                acc.setAnswer(rs.getString("answer"));

            }
            else
                JOptionPane.showMessageDialog(null, "User Name Invalid");
            provider.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return acc;
    }
       
       public static boolean changePassword(String newPassword,String userName)
       {
           try{
                String sql = "update account set password = '"+newPassword+"' where account.userName = '"+userName+"'";
                SQLServerProvider provider = new SQLServerProvider();
                provider.open();
                provider.executeQuery(sql);
                provider.close();
           }catch(Exception e ){
               JOptionPane.showMessageDialog(null, e);
               return false;
           }
           return true;
       }
}
