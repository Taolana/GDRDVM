/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author bynan
 */
public class AppointmentModel {

    private int id;
    private int medic_id;
    private int crenel_id;
    private int patient_folder_id;
    private String date;
    private Timestamp timestamp;
    private Timestamp updated_at;
    

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    
    public AppointmentModel(int id, int medic_id, int crenel_id, int patient_folder_id, String date, Timestamp timestamp, Timestamp updated_at) {
        this.id = id;
        this.medic_id = medic_id;
        this.crenel_id = crenel_id;
        this.patient_folder_id = patient_folder_id;
        this.timestamp = timestamp;
        this.updated_at = updated_at;
        this.date = date;
    }
    
    

    public AppointmentModel(int id,int idpatientfolder, int idmedics, int idcreno, String date, Timestamp ts) {
        this.id = id;
        this.patient_folder_id = idpatientfolder;
        this.medic_id = idmedics;
        this.crenel_id = idcreno;
        this.date = date;
        this.timestamp = ts;
    }
    public AppointmentModel() {

    }

    public AppointmentModel(int idpatientfolder, int idmedics, int idcreno, String date, Timestamp ts) {
        
        this.patient_folder_id = idpatientfolder;
        this.medic_id = idmedics;
        this.crenel_id = idcreno;
        this.date = date;
        this.timestamp = ts;
    }



    @Override
    public String toString() {
        return "AppointmentModel{" + "medic_id=" + medic_id + ", crenel_id=" + crenel_id + ", patient_folder_id=" + patient_folder_id + ", timestamp=" + timestamp + ", date=" + date + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMedic_id() {
        return medic_id;
    }

    public void setMedic_id(int medic_id) {
        this.medic_id = medic_id;
    }

    public int getCrenel_id() {
        return crenel_id;
    }

    public void setCrenel_id(int crenel_id) {
        this.crenel_id = crenel_id;
    }

    public int getPatient_folder_id() {
        return patient_folder_id;
    }

    public void setPatient_folder_id(int patient_folder_id) {
        this.patient_folder_id = patient_folder_id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

}
