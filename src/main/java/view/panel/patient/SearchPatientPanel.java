package view.panel.patient;

import controller.MainDAO;
import controller.MedicalRecordDAO;
import controller.PatientDAO;
import controller.SettingsDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import model.MedicalRecordDTO;
import model.PatientDTO;

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
        columnModel.getColumn(0).setCellRenderer(centerRenderer);
        columnModel.getColumn(2).setCellRenderer(centerRenderer);
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);  
        
        FilterValueFld.getDocument().addDocumentListener(new DocumentListener() 
        {
            @Override
            public void insertUpdate(DocumentEvent e) {
                UpdateTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                UpdateTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                UpdateTable();
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        TitleText = new javax.swing.JLabel();
        SocialNameText3 = new javax.swing.JLabel();
        SocialNameText4 = new javax.swing.JLabel();
        FilterValueFld = new javax.swing.JTextField();
        FilterColumnFld = new javax.swing.JComboBox<>();
        TableScrollPanel = new javax.swing.JScrollPane();
        PatientsTable = new javax.swing.JTable();
        CancelBtn = new javax.swing.JButton();
        SelectBtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

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

        FilterValueFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        FilterValueFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        FilterColumnFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        FilterColumnFld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Código", "Data de nascimento", "Nome da mãe", "CPF" }));
        FilterColumnFld.setBorder(null);
        FilterColumnFld.setLightWeightPopupEnabled(false);

        PatientsTable.setBackground(new java.awt.Color(204, 204, 204));
        PatientsTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Nascimento", "Mãe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            PatientsTable.getColumnModel().getColumn(0).setMinWidth(0);
            PatientsTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            PatientsTable.getColumnModel().getColumn(0).setMaxWidth(0);
            PatientsTable.getColumnModel().getColumn(1).setMinWidth(200);
            PatientsTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            PatientsTable.getColumnModel().getColumn(2).setMinWidth(100);
            PatientsTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            PatientsTable.getColumnModel().getColumn(2).setMaxWidth(100);
            PatientsTable.getColumnModel().getColumn(3).setMinWidth(150);
            PatientsTable.getColumnModel().getColumn(3).setPreferredWidth(200);
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
                .addGap(47, 47, 47)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TableScrollPanel)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(SelectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(TitleText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(SocialNameText3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(249, 249, 249))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(FilterValueFld, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                                .addGap(42, 42, 42)))
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SocialNameText4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FilterColumnFld, 0, 300, Short.MAX_VALUE))))
                .addGap(47, 47, 47))
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
                .addGap(7, 7, 7)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FilterColumnFld, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(FilterValueFld, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(TableScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        add(Background, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void SelectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectBtnActionPerformed
        SelectPatient();
    }//GEN-LAST:event_SelectBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(null);
    }//GEN-LAST:event_CancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JComboBox<String> FilterColumnFld;
    private javax.swing.JTextField FilterValueFld;
    private javax.swing.JTable PatientsTable;
    private javax.swing.JButton SelectBtn;
    private javax.swing.JLabel SocialNameText3;
    private javax.swing.JLabel SocialNameText4;
    private javax.swing.JScrollPane TableScrollPanel;
    private javax.swing.JLabel TitleText;
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
    
    private void SelectPatient()
    {
        int selectedRow = PatientsTable.getSelectedRow();
        
        if (selectedRow == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um paciente.");
            return;
        }
        
        int id = (int) PatientsTable.getValueAt(selectedRow, 0);

        PatientDAO patientDAO = new PatientDAO();
        PatientDTO patient = null;
        
        try 
        {
            patient = patientDAO.Select(id);
        } 
        catch (SQLException ex) 
        {
            System.out.println("Error (SearchPatientPanel): " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error: Não foi possível selecionar o paciente.");
        }
        
        SettingsDAO.Singleton.INSTANCE.setPatient(patient);

        if (type == 'P')
        {
            PatientInfoPanel p = new PatientInfoPanel();
            
            p.SetData();
            
            MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(p);
            
            return;
        }

        if (type == 'M')
        {
            MedicalRecordDAO medicalRecordDAO = new  MedicalRecordDAO();
            MedicalRecordDTO medicalRecord = null;
            
            try 
            {
                medicalRecord = medicalRecordDAO.Select(patient.getId());
            } 
            catch (SQLException ex) 
            {
                System.out.println("Error (SearchPatientPanel): " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error: Não foi possível selecionar o prontuário.");
            }
        
            if (medicalRecord == null) 
            {
                JOptionPane.showMessageDialog(null, "Error: Não existe prontuário para esse paciente.");
                return;
            }
            
            SettingsDAO.Singleton.INSTANCE.setMedicalRecord(medicalRecord);
            
            MedicalRecordPanel m = new MedicalRecordPanel();
            
            m.SetData();
            
            MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(m);
            
            return;
        }

        if (type == 'R')
        {
            MedicalRecordDAO medicalRecordDAO = new  MedicalRecordDAO();
            MedicalRecordDTO medicalRecord = null;
            
            try 
            {
                medicalRecord = medicalRecordDAO.Select(patient.getId());
            } 
            catch (SQLException ex) 
            {
                System.out.println("Error (SearchPatientPanel): " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error: Não foi possível criar um novo prontuário.");
            }
                     
            SettingsDAO.Singleton.INSTANCE.setMedicalRecord(medicalRecord);
            
            RegisterNewMedicalRecordPanel r = new RegisterNewMedicalRecordPanel();
            
            r.SetData();
            
            MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(r);
        }
    }
    
    private void UpdateTable()
    {
        PatientDAO examDAO                = new PatientDAO();
        MedicalRecordDAO medicalRecordDAO = new MedicalRecordDAO();
        
        ArrayList<PatientDTO> patients = examDAO.List(GetFilterColumn(), FilterValueFld.getText());

        DefaultTableModel tableModel = (DefaultTableModel) PatientsTable.getModel();
        tableModel.setRowCount(0);

        for (PatientDTO patient : patients) 
        {
            Object[] row = new Object[] 
            {
                patient.getId(),
                patient.getName(),
                patient.getFormattedBirthDate(),
                patient.getMother(),
            };
            
            tableModel.addRow(row);
        }
    }
    
    private String GetFilterColumn()
    {
        if (FilterColumnFld.getSelectedItem().toString().equals("Nome")) return "name";
        if (FilterColumnFld.getSelectedItem().toString().equals("Código")) return "id";
        if (FilterColumnFld.getSelectedItem().toString().equals("Data de nascimento")) return "birthDate";
        if (FilterColumnFld.getSelectedItem().toString().equals("Nome da mãe")) return "mother";
        if (FilterColumnFld.getSelectedItem().toString().equals("CPF")) return "cpf";
        
        return "name";
    }
}
