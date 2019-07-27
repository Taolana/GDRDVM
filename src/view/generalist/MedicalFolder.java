/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.generalist;

import dao.AppointmentDao;
import dao.CrenelDao;
import dao.MedicalFolderDao;
import dao.PatientFolderDao;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.AppointmentModel;
import model.CrenelModel;
import model.MedicalFolderModel;
import model.PatientFolderModel;
import view.main.Application;

/**
 *
 * @author bynan
 */
public class MedicalFolder extends javax.swing.JInternalFrame {

    /**
     * Creates new form MedicalFolder
     */
    public MedicalFolder() throws SQLException {
        initComponents();
        initListOfFolder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        folderList = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tailleTextField = new javax.swing.JTextField();
        poidsTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        allergiesTextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        antecedentsTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        contreIndicationsTextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        vaccinsTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        editToggleButton = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        updatedAt = new javax.swing.JTextField();
        crenel = new javax.swing.JTextField();
        rdvDate = new javax.swing.JTextField();
        priseRdvDate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        datesComboBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        creneauComboBox = new javax.swing.JComboBox<>();
        editFiltresToggleButton = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Dossiers Patients et Médicales");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dossiers n° :"));

        folderList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                folderListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(folderList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Modifier le dossier médicale"));

        jLabel2.setText("Taille");

        jLabel3.setText("Poids");

        jLabel4.setText("Allergies");

        tailleTextField.setEditable(false);

        poidsTextField.setEditable(false);

        jLabel5.setText("m");

        jLabel6.setText("kg");

        allergiesTextArea.setEditable(false);
        allergiesTextArea.setColumns(20);
        allergiesTextArea.setRows(5);
        jScrollPane2.setViewportView(allergiesTextArea);

        jLabel7.setText("Antécédents");

        antecedentsTextArea.setEditable(false);
        antecedentsTextArea.setColumns(20);
        antecedentsTextArea.setRows(5);
        jScrollPane3.setViewportView(antecedentsTextArea);

        jLabel8.setText("Contre indications");

        contreIndicationsTextArea.setEditable(false);
        contreIndicationsTextArea.setColumns(20);
        contreIndicationsTextArea.setRows(5);
        jScrollPane4.setViewportView(contreIndicationsTextArea);

        jLabel9.setText("Etats des vaccins");

        vaccinsTextArea.setEditable(false);
        vaccinsTextArea.setColumns(20);
        vaccinsTextArea.setRows(5);
        jScrollPane5.setViewportView(vaccinsTextArea);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_save_black_18dp.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_edit_black_18dp.png"))); // NOI18N
        editToggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                editToggleButtonItemStateChanged(evt);
            }
        });
        editToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(poidsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(tailleTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addGap(148, 148, 148)
                        .addComponent(editToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editToggleButton)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(tailleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(poidsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Historique du patient"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable1);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Nom du patient :");

        jLabel11.setText("Date de la prise du \"rdv\" :");

        jLabel12.setText("Date du rendez-vous :");

        jLabel13.setText("Créneau :");

        jLabel14.setText("Dernier modification du dossier :");

        name.setEditable(false);

        updatedAt.setEditable(false);

        crenel.setEditable(false);

        rdvDate.setEditable(false);

        priseRdvDate.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdvDate, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crenel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priseRdvDate, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updatedAt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crenel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdvDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priseRdvDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatedAt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Rédiger une ordonnance");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane6)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton1.setText("Consulté");

        jRadioButton2.setText("Non consulté");

        jLabel1.setText("Patient du :");
        jLabel1.setToolTipText("");

        datesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Créneau :");

        creneauComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        editFiltresToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_edit_black_18dp.png"))); // NOI18N
        editFiltresToggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                editFiltresToggleButtonItemStateChanged(evt);
            }
        });
        editFiltresToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFiltresToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editFiltresToggleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creneauComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel1)
                    .addComponent(datesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creneauComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editFiltresToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1304, 657));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void folderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_folderListMouseClicked

        try {
            showPatientAppointment(Integer.parseInt(folderList.getSelectedValue()));
        } catch (SQLException ex) {
            Logger.getLogger(MedicalFolder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_folderListMouseClicked

    private void editToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editToggleButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_editToggleButtonActionPerformed

    private void editToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_editToggleButtonItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            this.tailleTextField.setEditable(true);
            this.poidsTextField.setEditable(true);
            this.allergiesTextArea.setEditable(true);
            this.antecedentsTextArea.setEditable(true);
            this.contreIndicationsTextArea.setEditable(true);
            this.vaccinsTextArea.setEditable(true);
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
            this.tailleTextField.setEditable(false);
            this.poidsTextField.setEditable(false);
            this.allergiesTextArea.setEditable(false);
            this.antecedentsTextArea.setEditable(false);
            this.contreIndicationsTextArea.setEditable(false);
            this.vaccinsTextArea.setEditable(false);
        }
    }//GEN-LAST:event_editToggleButtonItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            saveButton();
        } catch (SQLException ex) {
            Logger.getLogger(MedicalFolder.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void editFiltresToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_editFiltresToggleButtonItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_editFiltresToggleButtonItemStateChanged

    private void editFiltresToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFiltresToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editFiltresToggleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea allergiesTextArea;
    private javax.swing.JTextArea antecedentsTextArea;
    private javax.swing.JTextArea contreIndicationsTextArea;
    private javax.swing.JComboBox<String> creneauComboBox;
    private javax.swing.JTextField crenel;
    private javax.swing.JComboBox<String> datesComboBox;
    private javax.swing.JToggleButton editFiltresToggleButton;
    private javax.swing.JToggleButton editToggleButton;
    private javax.swing.JList<String> folderList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField poidsTextField;
    private javax.swing.JTextField priseRdvDate;
    private javax.swing.JTextField rdvDate;
    private javax.swing.JTextField tailleTextField;
    private javax.swing.JTextField updatedAt;
    private javax.swing.JTextArea vaccinsTextArea;
    // End of variables declaration//GEN-END:variables
    private final DefaultListModel listModel = new DefaultListModel();
    public static int idPatientFolder;
    private final DefaultComboBoxModel combModel = new DefaultComboBoxModel();
    private final DefaultComboBoxModel combModel1 = new DefaultComboBoxModel();

    public void initListOfFolder() throws SQLException {

        AppointmentDao appointDao = new AppointmentDao();

        List<AppointmentModel> listAppointment = new ArrayList();
        Application app = new Application();
        Integer id = app.idMedic;

        listAppointment = appointDao.selectAllAppointmentByMedicId(id.toString());

        for (Object d : listAppointment) {
            AppointmentModel appoint = (AppointmentModel) d;
            listModel.addElement("" + appoint.getId());
            combModel.addElement(appoint.getDate());

        }
        List<CrenelModel> cre;
        CrenelDao creD = new CrenelDao();
        cre = creD.crenels();
        for (Object o : cre) {
            CrenelModel creM = (CrenelModel) o;
            combModel1.addElement(creM.getLibel());
        }

        folderList.setModel(listModel);
        this.datesComboBox.setModel(combModel);
        this.creneauComboBox.setModel(combModel1);
    }

    private void showPatientAppointment(int idAppointment) throws SQLException {
        AppointmentDao appointDao = new AppointmentDao();
        PatientFolderDao pflDao = new PatientFolderDao();
        CrenelDao crenelDao = new CrenelDao();
        List<AppointmentModel> listAppointment = new ArrayList();

        Application app = new Application();
        Integer id = app.idMedic;

        listAppointment = appointDao.selectAllAppointmentByMedicIdAndIdAppointment(id.toString(), idAppointment);

        for (AppointmentModel m : listAppointment) {
            AppointmentModel apppp = (AppointmentModel) m;

            PatientFolderModel patient = pflDao.findByIdOnAppointment(m.getPatient_folder_id());
            CrenelModel crenels = crenelDao.selectById(m.getCrenel_id());
            AppointmentModel appoint = appointDao.findById(m.getId());

            this.name.setText(patient.getFirst_name() + " " + patient.getLast_name());
            this.crenel.setText(crenels.getLibel());
            this.rdvDate.setText(appoint.getDate());
            this.priseRdvDate.setText(appoint.getTimestamp().toString());
            if (appoint.getUpdated_at() != null) {
                this.updatedAt.setText(appoint.getUpdated_at().toString());
            }
            this.idPatientFolder = patient.getId();
            showMedicalFolder();
        }
    }

    public void showMedicalFolder() throws SQLException {
        MedicalFolderDao medicalFDao = new MedicalFolderDao();

        Application app = new Application();
        Integer id = app.idMedic;

        MedicalFolderModel medicFolderModel = medicalFDao.selectByIdMedicAndIdPatientFolder(this.idPatientFolder, id);
        MedicalFolderModel medicFolderModel2 = medicalFDao.selectById(medicFolderModel.getId());

        this.tailleTextField.setText(medicFolderModel2.getLength().toString());
        this.poidsTextField.setText(medicFolderModel2.getWeight().toString());
        this.allergiesTextArea.setText(medicFolderModel2.getAllergy());
        this.antecedentsTextArea.setText(medicFolderModel2.getAntecedent());
        this.contreIndicationsTextArea.setText(medicFolderModel2.getUnallowed_indications());
        this.vaccinsTextArea.setText(medicFolderModel2.getVaccine());
    }

    private void saveButton() throws SQLException {
        Double taille = Double.parseDouble(this.tailleTextField.getText());
        Double poids = Double.parseDouble(this.poidsTextField.getText());
        String allergies = this.allergiesTextArea.getText();
        String antecedent = this.antecedentsTextArea.getText();
        String contre_indications = this.contreIndicationsTextArea.getText();
        String vaccin = this.vaccinsTextArea.getText();

        Date datetime = new Date();
        String timestamp = new SimpleDateFormat("yyy-MM-dd hh:mm:ss").format(datetime);

        MedicalFolderDao medicalFolderDao = new MedicalFolderDao();
        Application app = new Application();
        Integer id = app.idMedic;

        MedicalFolderModel medicFolderModel = medicalFolderDao.selectByIdMedicAndIdPatientFolder(this.idPatientFolder, id);
        MedicalFolderModel medicFolderModel2 = medicalFolderDao.selectById(medicFolderModel.getId());

        MedicalFolderModel medicalFolderModel = new MedicalFolderModel(medicFolderModel2.getId(), taille, poids, allergies, antecedent, contre_indications, vaccin, timestamp);

        medicalFolderDao.updateMedicalFolder(medicalFolderModel);
        JOptionPane.showMessageDialog(null, "Succès!");
        this.editToggleButton.setSelected(false);
    }
}
