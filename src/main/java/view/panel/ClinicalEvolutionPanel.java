package view.panel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class ClinicalEvolutionPanel extends javax.swing.JPanel 
{
    public ClinicalEvolutionPanel() 
    {
        initComponents();
        
        JTableHeader tableHeader = EvolutionTable.getTableHeader();
        TableColumnModel columnModel = EvolutionTable.getColumnModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) EvolutionTable.getTableHeader().getDefaultRenderer();
        
        tableHeader.setBackground(Color.red);
        tableHeader.setBackground(Color.red);
        tableHeader.setForeground(Color.black);
        tableHeader.setFont(new Font("Arial", Font.BOLD, 16));
        
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 1; i < 3; i++) columnModel.getColumn(i).setCellRenderer(centerRenderer);
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        UpdateHistoryBtn6 = new javax.swing.JButton();
        SocialNameText2 = new javax.swing.JLabel();
        SocialNameFld2 = new javax.swing.JLabel();
        BirthDateText2 = new javax.swing.JLabel();
        BirthDateFld2 = new javax.swing.JLabel();
        TableScrollPanel = new javax.swing.JScrollPane();
        EvolutionTable = new javax.swing.JTable();

        Background.setBackground(new java.awt.Color(255, 255, 255));

        UpdateHistoryBtn6.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn6.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn6.setText("Visualizar");
        UpdateHistoryBtn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn6.setBorderPainted(false);
        UpdateHistoryBtn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        EvolutionTable.setBackground(new java.awt.Color(204, 204, 204));
        EvolutionTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EvolutionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dor no dente", "Sintoma", "05/11/2024 14:37"},
                {"1 consulta", "Clínico Geral", "07/11/2024 12:40"},
                {"1 consulta", "Odontologia", "08/11/2024 12:40"},
                {"Raio X", "Exame", "08/11/2024 12:57"},
                {"Dipirona", "Receita Médica", "08/11/2024 13:03"},
                {"Retorno", "Odontologia", "08/12/2024 13:20"},
                {"Extração", "Odontologia", "24/11/2024 13:45"}
            },
            new String [] {
                "Descrição", "Especialidade", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EvolutionTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EvolutionTable.setGridColor(new java.awt.Color(0, 0, 0));
        EvolutionTable.setOpaque(false);
        EvolutionTable.setRowHeight(25);
        EvolutionTable.setSelectionBackground(new java.awt.Color(180, 175, 207));
        EvolutionTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        EvolutionTable.setShowGrid(true);
        TableScrollPanel.setViewportView(EvolutionTable);
        if (EvolutionTable.getColumnModel().getColumnCount() > 0) {
            EvolutionTable.getColumnModel().getColumn(1).setMinWidth(125);
            EvolutionTable.getColumnModel().getColumn(1).setPreferredWidth(125);
            EvolutionTable.getColumnModel().getColumn(1).setMaxWidth(125);
            EvolutionTable.getColumnModel().getColumn(2).setMinWidth(150);
            EvolutionTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            EvolutionTable.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SocialNameText2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(SocialNameFld2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BirthDateText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BirthDateFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateHistoryBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateHistoryBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SocialNameText2)
                            .addComponent(BirthDateText2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SocialNameFld2)
                            .addComponent(BirthDateFld2))))
                .addGap(18, 18, 18)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BirthDateFld2;
    private javax.swing.JLabel BirthDateText2;
    private javax.swing.JTable EvolutionTable;
    private javax.swing.JLabel SocialNameFld2;
    private javax.swing.JLabel SocialNameText2;
    private javax.swing.JScrollPane TableScrollPanel;
    private javax.swing.JButton UpdateHistoryBtn6;
    // End of variables declaration//GEN-END:variables
}
