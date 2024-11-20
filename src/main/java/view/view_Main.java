package view;

import controller.MainDAO;
import controller.SettingsDAO;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.panel.ClinicalEvolutionPanel;
import view.panel.patient.MedicalRecordPanel;
import view.panel.appointment.NewAppointmentPanel;
import view.panel.patient.PatientInfoPanel;
import view.panel.prescription.PrescriptionsPanel;
import view.panel.service.ServicePanel;
import view.panel.appointment.ShowAppointmentsPanel;
import view.panel.attachment.AttachmentsPanel;
import view.panel.patient.RegisterNewMedicalRecordPanel;
import view.panel.patient.RegisterNewPatientPanel;
import view.panel.patient.SearchPatientPanel;
import view.panel.service.ServicesListPanel;

public class view_Main extends javax.swing.JFrame 
{
    public view_Main() 
    {
        initComponents();
        
        MainDAO.Singleton.INSTANCE.setMain(this);
        MainDAO.Singleton.INSTANCE.setMainFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        NavBarPanel = new javax.swing.JPanel();
        SoftwareNameText = new javax.swing.JLabel();
        SideBarBtn = new javax.swing.JButton();
        ConfigBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        SideBarPanel = new javax.swing.JPanel();
        SideBarScrollPanel = new javax.swing.JScrollPane();
        ScrollPanel = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Health Track");
        setResizable(false);

        Background.setBackground(new java.awt.Color(204, 204, 204));

        NavBarPanel.setBackground(new java.awt.Color(0, 0, 102));
        NavBarPanel.setPreferredSize(new java.awt.Dimension(470, 50));

        SoftwareNameText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SoftwareNameText.setForeground(new java.awt.Color(255, 255, 255));
        SoftwareNameText.setText("Health Track");
        SoftwareNameText.setPreferredSize(new java.awt.Dimension(300, 22));

        SideBarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SideBarBtnActionPerformed(evt);
            }
        });

        ConfigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfigBtnActionPerformed(evt);
            }
        });

        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavBarPanelLayout = new javax.swing.GroupLayout(NavBarPanel);
        NavBarPanel.setLayout(NavBarPanelLayout);
        NavBarPanelLayout.setHorizontalGroup(
            NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SideBarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SoftwareNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConfigBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NavBarPanelLayout.setVerticalGroup(
            NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavBarPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConfigBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SoftwareNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SideBarBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        SideBarPanel.setBackground(new java.awt.Color(204, 204, 204));
        SideBarPanel.setPreferredSize(new java.awt.Dimension(250, 650));
        SideBarPanel.setRequestFocusEnabled(false);

        SideBarScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SideBarScrollPanel.setToolTipText("");
        SideBarScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout SideBarPanelLayout = new javax.swing.GroupLayout(SideBarPanel);
        SideBarPanel.setLayout(SideBarPanelLayout);
        SideBarPanelLayout.setHorizontalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(SideBarScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
        );
        SideBarPanelLayout.setVerticalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(SideBarScrollPanel)
                .addGap(13, 13, 13))
        );

        ScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(SideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(NavBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1310, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addComponent(NavBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                        .addGap(13, 13, 13))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Tela Inicial");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SideBarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SideBarBtnActionPerformed
        SideBarPanel.setVisible(!SideBarPanel.isVisible());
    }//GEN-LAST:event_SideBarBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        view_Login viewLogin = new view_Login();
        viewLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void ConfigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfigBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfigBtnActionPerformed

    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(view_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new view_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton ConfigBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JPanel NavBarPanel;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JButton SideBarBtn;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JScrollPane SideBarScrollPanel;
    private javax.swing.JLabel SoftwareNameText;
    // End of variables declaration//GEN-END:variables
    
    public SearchPatientPanel searchPatientPanel                         = new SearchPatientPanel();
    public RegisterNewPatientPanel registerNewPatientPanel               = new RegisterNewPatientPanel();
    public RegisterNewMedicalRecordPanel registerNewMedicalRecordPanel   = new RegisterNewMedicalRecordPanel();   
    public ServicesListPanel servicesListPanel                           = new ServicesListPanel();
    public NewAppointmentPanel newAppointmentPanel                       = new NewAppointmentPanel();
    
    public PatientInfoPanel patientInfoPanel             = new PatientInfoPanel();
    public MedicalRecordPanel medicalRecordPanel         = new MedicalRecordPanel();
    public ShowAppointmentsPanel showAppointmentsPanel   = new ShowAppointmentsPanel();
    public ServicePanel servicePanel                     = new ServicePanel();
    public PrescriptionsPanel prescriptionsPanel         = new PrescriptionsPanel();
    public AttachmentsPanel attachmentsPanel             = new AttachmentsPanel();
    public ClinicalEvolutionPanel clinicalEvolutionPanel = new ClinicalEvolutionPanel();

    public void SetScrollPanel(JPanel newPanel)
    {
        ScrollPanel.setViewportView(newPanel);
    }
    
    public void SetSideBarPanel(JPanel newPanel)
    {
        SideBarScrollPanel.setViewportView(newPanel);
    }
}
