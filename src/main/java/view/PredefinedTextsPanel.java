package view;

import controller.PredefinedTextDAO;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import model.PredefinedTextDTO;

public class PredefinedTextsPanel extends javax.swing.JDialog {

    public PredefinedTextsPanel(java.awt.Frame parent, boolean modal, int typeIndex) 
    {
        super(parent, modal);
        
        initComponents();
        
        type = typeIndex;
        
        JTableHeader tableHeader = TextsTable.getTableHeader();
        
        TableColumnModel columnModel = TextsTable.getColumnModel();
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) TextsTable.getTableHeader().getDefaultRenderer();
        
        tableHeader.setForeground(Color.black);
        tableHeader.setFont(new Font("Arial", Font.BOLD, 16));

        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        columnModel.getColumn(0).setCellRenderer(centerRenderer);
        columnModel.getColumn(1).setCellRenderer(centerRenderer);
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        UpdateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Panel = new javax.swing.JScrollPane();
        TextsTable = new javax.swing.JTable();
        DeleteBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        SelectBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        TextsTable.setBackground(new java.awt.Color(204, 204, 204));
        TextsTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TextsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "AAA", "OLÁAAAAA"}
            },
            new String [] {
                "ID", "Nome", "Texto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TextsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TextsTable.setGridColor(new java.awt.Color(0, 0, 0));
        TextsTable.setOpaque(false);
        TextsTable.setRowHeight(25);
        TextsTable.setSelectionBackground(new java.awt.Color(180, 175, 207));
        TextsTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        TextsTable.setShowGrid(true);
        Panel.setViewportView(TextsTable);
        if (TextsTable.getColumnModel().getColumnCount() > 0) {
            TextsTable.getColumnModel().getColumn(0).setMinWidth(0);
            TextsTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            TextsTable.getColumnModel().getColumn(0).setMaxWidth(0);
            TextsTable.getColumnModel().getColumn(1).setMinWidth(100);
            TextsTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            TextsTable.getColumnModel().getColumn(2).setMinWidth(500);
            TextsTable.getColumnModel().getColumn(2).setPreferredWidth(500);
        }

        DeleteBtn.setBackground(new java.awt.Color(204, 0, 0));
        DeleteBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Excluir");
        DeleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteBtn.setBorderPainted(false);
        DeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(0, 0, 102));
        UpdateBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Salvar alterações");
        UpdateBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateBtn.setBorderPainted(false);
        UpdateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        SelectBtn.setBackground(new java.awt.Color(0, 0, 102));
        SelectBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SelectBtn.setForeground(new java.awt.Color(255, 255, 255));
        SelectBtn.setText("Selecionar");
        SelectBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SelectBtn.setBorderPainted(false);
        SelectBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        DeleteText();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        UpdateText();
    }//GEN-LAST:event_UpdateBtnActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                PredefinedTextsPanel dialog = new PredefinedTextsPanel(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JScrollPane Panel;
    private javax.swing.JButton SelectBtn;
    private javax.swing.JTable TextsTable;
    private javax.swing.JButton UpdateBtn;
    // End of variables declaration//GEN-END:variables

    private int type = 0;
    
    public void SetType(int newType)
    {
        this.type = newType;
    }
    
    public JButton GetButton()
    {
        return SelectBtn;
    }
    
    public JTable GetTable()
    {
        return TextsTable;
    }
    
    private void UpdateText()
    {
        PredefinedTextDAO predefinedTextDAO = new PredefinedTextDAO();

        for (int row = 0; row < TextsTable.getRowCount(); row++) 
        {
            PredefinedTextDTO predefinedText = new PredefinedTextDTO();
            predefinedText.setId((Integer) TextsTable.getValueAt(row, 0));
            predefinedText.setName((String) TextsTable.getValueAt(row, 1));
            predefinedText.setText((String) TextsTable.getValueAt(row, 2));

            if (!predefinedTextDAO.Update(predefinedText)) 
            {
                JOptionPane.showMessageDialog(null, "Error: Não foi possível atualizar o registro: " + predefinedText.getName());
                return; 
            }
        }
 
        UpdateTable();
    }
    
    private void DeleteText()
    {
        PredefinedTextDAO predefinedTextDAO = new PredefinedTextDAO();
        
        String id = TextsTable.getValueAt(TextsTable.getSelectedRow(), 0).toString();
        if (!predefinedTextDAO.Delete((Integer.parseInt(id))))
        {
            JOptionPane.showMessageDialog(null, "Error: Não foi possível excluir o texto.");
            return;
        }
      
        UpdateTable();
    }
    
    private void UpdateTable() 
    {
        PredefinedTextDAO predefinedTextDAO = new PredefinedTextDAO();
        ArrayList<PredefinedTextDTO> predefinedTexts = predefinedTextDAO.List(type);

        DefaultTableModel tableModel = (DefaultTableModel) TextsTable.getModel();
        tableModel.setRowCount(0);

        for (PredefinedTextDTO predefinedText : predefinedTexts) 
        {
            Object[] row = new Object[] 
            {
                predefinedText.getId(),
                predefinedText.getName(),
                predefinedText.getText(),
            };
            
            tableModel.addRow(row);
        }
    }
}
