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
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Mario Wijaya
 */
@ManagedBean
public class DaftarController {

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static ResultSet rs2;

    private String nama;
    private String alamat;
    private String HP;
    private String email;
    private String username;
    private String password;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getHP() {
        return HP;
    }

    public void setHP(String HP) {
        this.HP = HP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    static boolean isValid(String str) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return str.matches(regex);
    }

    public String daftar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/tts_pl", "root", "");
            stmt = conn.createStatement();
            String sql2 = "SELECT username FROM user where username='"+username+"'";
            rs = stmt.executeQuery(sql2);

            if (rs.next()) {
                return "daftar_gagal";
            } else {
                if (isValid(email)) {
                    if (HP.matches("[0-9]*")) {
                        String sql = "INSERT INTO user VALUES ("
                                + "'" + username + "',"
                                + "'"+ password +"',"
                                + "'"+ nama+"',"
                                + "'"+alamat+"',"
                                + "'"+ HP+"',"
                                + "'"+email+"')";
                        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                        pst.execute();
//                        AkunController ac = new AkunController();
//                        ac.setNama(nama);
//                        ac.setEmail(email);
//                        ac.setHP(HP);
//                        ac.setAlamat(alamat);
                        return "daftar_berhasil";
                    } else {
                        return "daftar_gagal";
                    }
                } else {
                    return "daftar_gagal";
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
