/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccessBdd;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bynan
 */
public class MedicalFolderDao {

    public int selectNumberOfPatientsPerDoctor(int doctor_id) {
        int value = 0;
        try {
            String sql = "SELECT count(*)n FROM medical_folder m JOIN users u on u.id = m.medic_id where role_id = '"+doctor_id+"'";
            AccessBdd accessBdd = new AccessBdd();
            accessBdd.loadDriver();
            var rs = accessBdd.executeSelect(sql);
            while (rs.next()) {
                value = Integer.parseInt(rs.getString("n"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicalFolderDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

}
