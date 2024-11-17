package view.panel.patient;

import controller.MainDAO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class SearchPatientPanel extends javax.swing.JPanel 
{
    public SearchPatientPanel() 
    {
        initComponents();
        
        JTableHeader tableHeader = PatientsTable.getTableHeader();
        
        TableColumnModel columnModel = PatientsTable.getColumnModel();
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) PatientsTable.getTableHeader().getDefaultRenderer();
        
        tableHeader.setBackground(Color.red);
        tableHeader.setBackground(Color.red);
        tableHeader.setForeground(Color.black);
        tableHeader.setFont(new Font("Arial", Font.BOLD, 16));

        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        columnModel.getColumn(1).setCellRenderer(centerRenderer);
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        TitleText = new javax.swing.JLabel();
        SocialNameText3 = new javax.swing.JLabel();
        SocialNameText4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        TableScrollPanel = new javax.swing.JScrollPane();
        PatientsTable = new javax.swing.JTable();
        CancelBtn = new javax.swing.JButton();
        SelectBtn = new javax.swing.JButton();

        Background.setBackground(new java.awt.Color(255, 255, 255));

        TitleText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TitleText.setForeground(new java.awt.Color(0, 0, 102));
        TitleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleText.setText("BUSCAR PACIENTE");
        TitleText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameText3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SocialNameText3.setForeground(new java.awt.Color(0, 0, 102));
        SocialNameText3.setText("Filtro");
        SocialNameText3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameText4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SocialNameText4.setForeground(new java.awt.Color(0, 0, 102));
        SocialNameText4.setText("Tipo de filtro");
        SocialNameText4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nome", "Código", "Data de nascimento", "Nome da mãe", "CPF" }));
        jComboBox1.setBorder(null);
        jComboBox1.setLightWeightPopupEnabled(false);

        PatientsTable.setBackground(new java.awt.Color(204, 204, 204));
        PatientsTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nascimento", "Mãe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PatientsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PatientsTable.setGridColor(new java.awt.Color(0, 0, 0));
        PatientsTable.setOpaque(false);
        PatientsTable.setRowHeight(25);
        PatientsTable.setSelectionBackground(new java.awt.Color(180, 175, 207));
        PatientsTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        PatientsTable.setShowGrid(true);
        TableScrollPanel.setViewportView(PatientsTable);
        if (PatientsTable.getColumnModel().getColumnCount() > 0) {
            PatientsTable.getColumnModel().getColumn(1).setMinWidth(110);
            PatientsTable.getColumnModel().getColumn(1).setPreferredWidth(110);
            PatientsTable.getColumnModel().getColumn(1).setMaxWidth(110);
        }

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

        SelectBtn.setBackground(new java.awt.Color(0, 0, 102));
        SelectBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SelectBtn.setForeground(new java.awt.Color(255, 255, 255));
        SelectBtn.setText("Selecionar");
        SelectBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SelectBtn.setBorderPainted(false);
        SelectBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SelectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TableScrollPanel)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(SelectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(TitleText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(SocialNameText3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(249, 249, 249))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SocialNameText4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, 300, Short.MAX_VALUE))))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(TitleText)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SocialNameText3)
                    .addComponent(SocialNameText4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SelectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBtnActionPerformed
        if (type == 'P')
        {
            MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(new PatientInfoPanel());
            return;
        }
                
        if (type == 'M')
        {
            MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(new MedicalRecordPanel());
            return;
        }
        
        if (type == 'R')
        {
            MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(new RegisterNewMedicalRecordPanel());
        }
    }//GEN-LAST:event_SelectBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(null);
    }//GEN-LAST:event_CancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTable PatientsTable;
    private javax.swing.JButton SelectBtn;
    private javax.swing.JLabel SocialNameText3;
    private javax.swing.JLabel SocialNameText4;
    private javax.swing.JScrollPane TableScrollPanel;
    private javax.swing.JLabel TitleText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private char type;
    
    public void setType(char type)
    {
        this.type = type;
    }
    
    public void setTitle(String title)
    {
        TitleText.setText(title);
    }
}
