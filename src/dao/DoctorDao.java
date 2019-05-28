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
            String libel = rs.getString("libel");
            doctors = new DoctorModel(full_name, id, libel);
            docs.add(doctors);
        }
        return docs;
    }

}
