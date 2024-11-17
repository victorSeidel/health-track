package view;

import controller.HomeDAO;
import controller.MainDAO;
import controller.SettingsDAO;
import java.io.IOException;
import javax.swing.JPanel;
import view.panel.ClinicalEvolutionPanel;
import view.panel.patient.MedicalRecordPanel;
import view.panel.appointment.NewAppointmentPanel;
import view.panel.patient.PatientInfoPanel;
import view.panel.PrescriptionsPanel;
import view.panel.service.ServicePanel;
import view.panel.appointment.ShowAppointmentsPanel;
import view.panel.patient.RegisterNewMedicalRecordPanel;
import view.panel.patient.RegisterNewPatientPanel;
import view.panel.patient.SearchPatientPanel;

public class view_Main extends javax.swing.JFrame 
{
    public view_Main() 
    {
        initComponents();
        
        MainDAO.Singleton.INSTANCE.setMain(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        NavBarPanel = new javax.swing.JPanel();
        SoftwareNameText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SideBarBtn = new javax.swing.JButton();
        SideBarPanel = new javax.swing.JPanel();
        SearchPatientBtn = new javax.swing.JButton();
        RegisterNewPatientBtn = new javax.swing.JButton();
        SearchMedicalRecordBtn = new javax.swing.JButton();
        NewMedicalRecordBtn = new javax.swing.JButton();
        ServiceListBtn = new javax.swing.JButton();
        ShowScheduleBtn = new javax.swing.JButton();
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

        SideBarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SideBarBtnActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 887, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NavBarPanelLayout.setVerticalGroup(
            NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavBarPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SoftwareNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SideBarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        SideBarPanel.setBackground(new java.awt.Color(204, 204, 204));
        SideBarPanel.setPreferredSize(new java.awt.Dimension(250, 650));
        SideBarPanel.setRequestFocusEnabled(false);

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

        javax.swing.GroupLayout SideBarPanelLayout = new javax.swing.GroupLayout(SideBarPanel);
        SideBarPanel.setLayout(SideBarPanelLayout);
        SideBarPanelLayout.setHorizontalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchMedicalRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(ServiceListBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(ShowScheduleBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(NewAppointmentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(RegisterNewPatientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(NewMedicalRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(SearchPatientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        SideBarPanelLayout.setVerticalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
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
                .addContainerGap(265, Short.MAX_VALUE))
        );

        ScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(SideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addComponent(NavBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1310, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addComponent(NavBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
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

    private void SearchMedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMedicalRecordBtnActionPerformed
        SearchPatientPanel newSearchPatientPanel = new SearchPatientPanel();
        newSearchPatientPanel.setType('M');
        newSearchPatientPanel.setTitle("BUSCAR PRONTUÁRIO");
        SetScrollPanel(newSearchPatientPanel);
    }//GEN-LAST:event_SearchMedicalRecordBtnActionPerformed

    private void ServiceListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceListBtnActionPerformed
        view_Home viewHome = new view_Home();
        viewHome.setVisible(true);
        dispose();
    }//GEN-LAST:event_ServiceListBtnActionPerformed

    private void ShowScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowScheduleBtnActionPerformed
        
    }//GEN-LAST:event_ShowScheduleBtnActionPerformed

    private void NewAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppointmentBtnActionPerformed
        if (SettingsDAO.Singleton.INSTANCE.isStartNewPanel())
        {
            NewAppointmentPanel newNewAppointmentPanel = new NewAppointmentPanel();
            SetScrollPanel(newNewAppointmentPanel);
        }
        else SetScrollPanel(newAppointmentPanel);
    }//GEN-LAST:event_NewAppointmentBtnActionPerformed

    private void RegisterNewPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterNewPatientBtnActionPerformed
        if (SettingsDAO.Singleton.INSTANCE.isStartNewPanel()) 
        {
            RegisterNewPatientPanel newRegisterNewPatientPanel = new RegisterNewPatientPanel();
            SetScrollPanel(newRegisterNewPatientPanel);
        }
        else SetScrollPanel(registerNewPatientPanel);
    }//GEN-LAST:event_RegisterNewPatientBtnActionPerformed

    private void NewMedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMedicalRecordBtnActionPerformed
        SearchPatientPanel newSearchPatientPanel = new SearchPatientPanel();
        newSearchPatientPanel.setType('R');
        newSearchPatientPanel.setTitle("NOVO PRONTUÁRIO");
        SetScrollPanel(newSearchPatientPanel);
    }//GEN-LAST:event_NewMedicalRecordBtnActionPerformed

    private void SearchPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPatientBtnActionPerformed
        SearchPatientPanel newSearchPatientPanel = new SearchPatientPanel();
        newSearchPatientPanel.setType('P');
        newSearchPatientPanel.setTitle("BUSCAR PACIENTE");
        SetScrollPanel(newSearchPatientPanel);
    }//GEN-LAST:event_SearchPatientBtnActionPerformed

    private void SideBarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SideBarBtnActionPerformed
        SideBarPanel.setVisible(!SideBarPanel.isVisible());
    }//GEN-LAST:event_SideBarBtnActionPerformed

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
    private javax.swing.JPanel NavBarPanel;
    private javax.swing.JButton NewAppointmentBtn;
    private javax.swing.JButton NewMedicalRecordBtn;
    private javax.swing.JButton RegisterNewPatientBtn;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JButton SearchMedicalRecordBtn;
    private javax.swing.JButton SearchPatientBtn;
    private javax.swing.JButton ServiceListBtn;
    private javax.swing.JButton ShowScheduleBtn;
    private javax.swing.JButton SideBarBtn;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JLabel SoftwareNameText;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
    
    public SearchPatientPanel searchPatientPanel                         = new SearchPatientPanel();
    public RegisterNewPatientPanel registerNewPatientPanel               = new RegisterNewPatientPanel();
    public RegisterNewMedicalRecordPanel registerNewMedicalRecordPanel   = new RegisterNewMedicalRecordPanel();   
    public NewAppointmentPanel newAppointmentPanel                       = new NewAppointmentPanel();

    public void SetScrollPanel(JPanel newPanel)
    {
        ScrollPanel.setViewportView(newPanel);
    }
}
