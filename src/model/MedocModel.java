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
public class MedocModel {
    private int id;
    private String libel;
    private String type;
    private String dosage;
    private String duration;
    private String numbers;
    private String comment;

    public MedocModel(int id, String libel, String type, String dosage, String duration, String numbers, String comment) {
        this.id = id;
        this.libel = libel;
        this.type = type;
        this.dosage = dosage;
        this.duration = duration;
        this.numbers = numbers;
        this.comment = comment;
    }

    public MedocModel() {
    }

    public MedocModel(String libel, String type, String dosage, String duration, String numbers, String comment) {
        this.libel = libel;
        this.type = type;
        this.dosage = dosage;
        this.duration = duration;
        this.numbers = numbers;
        this.comment = comment;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibel() {
        return libel;
    }

    public void setLibel(String libel) {
        this.libel = libel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "MedocModel{" + "id=" + id + ", libel=" + libel + ", type=" + type + ", dosage=" + dosage + ", duration=" + duration + ", numbers=" + numbers + ", comment=" + comment + '}';
    }
    
}
