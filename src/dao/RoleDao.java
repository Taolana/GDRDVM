/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccessBdd;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.RoleModel;

/**
 *
 * @author bynan
 */
public class RoleDao {
    /**
     *
     * @return
     * @throws SQLException
     */
    public List<RoleModel> selectRole(){
        RoleModel roleModel = null;
        List roleList = new ArrayList();
        String sql = "SELECT * FROM `roles`  WHERE id > 2 ";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs =  accessBdd.executeSelect(sql);
        try {
            while(rs.next()){
                String libel = rs.getString("libel");
                int role_id = Integer.parseInt(rs.getString("id"));
                roleModel = new RoleModel(role_id, libel);
                roleList.add(roleModel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoleDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return roleList;
    }
    
    public RoleModel selectById(int param) throws SQLException{
        RoleModel role = null;
        String sql = "SELECT * FROM roles WHERE id = "+param;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while(rs.next()){
            int id  = rs.getInt("id");
            String libel = rs.getString("libel");
            
            role = new RoleModel(id, libel);
        }
        return role;
    }
}
