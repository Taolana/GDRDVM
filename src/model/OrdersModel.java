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
public class OrdersModel {
    private int id;
    private String doctor_order;

    public OrdersModel(int id, String doctor_order) {
        this.id = id;
        this.doctor_order = doctor_order;
    }
    public OrdersModel(String doctor_order) {
        this.doctor_order = doctor_order;
    }
    public OrdersModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctor_order() {
        return doctor_order;
    }

    public void setDoctor_order(String doctor_order) {
        this.doctor_order = doctor_order;
    }

    @Override
    public String toString() {
        return "OrdersModel{" + "id=" + id + ", doctor_order=" + doctor_order + '}';
    }
    
}
