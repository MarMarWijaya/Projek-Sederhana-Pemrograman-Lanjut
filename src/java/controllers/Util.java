/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Mario Wijaya
 */
public class Util {

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    Util() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/tts_pl", "root", "");
            
        }catch(Exception e){   
        }

    }
    
    public void insert(String sql){
        try{
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
        }catch(Exception e){
            
        }             
    }
    
    public String cek(String sql){
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return "a";
            }else{
                return "b";
            }
            
        }catch(Exception e){
            return "c";
        }
            
    }

}
