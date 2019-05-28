/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccessBdd;
import java.util.*;
import java.sql.SQLException;
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
        String sql = "SELECT * FROM `roles` ";
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
}
