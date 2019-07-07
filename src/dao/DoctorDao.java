/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccessBdd;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DoctorModel;

/**
 *
 * @author bynan
 */
public class DoctorDao {

    public List<DoctorModel> medics() throws SQLException {
        DoctorModel doctors = null;
        List docs = new ArrayList();
        String sql = "SELECT * FROM users u JOIN roles r ON r.id = u.role_id WHERE role_id > 2";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            String full_name = rs.getString("full_name");
            int id = Integer.parseInt(rs.getString("id"));
            doctors = new DoctorModel(full_name, id);
            docs.add(doctors);
        }
        return docs;
    }
    
     public List<DoctorModel> medicsByKey(int identifier) throws SQLException {
        DoctorModel doctors = null;
        List docs = new ArrayList();
        String sql = "SELECT * FROM users  WHERE role_id = "+identifier;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            String full_name = rs.getString("full_name");
            int id = Integer.parseInt(rs.getString("id"));
            doctors = new DoctorModel(full_name, id);
            docs.add(doctors);
        }
        return docs;
    }
     
     
    public int countMedics(int ident) throws SQLException{
        int value = 0;
        String sql = "SELECT COUNT(*)n FROM users WHERE role_id = "+ident;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
                value = Integer.parseInt(rs.getString("n"));
            }
        return value;
    }
    
    public DoctorModel selectById(int idParam) throws SQLException{
        DoctorModel doct = null;
        String sql = "SELECT * FROM users WHERE id = "+idParam;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while(rs.next()){
            int id  = rs.getInt("id");
            int roleId = rs.getInt("role_id");
            String fullName = rs.getString("full_name");
            String phoneNumber = rs.getString("phone_number");
            
            doct = new DoctorModel(id, roleId, fullName, phoneNumber);
        }
        return doct;
    }

}
