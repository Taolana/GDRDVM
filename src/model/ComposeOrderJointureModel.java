/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bynan
 */
public class ComposeOrderJointureModel {
    private int id;
    private int user_id;
    private int order_id;
    private int medical_folder_id;
    private int appointment_id;
    private String ts;

    public ComposeOrderJointureModel() {
    }

    public ComposeOrderJointureModel( int user_id, int order_id, int medical_folder_id, int appointment_id, String ts) {
       
        this.user_id = user_id;
        this.order_id = order_id;
        this.medical_folder_id = medical_folder_id;
        this.appointment_id = appointment_id;
        this.ts = ts;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public ComposeOrderJointureModel(int id, int user_id, int order_id, int medical_folder_id, int appointment_id, String ts) {
        this.id = id;
        this.user_id = user_id;
        this.order_id = order_id;
        this.medical_folder_id = medical_folder_id;
        this.appointment_id = appointment_id;
        this.ts = ts;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getMedical_folder_id() {
        return medical_folder_id;
    }

    public void setMedical_folder_id(int medical_folder_id) {
        this.medical_folder_id = medical_folder_id;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "ComposeOrderJointureModel{" + "id=" + id + ", user_id=" + user_id + ", order_id=" + order_id + ", medical_folder_id=" + medical_folder_id + ", appointment_id=" + appointment_id + ", ts=" + ts + '}';
    }
    
}
