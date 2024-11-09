package view;

import controller.HomeDAO;
import javax.swing.JPanel;
import view.panel.MedicalRecordPanel;
import view.panel.NewAppointmentPanel;
import view.panel.PatientInfoPanel;
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
        ShowAppointmentsBtn = new javax.swing.JButton();
        ServiceBtn = new javax.swing.JButton();
        NewAppointmentBtn = new javax.swing.JButton();
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

        ShowAppointmentsBtn.setBackground(new java.awt.Color(0, 0, 102));
        ShowAppointmentsBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ShowAppointmentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ShowAppointmentsBtn.setText("Visualizar Consultas");
        ShowAppointmentsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ShowAppointmentsBtn.setBorderPainted(false);
        ShowAppointmentsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowAppointmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAppointmentsBtnActionPerformed(evt);
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

        NewAppointmentBtn.setBackground(new java.awt.Color(0, 0, 102));
        NewAppointmentBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NewAppointmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewAppointmentBtn.setText("Agendar Consultas");
        NewAppointmentBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewAppointmentBtn.setBorderPainted(false);
        NewAppointmentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAppointmentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideBarPanelLayout = new javax.swing.GroupLayout(SideBarPanel);
        SideBarPanel.setLayout(SideBarPanelLayout);
        SideBarPanelLayout.setHorizontalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(MedicalRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(ShowAppointmentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(ServiceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(NewAppointmentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
        );
        SideBarPanelLayout.setVerticalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PatientInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                .addComponent(NewAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowAppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addContainerGap())
            .addComponent(NavBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1286, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addComponent(NavBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPanel)
                        .addContainerGap())))
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

    private void ShowAppointmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAppointmentsBtnActionPerformed
        SetScrollPanel(showAppointmentsPanel);
    }//GEN-LAST:event_ShowAppointmentsBtnActionPerformed

    private void ServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceBtnActionPerformed
        SetScrollPanel(servicePanel);
    }//GEN-LAST:event_ServiceBtnActionPerformed

    private void NewAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppointmentBtnActionPerformed
        SetScrollPanel(newAppointmentPanel);
    }//GEN-LAST:event_NewAppointmentBtnActionPerformed

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
    private javax.swing.JButton MedicalRecordBtn;
    private javax.swing.JPanel NavBarPanel;
    private javax.swing.JButton NewAppointmentBtn;
    private javax.swing.JButton PatientInfoBtn;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JButton ServiceBtn;
    private javax.swing.JButton ShowAppointmentsBtn;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JLabel SoftwareNameText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
    
    PatientInfoPanel patientInfoPanel           = new PatientInfoPanel();
    MedicalRecordPanel medicalRecordPanel       = new MedicalRecordPanel();
    NewAppointmentPanel newAppointmentPanel     = new NewAppointmentPanel();
    ShowAppointmentsPanel showAppointmentsPanel = new ShowAppointmentsPanel();
    ServicePanel servicePanel                   = new ServicePanel();

    public void SetScrollPanel(JPanel newPanel)
    {
        ScrollPanel.setViewportView(newPanel);
    }
}
