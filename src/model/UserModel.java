/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import contrat.Metier;
import java.io.Serializable;

/**
 *
 * @author bynan
 */
public class UserModel extends Metier implements Serializable {

    private int id;
    private String full_name;
    private String login;
    private String password;
    private String email;
    private String phone_number;
    int role_id;

    public UserModel(int id, int role_id, String full_name, String phone_number) {
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.role_id = role_id;
        this.id = id;
    }

    public UserModel(int id, String full_name, String login, String password, String email, String phone_number, int role_id) {
        this.id = id;
        this.full_name = full_name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.role_id = role_id;
    }

    public UserModel(String full_name, int id) {
        this.full_name = full_name;
        this.id = id;
    }
    
    public UserModel(int id){
        this.id = id;
    }

    public UserModel() {

    }

    public UserModel(String full_name, int idRole, String login, String hashed, String email, String mobile) {
        this.full_name = full_name;
        this.role_id =idRole;
        this.login = login;
        this.password = hashed;
        this.email = email;
        this.phone_number = mobile;
    }

    public int getId() {
        return id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return this.full_name;
    }

}
