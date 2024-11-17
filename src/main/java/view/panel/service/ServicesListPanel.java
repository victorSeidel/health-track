package view.panel.service;

import controller.MainDAO;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import controller.AttachmentDAO;
import model.AttachmentDTO;
import org.apache.commons.io.FilenameUtils;
import view.view_Home;

public class ServicesListPanel extends javax.swing.JPanel 
{
    public ServicesListPanel() 
    {
        initComponents();
        
        SetTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowAppointmentsPanel = new javax.swing.JPanel();
        AttachmentsText = new javax.swing.JLabel();
        TableScrollPanel = new javax.swing.JScrollPane();
        ServicesTable = new javax.swing.JTable();
        StartServiceBtn = new javax.swing.JButton();

        ShowAppointmentsPanel.setBackground(new java.awt.Color(255, 255, 255));

        AttachmentsText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AttachmentsText.setForeground(new java.awt.Color(0, 0, 102));
        AttachmentsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AttachmentsText.setText("LISTA DE ATENDIMENTOS");
        AttachmentsText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ServicesTable.setBackground(new java.awt.Color(204, 204, 204));
        ServicesTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ServicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título / Descrição", "Profissional", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ServicesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ServicesTable.setGridColor(new java.awt.Color(0, 0, 0));
        ServicesTable.setOpaque(false);
        ServicesTable.setRowHeight(25);
        ServicesTable.setSelectionBackground(new java.awt.Color(180, 175, 207));
        ServicesTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        ServicesTable.setShowGrid(true);
        TableScrollPanel.setViewportView(ServicesTable);
        if (ServicesTable.getColumnModel().getColumnCount() > 0) {
            ServicesTable.getColumnModel().getColumn(0).setMinWidth(0);
            ServicesTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            ServicesTable.getColumnModel().getColumn(0).setMaxWidth(0);
            ServicesTable.getColumnModel().getColumn(1).setMinWidth(400);
            ServicesTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            ServicesTable.getColumnModel().getColumn(2).setMinWidth(300);
            ServicesTable.getColumnModel().getColumn(2).setPreferredWidth(300);
            ServicesTable.getColumnModel().getColumn(3).setMinWidth(150);
            ServicesTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        StartServiceBtn.setBackground(new java.awt.Color(0, 0, 102));
        StartServiceBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        StartServiceBtn.setForeground(new java.awt.Color(255, 255, 255));
        StartServiceBtn.setText("Iniciar atendimento");
        StartServiceBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StartServiceBtn.setBorderPainted(false);
        StartServiceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StartServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartServiceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShowAppointmentsPanelLayout = new javax.swing.GroupLayout(ShowAppointmentsPanel);
        ShowAppointmentsPanel.setLayout(ShowAppointmentsPanelLayout);
        ShowAppointmentsPanelLayout.setHorizontalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AttachmentsText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TableScrollPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
                    .addComponent(StartServiceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        ShowAppointmentsPanelLayout.setVerticalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AttachmentsText)
                .addGap(18, 18, 18)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StartServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ShowAppointmentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ShowAppointmentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StartServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartServiceBtnActionPerformed
        view_Home viewHome = new view_Home();
        viewHome.setVisible(true);
        MainDAO.Singleton.INSTANCE.getMain().dispose();
    }//GEN-LAST:event_StartServiceBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AttachmentsText;
    private javax.swing.JTable ServicesTable;
    private javax.swing.JPanel ShowAppointmentsPanel;
    private javax.swing.JButton StartServiceBtn;
    private javax.swing.JScrollPane TableScrollPanel;
    // End of variables declaration//GEN-END:variables
   
    private void SetTable()
   {
        JTableHeader tableHeader = ServicesTable.getTableHeader();
        
        TableColumnModel columnModel = ServicesTable.getColumnModel();
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) ServicesTable.getTableHeader().getDefaultRenderer();
        
        tableHeader.setForeground(Color.black);
        tableHeader.setFont(new Font("Arial", Font.BOLD, 16));

        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        columnModel.getColumn(0).setCellRenderer(centerRenderer);
        columnModel.getColumn(3).setCellRenderer(centerRenderer);
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        UpdateTable();
   }
     
    private void UpdateTable() 
    {
        AttachmentDAO attachmentDAO = new AttachmentDAO();
        ArrayList<AttachmentDTO> attachments = attachmentDAO.List();

        DefaultTableModel tableModel = (DefaultTableModel) ServicesTable.getModel();
        tableModel.setRowCount(0);

        for (AttachmentDTO attachment : attachments) 
        {
            Object[] row = new Object[] 
            {
                attachment.getId(),
                attachment.getTitle(),
                attachment.getProfessionalName(),
                attachment.getFormattedDate(),
                attachment.getPath()
            };
            
            tableModel.addRow(row);
        }
    }
}
