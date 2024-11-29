package view.panel.prescription;

import controller.ExamDAO;
import controller.MainDAO;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import model.ExamDTO;

public class PrescriptionsPanel extends javax.swing.JPanel 
{
    public PrescriptionsPanel() 
    {
        initComponents();
        
        SetTable();
        
        UpdateExamTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowAppointmentsPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        ExamsText = new javax.swing.JLabel();
        ExamsPanel = new javax.swing.JScrollPane();
        ExamsTable = new javax.swing.JTable();
        DeleteExamBtn = new javax.swing.JButton();
        RecipesText = new javax.swing.JLabel();
        RecipesPanel = new javax.swing.JScrollPane();
        RecipesTable = new javax.swing.JTable();
        ReferralsText = new javax.swing.JLabel();
        ReferralsPanel = new javax.swing.JScrollPane();
        ReferralsTable = new javax.swing.JTable();
        CertificatesText = new javax.swing.JLabel();
        CertificatesPanel = new javax.swing.JScrollPane();
        CertificatesTable = new javax.swing.JTable();
        SocialNameText2 = new javax.swing.JLabel();
        SocialNameFld2 = new javax.swing.JLabel();
        BirthDateText2 = new javax.swing.JLabel();
        BirthDateFld2 = new javax.swing.JLabel();
        DeleteExamBtn1 = new javax.swing.JButton();
        NewRecipeBtn = new javax.swing.JButton();
        ShowExamBtn1 = new javax.swing.JButton();
        DeleteExamBtn2 = new javax.swing.JButton();
        NewReferralBtn = new javax.swing.JButton();
        ShowExamBtn2 = new javax.swing.JButton();
        DeleteExamBtn3 = new javax.swing.JButton();
        NewRecipeBtn2 = new javax.swing.JButton();
        ShowExamBtn3 = new javax.swing.JButton();
        NewExamBtn = new javax.swing.JButton();
        ShowExamBtn4 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

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
                {null, null, null, null}
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
            ExamsTable.getColumnModel().getColumn(2).setMinWidth(300);
            ExamsTable.getColumnModel().getColumn(2).setPreferredWidth(300);
            ExamsTable.getColumnModel().getColumn(3).setMinWidth(150);
            ExamsTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        DeleteExamBtn.setBackground(new java.awt.Color(204, 0, 0));
        DeleteExamBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteExamBtn.setText("Excluir exame");
        DeleteExamBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteExamBtn.setBorderPainted(false);
        DeleteExamBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteExamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteExamBtnActionPerformed(evt);
            }
        });

        RecipesText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RecipesText.setForeground(new java.awt.Color(0, 0, 102));
        RecipesText.setText("RECEITAS");
        RecipesText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        RecipesTable.setBackground(new java.awt.Color(204, 204, 204));
        RecipesTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        RecipesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        RecipesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RecipesTable.setGridColor(new java.awt.Color(0, 0, 0));
        RecipesTable.setOpaque(false);
        RecipesTable.setRowHeight(25);
        RecipesTable.setSelectionBackground(new java.awt.Color(180, 175, 207));
        RecipesTable.setSelectionForeground(new java.awt.Color(0, 0, 102));
        RecipesTable.setShowGrid(true);
        RecipesPanel.setViewportView(RecipesTable);
        if (RecipesTable.getColumnModel().getColumnCount() > 0) {
            RecipesTable.getColumnModel().getColumn(0).setMinWidth(0);
            RecipesTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            RecipesTable.getColumnModel().getColumn(0).setMaxWidth(0);
            RecipesTable.getColumnModel().getColumn(1).setMinWidth(750);
            RecipesTable.getColumnModel().getColumn(1).setPreferredWidth(750);
            RecipesTable.getColumnModel().getColumn(1).setMaxWidth(750);
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

        DeleteExamBtn1.setBackground(new java.awt.Color(204, 0, 0));
        DeleteExamBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteExamBtn1.setForeground(new java.awt.Color(255, 255, 255));
        DeleteExamBtn1.setText("Excluir exame");
        DeleteExamBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteExamBtn1.setBorderPainted(false);
        DeleteExamBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        NewRecipeBtn.setBackground(new java.awt.Color(0, 0, 102));
        NewRecipeBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NewRecipeBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewRecipeBtn.setText("Nova receita");
        NewRecipeBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewRecipeBtn.setBorderPainted(false);
        NewRecipeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewRecipeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRecipeBtnActionPerformed(evt);
            }
        });

        ShowExamBtn1.setBackground(new java.awt.Color(0, 0, 102));
        ShowExamBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ShowExamBtn1.setForeground(new java.awt.Color(255, 255, 255));
        ShowExamBtn1.setText("Visualizar exame");
        ShowExamBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ShowExamBtn1.setBorderPainted(false);
        ShowExamBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        DeleteExamBtn2.setBackground(new java.awt.Color(204, 0, 0));
        DeleteExamBtn2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteExamBtn2.setForeground(new java.awt.Color(255, 255, 255));
        DeleteExamBtn2.setText("Excluir exame");
        DeleteExamBtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteExamBtn2.setBorderPainted(false);
        DeleteExamBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        NewReferralBtn.setBackground(new java.awt.Color(0, 0, 102));
        NewReferralBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NewReferralBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewReferralBtn.setText("Novo encaminhamento");
        NewReferralBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewReferralBtn.setBorderPainted(false);
        NewReferralBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewReferralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewReferralBtnActionPerformed(evt);
            }
        });

        ShowExamBtn2.setBackground(new java.awt.Color(0, 0, 102));
        ShowExamBtn2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ShowExamBtn2.setForeground(new java.awt.Color(255, 255, 255));
        ShowExamBtn2.setText("Visualizar exame");
        ShowExamBtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ShowExamBtn2.setBorderPainted(false);
        ShowExamBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        DeleteExamBtn3.setBackground(new java.awt.Color(204, 0, 0));
        DeleteExamBtn3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteExamBtn3.setForeground(new java.awt.Color(255, 255, 255));
        DeleteExamBtn3.setText("Excluir exame");
        DeleteExamBtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteExamBtn3.setBorderPainted(false);
        DeleteExamBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        NewRecipeBtn2.setBackground(new java.awt.Color(0, 0, 102));
        NewRecipeBtn2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NewRecipeBtn2.setForeground(new java.awt.Color(255, 255, 255));
        NewRecipeBtn2.setText("Nova receita");
        NewRecipeBtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewRecipeBtn2.setBorderPainted(false);
        NewRecipeBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewRecipeBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRecipeBtn2ActionPerformed(evt);
            }
        });

        ShowExamBtn3.setBackground(new java.awt.Color(0, 0, 102));
        ShowExamBtn3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ShowExamBtn3.setForeground(new java.awt.Color(255, 255, 255));
        ShowExamBtn3.setText("Visualizar exame");
        ShowExamBtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ShowExamBtn3.setBorderPainted(false);
        ShowExamBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        NewExamBtn.setBackground(new java.awt.Color(0, 0, 102));
        NewExamBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NewExamBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewExamBtn.setText("Novo pedido de exame");
        NewExamBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewExamBtn.setBorderPainted(false);
        NewExamBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewExamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewExamBtnActionPerformed(evt);
            }
        });

        ShowExamBtn4.setBackground(new java.awt.Color(0, 0, 102));
        ShowExamBtn4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ShowExamBtn4.setForeground(new java.awt.Color(255, 255, 255));
        ShowExamBtn4.setText("Visualizar exame");
        ShowExamBtn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ShowExamBtn4.setBorderPainted(false);
        ShowExamBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ShowAppointmentsPanelLayout = new javax.swing.GroupLayout(ShowAppointmentsPanel);
        ShowAppointmentsPanel.setLayout(ShowAppointmentsPanelLayout);
        ShowAppointmentsPanelLayout.setHorizontalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                        .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SocialNameText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SocialNameFld2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BirthDateText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BirthDateFld2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
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
                            .addComponent(DeleteExamBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(13, 13, 13)
                            .addComponent(NewRecipeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ShowExamBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowAppointmentsPanelLayout.createSequentialGroup()
                            .addComponent(DeleteExamBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(13, 13, 13)
                            .addComponent(NewReferralBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ShowExamBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowAppointmentsPanelLayout.createSequentialGroup()
                            .addComponent(DeleteExamBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(13, 13, 13)
                            .addComponent(NewRecipeBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ShowExamBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                            .addComponent(DeleteExamBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(13, 13, 13)
                            .addComponent(NewExamBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ShowExamBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(47, 47, 47))
        );
        ShowAppointmentsPanelLayout.setVerticalGroup(
            ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowAppointmentsPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SocialNameText2)
                    .addComponent(BirthDateText2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SocialNameFld2)
                    .addComponent(BirthDateFld2))
                .addGap(18, 18, 18)
                .addComponent(ExamsText)
                .addGap(18, 18, 18)
                .addComponent(ExamsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewExamBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(ShowExamBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(DeleteExamBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(RecipesText)
                .addGap(18, 18, 18)
                .addComponent(RecipesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewRecipeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(ShowExamBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(DeleteExamBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(ReferralsText)
                .addGap(18, 18, 18)
                .addComponent(ReferralsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewReferralBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(ShowExamBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(DeleteExamBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(CertificatesText)
                .addGap(18, 18, 18)
                .addComponent(CertificatesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ShowAppointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewRecipeBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(ShowExamBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(DeleteExamBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );

        add(ShowAppointmentsPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void NewRecipeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRecipeBtnActionPerformed
        NewRecipePanel newRecipePanel = new NewRecipePanel();
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newRecipePanel);
    }//GEN-LAST:event_NewRecipeBtnActionPerformed

    private void NewReferralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewReferralBtnActionPerformed
        NewReferralPanel newrReferralPanel = new NewReferralPanel();
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newrReferralPanel);
    }//GEN-LAST:event_NewReferralBtnActionPerformed

    private void NewRecipeBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRecipeBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewRecipeBtn2ActionPerformed

    private void NewExamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewExamBtnActionPerformed
        NewExamPanel newExamPanel = new NewExamPanel();
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(newExamPanel);
    }//GEN-LAST:event_NewExamBtnActionPerformed

    private void DeleteExamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteExamBtnActionPerformed
        DeleteExam();
    }//GEN-LAST:event_DeleteExamBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BirthDateFld2;
    private javax.swing.JLabel BirthDateText2;
    private javax.swing.JScrollPane CertificatesPanel;
    private javax.swing.JTable CertificatesTable;
    private javax.swing.JLabel CertificatesText;
    private javax.swing.JButton DeleteExamBtn;
    private javax.swing.JButton DeleteExamBtn1;
    private javax.swing.JButton DeleteExamBtn2;
    private javax.swing.JButton DeleteExamBtn3;
    private javax.swing.JScrollPane ExamsPanel;
    private javax.swing.JTable ExamsTable;
    private javax.swing.JLabel ExamsText;
    private javax.swing.JButton NewExamBtn;
    private javax.swing.JButton NewRecipeBtn;
    private javax.swing.JButton NewRecipeBtn2;
    private javax.swing.JButton NewReferralBtn;
    private javax.swing.JScrollPane RecipesPanel;
    private javax.swing.JTable RecipesTable;
    private javax.swing.JLabel RecipesText;
    private javax.swing.JScrollPane ReferralsPanel;
    private javax.swing.JTable ReferralsTable;
    private javax.swing.JLabel ReferralsText;
    private javax.swing.JPanel ShowAppointmentsPanel;
    private javax.swing.JButton ShowExamBtn1;
    private javax.swing.JButton ShowExamBtn2;
    private javax.swing.JButton ShowExamBtn3;
    private javax.swing.JButton ShowExamBtn4;
    private javax.swing.JLabel SocialNameFld2;
    private javax.swing.JLabel SocialNameText2;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables

    private void SetTable()
    {
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
    
    private void UpdateExamTable()
    {
        ExamDAO examDAO          = new ExamDAO();
        ArrayList<ExamDTO> exams = examDAO.List();

        DefaultTableModel tableModel = (DefaultTableModel) ExamsTable.getModel();
        tableModel.setRowCount(0);

        for (ExamDTO exam : exams) 
        {
            Object[] row = new Object[] 
            {
                exam.getId(),
                exam.getDescription(),
                exam.getProfessionalId(),
                exam.getFormattedDate(),
            };
            
            tableModel.addRow(row);
        }
    }
    
    private void DeleteExam()
    {
        if (ExamsTable.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um exame.");
            return;
        }
        
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse exame?", "Excluir exame", JOptionPane.YES_NO_CANCEL_OPTION) != JOptionPane.YES_OPTION) return;
        
        ExamDAO examDAO = new ExamDAO();
        
        String id = ExamsTable.getValueAt(ExamsTable.getSelectedRow(), 0).toString();
        
        if (!examDAO.Delete((Integer.parseInt(id))))
        {
            JOptionPane.showMessageDialog(null, "Error: Não foi possível excluir o exame.");
            return;
        }
      
        UpdateExamTable();
    }
}
