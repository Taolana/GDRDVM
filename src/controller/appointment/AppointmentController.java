/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.appointment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.secretary.ListPatientsFolder;

/**
 *
 * @author bynan
 */
public class AppointmentController implements ActionListener{
    
    ListPatientsFolder listPView;
    public AppointmentController(ListPatientsFolder l){
        this.listPView = l;
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
