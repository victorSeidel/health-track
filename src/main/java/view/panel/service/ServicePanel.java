package view.panel.service;

import controller.MainDAO;
import view.panel.appointment.NewAppointmentPanel;

public class ServicePanel extends javax.swing.JPanel 
{
    public ServicePanel() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ServicePanel = new javax.swing.JPanel();
        PersonalInfoText3 = new javax.swing.JLabel();
        NameText2 = new javax.swing.JLabel();
        NameFld2 = new javax.swing.JLabel();
        SocialNameText2 = new javax.swing.JLabel();
        SocialNameFld2 = new javax.swing.JLabel();
        BirthDateText2 = new javax.swing.JLabel();
        BirthDateFld2 = new javax.swing.JLabel();
        AllergiesText2 = new javax.swing.JLabel();
        UpdateHistoryBtn3 = new javax.swing.JButton();
        AllergiesText3 = new javax.swing.JLabel();
        ObsPanel15 = new javax.swing.JScrollPane();
        ObsFld15 = new javax.swing.JTextPane();
        ObsPanel16 = new javax.swing.JScrollPane();
        ObsFld16 = new javax.swing.JTextPane();
        AllergiesText4 = new javax.swing.JLabel();
        ObsPanel17 = new javax.swing.JScrollPane();
        ObsFld17 = new javax.swing.JTextPane();
        AllergiesText5 = new javax.swing.JLabel();
        ObsPanel18 = new javax.swing.JScrollPane();
        ObsFld18 = new javax.swing.JTextPane();
        AllergiesText6 = new javax.swing.JLabel();
        ObsPanel19 = new javax.swing.JScrollPane();
        ObsFld19 = new javax.swing.JTextPane();
        UpdateHistoryBtn4 = new javax.swing.JButton();
        UpdateHistoryBtn5 = new javax.swing.JButton();
        NewAppointmentBtn = new javax.swing.JButton();
        ShowPrescriptionsBtn = new javax.swing.JButton();
        UpdateHistoryBtn7 = new javax.swing.JButton();
        FinishServiceBtn = new javax.swing.JButton();
        FinishServiceBtn1 = new javax.swing.JButton();

        ServicePanel.setBackground(new java.awt.Color(255, 255, 255));

        PersonalInfoText3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PersonalInfoText3.setForeground(new java.awt.Color(0, 0, 102));
        PersonalInfoText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonalInfoText3.setText("ATENDIMENTO");
        PersonalInfoText3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NameText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NameText2.setForeground(new java.awt.Color(0, 0, 102));
        NameText2.setText("Número do atendimento");
        NameText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NameFld2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NameFld2.setText("654321");
        NameFld2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SocialNameText2.setForeground(new java.awt.Color(0, 0, 102));
        SocialNameText2.setText("Código do paciente");
        SocialNameText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameFld2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        SocialNameFld2.setText("002170");
        SocialNameFld2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BirthDateText2.setForeground(new java.awt.Color(0, 0, 102));
        BirthDateText2.setText("Nome do paciente");
        BirthDateText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateFld2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BirthDateFld2.setText("VICTOR GABRIEL MARTINS SEIDEL");
        BirthDateFld2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AllergiesText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText2.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText2.setText("Sintomas");
        AllergiesText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        UpdateHistoryBtn3.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn3.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn3.setText("Novo pedido de exame");
        UpdateHistoryBtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn3.setBorderPainted(false);
        UpdateHistoryBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        AllergiesText3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText3.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText3.setText("Diagnóstico inicial");
        AllergiesText3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsPanel15.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel15.setBorder(null);
        ObsPanel15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ObsFld15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObsFld15.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel15.setViewportView(ObsFld15);

        ObsPanel16.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel16.setBorder(null);
        ObsPanel16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ObsFld16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObsFld16.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel16.setViewportView(ObsFld16);

        AllergiesText4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText4.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText4.setText("Procedimento");
        AllergiesText4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsPanel17.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel17.setBorder(null);
        ObsPanel17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ObsFld17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObsFld17.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel17.setViewportView(ObsFld17);

        AllergiesText5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText5.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText5.setText("Tratamento");
        AllergiesText5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsPanel18.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel18.setBorder(null);
        ObsPanel18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ObsFld18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObsFld18.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel18.setViewportView(ObsFld18);

        AllergiesText6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText6.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText6.setText("Informações adicionais");
        AllergiesText6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsPanel19.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel19.setBorder(null);
        ObsPanel19.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ObsFld19.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObsFld19.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel19.setViewportView(ObsFld19);

        UpdateHistoryBtn4.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn4.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn4.setText("Nova receita");
        UpdateHistoryBtn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn4.setBorderPainted(false);
        UpdateHistoryBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        UpdateHistoryBtn5.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn5.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn5.setText("Novo encaminhamento");
        UpdateHistoryBtn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn5.setBorderPainted(false);
        UpdateHistoryBtn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        ShowPrescriptionsBtn.setBackground(new java.awt.Color(0, 0, 102));
        ShowPrescriptionsBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ShowPrescriptionsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ShowPrescriptionsBtn.setText("Visualizar prescrições");
        ShowPrescriptionsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ShowPrescriptionsBtn.setBorderPainted(false);
        ShowPrescriptionsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowPrescriptionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPrescriptionsBtnActionPerformed(evt);
            }
        });

        UpdateHistoryBtn7.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn7.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn7.setText("Novo atestado");
        UpdateHistoryBtn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn7.setBorderPainted(false);
        UpdateHistoryBtn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        FinishServiceBtn.setBackground(new java.awt.Color(0, 0, 102));
        FinishServiceBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        FinishServiceBtn.setForeground(new java.awt.Color(255, 255, 255));
        FinishServiceBtn.setText("Salvar e finalizar");
        FinishServiceBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FinishServiceBtn.setBorderPainted(false);
        FinishServiceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FinishServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishServiceBtnActionPerformed(evt);
            }
        });

        FinishServiceBtn1.setBackground(new java.awt.Color(204, 0, 0));
        FinishServiceBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        FinishServiceBtn1.setForeground(new java.awt.Color(255, 255, 255));
        FinishServiceBtn1.setText("Cancelar");
        FinishServiceBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FinishServiceBtn1.setBorderPainted(false);
        FinishServiceBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FinishServiceBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishServiceBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServicePanelLayout = new javax.swing.GroupLayout(ServicePanel);
        ServicePanel.setLayout(ServicePanelLayout);
        ServicePanelLayout.setHorizontalGroup(
            ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AllergiesText6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AllergiesText5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AllergiesText4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AllergiesText3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PersonalInfoText3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ServicePanelLayout.createSequentialGroup()
                            .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NameText2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(NameFld2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SocialNameText2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(SocialNameFld2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BirthDateText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BirthDateFld2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                        .addComponent(AllergiesText2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ObsPanel15)
                        .addComponent(ObsPanel16)
                        .addComponent(ObsPanel17)
                        .addComponent(ObsPanel18)
                        .addComponent(ObsPanel19))
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(FinishServiceBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FinishServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addComponent(ShowPrescriptionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateHistoryBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addComponent(UpdateHistoryBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UpdateHistoryBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateHistoryBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        ServicePanelLayout.setVerticalGroup(
            ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(PersonalInfoText3)
                .addGap(18, 18, 18)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameText2)
                    .addComponent(SocialNameText2)
                    .addComponent(BirthDateText2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameFld2)
                    .addComponent(SocialNameFld2)
                    .addComponent(BirthDateFld2))
                .addGap(18, 18, 18)
                .addComponent(AllergiesText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AllergiesText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AllergiesText4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AllergiesText5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AllergiesText6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowPrescriptionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateHistoryBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateHistoryBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateHistoryBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewAppointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateHistoryBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FinishServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FinishServiceBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1054, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ServicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ServicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NewAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAppointmentBtnActionPerformed
        NewAppointmentPanel newAppointmentPanel = new NewAppointmentPanel();   
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newAppointmentPanel);
    }//GEN-LAST:event_NewAppointmentBtnActionPerformed

    private void ShowPrescriptionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPrescriptionsBtnActionPerformed
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(MainDAO.Singleton.INSTANCE.getMain().prescriptionsPanel);
    }//GEN-LAST:event_ShowPrescriptionsBtnActionPerformed

    private void FinishServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishServiceBtnActionPerformed
        FinishServicePanel finishServicePanel = new FinishServicePanel();
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(finishServicePanel);
    }//GEN-LAST:event_FinishServiceBtnActionPerformed

    private void FinishServiceBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishServiceBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FinishServiceBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllergiesText2;
    private javax.swing.JLabel AllergiesText3;
    private javax.swing.JLabel AllergiesText4;
    private javax.swing.JLabel AllergiesText5;
    private javax.swing.JLabel AllergiesText6;
    private javax.swing.JLabel BirthDateFld2;
    private javax.swing.JLabel BirthDateText2;
    private javax.swing.JButton FinishServiceBtn;
    private javax.swing.JButton FinishServiceBtn1;
    private javax.swing.JLabel NameFld2;
    private javax.swing.JLabel NameText2;
    private javax.swing.JButton NewAppointmentBtn;
    private javax.swing.JTextPane ObsFld15;
    private javax.swing.JTextPane ObsFld16;
    private javax.swing.JTextPane ObsFld17;
    private javax.swing.JTextPane ObsFld18;
    private javax.swing.JTextPane ObsFld19;
    private javax.swing.JScrollPane ObsPanel15;
    private javax.swing.JScrollPane ObsPanel16;
    private javax.swing.JScrollPane ObsPanel17;
    private javax.swing.JScrollPane ObsPanel18;
    private javax.swing.JScrollPane ObsPanel19;
    private javax.swing.JLabel PersonalInfoText3;
    private javax.swing.JPanel ServicePanel;
    private javax.swing.JButton ShowPrescriptionsBtn;
    private javax.swing.JLabel SocialNameFld2;
    private javax.swing.JLabel SocialNameText2;
    private javax.swing.JButton UpdateHistoryBtn3;
    private javax.swing.JButton UpdateHistoryBtn4;
    private javax.swing.JButton UpdateHistoryBtn5;
    private javax.swing.JButton UpdateHistoryBtn7;
    // End of variables declaration//GEN-END:variables
}
