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
        Title = new javax.swing.JLabel();
        ExamsText = new javax.swing.JLabel();
        ExamsPanel = new javax.swing.JScrollPane();
        ExamsTable = new javax.swing.JTable();
        NewExamBtn = new javax.swing.JButton();
        DeleteExamBtn = new javax.swing.JButton();
        ShowExamBtn = new javax.swing.JButton();
        RecipesText = new javax.swing.JLabel();
        RecipesPanel = new javax.swing.JScrollPane();
        RecipesTable = new javax.swing.JTable();
        ReferralsText = new javax.swing.JLabel();
        ReferralsPanel = new javax.swing.JScrollPane();
        ReferralsTable = new javax.swing.JTable();
        CertificatesText = new javax.swing.JLabel();
        CertificatesPanel = new javax.swing.JScrollPane();
        CertificatesTable = new javax.swing.JTable();

        ShowAppointmentsPanel.setBackground(new java.awt.Color(255, 255, 255));

        Title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 102));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("PRESCRIÇÕES");
        Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ExamsText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ExamsText.setForeground(new java.awt.Color(0, 0, 102));
        ExamsText.setText("EXAMES");
        ExamsText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ExamsTable.setBackground(new java.awt.Color(204, 204, 204));
        ExamsTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ExamsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "Raio X", null, "08/11/2024 12:57"}
            },
            new String [] {
                "ID", "Descrição", "Profissional", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        ExamsPanel.setViewportView(ExamsTable);
        if (ExamsTable.getColumnModel().getColumnCount() > 0) {
            ExamsTable.getColumnModel().getColumn(0).setMinWidth(0);
            ExamsTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            ExamsTable.getColumnModel().getColumn(0).setMaxWidth(0);
            ExamsTable.getColumnModel().getColumn(1).setMinWidth(400);
            ExamsTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            ExamsTable.getColumnModel().getColumn(1).setMaxWidth(0);
            ExamsTable.getColumnModel().getColumn(2).setMinWidth(300);
            ExamsTable.getColumnModel().getColumn(2).setPreferredWidth(300);
            ExamsTable.getColumnModel().getColumn(3).setMinWidth(150);
            ExamsTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        NewExamBtn.setBackground(new java.awt.Color(0, 0, 102));
        NewExamBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NewExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewExamBtn.setText("Novo exame");
        NewExamBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewExamBtn.setBorderPainted(false);
        NewExamBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        DeleteExamBtn.setBackground(new java.awt.Color(204, 0, 0));
        DeleteExamBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteExamBtn.setText("Excluir exame");
        DeleteExamBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteExamBtn.setBorderPainted(false);
        DeleteExamBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ShowExamBtn.setBackground(new java.awt.Color(0, 0, 102));
        ShowExamBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ShowExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        ShowExamBtn.setText("Visualizar exame");
        ShowExamBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ShowExamBtn.setBorderPainted(false);
        ShowExamBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        RecipesText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RecipesText.setForeground(new java.awt.Color(0, 0, 102));
        RecipesText.setText("RECEITAS");
        RecipesText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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
        RecipesPanel.setViewportView(RecipesTable);
        if (RecipesTable.getColumnModel().getColumnCount() > 0) {
            RecipesTable.getColumnModel().getColumn(0).setMinWidth(750);
            RecipesTable.getColumnModel().getColumn(0).setPreferredWidth(750);
            RecipesTable.getColumnModel().getColumn(0).setMaxWidth(750);
        }

        ReferralsText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ReferralsText.setForeground(new java.awt.Color(0, 0, 102));
        ReferralsText.setText("ENCAMINHAMENTOS");
        ReferralsText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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
        ReferralsPanel.setViewportView(ReferralsTable);
        if (ReferralsTable.getColumnModel().getColumnCount() > 0) {
            ReferralsTable.getColumnModel().getColumn(0).setMinWidth(750);
            ReferralsTable.getColumnModel().getColumn(0).setPreferredWidth(750);
            ReferralsTable.getColumnModel().getColumn(0).setMaxWidth(750);
        }

        CertificatesText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CertificatesText.setForeground(new java.awt.Color(0, 0, 102));
        CertificatesText.setText("ATESTADOS");
        CertificatesText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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
        CertificatesPanel.setViewportView(CertificatesTable);
        if (CertificatesTable.getColumnModel().getColumnCount() > 0) {
            CertificatesTable.getColumnModel().getColumn(0).setMinWidth(750);
            CertificatesTable.getColumnModel().getColumn(0).setPreferredWidth(750);
            CertificatesTable.getColumnModel().getColumn(0).setMaxWidth(750);
        }

        javax.swing.GroupLayout ShowAppointmentsPanelLayout = new javax.swing.GroupLayout(ShowAppointmentsPanel);
        ShowAppointmentsPanel.setLayout(ShowAppointmentsPanelLayout);
        ShowAppointmentsPanelLayout.setHorizontalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CertificatesPanel)
                    .addComponent(CertificatesText, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReferralsPanel)
                    .addComponent(ReferralsText, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExamsText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExamsPanel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RecipesPanel)
                    .addComponent(RecipesText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                        .addComponent(NewExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ShowExamBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        ShowAppointmentsPanelLayout.setVerticalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(ExamsText)
                .addGap(18, 18, 18)
                .addComponent(ExamsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(RecipesText)
                .addGap(18, 18, 18)
                .addComponent(RecipesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(ReferralsText)
                .addGap(18, 18, 18)
                .addComponent(ReferralsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(CertificatesText)
                .addGap(18, 18, 18)
                .addComponent(CertificatesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
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
            .addGap(0, 1907, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ShowAppointmentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CertificatesPanel;
    private javax.swing.JTable CertificatesTable;
    private javax.swing.JLabel CertificatesText;
    private javax.swing.JButton DeleteExamBtn;
    private javax.swing.JScrollPane ExamsPanel;
    private javax.swing.JTable ExamsTable;
    private javax.swing.JLabel ExamsText;
    private javax.swing.JButton NewExamBtn;
    private javax.swing.JScrollPane RecipesPanel;
    private javax.swing.JTable RecipesTable;
    private javax.swing.JLabel RecipesText;
    private javax.swing.JScrollPane ReferralsPanel;
    private javax.swing.JTable ReferralsTable;
    private javax.swing.JLabel ReferralsText;
    private javax.swing.JPanel ShowAppointmentsPanel;
    private javax.swing.JButton ShowExamBtn;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
