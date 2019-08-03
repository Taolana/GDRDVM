/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.MedicalFolderDao;
import dao.OrdersDao;
import java.sql.SQLException;
import java.util.List;
import model.ComposeOrderJointureModel;
import model.MedicalFolderModel;
import view.main.Application;

/**
 *
 * @author bynan
 */
public class Test {

    public static void main(String[] args) throws SQLException {
       MedicalFolderDao medicalFDao = new MedicalFolderDao();
        Application app = new Application();
        Integer id = app.idMedic;

        MedicalFolderModel medicFolderModel = medicalFDao.selectByIdMedicAndIdPatientFolder(450, 14);
        MedicalFolderModel medicFolderModel2 = medicalFDao.selectById(medicFolderModel.getId());
       
        
         List<ComposeOrderJointureModel> c = null;
        

        
        
        
        OrdersDao o = new OrdersDao();
        System.err.println(medicFolderModel2.getId());
        c = o.selectByMedicFolderID(medicFolderModel2.getId());
        System.err.println(c);

        for (ComposeOrderJointureModel p : c) {

                System.err.println(p.getOrder_id());
                System.err.println(p.getTs());
        }
    }
}
