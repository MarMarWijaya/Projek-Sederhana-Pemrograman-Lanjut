/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.DaftarController.conn;
import static controllers.HomeController.conn;
import static controllers.HomeController.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Mario Wijaya
 */
@ManagedBean
public class AkunController {
    static String username;
    static String nama;
    static String alamat;
    static String HP;
    static String email;

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public void setData(String usr){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/tts_pl", "root", "");
            stmt = conn.createStatement();
            String sql2 = "SELECT nama, alamat, hp, email FROM user where username='" + usr + "'";
            rs = stmt.executeQuery(sql2);
            if(rs.next()){
                setNama(rs.getString("nama"));
                setAlamat(rs.getString("alamat"));
                setHP(rs.getString("hp"));
                setEmail(rs.getString("email"));
            }
        } catch (Exception e) {
               System.out.println(e);
        }
    }
    
    
    public void setNama(String usr){
        nama = usr;
        System.out.println("A :" + nama);
    }
   
    public String getNama(){
        System.out.println("B :" + nama);
        return nama;
    }
    
    public void setAlamat(String usr){
        alamat = usr;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setHP(String usr){
        HP = usr;
    }
    
    public String getHP(){
        return HP;
    }
    
    public void setEmail(String usr){
        email = usr;
    }
    
    public String getEmail(){
        return email;
    }
}
