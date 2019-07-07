/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.SQLException;

/**
 *
 * @author bynan
 */
public class Test {

    public static void main(String[] args) throws SQLException {
        String valeur = "1/12/2019";
        var res = valeur.split("\\/");
        
        for(Object a : res){
          System.err.println(a);  
        }

    }
}
