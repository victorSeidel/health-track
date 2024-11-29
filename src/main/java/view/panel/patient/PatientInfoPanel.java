package view.panel.patient;

import controller.MainDAO;
import controller.SettingsDAO;
import model.PatientDTO;

public class PatientInfoPanel extends javax.swing.JPanel 
{
    public PatientInfoPanel() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        PersonalInfoText = new javax.swing.JLabel();
        NameText = new javax.swing.JLabel();
        NameFld = new javax.swing.JLabel();
        SocialNameText = new javax.swing.JLabel();
        SocialNameFld = new javax.swing.JLabel();
        BirthDateText = new javax.swing.JLabel();
        BirthDateFld = new javax.swing.JLabel();
        NationalityText = new javax.swing.JLabel();
        NationalityFld = new javax.swing.JLabel();
        NaturalnessText = new javax.swing.JLabel();
        NaturalnessFld = new javax.swing.JLabel();
        RaceText = new javax.swing.JLabel();
        RaceFld = new javax.swing.JLabel();
        SexText = new javax.swing.JLabel();
        SexFld = new javax.swing.JLabel();
        PatientIdText = new javax.swing.JLabel();
        PatientIdFld = new javax.swing.JLabel();
        CpfText = new javax.swing.JLabel();
        CpfFld = new javax.swing.JLabel();
        MotherText = new javax.swing.JLabel();
        MotherFld = new javax.swing.JLabel();
        FatherText = new javax.swing.JLabel();
        FatherFld = new javax.swing.JLabel();
        GuardianText = new javax.swing.JLabel();
        GuardianFld = new javax.swing.JLabel();
        Phone1Text = new javax.swing.JLabel();
        Phone1Fld = new javax.swing.JLabel();
        Phone2Text = new javax.swing.JLabel();
        Phone2Fld = new javax.swing.JLabel();
        EmailText = new javax.swing.JLabel();
        EmailFld = new javax.swing.JLabel();
        EmContactText = new javax.swing.JLabel();
        EmContactFld = new javax.swing.JLabel();
        EmNameText = new javax.swing.JLabel();
        EmNameFld = new javax.swing.JLabel();
        EmRelationText = new javax.swing.JLabel();
        EmRelationFld = new javax.swing.JLabel();
        AdressText = new javax.swing.JLabel();
        AdressFld = new javax.swing.JLabel();
        HealthInfoText = new javax.swing.JLabel();
        BloodTypeText = new javax.swing.JLabel();
        BloodTypeFld = new javax.swing.JLabel();
        WeightText = new javax.swing.JLabel();
        WeightFld = new javax.swing.JLabel();
        HeightText = new javax.swing.JLabel();
        HeightFld = new javax.swing.JLabel();
        AllergiesText = new javax.swing.JLabel();
        AllergiesPanel = new javax.swing.JScrollPane();
        AllergiesFld = new javax.swing.JTextPane();
        MedicationText = new javax.swing.JLabel();
        MedicationPanel = new javax.swing.JScrollPane();
        MedicationFld = new javax.swing.JTextPane();
        DiseasesText = new javax.swing.JLabel();
        DiseasesPanel = new javax.swing.JScrollPane();
        DiseasesFld = new javax.swing.JTextPane();
        ForMoreInfoText = new javax.swing.JLabel();
        GoToMedicalRecordBtn = new javax.swing.JButton();
        HealthPlanText = new javax.swing.JLabel();
        CnsText = new javax.swing.JLabel();
        CnsFld = new javax.swing.JLabel();
        PlanNameText = new javax.swing.JLabel();
        PlanNameFld = new javax.swing.JLabel();
        PlanNumberText = new javax.swing.JLabel();
        PlanNumberFld = new javax.swing.JLabel();
        AdditionalDataText = new javax.swing.JLabel();
        ObsText = new javax.swing.JLabel();
        ObsPanel = new javax.swing.JScrollPane();
        ObsFld = new javax.swing.JTextPane();
        StatusText = new javax.swing.JLabel();
        StatusFld = new javax.swing.JLabel();
        DeleteRegisterBtn = new javax.swing.JButton();
        EditDataBtn = new javax.swing.JButton();
        UpdateHistoryBtn2 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        Background.setBackground(new java.awt.Color(255, 255, 255));

        PersonalInfoText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PersonalInfoText.setForeground(new java.awt.Color(0, 0, 102));
        PersonalInfoText.setText("INFORMAÇÕES PESSOAIS");
        PersonalInfoText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NameText.setForeground(new java.awt.Color(0, 0, 102));
        NameText.setText("Nome de registro");
        NameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NameFld.setText("VICTOR GABRIEL MARTINS SEIDEL");
        NameFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SocialNameText.setForeground(new java.awt.Color(0, 0, 102));
        SocialNameText.setText("Nome social");
        SocialNameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        SocialNameFld.setText("VICTOR GABRIEL MARTINS SEIDEL");
        SocialNameFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BirthDateText.setForeground(new java.awt.Color(0, 0, 102));
        BirthDateText.setText("Data de nascimento");
        BirthDateText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BirthDateFld.setText("05/12/2005");
        BirthDateFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NationalityText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NationalityText.setForeground(new java.awt.Color(0, 0, 102));
        NationalityText.setText("Nacionalidade");
        NationalityText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NationalityFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NationalityFld.setText("BRASILEIRO");
        NationalityFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NaturalnessText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NaturalnessText.setForeground(new java.awt.Color(0, 0, 102));
        NaturalnessText.setText("Naturalidade");
        NaturalnessText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NaturalnessFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NaturalnessFld.setText("LINHARES");
        NaturalnessFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        RaceText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RaceText.setForeground(new java.awt.Color(0, 0, 102));
        RaceText.setText("Raça");
        RaceText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        RaceFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        RaceFld.setText("PARDA");
        RaceFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SexText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SexText.setForeground(new java.awt.Color(0, 0, 102));
        SexText.setText("Sexo");
        SexText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SexFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        SexFld.setText("MASCULINO");
        SexFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientIdText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PatientIdText.setForeground(new java.awt.Color(0, 0, 102));
        PatientIdText.setText("Código do paciente");
        PatientIdText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientIdFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientIdFld.setText("00000");
        PatientIdFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CpfText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CpfText.setForeground(new java.awt.Color(0, 0, 102));
        CpfText.setText("CPF");
        CpfText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CpfFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CpfFld.setText("15187131656");
        CpfFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        MotherText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MotherText.setForeground(new java.awt.Color(0, 0, 102));
        MotherText.setText("Mãe");
        MotherText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        MotherFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        MotherFld.setText("ANDRÉIA ALVES MARTINS");
        MotherFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        FatherText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FatherText.setForeground(new java.awt.Color(0, 0, 102));
        FatherText.setText("Pai");
        FatherText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        FatherFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        FatherFld.setText("GABRIEL SEIDEL DE FREITAS");
        FatherFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        GuardianText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GuardianText.setForeground(new java.awt.Color(0, 0, 102));
        GuardianText.setText("Responsável legal");
        GuardianText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        GuardianFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        GuardianFld.setText("-");
        GuardianFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Phone1Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Phone1Text.setForeground(new java.awt.Color(0, 0, 102));
        Phone1Text.setText("Telefone 1");
        Phone1Text.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Phone1Fld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Phone1Fld.setText("31995639780");
        Phone1Fld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Phone2Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Phone2Text.setForeground(new java.awt.Color(0, 0, 102));
        Phone2Text.setText("Telefone 2");
        Phone2Text.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Phone2Fld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Phone2Fld.setText("-");
        Phone2Fld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmailText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmailText.setForeground(new java.awt.Color(0, 0, 102));
        EmailText.setText("E-mail");
        EmailText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmailFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmailFld.setText("victorgabrielms88@gmail.com");
        EmailFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmContactText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmContactText.setForeground(new java.awt.Color(0, 0, 102));
        EmContactText.setText("Contato de emergência");
        EmContactText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmContactFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmContactFld.setText("3199403717");
        EmContactFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmNameText.setForeground(new java.awt.Color(0, 0, 102));
        EmNameText.setText("Nome do contato");
        EmNameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmNameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmNameFld.setText("ANDRÉIA ALVES MARTINS");
        EmNameFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmRelationText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmRelationText.setForeground(new java.awt.Color(0, 0, 102));
        EmRelationText.setText("Relação");
        EmRelationText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmRelationFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmRelationFld.setText("MÃE");
        EmRelationFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AdressText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AdressText.setForeground(new java.awt.Color(0, 0, 102));
        AdressText.setText("Endereço");
        AdressText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AdressFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        AdressFld.setText("Rua dos Aeronautas, 215 - Belo Horizonte, MG");
        AdressFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HealthInfoText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HealthInfoText.setForeground(new java.awt.Color(0, 0, 102));
        HealthInfoText.setText("INFORMAÇÕES DE SAÚDE");
        HealthInfoText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BloodTypeText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BloodTypeText.setForeground(new java.awt.Color(0, 0, 102));
        BloodTypeText.setText("Tipo sanguíneo");
        BloodTypeText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BloodTypeFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BloodTypeFld.setText("O+");
        BloodTypeFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        WeightText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        WeightText.setForeground(new java.awt.Color(0, 0, 102));
        WeightText.setText("Peso");
        WeightText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        WeightFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        WeightFld.setText("60 kg");
        WeightFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HeightText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        HeightText.setForeground(new java.awt.Color(0, 0, 102));
        HeightText.setText("Altura");
        HeightText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HeightFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        HeightFld.setText("181 cm");
        HeightFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AllergiesText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText.setText("Alergias");
        AllergiesText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AllergiesPanel.setBackground(new java.awt.Color(255, 255, 255));
        AllergiesPanel.setBorder(null);
        AllergiesPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        AllergiesFld.setEditable(false);
        AllergiesFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        AllergiesFld.setText("-");
        AllergiesFld.setFocusable(false);
        AllergiesPanel.setViewportView(AllergiesFld);

        MedicationText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MedicationText.setForeground(new java.awt.Color(0, 0, 102));
        MedicationText.setText("Medicamentos");
        MedicationText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        MedicationPanel.setBackground(new java.awt.Color(255, 255, 255));
        MedicationPanel.setBorder(null);
        MedicationPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        MedicationFld.setEditable(false);
        MedicationFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        MedicationFld.setText("-");
        MedicationFld.setFocusable(false);
        MedicationPanel.setViewportView(MedicationFld);

        DiseasesText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DiseasesText.setForeground(new java.awt.Color(0, 0, 102));
        DiseasesText.setText("Doenças crônicas");
        DiseasesText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        DiseasesPanel.setBackground(new java.awt.Color(255, 255, 255));
        DiseasesPanel.setBorder(null);
        DiseasesPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        DiseasesFld.setEditable(false);
        DiseasesFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        DiseasesFld.setText("-");
        DiseasesFld.setFocusable(false);
        DiseasesPanel.setViewportView(DiseasesFld);

        ForMoreInfoText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ForMoreInfoText.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ForMoreInfoText.setText("Para mais informações, acesse o prontuário do paciente.");

        GoToMedicalRecordBtn.setBackground(new java.awt.Color(0, 0, 102));
        GoToMedicalRecordBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        GoToMedicalRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        GoToMedicalRecordBtn.setText("Acessar prontuário");
        GoToMedicalRecordBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GoToMedicalRecordBtn.setBorderPainted(false);
        GoToMedicalRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoToMedicalRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToMedicalRecordBtnActionPerformed(evt);
            }
        });

        HealthPlanText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HealthPlanText.setForeground(new java.awt.Color(0, 0, 102));
        HealthPlanText.setText("INFORMAÇÕES DE PLANO DE SAÚDE");
        HealthPlanText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CnsText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CnsText.setForeground(new java.awt.Color(0, 0, 102));
        CnsText.setText("CNS");
        CnsText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CnsFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CnsFld.setText("703608040761038");
        CnsFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PlanNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PlanNameText.setForeground(new java.awt.Color(0, 0, 102));
        PlanNameText.setText("Plano de saúde");
        PlanNameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PlanNameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PlanNameFld.setText("-");
        PlanNameFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PlanNumberText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PlanNumberText.setForeground(new java.awt.Color(0, 0, 102));
        PlanNumberText.setText("Número");
        PlanNumberText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PlanNumberFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PlanNumberFld.setText("-");
        PlanNumberFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AdditionalDataText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdditionalDataText.setForeground(new java.awt.Color(0, 0, 102));
        AdditionalDataText.setText("DADOS ADICIONAIS");
        AdditionalDataText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ObsText.setForeground(new java.awt.Color(0, 0, 102));
        ObsText.setText("Observações");
        ObsText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsPanel.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel.setBorder(null);
        ObsPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld.setEditable(false);
        ObsFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObsFld.setText("-");
        ObsFld.setFocusable(false);
        ObsPanel.setViewportView(ObsFld);

        StatusText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StatusText.setForeground(new java.awt.Color(0, 0, 102));
        StatusText.setText("Status");
        StatusText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        StatusFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        StatusFld.setText("ATIVO");
        StatusFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        DeleteRegisterBtn.setBackground(new java.awt.Color(0, 0, 102));
        DeleteRegisterBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteRegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteRegisterBtn.setText("Histórico de atualizações");
        DeleteRegisterBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteRegisterBtn.setBorderPainted(false);
        DeleteRegisterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        EditDataBtn.setBackground(new java.awt.Color(0, 0, 102));
        EditDataBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EditDataBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditDataBtn.setText("Editar dados");
        EditDataBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EditDataBtn.setBorderPainted(false);
        EditDataBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        UpdateHistoryBtn2.setBackground(new java.awt.Color(204, 0, 0));
        UpdateHistoryBtn2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn2.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn2.setText("Excluir cadastro");
        UpdateHistoryBtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn2.setBorderPainted(false);
        UpdateHistoryBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(AdditionalDataText, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(MotherText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(MotherFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FatherText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(FatherFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(GuardianText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(GuardianFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BloodTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BloodTypeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(WeightText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(WeightFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(HeightText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(HeightFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(PersonalInfoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SexText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SexFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PatientIdText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PatientIdFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CpfText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CpfFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(HealthInfoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(AdressText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(EmContactFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(EmContactText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(NationalityText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(NationalityFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(Phone1Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(Phone1Fld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(NameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(NameFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(EmNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(NaturalnessText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(NaturalnessFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(Phone2Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(Phone2Fld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(SocialNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(SocialNameFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                                                    .addComponent(EmNameFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(AdressFld, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RaceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(RaceFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(BirthDateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BirthDateFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EmailText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EmailFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(EmRelationText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EmRelationFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(ForMoreInfoText, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(AllergiesPanel)
                                                .addComponent(AllergiesText, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(MedicationText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(MedicationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DiseasesText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DiseasesPanel))))
                            .addComponent(GoToMedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(HealthPlanText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CnsFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(CnsText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PlanNameFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PlanNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PlanNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(PlanNumberFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(BackgroundLayout.createSequentialGroup()
                                                .addComponent(ObsText, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(305, 305, 305))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                                        .addComponent(UpdateHistoryBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(EditDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(ObsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)))
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(StatusFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(StatusText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DeleteRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(47, 47, 47))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(PersonalInfoText)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameText)
                    .addComponent(SocialNameText)
                    .addComponent(BirthDateText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameFld)
                    .addComponent(SocialNameFld)
                    .addComponent(BirthDateFld))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(NationalityText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NationalityFld))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(NaturalnessText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NaturalnessFld))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(RaceText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RaceFld)))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(PatientIdText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientIdFld))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(CpfText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CpfFld))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(SexText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SexFld)))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(MotherText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MotherFld))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(FatherText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FatherFld))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(GuardianText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GuardianFld)))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addComponent(Phone1Text)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Phone1Fld))
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addComponent(Phone2Text)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Phone2Fld)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(EmailText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailFld)))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(EmContactText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmContactFld))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EmRelationText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmNameFld)
                            .addComponent(EmRelationFld, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addComponent(AdressText, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdressFld)
                .addGap(47, 47, 47)
                .addComponent(HealthInfoText)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(BloodTypeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BloodTypeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(WeightText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WeightFld))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(HeightText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HeightFld)))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AllergiesText)
                    .addComponent(MedicationText)
                    .addComponent(DiseasesText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AllergiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedicationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiseasesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoToMedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ForMoreInfoText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(HealthPlanText)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(CnsText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CnsFld, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlanNameText)
                            .addComponent(PlanNumberText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlanNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlanNumberFld, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addComponent(AdditionalDataText)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatusText)
                    .addComponent(ObsText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ObsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusFld, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateHistoryBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        add(Background, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void GoToMedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToMedicalRecordBtnActionPerformed
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(MainDAO.Singleton.INSTANCE.getMain().medicalRecordPanel);
    }//GEN-LAST:event_GoToMedicalRecordBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdditionalDataText;
    private javax.swing.JLabel AdressFld;
    private javax.swing.JLabel AdressText;
    private javax.swing.JTextPane AllergiesFld;
    private javax.swing.JScrollPane AllergiesPanel;
    private javax.swing.JLabel AllergiesText;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BirthDateFld;
    private javax.swing.JLabel BirthDateText;
    private javax.swing.JLabel BloodTypeFld;
    private javax.swing.JLabel BloodTypeText;
    private javax.swing.JLabel CnsFld;
    private javax.swing.JLabel CnsText;
    private javax.swing.JLabel CpfFld;
    private javax.swing.JLabel CpfText;
    private javax.swing.JButton DeleteRegisterBtn;
    private javax.swing.JTextPane DiseasesFld;
    private javax.swing.JScrollPane DiseasesPanel;
    private javax.swing.JLabel DiseasesText;
    private javax.swing.JButton EditDataBtn;
    private javax.swing.JLabel EmContactFld;
    private javax.swing.JLabel EmContactText;
    private javax.swing.JLabel EmNameFld;
    private javax.swing.JLabel EmNameText;
    private javax.swing.JLabel EmRelationFld;
    private javax.swing.JLabel EmRelationText;
    private javax.swing.JLabel EmailFld;
    private javax.swing.JLabel EmailText;
    private javax.swing.JLabel FatherFld;
    private javax.swing.JLabel FatherText;
    private javax.swing.JLabel ForMoreInfoText;
    private javax.swing.JButton GoToMedicalRecordBtn;
    private javax.swing.JLabel GuardianFld;
    private javax.swing.JLabel GuardianText;
    private javax.swing.JLabel HealthInfoText;
    private javax.swing.JLabel HealthPlanText;
    private javax.swing.JLabel HeightFld;
    private javax.swing.JLabel HeightText;
    private javax.swing.JTextPane MedicationFld;
    private javax.swing.JScrollPane MedicationPanel;
    private javax.swing.JLabel MedicationText;
    private javax.swing.JLabel MotherFld;
    private javax.swing.JLabel MotherText;
    private javax.swing.JLabel NameFld;
    private javax.swing.JLabel NameText;
    private javax.swing.JLabel NationalityFld;
    private javax.swing.JLabel NationalityText;
    private javax.swing.JLabel NaturalnessFld;
    private javax.swing.JLabel NaturalnessText;
    private javax.swing.JTextPane ObsFld;
    private javax.swing.JScrollPane ObsPanel;
    private javax.swing.JLabel ObsText;
    private javax.swing.JLabel PatientIdFld;
    private javax.swing.JLabel PatientIdText;
    private javax.swing.JLabel PersonalInfoText;
    private javax.swing.JLabel Phone1Fld;
    private javax.swing.JLabel Phone1Text;
    private javax.swing.JLabel Phone2Fld;
    private javax.swing.JLabel Phone2Text;
    private javax.swing.JLabel PlanNameFld;
    private javax.swing.JLabel PlanNameText;
    private javax.swing.JLabel PlanNumberFld;
    private javax.swing.JLabel PlanNumberText;
    private javax.swing.JLabel RaceFld;
    private javax.swing.JLabel RaceText;
    private javax.swing.JLabel SexFld;
    private javax.swing.JLabel SexText;
    private javax.swing.JLabel SocialNameFld;
    private javax.swing.JLabel SocialNameText;
    private javax.swing.JLabel StatusFld;
    private javax.swing.JLabel StatusText;
    private javax.swing.JButton UpdateHistoryBtn2;
    private javax.swing.JLabel WeightFld;
    private javax.swing.JLabel WeightText;
    // End of variables declaration//GEN-END:variables

    public void SetData()
    {
        PatientDTO patient = SettingsDAO.Singleton.INSTANCE.getPatient();
                
        PatientIdFld.setText(String.valueOf(patient.getId()));
        NameFld.setText(patient.getName());
        SocialNameFld.setText(patient.getSocialName());
        BirthDateFld.setText(patient.getFormattedBirthDate());
        CpfFld.setText(patient.getCpf());
        NationalityFld.setText(patient.getNationality());
        NaturalnessFld.setText(patient.getNaturalness());
        RaceFld.setText(patient.getRace());
        SexFld.setText(patient.getSex());
        MotherFld.setText(patient.getMother());
        FatherFld.setText(patient.getFather());
        GuardianFld.setText(patient.getGuardian());
        Phone1Fld.setText(patient.getPhone1());
        Phone2Fld.setText(patient.getPhone2());
        EmailFld.setText(patient.getEmail());
        EmContactFld.setText(patient.getEmergencyPhone());
        EmNameFld.setText(patient.getEmergencyName());
        EmRelationFld.setText(patient.getEmergencyRelation());
        AdressFld.setText(patient.getAdress());
    }
}
