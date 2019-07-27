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
import model.AppointmentModel;

/**
 *
 * @author bynan
 */
public class AppointmentDao {
    
    public AppointmentModel findById(int idParam) throws SQLException {
        AppointmentModel appointModel = null;
        String sql = "SELECT * FROM `appointments` WHERE `id` = " + idParam;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            int medics_id = Integer.parseInt(rs.getString("medic_id"));
            int crenel_id = Integer.parseInt(rs.getString("crenel_id"));
            int patient_folder_id = Integer.parseInt(rs.getString("patient_folder_id"));
            String date = rs.getString("date");
            java.sql.Timestamp timestamp = rs.getTimestamp("timestamp");
            java.sql.Timestamp updated_at = rs.getTimestamp("updated_at");

            appointModel = new AppointmentModel(id, medics_id, crenel_id, patient_folder_id, date, timestamp, updated_at);
        }
        return appointModel;
    }
    
    
//     public void insertTim(Rdz objet) {
//        try {
//            Connection cnx = bdd.seConnecter();
//
//            String sql = "INSERT INTO `rdz`(`ID_MEDECIN_RDZ`, `ID_DOSSIER_PATIENT_RDZ`, `ID_CRENEAU_RDZ`, `DATE`) VALUES (?,?,?,?)";
//            PreparedStatement stat = cnx.prepareStatement(sql);
//            stat.setInt(1, objet.getMedecin());
//            stat.setInt(2, objet.getPatient());
//            stat.setInt(3, objet.getCreneau());
//            stat.setString(4, objet.getDate());
//
//            stat.executeUpdate();
//            bdd.seDeconnecter(cnx);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    public void insertAppointment(AppointmentModel appointment) {
        String sql = "INSERT INTO `appointments`(`medic_id`, `crenel_id`, `patient_folder_id`, `date`, `timestamp`) VALUES ('"
                + appointment.getMedic_id() + "','"
                + appointment.getCrenel_id() + "','"
                + appointment.getPatient_folder_id() + "','"
                + appointment.getDate() + "','"
                + appointment.getTimestamp() + "')";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        accessBdd.executeUpdate(sql);
    }
//    public void updateDossierPatient(Rdz objet) {
//        try {
//            Connection cnx = bdd.seConnecter();
//            String sql="UPDATE `dossierpatient` set`id_medecin_user` = ? WHERE id_dossier_patient = ?";
//            PreparedStatement stat = cnx.prepareStatement(sql);
//            stat.setInt(1, objet.getMedecin());
//            stat.setInt(2, objet.getPatient());
//
//            stat.executeUpdate();
//            bdd.seDeconnecter(cnx);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    public void updatePatientFolder(AppointmentModel appointment) {
        String sql = "UPDATE `patient_folder` SET `user_id`=' " + appointment.getMedic_id() + "' WHERE id = ' " + appointment.getPatient_folder_id() + "'";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        accessBdd.executeUpdate(sql);
    }
//      public void insertDossierMedical(Rdz objet) {
//        try {
//            Connection cnx = bdd.seConnecter();
//            String sql="INSERT INTO `dossiermedical`(`id_dossier_patient_dm`, `id_medecin_user`) VALUES (?,?)";
//            PreparedStatement stat = cnx.prepareStatement(sql);
//            stat.setInt(1, objet.getPatient());
//            stat.setInt(2, objet.getMedecin());
//            
//            stat.executeUpdate();
//            bdd.seDeconnecter(cnx);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(DaoRdz.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    public void insertMedicalFolder(AppointmentModel appointment) {
        String sql = "INSERT INTO `medical_folder`(`patient_folder_id`, `medic_id`) VALUES('" + appointment.getPatient_folder_id() + "','" + appointment.getMedic_id() + "')";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        accessBdd.executeUpdate(sql);
    }
    
  
    
    

    public List<AppointmentModel> selectAllAppointment() throws SQLException {
        List appList = new ArrayList();
        String sql = "SELECT * FROM appointments";
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {

            int id = Integer.parseInt(rs.getString("id"));
            int medic_id = Integer.parseInt(rs.getString("medic_id"));
            int crenel_id = Integer.parseInt(rs.getString("crenel_id"));
            int patient_folder_id = Integer.parseInt(rs.getString("patient_folder_id"));
            String date = rs.getString("date");
            java.sql.Timestamp timestamp = rs.getTimestamp("timestamp");

            AppointmentModel apMdl = new AppointmentModel(id, patient_folder_id, medic_id, id, date, timestamp);
            
            apMdl.setMedic_id(id);
            apMdl.setCrenel_id(crenel_id);
            apMdl.setDate(date);
            apMdl.setMedic_id(medic_id);
            apMdl.setPatient_folder_id(patient_folder_id);
            apMdl.setTimestamp(timestamp);
            
            appList.add(apMdl);
        }
        return appList;
    }
    
    public List<AppointmentModel> selectAllAppointmentByMedicIdAndIdAppointment(String filter, int idAppoint) throws SQLException {
        List appList = new ArrayList();
        String sql = "SELECT * FROM appointments where medic_id ="+filter+" and id = "+idAppoint;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {

            int id = Integer.parseInt(rs.getString("id"));
            int medic_id = Integer.parseInt(rs.getString("medic_id"));
            int crenel_id = Integer.parseInt(rs.getString("crenel_id"));
            int patient_folder_id = Integer.parseInt(rs.getString("patient_folder_id"));
            String date = rs.getString("date");
            java.sql.Timestamp timestamp = rs.getTimestamp("timestamp");

            AppointmentModel apMdl = new AppointmentModel(id, patient_folder_id, medic_id, id, date, timestamp);
            
            apMdl.setMedic_id(id);
            apMdl.setCrenel_id(crenel_id);
            apMdl.setDate(date);
            apMdl.setMedic_id(medic_id);
            apMdl.setPatient_folder_id(patient_folder_id);
            apMdl.setTimestamp(timestamp);
            
            appList.add(apMdl);
        }
        return appList;
    }
    
    public List<AppointmentModel> selectAllAppointmentByMedicId(String filter) throws SQLException {
        List appList = new ArrayList();
        String sql = "SELECT * FROM appointments where medic_id ="+filter;
        AccessBdd accessBdd = new AccessBdd();
        accessBdd.loadDriver();
        var rs = accessBdd.executeSelect(sql);
        while (rs.next()) {

            int id = Integer.parseInt(rs.getString("id"));
            int medic_id = Integer.parseInt(rs.getString("medic_id"));
            int crenel_id = Integer.parseInt(rs.getString("crenel_id"));
            int patient_folder_id = Integer.parseInt(rs.getString("patient_folder_id"));
            String date = rs.getString("date");
            java.sql.Timestamp timestamp = rs.getTimestamp("timestamp");

            AppointmentModel apMdl = new AppointmentModel(id, patient_folder_id, medic_id, id, date, timestamp);
            
            apMdl.setMedic_id(id);
            apMdl.setCrenel_id(crenel_id);
            apMdl.setDate(date);
            apMdl.setMedic_id(medic_id);
            apMdl.setPatient_folder_id(patient_folder_id);
            apMdl.setTimestamp(timestamp);
            
            appList.add(apMdl);
        }
        return appList;
    }

//    public List<AppointmentModel> selectAllPatientFolder(int medicalOperatorId) throws SQLException {
//        AppointmentModel appointFolderModel = null;
//        List patients = new ArrayList();
//        String sql = "SELECT * FROM `appointments` ap JOIN patient_folder pf ON pf.id=ap.patient_folder_id JOIN crenels c ON ap.crenel_id=c.id WHERE medic_id= " + medicalOperatorId + " ORDER BY id DESC";
//        AccessBdd accessBdd = new AccessBdd();
//        accessBdd.loadDriver();
//        var rs = accessBdd.executeSelect(sql);
//        while (rs.next()) {
//            int id = Integer.parseInt(rs.getString("id"));
//            String medic_id = rs.getString("medic_id");
//            String crenel_id = rs.getString("crenel_id");
//            String patient_folder_id = rs.getString("patient_folder_id");
//            String date = rs.getString("date");
//            java.sql.Timestamp timestamp = rs.getTimestamp("timestamp");
//            String first_name = rs.getString("first_name");
//            String last_name = rs.getString("last_name");
//            String gender = rs.getString("gender");
//            String birth_date = rs.getString("birth_date");
//            String adress = rs.getString("adress");
//            String libel = rs.getString("libel");
//
//            appointFolderModel = new AppointmentModel(id, medic_id, crenel_id, patient_folder_id, date, timestamp, first_name, last_name, gender, birth_date, adress, libel);
//            patients.add(appointFolderModel);
//
//        }
//        return patients;
    //}
}
