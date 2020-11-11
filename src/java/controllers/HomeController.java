/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.AkunController.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Mario Wijaya
 */
@ManagedBean
public class HomeController {
    static String username;
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public void setUsername(String usr){
        username = usr;
    }
    
    public String getUsername(){
        return username;
    }
   
    
}
