package view.panel.attachment;

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
import java.util.logging.Level;
import java.util.logging.Logger;
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
import model.AttachmentDAO;
import model.AttachmentDTO;
import org.apache.commons.io.FilenameUtils;

public class AttachmentsPanel extends javax.swing.JPanel 
{
    public AttachmentsPanel() 
    {
        initComponents();
        
        SetTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowAppointmentsPanel = new javax.swing.JPanel();
        AttachmentsText = new javax.swing.JLabel();
        PatientIdText = new javax.swing.JLabel();
        PatientIdFld = new javax.swing.JLabel();
        NameText = new javax.swing.JLabel();
        NameFld = new javax.swing.JLabel();
        ShowAttachmentBtn = new javax.swing.JButton();
        TableScrollPanel = new javax.swing.JScrollPane();
        AttachmentsTable = new javax.swing.JTable();
        NewAttachmentBtn = new javax.swing.JButton();

        ShowAppointmentsPanel.setBackground(new java.awt.Color(255, 255, 255));

        AttachmentsText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AttachmentsText.setForeground(new java.awt.Color(0, 0, 102));
        AttachmentsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AttachmentsText.setText("ANEXOS");
        AttachmentsText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientIdText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PatientIdText.setForeground(new java.awt.Color(0, 0, 102));
        PatientIdText.setText("Código do paciente");
        PatientIdText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientIdFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientIdFld.setText("000000");
        PatientIdFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NameText.setForeground(new java.awt.Color(0, 0, 102));
        NameText.setText("Nome do paciente");
        NameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NameFld.setText("VICTOR GABRIEL MARTINS SEIDEL");
        NameFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ShowAttachmentBtn.setBackground(new java.awt.Color(0, 0, 102));
        ShowAttachmentBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ShowAttachmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        ShowAttachmentBtn.setText("Visualizar");
        ShowAttachmentBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ShowAttachmentBtn.setBorderPainted(false);
        ShowAttachmentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowAttachmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAttachmentBtnActionPerformed(evt);
            }
        });

        AttachmentsTable.setBackground(new java.awt.Color(204, 204, 204));
        AttachmentsTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        AttachmentsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        AttachmentsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AttachmentsTable.setGridColor(new java.awt.Color(0, 0, 0));
        AttachmentsTable.setOpaque(false);
        AttachmentsTable.setRowHeight(25);
        AttachmentsTable.setSelectionBackground(new java.awt.Color(180, 175, 207));
        AttachmentsTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        AttachmentsTable.setShowGrid(true);
        TableScrollPanel.setViewportView(AttachmentsTable);
        if (AttachmentsTable.getColumnModel().getColumnCount() > 0) {
            AttachmentsTable.getColumnModel().getColumn(0).setMinWidth(0);
            AttachmentsTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            AttachmentsTable.getColumnModel().getColumn(0).setMaxWidth(0);
            AttachmentsTable.getColumnModel().getColumn(1).setMinWidth(400);
            AttachmentsTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            AttachmentsTable.getColumnModel().getColumn(2).setMinWidth(300);
            AttachmentsTable.getColumnModel().getColumn(2).setPreferredWidth(300);
            AttachmentsTable.getColumnModel().getColumn(3).setMinWidth(150);
            AttachmentsTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        NewAttachmentBtn.setBackground(new java.awt.Color(0, 0, 102));
        NewAttachmentBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NewAttachmentBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewAttachmentBtn.setText("Incluir novo anexo");
        NewAttachmentBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewAttachmentBtn.setBorderPainted(false);
        NewAttachmentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewAttachmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAttachmentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShowAppointmentsPanelLayout = new javax.swing.GroupLayout(ShowAppointmentsPanel);
        ShowAppointmentsPanel.setLayout(ShowAppointmentsPanelLayout);
        ShowAppointmentsPanelLayout.setHorizontalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                        .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PatientIdFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PatientIdText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NameFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(ShowAttachmentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(AttachmentsText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewAttachmentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TableScrollPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        ShowAppointmentsPanelLayout.setVerticalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(AttachmentsText)
                .addGap(18, 18, 18)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                            .addComponent(PatientIdText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PatientIdFld))
                        .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                            .addComponent(NameText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NameFld)))
                    .addComponent(ShowAttachmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NewAttachmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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
            .addGap(0, 652, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ShowAppointmentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NewAttachmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAttachmentBtnActionPerformed
        SaveFile();
    }//GEN-LAST:event_NewAttachmentBtnActionPerformed

    private void ShowAttachmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAttachmentBtnActionPerformed
        int selectedRow = AttachmentsTable.getSelectedRow();
        
        if (selectedRow == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um anexo.");
            return;
        }
        
        int id = (int) AttachmentsTable.getValueAt(selectedRow, 0);

        AttachmentDAO attachmentDAO = new AttachmentDAO();
        AttachmentDTO attachment = null;
        
        try 
        {
            attachment = attachmentDAO.Select(id);
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error (AttachmentsPanel): " + ex.getMessage());
        }

        ShowFile(attachment);
    }//GEN-LAST:event_ShowAttachmentBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AttachmentsTable;
    private javax.swing.JLabel AttachmentsText;
    private javax.swing.JLabel NameFld;
    private javax.swing.JLabel NameText;
    private javax.swing.JButton NewAttachmentBtn;
    private javax.swing.JLabel PatientIdFld;
    private javax.swing.JLabel PatientIdText;
    private javax.swing.JPanel ShowAppointmentsPanel;
    private javax.swing.JButton ShowAttachmentBtn;
    private javax.swing.JScrollPane TableScrollPanel;
    // End of variables declaration//GEN-END:variables

     private void SaveFile()
    {
        String userHome = System.getProperty("user.home");
        
        Path desktopPath   = Paths.get(userHome, "Desktop");
        Path documentsPath = Paths.get(userHome, "Documents");
        Path downloadsPath = Paths.get(userHome, "Downloads");
        
        String directory = downloadsPath.toString() + File.separator + "meu_diretorio";
        
        JFileChooser FileChooser = new JFileChooser();
        
        FileChooser.setDialogTitle("Escolha um arquivo de imagem");
        FileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileChooser.setFileFilter(new FileNameExtensionFilter("Arquivos de Imagem", "jpg", "jpeg", "png", "pdf", "PDF"));
        
        int result = FileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) 
        {
            File selectedFile = FileChooser.getSelectedFile();
       
            String extension = FilenameUtils.getExtension(selectedFile.toString());

            if (selectedFile.exists()) 
            {
                try 
                {
                    File destiny = new File(directory);
                    
                    if (!destiny.exists()) 
                    {
                        destiny.mkdirs();
                    }
                    
                    String input = JOptionPane.showInputDialog(null, "Digite o nome / descrição do arquivo", "Nome do arquivo", JOptionPane.QUESTION_MESSAGE);
                    
                    if (input == null) return;
                    
                    if (input.equalsIgnoreCase("null") || input.length() <= 0)
                    {
                        JOptionPane.showMessageDialog(null, "Digite um nome para o arquivo!");
                        return;
                    }
                    
                    File destinyFile = new File(destiny, input + "." + extension);
                    
                    Path originPath  = selectedFile.toPath();
                    Path destinyPath = destinyFile.toPath();
                    
                    Files.copy(originPath, destinyPath, StandardCopyOption.REPLACE_EXISTING);
                    
                    AttachmentDTO attachment    = new AttachmentDTO();
                    AttachmentDAO attachmentDAO = new AttachmentDAO();
                                        
                    attachment.setTitle(input);
                    attachment.setPath(destinyFile.toString());
                    attachment.setProfessionalId(1);

                    if (!attachmentDAO.Insert(attachment)) 
                    {
                        System.out.println("Erro ao inserir o arquivo!");
                        return;
                    } 
               
                    JOptionPane.showMessageDialog(null, "Arquivo enviado com sucesso!");
                } 
                catch (IOException e) 
                {
                    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Erro: o arquivo selecionado não existe!");
            }
        }
        
        UpdateTable();
    }
     
    private void ShowFile(AttachmentDTO attachment)
    {
        try 
        {
            ImageIcon imageIcon = new ImageIcon(attachment.getPath());
            JLabel imageLabel = new JLabel(imageIcon);

            JPanel imagePanel = new JPanel();
            imagePanel.add(imageLabel);

            JFrame imageFrame = new JFrame(attachment.getTitle());
            imageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            imageFrame.getContentPane().add(imagePanel);
            imageFrame.pack();
            imageFrame.setVisible(true);
        } 
        catch (HeadlessException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a imagem.");
        }
    }
     
   private void SetTable()
   {
        JTableHeader tableHeader = AttachmentsTable.getTableHeader();
        
        TableColumnModel columnModel = AttachmentsTable.getColumnModel();
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) AttachmentsTable.getTableHeader().getDefaultRenderer();
        
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

        DefaultTableModel tableModel = (DefaultTableModel) AttachmentsTable.getModel();
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
