/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.main;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.about.About;
import view.administrator.NewUser;
import view.authentification.LoginDialog;
import view.secretary.Appointment;
import view.secretary.AppointmentLists;
import view.secretary.CreatePatientFolder;
import view.secretary.Chart;
import view.secretary.ListPatientsFolder;

/**
 *
 * @author bynan
 */
public class Application extends javax.swing.JFrame {

    /**
     * Creates new form Application
     */
    public Application() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        userName = new javax.swing.JMenu();
        logoutMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        newMenu = new javax.swing.JMenu();
        newAppointmentMenuItem = new javax.swing.JMenuItem();
        folderMenu = new javax.swing.JMenu();
        patientMenuItem = new javax.swing.JMenuItem();
        medicalMenuItem = new javax.swing.JMenuItem();
        userMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        listOfPatientsFolderMenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);

        userName.setMnemonic('f');
        userName.setText("Nom du personnel connecté");

        logoutMenuItem.setMnemonic('a');
        logoutMenuItem.setText("Déconnexion");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        userName.add(logoutMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        userName.add(exitMenuItem);

        menuBar.add(userName);

        newMenu.setMnemonic('e');
        newMenu.setText("Nouveau");

        newAppointmentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_alarm_on_black_18dp.png"))); // NOI18N
        newAppointmentMenuItem.setMnemonic('r');
        newAppointmentMenuItem.setText("Rendez-vous");
        newAppointmentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAppointmentMenuItemActionPerformed(evt);
            }
        });
        newMenu.add(newAppointmentMenuItem);

        folderMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_create_new_folder_black_18dp.png"))); // NOI18N
        folderMenu.setText("Dossier");

        patientMenuItem.setText("Patient");
        patientMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientMenuItemActionPerformed(evt);
            }
        });
        folderMenu.add(patientMenuItem);

        medicalMenuItem.setText("Médical");
        folderMenu.add(medicalMenuItem);

        newMenu.add(folderMenu);

        userMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_group_black_18dp.png"))); // NOI18N
        userMenuItem.setMnemonic('u');
        userMenuItem.setText("Utilisateur");
        userMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userMenuItemActionPerformed(evt);
            }
        });
        newMenu.add(userMenuItem);

        menuBar.add(newMenu);

        viewMenu.setText("Voir");

        listOfPatientsFolderMenuItem.setText("Dossiers patients");
        listOfPatientsFolderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfPatientsFolderMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(listOfPatientsFolderMenuItem);

        jMenuItem2.setText("Rendez-vous");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        viewMenu.add(jMenuItem2);

        jMenuItem1.setText("Graphe");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        viewMenu.add(jMenuItem1);

        menuBar.add(viewMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Aide");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("A propos");
        aboutMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenuItemMouseClicked(evt);
            }
        });
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        exit();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void newAppointmentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAppointmentMenuItemActionPerformed
        appointmentCreate();
    }//GEN-LAST:event_newAppointmentMenuItemActionPerformed

    private void aboutMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMouseClicked

    }//GEN-LAST:event_aboutMenuItemMouseClicked

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        about();
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void listOfPatientsFolderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfPatientsFolderMenuItemActionPerformed
        try {
            listPatients();
        } catch (SQLException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listOfPatientsFolderMenuItemActionPerformed

    private void userMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userMenuItemActionPerformed
        newUser();
    }//GEN-LAST:event_userMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        initChart();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        logout();
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void patientMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientMenuItemActionPerformed
        newPatient();
    }//GEN-LAST:event_patientMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        appointmentList();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    public javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    public javax.swing.JMenu folderMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem listOfPatientsFolderMenuItem;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuItem medicalMenuItem;
    public javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newAppointmentMenuItem;
    public javax.swing.JMenu newMenu;
    private javax.swing.JMenuItem patientMenuItem;
    public javax.swing.JMenuItem userMenuItem;
    public javax.swing.JMenu userName;
    public javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables
    private LoginDialog loginDialog;
    private Appointment appointment;
    private About about;
    private CreatePatientFolder new_patient_folder;
    public ListPatientsFolder list_patient_folder;
    public NewUser newUser;
    public AppointmentLists appointList;

    /**
     * My own methods
     */
//    public void initLoginForm() {
//        this.loginForm = new LoginForm();
//        this.loginForm.setVisible(true);
//        this.desktopPane.add(this.loginForm);
//        loginForm.setTitle("Formulaire de connexion");
//    }
//    
    public void initLoginDialog() {
        this.loginDialog = new LoginDialog(this, rootPaneCheckingEnabled);
        this.loginDialog.setVisible(true);
    }

    private void exit() {
        int p = JOptionPane.showConfirmDialog(null, "Voulez vous vraiement quitter définitivement l'application ?", "Quitter", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            System.exit(0);
        }
    }

    private void appointmentCreate() {
        try {
            this.appointment = new Appointment();
        } catch (SQLException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.desktopPane.add(this.appointment);
    }

    private void about() {
        this.about = new About();
        this.desktopPane.add(this.about);
    }

    private void newPatient() {
        this.new_patient_folder = new CreatePatientFolder();
        this.desktopPane.add(this.new_patient_folder);
    }

    public void listPatients() throws SQLException {
        this.list_patient_folder = new ListPatientsFolder();
        this.list_patient_folder.setVisible(true);
        this.desktopPane.add(this.list_patient_folder);
    }

    public void initChart() {
        Chart demo = new Chart("Nombres de patients par catégorie de médecin", "Vue global");
        demo.pack();
        this.desktopPane.add(demo);
        demo.setVisible(true);
    }

    private void newUser() {
        this.newUser = new NewUser();
        this.desktopPane.add(this.newUser);
        this.newUser.setVisible(true);
    }

    private void logout() {
        int p = JOptionPane.showConfirmDialog(null, "Voulez vous vraiement se déconnecter ?", "Déconnexion", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            this.setVisible(false);
            initLoginDialog();
        }
    }

    private void appointmentList() {
        this.appointList = new AppointmentLists();
        this.desktopPane.add(this.appointList);
        this.appointList.setVisible(true);
    }
}
