package view.panel.sidebar;

import controller.MainDAO;
import controller.SettingsDAO;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.swing.JPanel;
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

        Background = new javax.swing.JPanel();
        SearchPatientBtn = new javax.swing.JButton();
        RegisterNewPatientBtn = new javax.swing.JButton();
        SearchMedicalRecordBtn = new javax.swing.JButton();
        NewMedicalRecordBtn = new javax.swing.JButton();
        ServiceListBtn = new javax.swing.JButton();
        ShowScheduleBtn = new javax.swing.JButton();
        NewAppointmentBtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

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
        NewMedicalRecordBtn.setText("Iniciar ou editar prontuário");
        NewMedicalRecordBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewMedicalRecordBtn.setBorderPainted(false);
        NewMedicalRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewMedicalRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMedicalRecordBtnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchPatientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RegisterNewPatientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(SearchMedicalRecordBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NewMedicalRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ServiceListBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ShowScheduleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NewAppointmentBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(SearchPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(RegisterNewPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SearchMedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(NewMedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(ServiceListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(ShowScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(NewAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 249, Short.MAX_VALUE))
        );

        add(Background, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void ServiceListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceListBtnActionPerformed
        SwitchPanel(
            MainDAO.Singleton.INSTANCE.getMain().servicesListPanel,
            ServicesListPanel::new,
            panel -> MainDAO.Singleton.INSTANCE.getMain().servicesListPanel = (ServicesListPanel) panel
        );
    }//GEN-LAST:event_ServiceListBtnActionPerformed

    private void ShowScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowScheduleBtnActionPerformed

    }//GEN-LAST:event_ShowScheduleBtnActionPerformed

    private void NewAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppointmentBtnActionPerformed
        SwitchPanel(
            MainDAO.Singleton.INSTANCE.getMain().newAppointmentPanel,
            NewAppointmentPanel::new,
            panel -> MainDAO.Singleton.INSTANCE.getMain().newAppointmentPanel = (NewAppointmentPanel) panel
        );
    }//GEN-LAST:event_NewAppointmentBtnActionPerformed

    private void SearchPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPatientBtnActionPerformed
        SearchPatientPanel newSearchPatientPanel = new SearchPatientPanel();
        
        newSearchPatientPanel.setType('P');
        newSearchPatientPanel.setTitle("BUSCAR PACIENTE");
        
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newSearchPatientPanel);
        MainDAO.Singleton.INSTANCE.getMain().searchPatientPanel = newSearchPatientPanel;
    }//GEN-LAST:event_SearchPatientBtnActionPerformed

    private void RegisterNewPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterNewPatientBtnActionPerformed
        SwitchPanel(
            MainDAO.Singleton.INSTANCE.getMain().registerNewPatientPanel,
            RegisterNewPatientPanel::new,
            panel -> MainDAO.Singleton.INSTANCE.getMain().registerNewPatientPanel = (RegisterNewPatientPanel) panel
        );
    }//GEN-LAST:event_RegisterNewPatientBtnActionPerformed

    private void SearchMedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMedicalRecordBtnActionPerformed
        SearchPatientPanel newSearchPatientPanel = new SearchPatientPanel();
        
        newSearchPatientPanel.setType('M');
        newSearchPatientPanel.setTitle("BUSCAR PRONTUÁRIO");
        
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newSearchPatientPanel);
        MainDAO.Singleton.INSTANCE.getMain().searchPatientPanel = newSearchPatientPanel;
    }//GEN-LAST:event_SearchMedicalRecordBtnActionPerformed

    private void NewMedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMedicalRecordBtnActionPerformed
        SearchPatientPanel newSearchPatientPanel = new SearchPatientPanel();
        
        newSearchPatientPanel.setType('R');
        newSearchPatientPanel.setTitle("NOVO PRONTUÁRIO");
        
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newSearchPatientPanel);
        MainDAO.Singleton.INSTANCE.getMain().searchPatientPanel = newSearchPatientPanel;
    }//GEN-LAST:event_NewMedicalRecordBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton NewAppointmentBtn;
    private javax.swing.JButton NewMedicalRecordBtn;
    private javax.swing.JButton RegisterNewPatientBtn;
    private javax.swing.JButton SearchMedicalRecordBtn;
    private javax.swing.JButton SearchPatientBtn;
    private javax.swing.JButton ServiceListBtn;
    private javax.swing.JButton ShowScheduleBtn;
    // End of variables declaration//GEN-END:variables

    private void SwitchPanel(JPanel currentPanel, Supplier<JPanel> panelSupplier, Consumer<JPanel> panelSetter) 
    {
        if (SettingsDAO.Singleton.INSTANCE.isStartNewPanel() || currentPanel == null) 
        {
            JPanel newPanel = panelSupplier.get();
            MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newPanel);
            panelSetter.accept(newPanel);
        } 
        else 
        {
            MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(currentPanel);
        }
    }
}
