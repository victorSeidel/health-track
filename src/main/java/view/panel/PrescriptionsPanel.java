package view.panel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class PrescriptionsPanel extends javax.swing.JPanel 
{
    public PrescriptionsPanel() 
    {
        initComponents();
        
        JTableHeader tableHeader[] = {ExamsTable.getTableHeader(), RecipesTable.getTableHeader(), ReferralsTable.getTableHeader(), CertificatesTable.getTableHeader()};
        
        TableColumnModel columnModel[] = {ExamsTable.getColumnModel(), RecipesTable.getColumnModel(), ReferralsTable.getColumnModel(), CertificatesTable.getColumnModel()};
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer headerRenderer[] = {
            (DefaultTableCellRenderer) ExamsTable.getTableHeader().getDefaultRenderer(), (DefaultTableCellRenderer) RecipesTable.getTableHeader().getDefaultRenderer(),
            (DefaultTableCellRenderer) ReferralsTable.getTableHeader().getDefaultRenderer(), (DefaultTableCellRenderer) CertificatesTable.getTableHeader().getDefaultRenderer()};
        
        for (int i = 0; i < 4; i++)
        {
           tableHeader[i].setBackground(Color.red);
           tableHeader[i].setBackground(Color.red);
           tableHeader[i].setForeground(Color.black);
           tableHeader[i].setFont(new Font("Arial", Font.BOLD, 16));

           centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
           columnModel[i].getColumn(1).setCellRenderer(centerRenderer);
           headerRenderer[i].setHorizontalAlignment(SwingConstants.CENTER);   
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowAppointmentsPanel = new javax.swing.JPanel();
        AppointmentsText = new javax.swing.JLabel();
        PatientIdText2 = new javax.swing.JLabel();
        PatientIdFld2 = new javax.swing.JLabel();
        TableScrollPanel = new javax.swing.JScrollPane();
        ExamsTable = new javax.swing.JTable();
        PatientIdFld3 = new javax.swing.JLabel();
        PatientIdText3 = new javax.swing.JLabel();
        AppointmentsText2 = new javax.swing.JLabel();
        UpdateHistoryBtn3 = new javax.swing.JButton();
        AppointmentsText1 = new javax.swing.JLabel();
        TableScrollPanel1 = new javax.swing.JScrollPane();
        RecipesTable = new javax.swing.JTable();
        UpdateHistoryBtn4 = new javax.swing.JButton();
        AppointmentsText3 = new javax.swing.JLabel();
        TableScrollPanel2 = new javax.swing.JScrollPane();
        ReferralsTable = new javax.swing.JTable();
        UpdateHistoryBtn5 = new javax.swing.JButton();
        AppointmentsText4 = new javax.swing.JLabel();
        TableScrollPanel3 = new javax.swing.JScrollPane();
        CertificatesTable = new javax.swing.JTable();
        UpdateHistoryBtn6 = new javax.swing.JButton();

        ShowAppointmentsPanel.setBackground(new java.awt.Color(255, 255, 255));

        AppointmentsText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AppointmentsText.setForeground(new java.awt.Color(0, 0, 102));
        AppointmentsText.setText("EXAMES");
        AppointmentsText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientIdText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PatientIdText2.setForeground(new java.awt.Color(0, 0, 102));
        PatientIdText2.setText("Código do paciente");
        PatientIdText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientIdFld2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientIdFld2.setText("000000");
        PatientIdFld2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ExamsTable.setBackground(new java.awt.Color(204, 204, 204));
        ExamsTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ExamsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Raio X", "08/11/2024 12:57"}
            },
            new String [] {
                "Descrição", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ExamsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ExamsTable.setGridColor(new java.awt.Color(0, 0, 0));
        ExamsTable.setOpaque(false);
        ExamsTable.setRowHeight(25);
        ExamsTable.setSelectionBackground(new java.awt.Color(180, 175, 207));
        ExamsTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        ExamsTable.setShowGrid(true);
        TableScrollPanel.setViewportView(ExamsTable);
        if (ExamsTable.getColumnModel().getColumnCount() > 0) {
            ExamsTable.getColumnModel().getColumn(0).setMinWidth(750);
            ExamsTable.getColumnModel().getColumn(0).setPreferredWidth(750);
            ExamsTable.getColumnModel().getColumn(0).setMaxWidth(750);
        }

        PatientIdFld3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientIdFld3.setText("VICTOR GABRIEL MARTINS SEIDEL");
        PatientIdFld3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientIdText3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PatientIdText3.setForeground(new java.awt.Color(0, 0, 102));
        PatientIdText3.setText("Nome do paciente");
        PatientIdText3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AppointmentsText2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AppointmentsText2.setForeground(new java.awt.Color(0, 0, 102));
        AppointmentsText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppointmentsText2.setText("PRESCRIÇÕES");
        AppointmentsText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        UpdateHistoryBtn3.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn3.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn3.setText("Novo pedido de exame");
        UpdateHistoryBtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn3.setBorderPainted(false);
        UpdateHistoryBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        AppointmentsText1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AppointmentsText1.setForeground(new java.awt.Color(0, 0, 102));
        AppointmentsText1.setText("RECEITAS");
        AppointmentsText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        RecipesTable.setBackground(new java.awt.Color(204, 204, 204));
        RecipesTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        RecipesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dipirona", "08/11/2024 13:03"}
            },
            new String [] {
                "Descrição", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RecipesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RecipesTable.setGridColor(new java.awt.Color(0, 0, 0));
        RecipesTable.setOpaque(false);
        RecipesTable.setRowHeight(25);
        RecipesTable.setSelectionBackground(new java.awt.Color(180, 175, 207));
        RecipesTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        RecipesTable.setShowGrid(true);
        TableScrollPanel1.setViewportView(RecipesTable);
        if (RecipesTable.getColumnModel().getColumnCount() > 0) {
            RecipesTable.getColumnModel().getColumn(0).setMinWidth(750);
            RecipesTable.getColumnModel().getColumn(0).setPreferredWidth(750);
            RecipesTable.getColumnModel().getColumn(0).setMaxWidth(750);
        }

        UpdateHistoryBtn4.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn4.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn4.setText("Nova receita");
        UpdateHistoryBtn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn4.setBorderPainted(false);
        UpdateHistoryBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        AppointmentsText3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AppointmentsText3.setForeground(new java.awt.Color(0, 0, 102));
        AppointmentsText3.setText("ENCAMINHAMENTOS");
        AppointmentsText3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ReferralsTable.setBackground(new java.awt.Color(204, 204, 204));
        ReferralsTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ReferralsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ReferralsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ReferralsTable.setGridColor(new java.awt.Color(0, 0, 0));
        ReferralsTable.setOpaque(false);
        ReferralsTable.setRowHeight(25);
        ReferralsTable.setSelectionBackground(new java.awt.Color(180, 175, 207));
        ReferralsTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        ReferralsTable.setShowGrid(true);
        TableScrollPanel2.setViewportView(ReferralsTable);
        if (ReferralsTable.getColumnModel().getColumnCount() > 0) {
            ReferralsTable.getColumnModel().getColumn(0).setMinWidth(750);
            ReferralsTable.getColumnModel().getColumn(0).setPreferredWidth(750);
            ReferralsTable.getColumnModel().getColumn(0).setMaxWidth(750);
        }

        UpdateHistoryBtn5.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn5.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn5.setText("Novo encaminhamento");
        UpdateHistoryBtn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn5.setBorderPainted(false);
        UpdateHistoryBtn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        AppointmentsText4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AppointmentsText4.setForeground(new java.awt.Color(0, 0, 102));
        AppointmentsText4.setText("ATESTADOS");
        AppointmentsText4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CertificatesTable.setBackground(new java.awt.Color(204, 204, 204));
        CertificatesTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CertificatesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CertificatesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CertificatesTable.setGridColor(new java.awt.Color(0, 0, 0));
        CertificatesTable.setOpaque(false);
        CertificatesTable.setRowHeight(25);
        CertificatesTable.setSelectionBackground(new java.awt.Color(180, 175, 207));
        CertificatesTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        CertificatesTable.setShowGrid(true);
        TableScrollPanel3.setViewportView(CertificatesTable);
        if (CertificatesTable.getColumnModel().getColumnCount() > 0) {
            CertificatesTable.getColumnModel().getColumn(0).setMinWidth(750);
            CertificatesTable.getColumnModel().getColumn(0).setPreferredWidth(750);
            CertificatesTable.getColumnModel().getColumn(0).setMaxWidth(750);
        }

        UpdateHistoryBtn6.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn6.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn6.setText("Novo atestado");
        UpdateHistoryBtn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn6.setBorderPainted(false);
        UpdateHistoryBtn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ShowAppointmentsPanelLayout = new javax.swing.GroupLayout(ShowAppointmentsPanel);
        ShowAppointmentsPanel.setLayout(ShowAppointmentsPanelLayout);
        ShowAppointmentsPanelLayout.setHorizontalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowAppointmentsPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(UpdateHistoryBtn6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TableScrollPanel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AppointmentsText4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(UpdateHistoryBtn5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TableScrollPanel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AppointmentsText3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                            .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(PatientIdFld2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PatientIdText2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PatientIdText3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PatientIdFld3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowAppointmentsPanelLayout.createSequentialGroup()
                            .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AppointmentsText2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AppointmentsText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UpdateHistoryBtn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TableScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE))
                            .addContainerGap(47, Short.MAX_VALUE)))
                    .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(UpdateHistoryBtn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TableScrollPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                        .addComponent(AppointmentsText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ShowAppointmentsPanelLayout.setVerticalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(AppointmentsText2)
                .addGap(18, 18, 18)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                        .addComponent(PatientIdText2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientIdFld2))
                    .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                        .addComponent(PatientIdText3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientIdFld3)))
                .addGap(18, 18, 18)
                .addComponent(AppointmentsText)
                .addGap(18, 18, 18)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateHistoryBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(AppointmentsText1)
                .addGap(18, 18, 18)
                .addComponent(TableScrollPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateHistoryBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(AppointmentsText3)
                .addGap(18, 18, 18)
                .addComponent(TableScrollPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateHistoryBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(AppointmentsText4)
                .addGap(18, 18, 18)
                .addComponent(TableScrollPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateHistoryBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ShowAppointmentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1968, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ShowAppointmentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppointmentsText;
    private javax.swing.JLabel AppointmentsText1;
    private javax.swing.JLabel AppointmentsText2;
    private javax.swing.JLabel AppointmentsText3;
    private javax.swing.JLabel AppointmentsText4;
    private javax.swing.JTable CertificatesTable;
    private javax.swing.JTable ExamsTable;
    private javax.swing.JLabel PatientIdFld2;
    private javax.swing.JLabel PatientIdFld3;
    private javax.swing.JLabel PatientIdText2;
    private javax.swing.JLabel PatientIdText3;
    private javax.swing.JTable RecipesTable;
    private javax.swing.JTable ReferralsTable;
    private javax.swing.JPanel ShowAppointmentsPanel;
    private javax.swing.JScrollPane TableScrollPanel;
    private javax.swing.JScrollPane TableScrollPanel1;
    private javax.swing.JScrollPane TableScrollPanel2;
    private javax.swing.JScrollPane TableScrollPanel3;
    private javax.swing.JButton UpdateHistoryBtn3;
    private javax.swing.JButton UpdateHistoryBtn4;
    private javax.swing.JButton UpdateHistoryBtn5;
    private javax.swing.JButton UpdateHistoryBtn6;
    // End of variables declaration//GEN-END:variables
}
