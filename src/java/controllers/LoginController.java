/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

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
public class LoginController {

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    private String username;
    private String password;

    public String usr = username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/tts_pl", "root", "");
            stmt = conn.createStatement();
            String sql = "SELECT username, password FROM user WHERE username = " + "'" + username + "'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                if (password.equals(rs.getString("password"))) {
                    HomeController h = new HomeController();   
                    MenuController mc = new MenuController();
                    h.setUsername(username);
                    mc.setUsername(username);
                    AkunController ac = new AkunController();
                    ac.setData(username);
                    return "beranda";
                }else{
                    return "login_gagal";
                }
            } else {
                return "login_gagal"; //nama file xhtml
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String daftar() {
        return "daftar";
    }
}
