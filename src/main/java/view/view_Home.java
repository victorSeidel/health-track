package view;

import controller.HomeDAO;
import javax.swing.JPanel;
import view.panel.ClinicalEvolutionPanel;
import view.panel.MedicalRecordPanel;
import view.panel.NewAppointmentPanel;
import view.panel.PatientInfoPanel;
import view.panel.PrescriptionsPanel;
import view.panel.ServicePanel;
import view.panel.ShowAppointmentsPanel;

public class view_Home extends javax.swing.JFrame 
{
    public view_Home() 
    {
        initComponents();
        
        HomeDAO.Singleton.INSTANCE.setHome(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        NavBarPanel = new javax.swing.JPanel();
        SoftwareNameText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SideBarPanel = new javax.swing.JPanel();
        PatientInfoBtn = new javax.swing.JButton();
        MedicalRecordBtn = new javax.swing.JButton();
        ServiceBtn = new javax.swing.JButton();
        PrescriptionBtn = new javax.swing.JButton();
        ClinicalEvolutionBtn = new javax.swing.JButton();
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

        javax.swing.GroupLayout NavBarPanelLayout = new javax.swing.GroupLayout(NavBarPanel);
        NavBarPanel.setLayout(NavBarPanelLayout);
        NavBarPanelLayout.setHorizontalGroup(
            NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoftwareNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 874, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NavBarPanelLayout.setVerticalGroup(
            NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SoftwareNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        SideBarPanel.setBackground(new java.awt.Color(204, 204, 204));
        SideBarPanel.setPreferredSize(new java.awt.Dimension(250, 650));
        SideBarPanel.setRequestFocusEnabled(false);

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

        javax.swing.GroupLayout SideBarPanelLayout = new javax.swing.GroupLayout(SideBarPanel);
        SideBarPanel.setLayout(SideBarPanelLayout);
        SideBarPanelLayout.setHorizontalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(MedicalRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(ServiceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(PrescriptionBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(ClinicalEvolutionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        SideBarPanelLayout.setVerticalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(PatientInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrescriptionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClinicalEvolutionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
        );

        ScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(SideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ScrollPanel)
                .addGap(13, 13, 13))
            .addComponent(NavBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1286, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addComponent(NavBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(ScrollPanel)
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

    private void PatientInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientInfoBtnActionPerformed
        SetScrollPanel(patientInfoPanel);
    }//GEN-LAST:event_PatientInfoBtnActionPerformed

    private void MedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalRecordBtnActionPerformed
        SetScrollPanel(medicalRecordPanel);
    }//GEN-LAST:event_MedicalRecordBtnActionPerformed

    private void ServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceBtnActionPerformed
        SetScrollPanel(servicePanel);
    }//GEN-LAST:event_ServiceBtnActionPerformed

    private void PrescriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrescriptionBtnActionPerformed
        SetScrollPanel(prescriptionsPanel);
    }//GEN-LAST:event_PrescriptionBtnActionPerformed

    private void ClinicalEvolutionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClinicalEvolutionBtnActionPerformed
        SetScrollPanel(clinicalEvolutionPanel);
    }//GEN-LAST:event_ClinicalEvolutionBtnActionPerformed

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
            java.util.logging.Logger.getLogger(view_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new view_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton ClinicalEvolutionBtn;
    private javax.swing.JButton MedicalRecordBtn;
    private javax.swing.JPanel NavBarPanel;
    private javax.swing.JButton PatientInfoBtn;
    private javax.swing.JButton PrescriptionBtn;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JButton ServiceBtn;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JLabel SoftwareNameText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
    
    public PatientInfoPanel patientInfoPanel             = new PatientInfoPanel();
    public MedicalRecordPanel medicalRecordPanel         = new MedicalRecordPanel();
    public NewAppointmentPanel newAppointmentPanel       = new NewAppointmentPanel();
    public ShowAppointmentsPanel showAppointmentsPanel   = new ShowAppointmentsPanel();
    public ServicePanel servicePanel                     = new ServicePanel();
    public PrescriptionsPanel prescriptionsPanel         = new PrescriptionsPanel();
    public ClinicalEvolutionPanel clinicalEvolutionPanel = new ClinicalEvolutionPanel();

    public void SetScrollPanel(JPanel newPanel)
    {
        ScrollPanel.setViewportView(newPanel);
    }
}
