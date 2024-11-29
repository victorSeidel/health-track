package view.panel.sidebar;

import controller.MainDAO;
import controller.SettingsDAO;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.swing.JPanel;
import view.panel.ClinicalEvolutionPanel;
import view.panel.prescription.PrescriptionsPanel;
import view.panel.appointment.NewAppointmentPanel;
import view.panel.attachment.AttachmentsPanel;
import view.panel.patient.MedicalRecordPanel;
import view.panel.patient.PatientInfoPanel;
import view.panel.service.ServicePanel;

public class ServiceSideBarPanel extends javax.swing.JPanel {

    public ServiceSideBarPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        PatientInfoBtn = new javax.swing.JButton();
        MedicalRecordBtn = new javax.swing.JButton();
        ServiceBtn = new javax.swing.JButton();
        newAppointmentBtn = new javax.swing.JButton();
        PrescriptionBtn = new javax.swing.JButton();
        AttachmentsBtn = new javax.swing.JButton();
        ClinicalEvolutionBtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        PatientInfoBtn.setBackground(new java.awt.Color(0, 0, 102));
        PatientInfoBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PatientInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        PatientInfoBtn.setText("Paciente");
        PatientInfoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PatientInfoBtn.setBorderPainted(false);
        PatientInfoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PatientInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientInfoBtnActionPerformed(evt);
            }
        });

        MedicalRecordBtn.setBackground(new java.awt.Color(0, 0, 102));
        MedicalRecordBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MedicalRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        MedicalRecordBtn.setText("Prontuário");
        MedicalRecordBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MedicalRecordBtn.setBorderPainted(false);
        MedicalRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MedicalRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalRecordBtnActionPerformed(evt);
            }
        });

        ServiceBtn.setBackground(new java.awt.Color(0, 0, 102));
        ServiceBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ServiceBtn.setForeground(new java.awt.Color(255, 255, 255));
        ServiceBtn.setText("Atendimento");
        ServiceBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ServiceBtn.setBorderPainted(false);
        ServiceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceBtnActionPerformed(evt);
            }
        });

        newAppointmentBtn.setBackground(new java.awt.Color(0, 0, 102));
        newAppointmentBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newAppointmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        newAppointmentBtn.setText("Agendar consulta");
        newAppointmentBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        newAppointmentBtn.setBorderPainted(false);
        newAppointmentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAppointmentBtnActionPerformed(evt);
            }
        });

        PrescriptionBtn.setBackground(new java.awt.Color(0, 0, 102));
        PrescriptionBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PrescriptionBtn.setForeground(new java.awt.Color(255, 255, 255));
        PrescriptionBtn.setText("Prescrições");
        PrescriptionBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PrescriptionBtn.setBorderPainted(false);
        PrescriptionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrescriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrescriptionBtnActionPerformed(evt);
            }
        });

        AttachmentsBtn.setBackground(new java.awt.Color(0, 0, 102));
        AttachmentsBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AttachmentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        AttachmentsBtn.setText("Anexos");
        AttachmentsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AttachmentsBtn.setBorderPainted(false);
        AttachmentsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AttachmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttachmentsBtnActionPerformed(evt);
            }
        });

        ClinicalEvolutionBtn.setBackground(new java.awt.Color(0, 0, 102));
        ClinicalEvolutionBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ClinicalEvolutionBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClinicalEvolutionBtn.setText("Evolução Clínica");
        ClinicalEvolutionBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClinicalEvolutionBtn.setBorderPainted(false);
        ClinicalEvolutionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClinicalEvolutionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClinicalEvolutionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PatientInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MedicalRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ServiceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(newAppointmentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(PrescriptionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AttachmentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ClinicalEvolutionBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PatientInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(MedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(ServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(newAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(PrescriptionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(AttachmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(ClinicalEvolutionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 248, Short.MAX_VALUE))
        );

        add(Background, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void MedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalRecordBtnActionPerformed
        SwitchPanel(
            MainDAO.Singleton.INSTANCE.getMain().medicalRecordPanel,
            MedicalRecordPanel::new,
            panel -> MainDAO.Singleton.INSTANCE.getMain().medicalRecordPanel = (MedicalRecordPanel) panel
        );
    }//GEN-LAST:event_MedicalRecordBtnActionPerformed

    private void ServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceBtnActionPerformed
        SwitchPanel(
            MainDAO.Singleton.INSTANCE.getMain().servicePanel,
            ServicePanel::new,
            panel -> MainDAO.Singleton.INSTANCE.getMain().servicePanel = (ServicePanel) panel
        );
    }//GEN-LAST:event_ServiceBtnActionPerformed

    private void newAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAppointmentBtnActionPerformed
        SwitchPanel(
            MainDAO.Singleton.INSTANCE.getMain().newAppointmentPanel,
            NewAppointmentPanel::new,
            panel -> MainDAO.Singleton.INSTANCE.getMain().newAppointmentPanel = (NewAppointmentPanel) panel
        );
    }//GEN-LAST:event_newAppointmentBtnActionPerformed

    private void PrescriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrescriptionBtnActionPerformed
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(new PrescriptionsPanel());
    }//GEN-LAST:event_PrescriptionBtnActionPerformed

    private void AttachmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttachmentsBtnActionPerformed
        SwitchPanel(
            MainDAO.Singleton.INSTANCE.getMain().attachmentsPanel,
            AttachmentsPanel::new,
            panel -> MainDAO.Singleton.INSTANCE.getMain().attachmentsPanel = (AttachmentsPanel) panel
        );
    }//GEN-LAST:event_AttachmentsBtnActionPerformed

    private void ClinicalEvolutionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClinicalEvolutionBtnActionPerformed
        SwitchPanel(
            MainDAO.Singleton.INSTANCE.getMain().clinicalEvolutionPanel,
            ClinicalEvolutionPanel::new,
            panel -> MainDAO.Singleton.INSTANCE.getMain().clinicalEvolutionPanel = (ClinicalEvolutionPanel) panel
        );
    }//GEN-LAST:event_ClinicalEvolutionBtnActionPerformed

    private void PatientInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientInfoBtnActionPerformed
        SwitchPanel(
            MainDAO.Singleton.INSTANCE.getMain().patientInfoPanel,
            PatientInfoPanel::new,
            panel -> MainDAO.Singleton.INSTANCE.getMain().patientInfoPanel = (PatientInfoPanel) panel

        );
    }//GEN-LAST:event_PatientInfoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AttachmentsBtn;
    private javax.swing.JPanel Background;
    private javax.swing.JButton ClinicalEvolutionBtn;
    private javax.swing.JButton MedicalRecordBtn;
    private javax.swing.JButton PatientInfoBtn;
    private javax.swing.JButton PrescriptionBtn;
    private javax.swing.JButton ServiceBtn;
    private javax.swing.JButton newAppointmentBtn;
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
