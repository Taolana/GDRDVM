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
public class CrenelModel {

    private int id;
    private String libel;

    public CrenelModel() {

    }

    public int getId() {
        return id;
    }

    public CrenelModel(int id, String libel) {
        this.id = id;
        this.libel = libel;
    }

    public String getLibel() {
        return libel;
    }

    public void setLibel(String libel) {
        this.libel = libel;
    }

    @Override
    public String toString() {
        return this.libel;
    }

}
