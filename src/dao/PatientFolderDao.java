/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccessBdd;
import java.lang.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.PatientFolderModel;

/**
 *
 * @author bynan
 */
public class PatientFolderDao {

    public void addPatientFolder(PatientFolderModel patientFolderModel) {
        String sql = "INSERT INTO `patient_folder`( `first_name`, `last_name`, `gender`, `birth_date`, `adress`) VALUES ('"
                + patientFolderModel.getFirst_name() + "','"
                + patientFolderModel.getLast_name() + "','"
                + patientFolderModel.getGender() + "','"
                + patientFolderModel.getBirth_date() + "','"
                + patientFolderModel.getAdress() + "')";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        accessBdd.executeUpdate(sql);
    }
    

    public void updatePatientFolder(PatientFolderModel p) throws SQLException {
        AccessBdd accessBdd = new AccessBdd();
        PreparedStatement ps = null;
        Connection con = accessBdd.getConnection();
        String sql = "UPDATE `patient_folder` SET `first_name`=?,`last_name`=?,`gender`=?,`birth_date`=?,`adress`=? WHERE `id`= ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, p.getFirst_name());
        ps.setString(2, p.getLast_name());
        ps.setString(3, p.getGender());
        ps.setString(4, p.getBirth_date());
        ps.setString(5, p.getAdress());
        ps.setInt(6, p.getId());
        ps.executeUpdate();
    }

    public List<PatientFolderModel> selectPatientBySearch(String value) throws SQLException {
        PatientFolderModel patientFolderModel = null;
        List patients = new ArrayList();
        String sql = "select * from patient_folder where user_id = 0 and (first_name LIKE '%" + value + "%' OR last_name LIKE '%" + value + "%')";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            String first_name = rs.getString("first_name");
            String last_name = rs.getString("last_name");
            String gender = rs.getString("gender");
            String age = rs.getString("birth_date");
            String adress = rs.getString("adress");

            patientFolderModel = new PatientFolderModel(id, first_name, last_name, gender, age, adress);
            patients.add(patientFolderModel);
        }
        return patients;
    }

    public int countPatients() throws SQLException {
        int number = 0;
        String sql = "SELECT COUNT(*)isa FROM patient_folder where user_id = 0";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        if (rs.first()) {
            number = rs.getInt("isa");
        }
        return number;
    }

    public List<PatientFolderModel> selectWithLimitAndFilter(String limit) throws SQLException {
        PatientFolderModel patientFolderModel = null;
        List patients = new ArrayList();

        String sql = "select * from patient_folder where user_id = 0 ORDER BY id DESC limit " + limit;

        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            String first_name = rs.getString("first_name");
            String last_name = rs.getString("last_name");
            String gender = rs.getString("gender");
            String age = rs.getString("birth_date");
            String adress = rs.getString("adress");

            patientFolderModel = new PatientFolderModel(id, first_name, last_name, gender, age, adress);
            patients.add(patientFolderModel);
        }
        return patients;
    }

    public List<PatientFolderModel> selectAllPatientFolder() throws SQLException {
        PatientFolderModel patientFolderModel = null;
        List patients = new ArrayList();
        String sql = "SELECT * FROM `patient_folder` where user_id = 0 ORDER BY id DESC";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            String first_name = rs.getString("first_name");
            String last_name = rs.getString("last_name");
            String gender = rs.getString("gender");
            String age = rs.getString("birth_date");
            String adress = rs.getString("adress");

            patientFolderModel = new PatientFolderModel(id, first_name, last_name, gender, age, adress);
            patients.add(patientFolderModel);

        }
        return patients;
    }

    public PatientFolderModel selectById(int idParam) throws SQLException {
        PatientFolderModel pfModel = null;
        String sql = "SELECT * FROM patient_folder WHERE user_id = 0 and id = " + idParam;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            String first_name = rs.getString("first_name");
            String last_name = rs.getString("last_name");
            String gender = rs.getString("gender");
            String age = rs.getString("birth_date");
            String adress = rs.getString("adress");

            pfModel = new PatientFolderModel(id, first_name, last_name, gender, age, adress);
        }
        return pfModel;
    }
    /**
     * id not null
     * @param idParam
     * @return
     * @throws SQLException 
     */
    public PatientFolderModel findById(int idParam) throws SQLException {
        PatientFolderModel pfModel = null;
        String sql = "SELECT * FROM patient_folder WHERE user_id != 0 and id = " + idParam;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            String first_name = rs.getString("first_name");
            String last_name = rs.getString("last_name");
            String gender = rs.getString("gender");
            String age = rs.getString("birth_date");
            String adress = rs.getString("adress");

            pfModel = new PatientFolderModel(id, first_name, last_name, gender, age, adress);
        }
        return pfModel;
    }
    
    public PatientFolderModel findByIdOnAppointment(int idParam) throws SQLException {
        PatientFolderModel pfModel = null;
        String sql = "SELECT * FROM patient_folder WHERE user_id >= 0 and id = " + idParam;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            String first_name = rs.getString("first_name");
            String last_name = rs.getString("last_name");
            String gender = rs.getString("gender");
            String age = rs.getString("birth_date");
            String adress = rs.getString("adress");

            pfModel = new PatientFolderModel(id, first_name, last_name, gender, age, adress);
        }
        return pfModel;
    }
    
    
    

}
