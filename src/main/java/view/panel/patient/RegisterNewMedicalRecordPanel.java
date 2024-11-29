package view.panel.patient;

import controller.MainDAO;
import controller.MedicalRecordDAO;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import model.MedicalRecordDTO;
import model.PatientDTO;

public class RegisterNewMedicalRecordPanel extends javax.swing.JPanel 
{
    public RegisterNewMedicalRecordPanel() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MedicalRecordPanel = new javax.swing.JPanel();
        PersonalInfoText1 = new javax.swing.JLabel();
        NameText1 = new javax.swing.JLabel();
        SocialNameText1 = new javax.swing.JLabel();
        BirthDateText1 = new javax.swing.JLabel();
        PersonalInfoText2 = new javax.swing.JLabel();
        FamilyHisText1 = new javax.swing.JLabel();
        HealthInfoText1 = new javax.swing.JLabel();
        BloodTypeText1 = new javax.swing.JLabel();
        WeightText1 = new javax.swing.JLabel();
        HeightText1 = new javax.swing.JLabel();
        AllergiesText1 = new javax.swing.JLabel();
        MedicationText1 = new javax.swing.JLabel();
        DiseasesText1 = new javax.swing.JLabel();
        DiseasesHisText1 = new javax.swing.JLabel();
        SurgeryHisText1 = new javax.swing.JLabel();
        ObsText2 = new javax.swing.JLabel();
        AdditionalDataText1 = new javax.swing.JLabel();
        CancelBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        NameFld2 = new javax.swing.JTextField();
        PatientCodeFld = new javax.swing.JTextField();
        PatientNameFld = new javax.swing.JTextField();
        BloodTypeFld = new javax.swing.JTextField();
        WeightFld = new javax.swing.JTextField();
        HeightFld = new javax.swing.JTextField();
        ObsPanel = new javax.swing.JScrollPane();
        ObservationsFld = new javax.swing.JTextPane();
        ObsPanel1 = new javax.swing.JScrollPane();
        FamilyHistoryFld = new javax.swing.JTextPane();
        ObsPanel9 = new javax.swing.JScrollPane();
        SurgeryHistoryFld = new javax.swing.JTextPane();
        ObsPanel10 = new javax.swing.JScrollPane();
        DiseasesHistoryFld = new javax.swing.JTextPane();
        ObsPanel11 = new javax.swing.JScrollPane();
        DiseasesFld = new javax.swing.JTextPane();
        ObsPanel12 = new javax.swing.JScrollPane();
        MedicationsFld = new javax.swing.JTextPane();
        ObsPanel13 = new javax.swing.JScrollPane();
        AllergiesFld = new javax.swing.JTextPane();
        ObsText3 = new javax.swing.JLabel();
        StatusFld = new javax.swing.JTextField();

        MedicalRecordPanel.setBackground(new java.awt.Color(255, 255, 255));

        PersonalInfoText1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PersonalInfoText1.setForeground(new java.awt.Color(0, 0, 102));
        PersonalInfoText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonalInfoText1.setText("PRONTUÁRIO");
        PersonalInfoText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NameText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NameText1.setForeground(new java.awt.Color(0, 0, 102));
        NameText1.setText("Número do prontuário");
        NameText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SocialNameText1.setForeground(new java.awt.Color(0, 0, 102));
        SocialNameText1.setText("Código do paciente");
        SocialNameText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BirthDateText1.setForeground(new java.awt.Color(0, 0, 102));
        BirthDateText1.setText("Nome do paciente");
        BirthDateText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PersonalInfoText2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PersonalInfoText2.setForeground(new java.awt.Color(0, 0, 102));
        PersonalInfoText2.setText("INFORMAÇÕES BÁSICAS");
        PersonalInfoText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        FamilyHisText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FamilyHisText1.setForeground(new java.awt.Color(0, 0, 102));
        FamilyHisText1.setText("Histórico familiar");
        FamilyHisText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HealthInfoText1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HealthInfoText1.setForeground(new java.awt.Color(0, 0, 102));
        HealthInfoText1.setText("INFORMAÇÕES DE SAÚDE");
        HealthInfoText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BloodTypeText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BloodTypeText1.setForeground(new java.awt.Color(0, 0, 102));
        BloodTypeText1.setText("Tipo sanguíneo");
        BloodTypeText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        WeightText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        WeightText1.setForeground(new java.awt.Color(0, 0, 102));
        WeightText1.setText("Peso em quilos (apenas números)");
        WeightText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HeightText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        HeightText1.setForeground(new java.awt.Color(0, 0, 102));
        HeightText1.setText("Altura em centímetros (apenas números)");
        HeightText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AllergiesText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText1.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText1.setText("Alergias");
        AllergiesText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        MedicationText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MedicationText1.setForeground(new java.awt.Color(0, 0, 102));
        MedicationText1.setText("Medicamentos");
        MedicationText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        DiseasesText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DiseasesText1.setForeground(new java.awt.Color(0, 0, 102));
        DiseasesText1.setText("Doenças crônicas");
        DiseasesText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        DiseasesHisText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DiseasesHisText1.setForeground(new java.awt.Color(0, 0, 102));
        DiseasesHisText1.setText("Histórico de doenças");
        DiseasesHisText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SurgeryHisText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SurgeryHisText1.setForeground(new java.awt.Color(0, 0, 102));
        SurgeryHisText1.setText("Histórico de cirugias");
        SurgeryHisText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ObsText2.setForeground(new java.awt.Color(0, 0, 102));
        ObsText2.setText("Observações");
        ObsText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AdditionalDataText1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdditionalDataText1.setForeground(new java.awt.Color(0, 0, 102));
        AdditionalDataText1.setText("DADOS ADICIONAIS");
        AdditionalDataText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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

        SaveBtn.setBackground(new java.awt.Color(0, 0, 102));
        SaveBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Salvar");
        SaveBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SaveBtn.setBorderPainted(false);
        SaveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        NameFld2.setEditable(false);
        NameFld2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NameFld2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NameFld2.setFocusable(false);
        NameFld2.setMargin(new java.awt.Insets(2, 2, 2, 10));

        PatientCodeFld.setEditable(false);
        PatientCodeFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientCodeFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PatientCodeFld.setFocusable(false);
        PatientCodeFld.setMargin(new java.awt.Insets(2, 2, 2, 10));

        PatientNameFld.setEditable(false);
        PatientNameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientNameFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PatientNameFld.setFocusable(false);
        PatientNameFld.setMargin(new java.awt.Insets(2, 2, 2, 10));

        BloodTypeFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BloodTypeFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BloodTypeFld.setMargin(new java.awt.Insets(2, 2, 2, 10));

        WeightFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        WeightFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        WeightFld.setMargin(new java.awt.Insets(2, 2, 2, 10));

        HeightFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        HeightFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HeightFld.setMargin(new java.awt.Insets(2, 2, 2, 10));

        ObsPanel.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel.setBorder(null);
        ObsPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObservationsFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ObservationsFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObservationsFld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel.setViewportView(ObservationsFld);

        ObsPanel1.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel1.setBorder(null);
        ObsPanel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        FamilyHistoryFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FamilyHistoryFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        FamilyHistoryFld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel1.setViewportView(FamilyHistoryFld);

        ObsPanel9.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel9.setBorder(null);
        ObsPanel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        SurgeryHistoryFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SurgeryHistoryFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        SurgeryHistoryFld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel9.setViewportView(SurgeryHistoryFld);

        ObsPanel10.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel10.setBorder(null);
        ObsPanel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        DiseasesHistoryFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DiseasesHistoryFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        DiseasesHistoryFld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel10.setViewportView(DiseasesHistoryFld);

        ObsPanel11.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel11.setBorder(null);
        ObsPanel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        DiseasesFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DiseasesFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        DiseasesFld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel11.setViewportView(DiseasesFld);

        ObsPanel12.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel12.setBorder(null);
        ObsPanel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        MedicationsFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MedicationsFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        MedicationsFld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel12.setViewportView(MedicationsFld);

        ObsPanel13.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel13.setBorder(null);
        ObsPanel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        AllergiesFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AllergiesFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        AllergiesFld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel13.setViewportView(AllergiesFld);

        ObsText3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ObsText3.setForeground(new java.awt.Color(0, 0, 102));
        ObsText3.setText("Status");
        ObsText3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        StatusFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        StatusFld.setText("Ativo");
        StatusFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StatusFld.setMargin(new java.awt.Insets(2, 2, 2, 10));

        javax.swing.GroupLayout MedicalRecordPanelLayout = new javax.swing.GroupLayout(MedicalRecordPanel);
        MedicalRecordPanel.setLayout(MedicalRecordPanelLayout);
        MedicalRecordPanelLayout.setHorizontalGroup(
            MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(BloodTypeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(WeightFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HeightFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                            .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(SaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(AdditionalDataText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DiseasesHisText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DiseasesText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MedicationText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PersonalInfoText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MedicalRecordPanelLayout.createSequentialGroup()
                            .addComponent(NameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(SocialNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BirthDateText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(PersonalInfoText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MedicalRecordPanelLayout.createSequentialGroup()
                            .addComponent(BloodTypeText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(WeightText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(HeightText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(HealthInfoText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AllergiesText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FamilyHisText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SurgeryHisText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MedicalRecordPanelLayout.createSequentialGroup()
                            .addComponent(NameFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(PatientCodeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(PatientNameFld))
                        .addComponent(ObsPanel1)
                        .addComponent(ObsPanel9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ObsPanel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ObsPanel11, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ObsPanel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ObsPanel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                            .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                                    .addComponent(ObsText2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(ObsPanel))
                            .addGap(18, 18, 18)
                            .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ObsText3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(StatusFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        MedicalRecordPanelLayout.setVerticalGroup(
            MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(PersonalInfoText1)
                .addGap(18, 18, 18)
                .addComponent(PersonalInfoText2)
                .addGap(18, 18, 18)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameText1)
                    .addComponent(SocialNameText1)
                    .addComponent(BirthDateText1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameFld2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(PatientCodeFld, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(PatientNameFld, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(HealthInfoText1)
                .addGap(18, 18, 18)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WeightText1)
                    .addComponent(HeightText1)
                    .addComponent(BloodTypeText1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodTypeFld, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(WeightFld, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(HeightFld, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(AllergiesText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(MedicationText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(DiseasesText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(DiseasesHisText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(SurgeryHisText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(FamilyHisText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(AdditionalDataText1)
                .addGap(18, 18, 18)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ObsText2)
                    .addComponent(ObsText3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ObsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(StatusFld))
                .addGap(47, 47, 47)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(MedicalRecordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MedicalRecordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        InsertMedicalRecord();
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(null);
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(null);
        MainDAO.Singleton.INSTANCE.getMain().registerNewMedicalRecordPanel = new RegisterNewMedicalRecordPanel();
    }//GEN-LAST:event_CancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdditionalDataText1;
    private javax.swing.JTextPane AllergiesFld;
    private javax.swing.JLabel AllergiesText1;
    private javax.swing.JLabel BirthDateText1;
    private javax.swing.JTextField BloodTypeFld;
    private javax.swing.JLabel BloodTypeText1;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextPane DiseasesFld;
    private javax.swing.JLabel DiseasesHisText1;
    private javax.swing.JTextPane DiseasesHistoryFld;
    private javax.swing.JLabel DiseasesText1;
    private javax.swing.JLabel FamilyHisText1;
    private javax.swing.JTextPane FamilyHistoryFld;
    private javax.swing.JLabel HealthInfoText1;
    private javax.swing.JTextField HeightFld;
    private javax.swing.JLabel HeightText1;
    private javax.swing.JPanel MedicalRecordPanel;
    private javax.swing.JLabel MedicationText1;
    private javax.swing.JTextPane MedicationsFld;
    private javax.swing.JTextField NameFld2;
    private javax.swing.JLabel NameText1;
    private javax.swing.JScrollPane ObsPanel;
    private javax.swing.JScrollPane ObsPanel1;
    private javax.swing.JScrollPane ObsPanel10;
    private javax.swing.JScrollPane ObsPanel11;
    private javax.swing.JScrollPane ObsPanel12;
    private javax.swing.JScrollPane ObsPanel13;
    private javax.swing.JScrollPane ObsPanel9;
    private javax.swing.JLabel ObsText2;
    private javax.swing.JLabel ObsText3;
    private javax.swing.JTextPane ObservationsFld;
    private javax.swing.JTextField PatientCodeFld;
    private javax.swing.JTextField PatientNameFld;
    private javax.swing.JLabel PersonalInfoText1;
    private javax.swing.JLabel PersonalInfoText2;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel SocialNameText1;
    private javax.swing.JTextField StatusFld;
    private javax.swing.JLabel SurgeryHisText1;
    private javax.swing.JTextPane SurgeryHistoryFld;
    private javax.swing.JTextField WeightFld;
    private javax.swing.JLabel WeightText1;
    // End of variables declaration//GEN-END:variables

    public void SetData(PatientDTO patient)
    {
        Integer id = patient.getId();
        
        PatientCodeFld.setText(id.toString());
        PatientNameFld.setText(patient.getName());
    }
    
    private void InsertMedicalRecord()
    {
        MedicalRecordDTO medicalRecord = new MedicalRecordDTO();
        
        medicalRecord.setAllergies(AllergiesFld.getText());
        medicalRecord.setBloodType(BloodTypeFld.getText());
        medicalRecord.setPatientId(Integer.parseInt(PatientCodeFld.getText()));
        medicalRecord.setDiseases(DiseasesFld.getText());
        medicalRecord.setDiseasesHistory(DiseasesHistoryFld.getText());
        medicalRecord.setFamilyHistory(FamilyHistoryFld.getText());
        medicalRecord.setHeight(Double.parseDouble(HeightFld.getText()));
        medicalRecord.setMedications(MedicationsFld.getText());
        medicalRecord.setObservations(ObservationsFld.getText());
        medicalRecord.setStatus(StatusFld.getText());
        medicalRecord.setSurgeryHistory(SurgeryHistoryFld.getText());
        medicalRecord.setWeight(Double.parseDouble(WeightFld.getText()));
        
        try 
        {
            MedicalRecordDAO medicalRecordDAO = new MedicalRecordDAO();
            boolean sucess = medicalRecordDAO.Insert(medicalRecord);
            
            if (!sucess) JOptionPane.showMessageDialog(null, "Error: Não foi possível inserir o prontuário.");
            
        } 
        catch (HeadlessException ex) 
        {
            System.out.println("Error (RegisterNewMedicalRecord): " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error: Não foi possível inserir o prontuário.");
        }
    }
}
