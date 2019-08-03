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
    private Double length;
    private Double weight;
    private String allergy;
    private String antecedent;
    private String unallowed_indications;
    private String vaccine;
    private String updated_at;

    public MedicalFolderModel(int id, int medics_id, int patient_folder_id, Double length, Double weight, String allergy, String antecedent, String unallowed_indications, String vaccine, String updated_at) {
        this.id = id;
        this.medics_id = medics_id;
        this.patient_folder_id = patient_folder_id;
        this.length = length;
        this.weight = weight;
        this.allergy = allergy;
        this.antecedent = antecedent;
        this.unallowed_indications = unallowed_indications;
        this.vaccine = vaccine;
        this.updated_at = updated_at;
    }

    public MedicalFolderModel(int id, Double length, Double weight, String allergy, String antecedent, String unallowed_indications, String vaccine, String updated_at) {
        this.id = id;
        this.length = length;
        this.weight = weight;
        this.allergy = allergy;
        this.antecedent = antecedent;
        this.unallowed_indications = unallowed_indications;
        this.vaccine = vaccine;
        this.updated_at = updated_at;
    }

    
    
    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
    
    

    public MedicalFolderModel(int id, int medics_id, int patient_folder_id, Double length, Double weight, String allergy, String antecedent, String unallowed_indications, String vaccine) {
        this.id = id;
        this.medics_id = medics_id;
        this.patient_folder_id = patient_folder_id;
        this.length = length;
        this.weight = weight;
        this.allergy = allergy;
        this.antecedent = antecedent;
        this.unallowed_indications = unallowed_indications;
        this.vaccine = vaccine;
    }

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

    public int getPatient_folder_id() {
        return patient_folder_id;
    }

    public void setPatient_folder_id(int patient_folder_id) {
        this.patient_folder_id = patient_folder_id;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
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

    @Override
    public String toString() {
        return "MedicalFolderModel{" + "id=" + id + ", medics_id=" + medics_id + ", patient_folder_id=" + patient_folder_id + ", length=" + length + ", weight=" + weight + ", allergy=" + allergy + ", antecedent=" + antecedent + ", unallowed_indications=" + unallowed_indications + ", vaccine=" + vaccine + ", updated_at=" + updated_at + '}';
    }

    
}
