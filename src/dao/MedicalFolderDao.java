/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccessBdd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MedicalFolderModel;
/**
 *
 * @author bynan
 */
public class MedicalFolderDao {
    
    public void updateMedicalFolder(MedicalFolderModel mdclfldr) throws SQLException {
        AccessBdd accessBdd = new AccessBdd();
        PreparedStatement ps = null;
        Connection con = accessBdd.getConnection();
        String sql = "UPDATE `medical_folder` SET `allergy`=?,`antecedent`=?,`unallowed_indicators`=?,`length`=?,`weight`=?,`vaccine`=?,`updated_at`=? WHERE `id` =?";
        ps = con.prepareStatement(sql);
        ps.setString(1, mdclfldr.getAllergy());
        ps.setString(2, mdclfldr.getAntecedent());
        ps.setString(3, mdclfldr.getUnallowed_indications());
        ps.setDouble(4, mdclfldr.getLength());
        ps.setDouble(5, mdclfldr.getWeight());
        ps.setString(6, mdclfldr.getVaccine());
        ps.setString(7, mdclfldr.getUpdated_at());
        ps.setInt(8, mdclfldr.getId());
        ps.executeUpdate();
    }

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
    
    public MedicalFolderModel selectByIdPatientFolder(int idParam) throws SQLException {
        MedicalFolderModel mfModel = null;
        String sql = "SELECT * FROM `medical_folder` WHERE `patient_folder_id` = " + idParam;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            int medics_id = Integer.parseInt(rs.getString("medic_id"));
            int patient_folder_id = Integer.parseInt(rs.getString("patient_folder_id"));
            Double length = Double.parseDouble(rs.getString("length"));
            Double weight = Double.parseDouble(rs.getString("weight"));
            String allergy = rs.getString("allergy");
            String antecedent = rs.getString("antecedent");
            String unallowed_indications = rs.getString("unallowed_indicators");
            String vaccine = rs.getString("vaccine");
            String updated_at = rs.getString("updated_at");

            mfModel = new MedicalFolderModel(id, medics_id, patient_folder_id, length, weight, allergy, antecedent, unallowed_indications, vaccine, updated_at);
        }
        return mfModel;
    }
    
    public MedicalFolderModel selectByIdMedicAndIdPatientFolder(int idPF, int idMedic ) throws SQLException {
        MedicalFolderModel mfModel = null;
        String sql = "SELECT * FROM `medical_folder` WHERE `patient_folder_id` = " + idPF+" and `medic_id` = "+idMedic;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            int medics_id = Integer.parseInt(rs.getString("medic_id"));
            int patient_folder_id = Integer.parseInt(rs.getString("patient_folder_id"));
            Double length = rs.getDouble("length");
            Double weight = rs.getDouble("weight");
            String allergy = rs.getString("allergy");
            String antecedent = rs.getString("antecedent");
            String unallowed_indications = rs.getString("unallowed_indicators");
            String vaccine = rs.getString("vaccine");
            String updated_at = rs.getString("updated_at");

            mfModel = new MedicalFolderModel(id, medics_id, patient_folder_id, length, weight, allergy, antecedent, unallowed_indications, vaccine, updated_at);
        }
        return mfModel;
    }
    
    public MedicalFolderModel selectById(int idMedicFolder ) throws SQLException {
        MedicalFolderModel mfModel = null;
        String sql = "SELECT * FROM `medical_folder` WHERE `id` = "+idMedicFolder;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            int medics_id = Integer.parseInt(rs.getString("medic_id"));
            int patient_folder_id = Integer.parseInt(rs.getString("patient_folder_id"));
            Double length = rs.getDouble("length");
            Double weight = rs.getDouble("weight");
            String allergy = rs.getString("allergy");
            String antecedent = rs.getString("antecedent");
            String unallowed_indications = rs.getString("unallowed_indicators");
            String vaccine = rs.getString("vaccine");
            String updated_at = rs.getString("updated_at");

            mfModel = new MedicalFolderModel(id, medics_id, patient_folder_id, length, weight, allergy, antecedent, unallowed_indications, vaccine,updated_at);
        }
        return mfModel;
    }

}
