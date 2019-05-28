/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccessBdd;
import extrapackages.AgeCalculator;
import java.lang.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AgeModel;
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

    public List<PatientFolderModel> selectPatientBySearch(String value) throws SQLException {
        PatientFolderModel patientFolderModel = null;
        List patients = new ArrayList();
        String sql = "select * from patient_folder where user_id = 0 and (first_name LIKE '%" + value + "%' OR last_name LIKE '%" +  value+ "%')";
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
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date birthDate = null;
            try {
                birthDate = (Date) sdf.parse(age);
            } catch (ParseException ex) {
                Logger.getLogger(RoleDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            AgeCalculator ageFoo = new AgeCalculator();
            AgeModel ageExact = ageFoo.calculateAge(birthDate);
            String ageExactString = ageExact.toString();
            patientFolderModel = new PatientFolderModel(id, first_name, last_name, gender, ageExactString, adress);
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
            int id =Integer.parseInt(rs.getString("id"));
            String first_name = rs.getString("first_name");
            String last_name = rs.getString("last_name");
            String gender = rs.getString("gender");
            String age = rs.getString("birth_date");
            String adress = rs.getString("adress");

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date birthDate = null;
            try {
                birthDate = (Date) sdf.parse(age);
            } catch (ParseException ex) {
                Logger.getLogger(RoleDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            AgeCalculator ageFoo = new AgeCalculator();
            AgeModel ageExact = ageFoo.calculateAge(birthDate);
            String ageExactString = ageExact.toString();

            patientFolderModel = new PatientFolderModel(id, first_name, last_name, gender, ageExactString, adress);
            patients.add(patientFolderModel);

        }
        return patients;
    }
    
}
