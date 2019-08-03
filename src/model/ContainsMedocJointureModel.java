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
public class ContainsMedocJointureModel {
    private int id;
    private int id_medoc;
    private int id_orders;

    public ContainsMedocJointureModel(int id, int id_medoc, int id_orders) {
        this.id = id;
        this.id_medoc = id_medoc;
        this.id_orders = id_orders;
    }

    public ContainsMedocJointureModel(int id_medoc, int id_orders) {
        this.id_medoc = id_medoc;
        this.id_orders = id_orders;
    }

    public ContainsMedocJointureModel(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_medoc() {
        return id_medoc;
    }

    public void setId_medoc(int id_medoc) {
        this.id_medoc = id_medoc;
    }

    public int getId_orders() {
        return id_orders;
    }

    public void setId_orders(int id_orders) {
        this.id_orders = id_orders;
    }
    
}
