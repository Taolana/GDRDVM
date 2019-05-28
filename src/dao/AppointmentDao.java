/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.AccessBdd;
import model.AppointmentModel;

/**
 *
 * @author bynan
 */
public class AppointmentDao {
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
        String sql = "UPDATE `patient_folder` SET `user_id`=' " + appointment.getMedic_id()+ "' WHERE id = ' " + appointment.getPatient_folder_id()+ "'";
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
}
