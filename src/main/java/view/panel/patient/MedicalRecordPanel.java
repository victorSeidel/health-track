package view.panel.patient;

import controller.MainDAO;
import controller.SettingsDAO;
import model.MedicalRecordDTO;
import model.PatientDTO;

public class MedicalRecordPanel extends javax.swing.JPanel 
{
    public MedicalRecordPanel() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MedicalRecordPanel = new javax.swing.JPanel();
        PersonalInfoText1 = new javax.swing.JLabel();
        NameText1 = new javax.swing.JLabel();
        CodeFld = new javax.swing.JLabel();
        SocialNameText1 = new javax.swing.JLabel();
        PatientCodeFld = new javax.swing.JLabel();
        BirthDateText1 = new javax.swing.JLabel();
        PatientNameFld = new javax.swing.JLabel();
        PersonalInfoText2 = new javax.swing.JLabel();
        ServiceHistoryText1 = new javax.swing.JLabel();
        AppointmentsBtn1 = new javax.swing.JButton();
        HospitalizationsBtn1 = new javax.swing.JButton();
        PrescriptionsBtn = new javax.swing.JButton();
        FamilyHisText1 = new javax.swing.JLabel();
        HealthInfoText1 = new javax.swing.JLabel();
        BloodTypeText1 = new javax.swing.JLabel();
        BloodTypeFld = new javax.swing.JLabel();
        WeightText1 = new javax.swing.JLabel();
        WeightFld = new javax.swing.JLabel();
        HeightText1 = new javax.swing.JLabel();
        HeightFld = new javax.swing.JLabel();
        AllergiesText1 = new javax.swing.JLabel();
        MedicationText1 = new javax.swing.JLabel();
        DiseasesText1 = new javax.swing.JLabel();
        DiseasesHisText1 = new javax.swing.JLabel();
        SurgeryHisText1 = new javax.swing.JLabel();
        ObsText2 = new javax.swing.JLabel();
        ObsPanel2 = new javax.swing.JScrollPane();
        ObservationsFld = new javax.swing.JTextPane();
        StatusText2 = new javax.swing.JLabel();
        StatusFld = new javax.swing.JLabel();
        AdditionalDataText1 = new javax.swing.JLabel();
        ObsPanel3 = new javax.swing.JScrollPane();
        FamilyHistoryFld = new javax.swing.JTextPane();
        ObsPanel4 = new javax.swing.JScrollPane();
        SurgeryHistoryFld = new javax.swing.JTextPane();
        ObsPanel5 = new javax.swing.JScrollPane();
        DiseasesHistoryFld = new javax.swing.JTextPane();
        ObsPanel6 = new javax.swing.JScrollPane();
        MedicationsFld = new javax.swing.JTextPane();
        ObsPanel7 = new javax.swing.JScrollPane();
        AllergiesFld = new javax.swing.JTextPane();
        ObsPanel8 = new javax.swing.JScrollPane();
        DiseasesFld = new javax.swing.JTextPane();
        UpdateHistoryBtn = new javax.swing.JButton();
        PrintRecordBtn = new javax.swing.JButton();
        ClinicalEvolutionBtn = new javax.swing.JButton();

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

        CodeFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CodeFld.setText("123456");
        CodeFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SocialNameText1.setForeground(new java.awt.Color(0, 0, 102));
        SocialNameText1.setText("Código do paciente");
        SocialNameText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientCodeFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientCodeFld.setText("000000");
        PatientCodeFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BirthDateText1.setForeground(new java.awt.Color(0, 0, 102));
        BirthDateText1.setText("Nome do paciente");
        BirthDateText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientNameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientNameFld.setText("VICTOR GABRIEL MARTINS SEIDEL");
        PatientNameFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PersonalInfoText2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PersonalInfoText2.setForeground(new java.awt.Color(0, 0, 102));
        PersonalInfoText2.setText("INFORMAÇÕES BÁSICAS");
        PersonalInfoText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ServiceHistoryText1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ServiceHistoryText1.setForeground(new java.awt.Color(0, 0, 102));
        ServiceHistoryText1.setText("HISTÓRICO DE ATENDIMENTO");
        ServiceHistoryText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AppointmentsBtn1.setBackground(new java.awt.Color(0, 0, 102));
        AppointmentsBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AppointmentsBtn1.setForeground(new java.awt.Color(255, 255, 255));
        AppointmentsBtn1.setText("Consultas");
        AppointmentsBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AppointmentsBtn1.setBorderPainted(false);
        AppointmentsBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        HospitalizationsBtn1.setBackground(new java.awt.Color(0, 0, 102));
        HospitalizationsBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        HospitalizationsBtn1.setForeground(new java.awt.Color(255, 255, 255));
        HospitalizationsBtn1.setText("Internações");
        HospitalizationsBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HospitalizationsBtn1.setBorderPainted(false);
        HospitalizationsBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        PrescriptionsBtn.setBackground(new java.awt.Color(0, 0, 102));
        PrescriptionsBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PrescriptionsBtn.setForeground(new java.awt.Color(255, 255, 255));
        PrescriptionsBtn.setText("Prescrições");
        PrescriptionsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PrescriptionsBtn.setBorderPainted(false);
        PrescriptionsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrescriptionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrescriptionsBtnActionPerformed(evt);
            }
        });

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

        BloodTypeFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BloodTypeFld.setText("O+");
        BloodTypeFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        WeightText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        WeightText1.setForeground(new java.awt.Color(0, 0, 102));
        WeightText1.setText("Peso");
        WeightText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        WeightFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        WeightFld.setText("60 kg");
        WeightFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HeightText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        HeightText1.setForeground(new java.awt.Color(0, 0, 102));
        HeightText1.setText("Altura");
        HeightText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HeightFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        HeightFld.setText("181 cm");
        HeightFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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

        ObsPanel2.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel2.setBorder(null);
        ObsPanel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObservationsFld.setEditable(false);
        ObservationsFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObservationsFld.setText("-");
        ObservationsFld.setFocusable(false);
        ObsPanel2.setViewportView(ObservationsFld);

        StatusText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StatusText2.setForeground(new java.awt.Color(0, 0, 102));
        StatusText2.setText("Status");
        StatusText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        StatusFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        StatusFld.setText("ATIVO");
        StatusFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AdditionalDataText1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdditionalDataText1.setForeground(new java.awt.Color(0, 0, 102));
        AdditionalDataText1.setText("DADOS ADICIONAIS");
        AdditionalDataText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsPanel3.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel3.setBorder(null);
        ObsPanel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        FamilyHistoryFld.setEditable(false);
        FamilyHistoryFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        FamilyHistoryFld.setText("-");
        FamilyHistoryFld.setFocusable(false);
        ObsPanel3.setViewportView(FamilyHistoryFld);

        ObsPanel4.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel4.setBorder(null);
        ObsPanel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        SurgeryHistoryFld.setEditable(false);
        SurgeryHistoryFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        SurgeryHistoryFld.setText("-");
        SurgeryHistoryFld.setFocusable(false);
        ObsPanel4.setViewportView(SurgeryHistoryFld);

        ObsPanel5.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel5.setBorder(null);
        ObsPanel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        DiseasesHistoryFld.setEditable(false);
        DiseasesHistoryFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        DiseasesHistoryFld.setText("-");
        DiseasesHistoryFld.setFocusable(false);
        ObsPanel5.setViewportView(DiseasesHistoryFld);

        ObsPanel6.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel6.setBorder(null);
        ObsPanel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        MedicationsFld.setEditable(false);
        MedicationsFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        MedicationsFld.setText("-");
        MedicationsFld.setFocusable(false);
        ObsPanel6.setViewportView(MedicationsFld);

        ObsPanel7.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel7.setBorder(null);
        ObsPanel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        AllergiesFld.setEditable(false);
        AllergiesFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        AllergiesFld.setText("-");
        AllergiesFld.setFocusable(false);
        ObsPanel7.setViewportView(AllergiesFld);

        ObsPanel8.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel8.setBorder(null);
        ObsPanel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        DiseasesFld.setEditable(false);
        DiseasesFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        DiseasesFld.setText("-");
        DiseasesFld.setFocusable(false);
        ObsPanel8.setViewportView(DiseasesFld);

        UpdateHistoryBtn.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn.setText("Histórico de atualizações");
        UpdateHistoryBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn.setBorderPainted(false);
        UpdateHistoryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        PrintRecordBtn.setBackground(new java.awt.Color(0, 0, 102));
        PrintRecordBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PrintRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        PrintRecordBtn.setText("Imprimir prontuário");
        PrintRecordBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PrintRecordBtn.setBorderPainted(false);
        PrintRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ClinicalEvolutionBtn.setBackground(new java.awt.Color(0, 0, 102));
        ClinicalEvolutionBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ClinicalEvolutionBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClinicalEvolutionBtn.setText("Evolução Clínica");
        ClinicalEvolutionBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClinicalEvolutionBtn.setBorderPainted(false);
        ClinicalEvolutionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClinicalEvolutionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClinicalEvolutionBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MedicalRecordPanelLayout = new javax.swing.GroupLayout(MedicalRecordPanel);
        MedicalRecordPanel.setLayout(MedicalRecordPanelLayout);
        MedicalRecordPanelLayout.setHorizontalGroup(
            MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdditionalDataText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ObsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ObsText2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusText2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DiseasesHisText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiseasesText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedicationText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonalInfoText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CodeFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SocialNameText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PatientCodeFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BirthDateText1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(PatientNameFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(PersonalInfoText2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ServiceHistoryText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(AppointmentsBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrescriptionsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HospitalizationsBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClinicalEvolutionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BloodTypeText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BloodTypeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(WeightText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WeightFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HeightText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HeightFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(HealthInfoText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllergiesText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FamilyHisText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SurgeryHisText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ObsPanel3)
                    .addComponent(ObsPanel4)
                    .addComponent(ObsPanel5)
                    .addComponent(ObsPanel6)
                    .addComponent(ObsPanel7)
                    .addComponent(ObsPanel8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(UpdateHistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PrintRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(CodeFld)
                    .addComponent(PatientCodeFld)
                    .addComponent(PatientNameFld))
                .addGap(47, 47, 47)
                .addComponent(ServiceHistoryText1)
                .addGap(18, 18, 18)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppointmentsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrescriptionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HospitalizationsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClinicalEvolutionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(HealthInfoText1)
                .addGap(18, 18, 18)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(BloodTypeText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BloodTypeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(WeightText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WeightFld))
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(HeightText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HeightFld)))
                .addGap(18, 18, 18)
                .addComponent(AllergiesText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MedicationText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DiseasesText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DiseasesHisText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SurgeryHisText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FamilyHisText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdditionalDataText1)
                .addGap(18, 18, 18)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(ObsText2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ObsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(StatusText2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StatusFld, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrintRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MedicalRecordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MedicalRecordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PrescriptionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrescriptionsBtnActionPerformed
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(MainDAO.Singleton.INSTANCE.getMain().prescriptionsPanel);
    }//GEN-LAST:event_PrescriptionsBtnActionPerformed

    private void ClinicalEvolutionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClinicalEvolutionBtnActionPerformed
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(MainDAO.Singleton.INSTANCE.getMain().clinicalEvolutionPanel);
    }//GEN-LAST:event_ClinicalEvolutionBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdditionalDataText1;
    private javax.swing.JTextPane AllergiesFld;
    private javax.swing.JLabel AllergiesText1;
    private javax.swing.JButton AppointmentsBtn1;
    private javax.swing.JLabel BirthDateText1;
    private javax.swing.JLabel BloodTypeFld;
    private javax.swing.JLabel BloodTypeText1;
    private javax.swing.JButton ClinicalEvolutionBtn;
    private javax.swing.JLabel CodeFld;
    private javax.swing.JTextPane DiseasesFld;
    private javax.swing.JLabel DiseasesHisText1;
    private javax.swing.JTextPane DiseasesHistoryFld;
    private javax.swing.JLabel DiseasesText1;
    private javax.swing.JLabel FamilyHisText1;
    private javax.swing.JTextPane FamilyHistoryFld;
    private javax.swing.JLabel HealthInfoText1;
    private javax.swing.JLabel HeightFld;
    private javax.swing.JLabel HeightText1;
    private javax.swing.JButton HospitalizationsBtn1;
    private javax.swing.JPanel MedicalRecordPanel;
    private javax.swing.JLabel MedicationText1;
    private javax.swing.JTextPane MedicationsFld;
    private javax.swing.JLabel NameText1;
    private javax.swing.JScrollPane ObsPanel2;
    private javax.swing.JScrollPane ObsPanel3;
    private javax.swing.JScrollPane ObsPanel4;
    private javax.swing.JScrollPane ObsPanel5;
    private javax.swing.JScrollPane ObsPanel6;
    private javax.swing.JScrollPane ObsPanel7;
    private javax.swing.JScrollPane ObsPanel8;
    private javax.swing.JLabel ObsText2;
    private javax.swing.JTextPane ObservationsFld;
    private javax.swing.JLabel PatientCodeFld;
    private javax.swing.JLabel PatientNameFld;
    private javax.swing.JLabel PersonalInfoText1;
    private javax.swing.JLabel PersonalInfoText2;
    private javax.swing.JButton PrescriptionsBtn;
    private javax.swing.JButton PrintRecordBtn;
    private javax.swing.JLabel ServiceHistoryText1;
    private javax.swing.JLabel SocialNameText1;
    private javax.swing.JLabel StatusFld;
    private javax.swing.JLabel StatusText2;
    private javax.swing.JLabel SurgeryHisText1;
    private javax.swing.JTextPane SurgeryHistoryFld;
    private javax.swing.JButton UpdateHistoryBtn;
    private javax.swing.JLabel WeightFld;
    private javax.swing.JLabel WeightText1;
    // End of variables declaration//GEN-END:variables

    public void SetData()
    {
        MedicalRecordDTO medicalRecord = SettingsDAO.Singleton.INSTANCE.getMedicalRecord();;
        PatientDTO patient = SettingsDAO.Singleton.INSTANCE.getPatient();
        
        AllergiesFld.setText(medicalRecord.getAllergies());
        BloodTypeFld.setText(medicalRecord.getBloodType());
        CodeFld.setText(String.valueOf(medicalRecord.getId()));
        DiseasesFld.setText(medicalRecord.getDiseases());
        DiseasesHistoryFld.setText(medicalRecord.getDiseasesHistory());
        FamilyHistoryFld.setText(medicalRecord.getFamilyHistory());
        HeightFld.setText(String.valueOf(medicalRecord.getHeight()) + " cm");
        MedicationsFld.setText(medicalRecord.getMedications());
        ObservationsFld.setText(medicalRecord.getObservations());
        PatientCodeFld.setText(String.valueOf(medicalRecord.getPatientId()));
        StatusFld.setText(medicalRecord.getStatus());
        SurgeryHistoryFld.setText(medicalRecord.getSurgeryHistory());
        WeightFld.setText(String.valueOf(medicalRecord.getWeight()) + " kg");
        
        Integer id = patient.getId();
        PatientNameFld.setText(patient.getName());
        PatientCodeFld.setText(id.toString());
    }
}
