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
public class DoctorModel extends UserModel {

    private String libel;

    public DoctorModel(int id, String full_name, String login, String password, String email, String phone_number, int role_id) {
        super(id, full_name, login, password, email, phone_number, role_id);
    }

    public DoctorModel(String full_name, int id) {
        super(full_name, id);
    }
    public DoctorModel(int id, int roleId, String fullName, String phoneNumber) {
        super(id, roleId,fullName, phoneNumber); // ampitoviana ny eo @ parametre 
    }
    public DoctorModel(int id){
        super(id);
    }

    public DoctorModel() {
    }

    

    public String getLibel() {
        return libel;
    }

    public void setLibel(String libel) {
        this.libel = libel;
    }

    @Override
    public String toString() {
        return this.getFull_name();
    }

}
