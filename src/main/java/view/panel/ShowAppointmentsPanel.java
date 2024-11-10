package view.panel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class ShowAppointmentsPanel extends javax.swing.JPanel 
{
    public ShowAppointmentsPanel() 
    {
        initComponents();
        
        JTableHeader tableHeader = AppointmentsTable.getTableHeader();
        TableColumnModel columnModel = AppointmentsTable.getColumnModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) AppointmentsTable.getTableHeader().getDefaultRenderer();
        
        tableHeader.setBackground(Color.red);
        tableHeader.setBackground(Color.red);
        tableHeader.setForeground(Color.black);
        tableHeader.setFont(new Font("Arial", Font.BOLD, 16));
        
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 3; i++) columnModel.getColumn(i).setCellRenderer(centerRenderer);
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowAppointmentsPanel = new javax.swing.JPanel();
        AppointmentsText = new javax.swing.JLabel();
        PatientIdText2 = new javax.swing.JLabel();
        PatientIdFld2 = new javax.swing.JLabel();
        PatientNameText = new javax.swing.JLabel();
        PatientNameFld = new javax.swing.JLabel();
        TableScrollPanel = new javax.swing.JScrollPane();
        AppointmentsTable = new javax.swing.JTable();
        MoreBtn = new javax.swing.JButton();
        FinishServiceBtn = new javax.swing.JButton();

        ShowAppointmentsPanel.setBackground(new java.awt.Color(255, 255, 255));

        AppointmentsText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AppointmentsText.setForeground(new java.awt.Color(0, 0, 102));
        AppointmentsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppointmentsText.setText("CONSULTAS");
        AppointmentsText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientIdText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PatientIdText2.setForeground(new java.awt.Color(0, 0, 102));
        PatientIdText2.setText("Código do paciente");
        PatientIdText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientIdFld2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientIdFld2.setText("000000");
        PatientIdFld2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PatientNameText.setForeground(new java.awt.Color(0, 0, 102));
        PatientNameText.setText("Nome do paciente");
        PatientNameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientNameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientNameFld.setText("VICTOR GABRIEL MARTINS SEIDEL");
        PatientNameFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AppointmentsTable.setBackground(new java.awt.Color(204, 204, 204));
        AppointmentsTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        AppointmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"002040", "1 consulta", "07/11/2024 12:40", "Cancelada"},
                {"002087", "1 consulta", "08/11/2024 12:40", "Finalizada"},
                {"002132", "Retorno", "08/12/2024 13:20", "Agendada"},
                {"002170", "Extração", "24/11/2024 13:45", "Agendada"}
            },
            new String [] {
                "Código", "Tipo", "Data", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AppointmentsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AppointmentsTable.setGridColor(new java.awt.Color(0, 0, 0));
        AppointmentsTable.setOpaque(false);
        AppointmentsTable.setRowHeight(25);
        AppointmentsTable.setSelectionBackground(new java.awt.Color(180, 175, 207));
        AppointmentsTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        AppointmentsTable.setShowGrid(true);
        TableScrollPanel.setViewportView(AppointmentsTable);
        if (AppointmentsTable.getColumnModel().getColumnCount() > 0) {
            AppointmentsTable.getColumnModel().getColumn(0).setMinWidth(100);
            AppointmentsTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            AppointmentsTable.getColumnModel().getColumn(0).setMaxWidth(100);
            AppointmentsTable.getColumnModel().getColumn(2).setMinWidth(150);
            AppointmentsTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            AppointmentsTable.getColumnModel().getColumn(2).setMaxWidth(150);
            AppointmentsTable.getColumnModel().getColumn(3).setMinWidth(100);
            AppointmentsTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            AppointmentsTable.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        MoreBtn.setBackground(new java.awt.Color(0, 0, 102));
        MoreBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MoreBtn.setForeground(new java.awt.Color(255, 255, 255));
        MoreBtn.setText("Ver mais");
        MoreBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MoreBtn.setBorderPainted(false);
        MoreBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        FinishServiceBtn.setBackground(new java.awt.Color(0, 0, 102));
        FinishServiceBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        FinishServiceBtn.setForeground(new java.awt.Color(255, 255, 255));
        FinishServiceBtn.setText("Finalizar atendimento");
        FinishServiceBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FinishServiceBtn.setBorderPainted(false);
        FinishServiceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FinishServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishServiceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShowAppointmentsPanelLayout = new javax.swing.GroupLayout(ShowAppointmentsPanel);
        ShowAppointmentsPanel.setLayout(ShowAppointmentsPanelLayout);
        ShowAppointmentsPanelLayout.setHorizontalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AppointmentsText, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
                        .addComponent(TableScrollPanel))
                    .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                        .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PatientIdText2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(PatientIdFld2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PatientNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PatientNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FinishServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        ShowAppointmentsPanelLayout.setVerticalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(AppointmentsText)
                .addGap(18, 18, 18)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                        .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientIdText2)
                            .addComponent(PatientNameText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientIdFld2)
                            .addComponent(PatientNameFld)))
                    .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FinishServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ShowAppointmentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ShowAppointmentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FinishServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishServiceBtnActionPerformed
        
    }//GEN-LAST:event_FinishServiceBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentsTable;
    private javax.swing.JLabel AppointmentsText;
    private javax.swing.JButton FinishServiceBtn;
    private javax.swing.JButton MoreBtn;
    private javax.swing.JLabel PatientIdFld2;
    private javax.swing.JLabel PatientIdText2;
    private javax.swing.JLabel PatientNameFld;
    private javax.swing.JLabel PatientNameText;
    private javax.swing.JPanel ShowAppointmentsPanel;
    private javax.swing.JScrollPane TableScrollPanel;
    // End of variables declaration//GEN-END:variables
}
