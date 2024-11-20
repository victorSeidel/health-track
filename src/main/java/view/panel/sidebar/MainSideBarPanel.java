package view.panel.sidebar;

import controller.MainDAO;
import controller.SettingsDAO;
import view.panel.appointment.NewAppointmentPanel;
import view.panel.patient.RegisterNewPatientPanel;
import view.panel.patient.SearchPatientPanel;
import view.panel.service.ServicesListPanel;

public class MainSideBarPanel extends javax.swing.JPanel {

    public MainSideBarPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ServiceListBtn = new javax.swing.JButton();
        ShowScheduleBtn = new javax.swing.JButton();
        NewAppointmentBtn = new javax.swing.JButton();
        SearchPatientBtn = new javax.swing.JButton();
        RegisterNewPatientBtn = new javax.swing.JButton();
        SearchMedicalRecordBtn = new javax.swing.JButton();
        NewMedicalRecordBtn = new javax.swing.JButton();

        ServiceListBtn.setBackground(new java.awt.Color(0, 0, 102));
        ServiceListBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ServiceListBtn.setForeground(new java.awt.Color(255, 255, 255));
        ServiceListBtn.setText("Lista de atendimentos");
        ServiceListBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ServiceListBtn.setBorderPainted(false);
        ServiceListBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ServiceListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceListBtnActionPerformed(evt);
            }
        });

        ShowScheduleBtn.setBackground(new java.awt.Color(0, 0, 102));
        ShowScheduleBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ShowScheduleBtn.setForeground(new java.awt.Color(255, 255, 255));
        ShowScheduleBtn.setText("Visualizar agenda");
        ShowScheduleBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ShowScheduleBtn.setBorderPainted(false);
        ShowScheduleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowScheduleBtnActionPerformed(evt);
            }
        });

        NewAppointmentBtn.setBackground(new java.awt.Color(0, 0, 102));
        NewAppointmentBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NewAppointmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewAppointmentBtn.setText("Agendar nova consulta");
        NewAppointmentBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewAppointmentBtn.setBorderPainted(false);
        NewAppointmentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAppointmentBtnActionPerformed(evt);
            }
        });

        SearchPatientBtn.setBackground(new java.awt.Color(0, 0, 102));
        SearchPatientBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SearchPatientBtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchPatientBtn.setText("Pesquisar paciente");
        SearchPatientBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SearchPatientBtn.setBorderPainted(false);
        SearchPatientBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPatientBtnActionPerformed(evt);
            }
        });

        RegisterNewPatientBtn.setBackground(new java.awt.Color(0, 0, 102));
        RegisterNewPatientBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RegisterNewPatientBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegisterNewPatientBtn.setText("Cadastrar novo paciente");
        RegisterNewPatientBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RegisterNewPatientBtn.setBorderPainted(false);
        RegisterNewPatientBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterNewPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterNewPatientBtnActionPerformed(evt);
            }
        });

        SearchMedicalRecordBtn.setBackground(new java.awt.Color(0, 0, 102));
        SearchMedicalRecordBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SearchMedicalRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchMedicalRecordBtn.setText("Pesquisar prontuário");
        SearchMedicalRecordBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SearchMedicalRecordBtn.setBorderPainted(false);
        SearchMedicalRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchMedicalRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchMedicalRecordBtnActionPerformed(evt);
            }
        });

        NewMedicalRecordBtn.setBackground(new java.awt.Color(0, 0, 102));
        NewMedicalRecordBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NewMedicalRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewMedicalRecordBtn.setText("Iniciar novo prontuário");
        NewMedicalRecordBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewMedicalRecordBtn.setBorderPainted(false);
        NewMedicalRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewMedicalRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMedicalRecordBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchMedicalRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(ServiceListBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(ShowScheduleBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(NewAppointmentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(RegisterNewPatientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(NewMedicalRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(SearchPatientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(SearchPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterNewPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchMedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewMedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ServiceListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ServiceListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceListBtnActionPerformed
        if (SettingsDAO.Singleton.INSTANCE.isStartNewPanel())
        {
            ServicesListPanel newServicesListPanel = new ServicesListPanel();
            MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newServicesListPanel);
        }
        else MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(MainDAO.Singleton.INSTANCE.getMain().servicesListPanel);
    }//GEN-LAST:event_ServiceListBtnActionPerformed

    private void ShowScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowScheduleBtnActionPerformed

    }//GEN-LAST:event_ShowScheduleBtnActionPerformed

    private void NewAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppointmentBtnActionPerformed
        if (SettingsDAO.Singleton.INSTANCE.isStartNewPanel())
        {
            NewAppointmentPanel newNewAppointmentPanel = new NewAppointmentPanel();
            MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newNewAppointmentPanel);
        }
        else MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(MainDAO.Singleton.INSTANCE.getMain().newAppointmentPanel);
    }//GEN-LAST:event_NewAppointmentBtnActionPerformed

    private void SearchPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPatientBtnActionPerformed
        SearchPatientPanel newSearchPatientPanel = new SearchPatientPanel();
        newSearchPatientPanel.setType('P');
        newSearchPatientPanel.setTitle("BUSCAR PACIENTE");
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newSearchPatientPanel);
    }//GEN-LAST:event_SearchPatientBtnActionPerformed

    private void RegisterNewPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterNewPatientBtnActionPerformed
        if (SettingsDAO.Singleton.INSTANCE.isStartNewPanel())
        {
            RegisterNewPatientPanel newRegisterNewPatientPanel = new RegisterNewPatientPanel();
            MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newRegisterNewPatientPanel);
        }
        else MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(MainDAO.Singleton.INSTANCE.getMain().registerNewPatientPanel);
    }//GEN-LAST:event_RegisterNewPatientBtnActionPerformed

    private void SearchMedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMedicalRecordBtnActionPerformed
        SearchPatientPanel newSearchPatientPanel = new SearchPatientPanel();
        newSearchPatientPanel.setType('M');
        newSearchPatientPanel.setTitle("BUSCAR PRONTUÁRIO");
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newSearchPatientPanel);
    }//GEN-LAST:event_SearchMedicalRecordBtnActionPerformed

    private void NewMedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMedicalRecordBtnActionPerformed
        SearchPatientPanel newSearchPatientPanel = new SearchPatientPanel();
        newSearchPatientPanel.setType('R');
        newSearchPatientPanel.setTitle("NOVO PRONTUÁRIO");
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newSearchPatientPanel);
    }//GEN-LAST:event_NewMedicalRecordBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewAppointmentBtn;
    private javax.swing.JButton NewMedicalRecordBtn;
    private javax.swing.JButton RegisterNewPatientBtn;
    private javax.swing.JButton SearchMedicalRecordBtn;
    private javax.swing.JButton SearchPatientBtn;
    private javax.swing.JButton ServiceListBtn;
    private javax.swing.JButton ShowScheduleBtn;
    // End of variables declaration//GEN-END:variables
}
