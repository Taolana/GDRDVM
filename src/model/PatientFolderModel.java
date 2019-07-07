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
public class PatientFolderModel {

    private int id;
    private String last_name;
    private String first_name;
    private int medic_id;
    private String gender;
    private String birth_date;
    private String adress;

    public PatientFolderModel(int id, String first_name, String last_name, String gender, String ageExactString, String adress) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.birth_date = ageExactString;
        this.adress = adress;
    }

    public PatientFolderModel(int id, String last_name, String first_name, int medic_id, String gender, String birth_date, String adress) {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.medic_id = medic_id;
        this.gender = gender;
        this.birth_date = birth_date;
        this.adress = adress;
    }
    
    public PatientFolderModel(int id) {
        this.id = id;
    }
    
    public PatientFolderModel() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getMedic_id() {
        return medic_id;
    }

    public void setMedic_id(int medic_id) {
        this.medic_id = medic_id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return first_name + " " + last_name;
    }

}
