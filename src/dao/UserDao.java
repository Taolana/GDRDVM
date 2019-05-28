/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccessBdd;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.DoctorModel;
import model.UserModel;

/**
 *
 * @author bynan
 */
public class UserDao {
    public Integer role_id = null;
    
    public Integer userConnected(String login, String password) throws SQLException{
        String sql = "SELECT * FROM users WHERE login ='"+login+"' AND password = '"+password+"'";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()){
           role_id = rs.getInt("role_id");         
       }
        if(role_id != null){
            return role_id;
        }else{
            return null;
        }    
    }
    
    public Integer userConnectedByRole(Integer indexa) throws SQLException{
        String sql = "SELECT * FROM users WHERE role_id ='"+indexa+"' ";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()){
           role_id = rs.getInt("role_id");         
       }
        if(role_id != null){
            return role_id;
        }else{
            return null;
        }    
    }
    
    public void addUser(UserModel user){
        String sql = "INSERT INTO `users`(`role_id`, `full_name`, `login`, `password`, `email`, `phone_number`) VALUES ('"+user.getRole_id()+"','"+user.getFull_name()+"','"+user.getLogin()+"','"+user.getPassword()+"','"+user.getEmail()+"','"+user.getPhone_number()+"')";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        accessBdd.executeUpdate(sql);
    }
    
    
}
