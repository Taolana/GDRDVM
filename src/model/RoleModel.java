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
public class RoleModel {
    private String libel;
    private int id_role;
    
    public RoleModel(){
        
    }


    public RoleModel(int role_id, String aLibel) {
        this.id_role = role_id;
        this.libel = aLibel;
    }

   

    public String getLibel() {
        return libel;
    }

    public void setLibel(String libel) {
        this.libel = libel;
    }

    public int getIdRole() {
        return id_role;
    }

    public void setIdRole(int id) {
        this.id_role = id;
    }

   @Override
   public String toString(){
       return libel;
   }
    
}
