/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.CrenelDao;
import dao.DoctorDao;
import dao.MedicalFolderDao;
import java.sql.SQLException;
import java.util.List;
import model.CrenelModel;
import model.DoctorModel;

/**
 *
 * @author bynan
 */
public class Test {
    public static void main (String[] args) throws SQLException{
         MedicalFolderDao med = new MedicalFolderDao();
         int a = med.selectNumberOfPatientsPerDoctor(9);
         System.out.println(a);

    }
}
