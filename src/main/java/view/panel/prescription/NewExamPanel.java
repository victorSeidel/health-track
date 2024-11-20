package view.panel.prescription;

import controller.MainDAO;
import controller.PredefinedTextDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import model.PredefinedTextDTO;
import view.PredefinedTextsPanel;

public class NewExamPanel extends javax.swing.JPanel 
{
    public NewExamPanel() 
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
        DescriptionPanel = new javax.swing.JScrollPane();
        DescriptionFld = new javax.swing.JTextPane();
        UpdateHistoryBtn6 = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        AddDescTextBtn = new javax.swing.JButton();
        SetDescTextBtn = new javax.swing.JButton();
        ReasonPanel = new javax.swing.JScrollPane();
        ReasonFld = new javax.swing.JTextPane();
        AllergiesText3 = new javax.swing.JLabel();
        SetReasonTextBtn = new javax.swing.JButton();
        AddReasonTextBtn = new javax.swing.JButton();

        ServicePanel.setBackground(new java.awt.Color(255, 255, 255));

        PersonalInfoText3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PersonalInfoText3.setForeground(new java.awt.Color(0, 0, 102));
        PersonalInfoText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonalInfoText3.setText("NOVO PEDIDO DE EXAME");
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
        AllergiesText2.setText("Descrição");
        AllergiesText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        DescriptionPanel.setBackground(new java.awt.Color(255, 255, 255));
        DescriptionPanel.setBorder(null);
        DescriptionPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        DescriptionFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DescriptionFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        DescriptionFld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DescriptionPanel.setViewportView(DescriptionFld);

        UpdateHistoryBtn6.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn6.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn6.setText("Finalizar e imprimir");
        UpdateHistoryBtn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn6.setBorderPainted(false);
        UpdateHistoryBtn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        CancelBtn.setBackground(new java.awt.Color(204, 0, 0));
        CancelBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        CancelBtn.setText("Cancelar");
        CancelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CancelBtn.setBorderPainted(false);
        CancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        AddDescTextBtn.setBackground(new java.awt.Color(0, 0, 102));
        AddDescTextBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddDescTextBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddDescTextBtn.setText("=");
        AddDescTextBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AddDescTextBtn.setBorderPainted(false);
        AddDescTextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddDescTextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDescTextBtnActionPerformed(evt);
            }
        });

        SetDescTextBtn.setBackground(new java.awt.Color(0, 0, 102));
        SetDescTextBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SetDescTextBtn.setForeground(new java.awt.Color(255, 255, 255));
        SetDescTextBtn.setText("+");
        SetDescTextBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SetDescTextBtn.setBorderPainted(false);
        SetDescTextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetDescTextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDescTextBtnActionPerformed(evt);
            }
        });

        ReasonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ReasonPanel.setBorder(null);
        ReasonPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ReasonFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ReasonFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ReasonFld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ReasonPanel.setViewportView(ReasonFld);

        AllergiesText3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText3.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText3.setText("Motivo");
        AllergiesText3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SetReasonTextBtn.setBackground(new java.awt.Color(0, 0, 102));
        SetReasonTextBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SetReasonTextBtn.setForeground(new java.awt.Color(255, 255, 255));
        SetReasonTextBtn.setText("+");
        SetReasonTextBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SetReasonTextBtn.setBorderPainted(false);
        SetReasonTextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SetReasonTextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetReasonTextBtnActionPerformed(evt);
            }
        });

        AddReasonTextBtn.setBackground(new java.awt.Color(0, 0, 102));
        AddReasonTextBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddReasonTextBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddReasonTextBtn.setText("=");
        AddReasonTextBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AddReasonTextBtn.setBorderPainted(false);
        AddReasonTextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddReasonTextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddReasonTextBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServicePanelLayout = new javax.swing.GroupLayout(ServicePanel);
        ServicePanel.setLayout(ServicePanelLayout);
        ServicePanelLayout.setHorizontalGroup(
            ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicePanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AllergiesText3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReasonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddReasonTextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SetReasonTextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ServicePanelLayout.createSequentialGroup()
                            .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UpdateHistoryBtn6, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ServicePanelLayout.createSequentialGroup()
                            .addComponent(DescriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AddDescTextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SetDescTextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
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
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DescriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addComponent(AddDescTextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SetDescTextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(AllergiesText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ReasonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addComponent(AddReasonTextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SetReasonTextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateHistoryBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ServicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ServicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddDescTextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDescTextBtnActionPerformed
        AddText(DescriptionFld, 11);
    }//GEN-LAST:event_AddDescTextBtnActionPerformed

    private void SetDescTextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetDescTextBtnActionPerformed
        SaveText(11);
    }//GEN-LAST:event_SetDescTextBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        Cancel();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void SetReasonTextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetReasonTextBtnActionPerformed
        SaveText(12);
    }//GEN-LAST:event_SetReasonTextBtnActionPerformed

    private void AddReasonTextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddReasonTextBtnActionPerformed
        AddText(ReasonFld, 12);
    }//GEN-LAST:event_AddReasonTextBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDescTextBtn;
    private javax.swing.JButton AddReasonTextBtn;
    private javax.swing.JLabel AllergiesText2;
    private javax.swing.JLabel AllergiesText3;
    private javax.swing.JLabel BirthDateFld2;
    private javax.swing.JLabel BirthDateText2;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextPane DescriptionFld;
    private javax.swing.JScrollPane DescriptionPanel;
    private javax.swing.JLabel NameFld2;
    private javax.swing.JLabel NameText2;
    private javax.swing.JLabel PersonalInfoText3;
    private javax.swing.JTextPane ReasonFld;
    private javax.swing.JScrollPane ReasonPanel;
    private javax.swing.JPanel ServicePanel;
    private javax.swing.JButton SetDescTextBtn;
    private javax.swing.JButton SetReasonTextBtn;
    private javax.swing.JLabel SocialNameFld2;
    private javax.swing.JLabel SocialNameText2;
    private javax.swing.JButton UpdateHistoryBtn6;
    // End of variables declaration//GEN-END:variables

    private JButton button;
    private JTable table;
    
    private void AddText(JTextPane text, int type)
    {
        PredefinedTextsPanel predefinedTextsPanel = new PredefinedTextsPanel(MainDAO.Singleton.INSTANCE.getMainFrame(), true, type);
        predefinedTextsPanel.SetType(type);
        predefinedTextsPanel.setTitle("Selecione um texto");
        
        button = predefinedTextsPanel.GetButton();
        button.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                table = predefinedTextsPanel.GetTable();
                text.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
                predefinedTextsPanel.dispose();
            }
        });
        
        predefinedTextsPanel.setVisible(true);
    }
    
    private void SaveText(int type)
    {
        String input = JOptionPane.showInputDialog(null, "Digite o nome do texto", "Nome do texto pré-definido", JOptionPane.QUESTION_MESSAGE);
        
        if (input == null) return;

        if (input.equalsIgnoreCase("null") || input.length() <= 0)
        {
            JOptionPane.showMessageDialog(null, "Error: Nenhum nome escolhido.");
            return;
        }
        
        PredefinedTextDTO predefinedText    = new PredefinedTextDTO();
        PredefinedTextDAO predefinedTextDAO = new PredefinedTextDAO();
        
        predefinedText.setName(input);
        predefinedText.setType(type);
        predefinedText.setText(DescriptionFld.getText());
        
        if (!predefinedTextDAO.Insert(predefinedText))
        {
            System.out.println("Error: Não foi possível inserir o texto!");
            return;
        } 
        
        JOptionPane.showMessageDialog(null, "Texto inserido com sucesso!");
    }
    
    private void Cancel()
    {
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(null);
    }
}
