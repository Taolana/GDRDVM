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
public class MedicalFolderModel {
    private int id;
    private int medics_id;
    private int patient_folder_id;
    private String length;
    private String weight;
    private String allergy;
    private String antecedent;
    private String unallowed_indications;
    private String vaccine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedics_id() {
        return medics_id;
    }

    public void setMedics_id(int medics_id) {
        this.medics_id = medics_id;
    }

    @Override
    public String toString() {
        return "MedicalFolderModel{" + "length=" + length + ", weight=" + weight + ", allergy=" + allergy + ", antecedent=" + antecedent + ", unallowed_indications=" + unallowed_indications + ", vaccine=" + vaccine + '}';
    }
  
    public int getPatient_folder_id() {
        return patient_folder_id;
    }

    public void setPatient_folder_id(int patient_folder_id) {
        this.patient_folder_id = patient_folder_id;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getAntecedent() {
        return antecedent;
    }

    public void setAntecedent(String antecedent) {
        this.antecedent = antecedent;
    }

    public String getUnallowed_indications() {
        return unallowed_indications;
    }

    public void setUnallowed_indications(String unallowed_indications) {
        this.unallowed_indications = unallowed_indications;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }
    
    
}
