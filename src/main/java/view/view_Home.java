package view;

import java.awt.Component;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class view_Home extends javax.swing.JFrame 
{
    public view_Home() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientInfoPanel = new javax.swing.JPanel();
        PersonalInfoText = new javax.swing.JLabel();
        NameText = new javax.swing.JLabel();
        NameFld = new javax.swing.JLabel();
        SocialNameText = new javax.swing.JLabel();
        SocialNameFld = new javax.swing.JLabel();
        BirthDateText = new javax.swing.JLabel();
        BirthDateFld = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RaceText = new javax.swing.JLabel();
        RaceFld = new javax.swing.JLabel();
        SexText = new javax.swing.JLabel();
        SexFld = new javax.swing.JLabel();
        PatientCodeText = new javax.swing.JLabel();
        PatientCodeFld = new javax.swing.JLabel();
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
        EmContacttFld = new javax.swing.JLabel();
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
        LastUpdateText = new javax.swing.JLabel();
        LastUpdateFld = new javax.swing.JLabel();
        UpdateByText = new javax.swing.JLabel();
        UpdateByFld = new javax.swing.JLabel();
        UpdateHistoryBtn = new javax.swing.JButton();
        MedicalRecordPanel = new javax.swing.JPanel();
        PersonalInfoText1 = new javax.swing.JLabel();
        NameText1 = new javax.swing.JLabel();
        NameFld1 = new javax.swing.JLabel();
        SocialNameText1 = new javax.swing.JLabel();
        SocialNameFld1 = new javax.swing.JLabel();
        BirthDateText1 = new javax.swing.JLabel();
        BirthDateFld1 = new javax.swing.JLabel();
        PersonalInfoText2 = new javax.swing.JLabel();
        ServiceHistoryText1 = new javax.swing.JLabel();
        AppointmentsBtn1 = new javax.swing.JButton();
        ExamsBtn1 = new javax.swing.JButton();
        HospitalizationsBtn1 = new javax.swing.JButton();
        HospitalizationsBtn2 = new javax.swing.JButton();
        FamilyHisText1 = new javax.swing.JLabel();
        HealthInfoText1 = new javax.swing.JLabel();
        BloodTypeText1 = new javax.swing.JLabel();
        BloodTypeFld1 = new javax.swing.JLabel();
        WeightText1 = new javax.swing.JLabel();
        WeightFld1 = new javax.swing.JLabel();
        HeightText1 = new javax.swing.JLabel();
        HeightFld1 = new javax.swing.JLabel();
        AllergiesText1 = new javax.swing.JLabel();
        MedicationText1 = new javax.swing.JLabel();
        DiseasesText1 = new javax.swing.JLabel();
        DiseasesHisText1 = new javax.swing.JLabel();
        SurgeryHisText1 = new javax.swing.JLabel();
        LastUpdateText2 = new javax.swing.JLabel();
        LastUpdateFld2 = new javax.swing.JLabel();
        UpdateByText2 = new javax.swing.JLabel();
        UpdateByFld2 = new javax.swing.JLabel();
        UpdateHistoryBtn2 = new javax.swing.JButton();
        ObsText2 = new javax.swing.JLabel();
        ObsPanel2 = new javax.swing.JScrollPane();
        ObsFld2 = new javax.swing.JTextPane();
        StatusText2 = new javax.swing.JLabel();
        StatusFld2 = new javax.swing.JLabel();
        AdditionalDataText1 = new javax.swing.JLabel();
        ObsPanel3 = new javax.swing.JScrollPane();
        ObsFld3 = new javax.swing.JTextPane();
        ObsPanel4 = new javax.swing.JScrollPane();
        ObsFld4 = new javax.swing.JTextPane();
        ObsPanel5 = new javax.swing.JScrollPane();
        ObsFld5 = new javax.swing.JTextPane();
        ObsPanel6 = new javax.swing.JScrollPane();
        ObsFld6 = new javax.swing.JTextPane();
        ObsPanel7 = new javax.swing.JScrollPane();
        ObsFld7 = new javax.swing.JTextPane();
        ObsPanel8 = new javax.swing.JScrollPane();
        ObsFld8 = new javax.swing.JTextPane();
        ObsText1 = new javax.swing.JLabel();
        ObsPanel1 = new javax.swing.JScrollPane();
        ObsFld1 = new javax.swing.JTextPane();
        StatusText1 = new javax.swing.JLabel();
        StatusFld1 = new javax.swing.JLabel();
        LastUpdateText1 = new javax.swing.JLabel();
        LastUpdateFld1 = new javax.swing.JLabel();
        UpdateByText1 = new javax.swing.JLabel();
        UpdateByFld1 = new javax.swing.JLabel();
        UpdateHistoryBtn1 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        NavBarPanel = new javax.swing.JPanel();
        SoftwareNameText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SideBarPanel = new javax.swing.JPanel();
        PatientInfoBtn = new javax.swing.JButton();
        MedicalRecordBtn = new javax.swing.JButton();
        PatientPanel = new javax.swing.JPanel();
        PatientNameText = new javax.swing.JLabel();
        PatientInfoText = new javax.swing.JLabel();
        ScrollPanel = new javax.swing.JScrollPane();

        PatientInfoPanel.setBackground(new java.awt.Color(255, 255, 255));

        PersonalInfoText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PersonalInfoText.setForeground(new java.awt.Color(0, 0, 102));
        PersonalInfoText.setText("INFORMAÇÕES PESSOAIS");
        PersonalInfoText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NameText.setForeground(new java.awt.Color(0, 0, 102));
        NameText.setText("Nome de registro");
        NameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NameFld.setForeground(new java.awt.Color(0, 0, 0));
        NameFld.setText("VICTOR GABRIEL MARTINS SEIDEL");
        NameFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SocialNameText.setForeground(new java.awt.Color(0, 0, 102));
        SocialNameText.setText("Nome social");
        SocialNameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        SocialNameFld.setForeground(new java.awt.Color(0, 0, 0));
        SocialNameFld.setText("VICTOR GABRIEL MARTINS SEIDEL");
        SocialNameFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BirthDateText.setForeground(new java.awt.Color(0, 0, 102));
        BirthDateText.setText("Data de nascimento");
        BirthDateText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BirthDateFld.setForeground(new java.awt.Color(0, 0, 0));
        BirthDateFld.setText("05/12/2005");
        BirthDateFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Nacionalidade");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("BRASILEIRO");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Naturalidade");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("LINHARES");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        RaceText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RaceText.setForeground(new java.awt.Color(0, 0, 102));
        RaceText.setText("Raça");
        RaceText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        RaceFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        RaceFld.setForeground(new java.awt.Color(0, 0, 0));
        RaceFld.setText("PARDA");
        RaceFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SexText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SexText.setForeground(new java.awt.Color(0, 0, 102));
        SexText.setText("Sexo");
        SexText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SexFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        SexFld.setForeground(new java.awt.Color(0, 0, 0));
        SexFld.setText("MASCULINO");
        SexFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientCodeText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PatientCodeText.setForeground(new java.awt.Color(0, 0, 102));
        PatientCodeText.setText("Código do paciente");
        PatientCodeText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientCodeFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientCodeFld.setForeground(new java.awt.Color(0, 0, 0));
        PatientCodeFld.setText("00000");
        PatientCodeFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CpfText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CpfText.setForeground(new java.awt.Color(0, 0, 102));
        CpfText.setText("CPF");
        CpfText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CpfFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CpfFld.setForeground(new java.awt.Color(0, 0, 0));
        CpfFld.setText("15187131656");
        CpfFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        MotherText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MotherText.setForeground(new java.awt.Color(0, 0, 102));
        MotherText.setText("Mãe");
        MotherText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        MotherFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        MotherFld.setForeground(new java.awt.Color(0, 0, 0));
        MotherFld.setText("ANDRÉIA ALVES MARTINS");
        MotherFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        FatherText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FatherText.setForeground(new java.awt.Color(0, 0, 102));
        FatherText.setText("Pai");
        FatherText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        FatherFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        FatherFld.setForeground(new java.awt.Color(0, 0, 0));
        FatherFld.setText("GABRIEL SEIDEL DE FREITAS");
        FatherFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        GuardianText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GuardianText.setForeground(new java.awt.Color(0, 0, 102));
        GuardianText.setText("Responsável legal");
        GuardianText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        GuardianFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        GuardianFld.setForeground(new java.awt.Color(0, 0, 0));
        GuardianFld.setText("-");
        GuardianFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Phone1Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Phone1Text.setForeground(new java.awt.Color(0, 0, 102));
        Phone1Text.setText("Telefone 1");
        Phone1Text.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Phone1Fld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Phone1Fld.setForeground(new java.awt.Color(0, 0, 0));
        Phone1Fld.setText("31995639780");
        Phone1Fld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Phone2Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Phone2Text.setForeground(new java.awt.Color(0, 0, 102));
        Phone2Text.setText("Telefone 2");
        Phone2Text.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Phone2Fld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Phone2Fld.setForeground(new java.awt.Color(0, 0, 0));
        Phone2Fld.setText("-");
        Phone2Fld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmailText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmailText.setForeground(new java.awt.Color(0, 0, 102));
        EmailText.setText("E-mail");
        EmailText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmailFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmailFld.setForeground(new java.awt.Color(0, 0, 0));
        EmailFld.setText("victorgabrielms88@gmail.com");
        EmailFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmContactText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmContactText.setForeground(new java.awt.Color(0, 0, 102));
        EmContactText.setText("Contato de emergência");
        EmContactText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmContacttFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmContacttFld.setForeground(new java.awt.Color(0, 0, 0));
        EmContacttFld.setText("3199403717");
        EmContacttFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmNameText.setForeground(new java.awt.Color(0, 0, 102));
        EmNameText.setText("Nome do contato");
        EmNameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmNameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmNameFld.setForeground(new java.awt.Color(0, 0, 0));
        EmNameFld.setText("ANDRÉIA ALVES MARTINS");
        EmNameFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmRelationText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmRelationText.setForeground(new java.awt.Color(0, 0, 102));
        EmRelationText.setText("Relação");
        EmRelationText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmRelationFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmRelationFld.setForeground(new java.awt.Color(0, 0, 0));
        EmRelationFld.setText("MÃE");
        EmRelationFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AdressText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AdressText.setForeground(new java.awt.Color(0, 0, 102));
        AdressText.setText("Endereço");
        AdressText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AdressFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        AdressFld.setForeground(new java.awt.Color(0, 0, 0));
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
        BloodTypeFld.setForeground(new java.awt.Color(0, 0, 0));
        BloodTypeFld.setText("O+");
        BloodTypeFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        WeightText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        WeightText.setForeground(new java.awt.Color(0, 0, 102));
        WeightText.setText("Peso");
        WeightText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        WeightFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        WeightFld.setForeground(new java.awt.Color(0, 0, 0));
        WeightFld.setText("60 kg");
        WeightFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HeightText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        HeightText.setForeground(new java.awt.Color(0, 0, 102));
        HeightText.setText("Altura");
        HeightText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HeightFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        HeightFld.setForeground(new java.awt.Color(0, 0, 0));
        HeightFld.setText("181 cm");
        HeightFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AllergiesText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText.setText("Alergias");
        AllergiesText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AllergiesPanel.setBackground(new java.awt.Color(255, 255, 255));
        AllergiesPanel.setBorder(null);
        AllergiesPanel.setForeground(new java.awt.Color(0, 0, 0));
        AllergiesPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        AllergiesFld.setEditable(false);
        AllergiesFld.setBackground(new java.awt.Color(255, 255, 255));
        AllergiesFld.setForeground(new java.awt.Color(0, 0, 0));
        AllergiesFld.setText("-");
        AllergiesFld.setFocusable(false);
        AllergiesPanel.setViewportView(AllergiesFld);

        MedicationText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MedicationText.setForeground(new java.awt.Color(0, 0, 102));
        MedicationText.setText("Medicamentos");
        MedicationText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        MedicationPanel.setBackground(new java.awt.Color(255, 255, 255));
        MedicationPanel.setBorder(null);
        MedicationPanel.setForeground(new java.awt.Color(0, 0, 0));
        MedicationPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        MedicationFld.setEditable(false);
        MedicationFld.setBackground(new java.awt.Color(255, 255, 255));
        MedicationFld.setForeground(new java.awt.Color(0, 0, 0));
        MedicationFld.setText("-");
        MedicationFld.setFocusable(false);
        MedicationPanel.setViewportView(MedicationFld);

        DiseasesText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DiseasesText.setForeground(new java.awt.Color(0, 0, 102));
        DiseasesText.setText("Doenças crônicas");
        DiseasesText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        DiseasesPanel.setBackground(new java.awt.Color(255, 255, 255));
        DiseasesPanel.setBorder(null);
        DiseasesPanel.setForeground(new java.awt.Color(0, 0, 0));
        DiseasesPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        DiseasesFld.setEditable(false);
        DiseasesFld.setBackground(new java.awt.Color(255, 255, 255));
        DiseasesFld.setForeground(new java.awt.Color(0, 0, 0));
        DiseasesFld.setText("-");
        DiseasesFld.setFocusable(false);
        DiseasesPanel.setViewportView(DiseasesFld);

        ForMoreInfoText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ForMoreInfoText.setForeground(new java.awt.Color(0, 0, 0));
        ForMoreInfoText.setText("Para mais informações, acesse o prontuário do paciente.");
        ForMoreInfoText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        GoToMedicalRecordBtn.setBackground(new java.awt.Color(0, 0, 102));
        GoToMedicalRecordBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        GoToMedicalRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        GoToMedicalRecordBtn.setText("Acessar prontuário");
        GoToMedicalRecordBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GoToMedicalRecordBtn.setBorderPainted(false);
        GoToMedicalRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        HealthPlanText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HealthPlanText.setForeground(new java.awt.Color(0, 0, 102));
        HealthPlanText.setText("INFORMAÇÕES DE PLANO DE SAÚDE");
        HealthPlanText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CnsText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CnsText.setForeground(new java.awt.Color(0, 0, 102));
        CnsText.setText("CNS");
        CnsText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CnsFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CnsFld.setForeground(new java.awt.Color(0, 0, 0));
        CnsFld.setText("703608040761038");
        CnsFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PlanNameText.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PlanNameText.setForeground(new java.awt.Color(0, 0, 0));
        PlanNameText.setText("-");
        PlanNameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PlanNameFld.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PlanNameFld.setForeground(new java.awt.Color(0, 0, 102));
        PlanNameFld.setText("Plano de saúde");
        PlanNameFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PlanNumberText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PlanNumberText.setForeground(new java.awt.Color(0, 0, 102));
        PlanNumberText.setText("Número");
        PlanNumberText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PlanNumberFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PlanNumberFld.setForeground(new java.awt.Color(0, 0, 0));
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
        ObsPanel.setForeground(new java.awt.Color(0, 0, 0));
        ObsPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld.setEditable(false);
        ObsFld.setBackground(new java.awt.Color(255, 255, 255));
        ObsFld.setForeground(new java.awt.Color(0, 0, 0));
        ObsFld.setText("-");
        ObsFld.setFocusable(false);
        ObsPanel.setViewportView(ObsFld);

        StatusText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StatusText.setForeground(new java.awt.Color(0, 0, 102));
        StatusText.setText("Status");
        StatusText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        StatusFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        StatusFld.setForeground(new java.awt.Color(0, 0, 0));
        StatusFld.setText("ATIVO");
        StatusFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        LastUpdateText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LastUpdateText.setForeground(new java.awt.Color(0, 0, 102));
        LastUpdateText.setText("Última atualização");
        LastUpdateText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        LastUpdateFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LastUpdateFld.setForeground(new java.awt.Color(0, 0, 0));
        LastUpdateFld.setText("07/11/2024 22:07:00");
        LastUpdateFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        UpdateByText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UpdateByText.setForeground(new java.awt.Color(0, 0, 102));
        UpdateByText.setText("Atualizado por");
        UpdateByText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        UpdateByFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        UpdateByFld.setForeground(new java.awt.Color(0, 0, 0));
        UpdateByFld.setText("VICTOR GABRIEL MARTINS SEIDEL");
        UpdateByFld.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        UpdateHistoryBtn.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn.setText("Histórico de atualizações");
        UpdateHistoryBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn.setBorderPainted(false);
        UpdateHistoryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PatientInfoPanelLayout = new javax.swing.GroupLayout(PatientInfoPanel);
        PatientInfoPanel.setLayout(PatientInfoPanelLayout);
        PatientInfoPanelLayout.setHorizontalGroup(
            PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(MotherText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(MotherFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FatherText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(FatherFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(GuardianText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(GuardianFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BloodTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BloodTypeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(WeightText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(WeightFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(HeightText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(HeightFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(PersonalInfoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientInfoPanelLayout.createSequentialGroup()
                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SexText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SexFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PatientCodeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PatientCodeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CpfText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CpfFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(HealthInfoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(AdressText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PatientInfoPanelLayout.createSequentialGroup()
                                                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(EmContacttFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(EmContactText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(Phone1Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(Phone1Fld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(NameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(NameFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(EmNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(Phone2Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(Phone2Fld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(SocialNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(SocialNameFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                                                    .addComponent(EmNameFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(AdressFld, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RaceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(RaceFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(BirthDateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BirthDateFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EmailText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EmailFld, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(EmRelationText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EmRelationFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(AllergiesPanel)
                                    .addComponent(AllergiesText, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MedicationText, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(MedicationPanel))
                                .addGap(18, 18, 18)
                                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DiseasesText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiseasesPanel))))
                        .addGap(47, 47, 47))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                        .addComponent(LastUpdateFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(UpdateByFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                        .addComponent(LastUpdateText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(UpdateByText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(UpdateHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                    .addComponent(ForMoreInfoText)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(GoToMedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PatientInfoPanelLayout.createSequentialGroup()
                                    .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CnsText, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CnsFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PlanNameFld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PlanNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PlanNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PlanNumberFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(HealthPlanText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AdditionalDataText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PatientInfoPanelLayout.createSequentialGroup()
                                    .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                            .addComponent(ObsText, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(305, 305, 305))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientInfoPanelLayout.createSequentialGroup()
                                            .addComponent(ObsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)))
                                    .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(StatusFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(StatusText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PatientInfoPanelLayout.setVerticalGroup(
            PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(PersonalInfoText)
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameText)
                    .addComponent(SocialNameText)
                    .addComponent(BirthDateText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameFld)
                    .addComponent(SocialNameFld)
                    .addComponent(BirthDateFld))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(RaceText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RaceFld)))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(PatientCodeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientCodeFld))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(CpfText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CpfFld))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(SexText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SexFld)))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(MotherText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MotherFld))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(FatherText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FatherFld))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(GuardianText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GuardianFld)))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                            .addComponent(Phone1Text)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Phone1Fld))
                        .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                            .addComponent(Phone2Text)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Phone2Fld)))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(EmailText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailFld)))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(EmContactText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmContacttFld))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EmRelationText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmNameFld)
                            .addComponent(EmRelationFld, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addComponent(AdressText, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdressFld)
                .addGap(47, 47, 47)
                .addComponent(HealthInfoText)
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(BloodTypeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BloodTypeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(WeightText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WeightFld))
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addComponent(HeightText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HeightFld)))
                .addGap(18, 18, 18)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AllergiesText)
                    .addComponent(MedicationText)
                    .addComponent(DiseasesText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AllergiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MedicationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ForMoreInfoText)
                            .addComponent(GoToMedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                .addComponent(HealthPlanText)
                                .addGap(18, 18, 18)
                                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                        .addComponent(CnsText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CnsFld, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                        .addComponent(PlanNameFld)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PlanNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                .addComponent(PlanNumberText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PlanNumberFld, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(AdditionalDataText)
                        .addGap(18, 18, 18)
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusText)
                            .addComponent(ObsText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ObsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusFld, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LastUpdateText)
                                    .addComponent(UpdateByText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PatientInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LastUpdateFld, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UpdateByFld)))
                            .addGroup(PatientInfoPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(UpdateHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(DiseasesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
        );

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

        NameFld1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NameFld1.setForeground(new java.awt.Color(0, 0, 0));
        NameFld1.setText("123456");
        NameFld1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SocialNameText1.setForeground(new java.awt.Color(0, 0, 102));
        SocialNameText1.setText("Código do paciente");
        SocialNameText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameFld1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        SocialNameFld1.setForeground(new java.awt.Color(0, 0, 0));
        SocialNameFld1.setText("000000");
        SocialNameFld1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BirthDateText1.setForeground(new java.awt.Color(0, 0, 102));
        BirthDateText1.setText("Nome do paciente");
        BirthDateText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateFld1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BirthDateFld1.setForeground(new java.awt.Color(0, 0, 0));
        BirthDateFld1.setText("VICTOR GABRIEL MARTINS SEIDEL");
        BirthDateFld1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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

        ExamsBtn1.setBackground(new java.awt.Color(0, 0, 102));
        ExamsBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ExamsBtn1.setForeground(new java.awt.Color(255, 255, 255));
        ExamsBtn1.setText("Exames");
        ExamsBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ExamsBtn1.setBorderPainted(false);
        ExamsBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        HospitalizationsBtn1.setBackground(new java.awt.Color(0, 0, 102));
        HospitalizationsBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        HospitalizationsBtn1.setForeground(new java.awt.Color(255, 255, 255));
        HospitalizationsBtn1.setText("Internações");
        HospitalizationsBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HospitalizationsBtn1.setBorderPainted(false);
        HospitalizationsBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        HospitalizationsBtn2.setBackground(new java.awt.Color(0, 0, 102));
        HospitalizationsBtn2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        HospitalizationsBtn2.setForeground(new java.awt.Color(255, 255, 255));
        HospitalizationsBtn2.setText("Prescrições");
        HospitalizationsBtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HospitalizationsBtn2.setBorderPainted(false);
        HospitalizationsBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        BloodTypeFld1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BloodTypeFld1.setForeground(new java.awt.Color(0, 0, 0));
        BloodTypeFld1.setText("O+");
        BloodTypeFld1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        WeightText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        WeightText1.setForeground(new java.awt.Color(0, 0, 102));
        WeightText1.setText("Peso");
        WeightText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        WeightFld1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        WeightFld1.setForeground(new java.awt.Color(0, 0, 0));
        WeightFld1.setText("60 kg");
        WeightFld1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HeightText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        HeightText1.setForeground(new java.awt.Color(0, 0, 102));
        HeightText1.setText("Altura");
        HeightText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HeightFld1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        HeightFld1.setForeground(new java.awt.Color(0, 0, 0));
        HeightFld1.setText("181 cm");
        HeightFld1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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

        LastUpdateText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LastUpdateText2.setForeground(new java.awt.Color(0, 0, 102));
        LastUpdateText2.setText("Última atualização");
        LastUpdateText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        LastUpdateFld2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LastUpdateFld2.setForeground(new java.awt.Color(0, 0, 0));
        LastUpdateFld2.setText("07/11/2024 23:32:47");
        LastUpdateFld2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        UpdateByText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UpdateByText2.setForeground(new java.awt.Color(0, 0, 102));
        UpdateByText2.setText("Atualizado por");
        UpdateByText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        UpdateByFld2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        UpdateByFld2.setForeground(new java.awt.Color(0, 0, 0));
        UpdateByFld2.setText("VICTOR GABRIEL MARTINS SEIDEL");
        UpdateByFld2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        UpdateHistoryBtn2.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn2.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn2.setText("Histórico de atualizações");
        UpdateHistoryBtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn2.setBorderPainted(false);
        UpdateHistoryBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ObsText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ObsText2.setForeground(new java.awt.Color(0, 0, 102));
        ObsText2.setText("Observações");
        ObsText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsPanel2.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel2.setBorder(null);
        ObsPanel2.setForeground(new java.awt.Color(0, 0, 0));
        ObsPanel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld2.setEditable(false);
        ObsFld2.setBackground(new java.awt.Color(255, 255, 255));
        ObsFld2.setForeground(new java.awt.Color(0, 0, 0));
        ObsFld2.setText("-");
        ObsFld2.setFocusable(false);
        ObsPanel2.setViewportView(ObsFld2);

        StatusText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StatusText2.setForeground(new java.awt.Color(0, 0, 102));
        StatusText2.setText("Status");
        StatusText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        StatusFld2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        StatusFld2.setForeground(new java.awt.Color(0, 0, 0));
        StatusFld2.setText("ATIVO");
        StatusFld2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AdditionalDataText1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdditionalDataText1.setForeground(new java.awt.Color(0, 0, 102));
        AdditionalDataText1.setText("DADOS ADICIONAIS");
        AdditionalDataText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsPanel3.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel3.setBorder(null);
        ObsPanel3.setForeground(new java.awt.Color(0, 0, 0));
        ObsPanel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld3.setEditable(false);
        ObsFld3.setBackground(new java.awt.Color(255, 255, 255));
        ObsFld3.setForeground(new java.awt.Color(0, 0, 0));
        ObsFld3.setText("-");
        ObsFld3.setFocusable(false);
        ObsPanel3.setViewportView(ObsFld3);

        ObsPanel4.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel4.setBorder(null);
        ObsPanel4.setForeground(new java.awt.Color(0, 0, 0));
        ObsPanel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld4.setEditable(false);
        ObsFld4.setBackground(new java.awt.Color(255, 255, 255));
        ObsFld4.setForeground(new java.awt.Color(0, 0, 0));
        ObsFld4.setText("-");
        ObsFld4.setFocusable(false);
        ObsPanel4.setViewportView(ObsFld4);

        ObsPanel5.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel5.setBorder(null);
        ObsPanel5.setForeground(new java.awt.Color(0, 0, 0));
        ObsPanel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld5.setEditable(false);
        ObsFld5.setBackground(new java.awt.Color(255, 255, 255));
        ObsFld5.setForeground(new java.awt.Color(0, 0, 0));
        ObsFld5.setText("-");
        ObsFld5.setFocusable(false);
        ObsPanel5.setViewportView(ObsFld5);

        ObsPanel6.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel6.setBorder(null);
        ObsPanel6.setForeground(new java.awt.Color(0, 0, 0));
        ObsPanel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld6.setEditable(false);
        ObsFld6.setBackground(new java.awt.Color(255, 255, 255));
        ObsFld6.setForeground(new java.awt.Color(0, 0, 0));
        ObsFld6.setText("-");
        ObsFld6.setFocusable(false);
        ObsPanel6.setViewportView(ObsFld6);

        ObsPanel7.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel7.setBorder(null);
        ObsPanel7.setForeground(new java.awt.Color(0, 0, 0));
        ObsPanel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld7.setEditable(false);
        ObsFld7.setBackground(new java.awt.Color(255, 255, 255));
        ObsFld7.setForeground(new java.awt.Color(0, 0, 0));
        ObsFld7.setText("-");
        ObsFld7.setFocusable(false);
        ObsPanel7.setViewportView(ObsFld7);

        ObsPanel8.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel8.setBorder(null);
        ObsPanel8.setForeground(new java.awt.Color(0, 0, 0));
        ObsPanel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld8.setEditable(false);
        ObsFld8.setBackground(new java.awt.Color(255, 255, 255));
        ObsFld8.setForeground(new java.awt.Color(0, 0, 0));
        ObsFld8.setText("-");
        ObsFld8.setFocusable(false);
        ObsPanel8.setViewportView(ObsFld8);

        javax.swing.GroupLayout MedicalRecordPanelLayout = new javax.swing.GroupLayout(MedicalRecordPanel);
        MedicalRecordPanel.setLayout(MedicalRecordPanelLayout);
        MedicalRecordPanelLayout.setHorizontalGroup(
            MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdditionalDataText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ObsPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ObsText2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusText2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                                .addComponent(LastUpdateFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateByFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                                .addComponent(LastUpdateText2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateByText2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(UpdateHistoryBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DiseasesHisText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiseasesText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedicationText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonalInfoText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NameFld1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SocialNameText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SocialNameFld1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BirthDateText1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(BirthDateFld1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(PersonalInfoText2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ServiceHistoryText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(AppointmentsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExamsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HospitalizationsBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HospitalizationsBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BloodTypeText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BloodTypeFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(WeightText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WeightFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HeightText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HeightFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(HealthInfoText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllergiesText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FamilyHisText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SurgeryHisText1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ObsPanel3)
                    .addComponent(ObsPanel4)
                    .addComponent(ObsPanel5)
                    .addComponent(ObsPanel6)
                    .addComponent(ObsPanel7)
                    .addComponent(ObsPanel8))
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
                    .addComponent(NameFld1)
                    .addComponent(SocialNameFld1)
                    .addComponent(BirthDateFld1))
                .addGap(47, 47, 47)
                .addComponent(ServiceHistoryText1)
                .addGap(18, 18, 18)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppointmentsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExamsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HospitalizationsBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HospitalizationsBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(HealthInfoText1)
                .addGap(18, 18, 18)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(BloodTypeText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BloodTypeFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(WeightText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WeightFld1))
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addComponent(HeightText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HeightFld1)))
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
                        .addComponent(StatusFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MedicalRecordPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastUpdateText2)
                            .addComponent(UpdateByText2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MedicalRecordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastUpdateFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateByFld2)))
                    .addComponent(UpdateHistoryBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        ObsText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ObsText1.setForeground(new java.awt.Color(0, 0, 102));
        ObsText1.setText("Observações");
        ObsText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsPanel1.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel1.setBorder(null);
        ObsPanel1.setForeground(new java.awt.Color(0, 0, 0));
        ObsPanel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld1.setEditable(false);
        ObsFld1.setBackground(new java.awt.Color(255, 255, 255));
        ObsFld1.setForeground(new java.awt.Color(0, 0, 0));
        ObsFld1.setText("-");
        ObsFld1.setFocusable(false);
        ObsPanel1.setViewportView(ObsFld1);

        StatusText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StatusText1.setForeground(new java.awt.Color(0, 0, 102));
        StatusText1.setText("Status");
        StatusText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        StatusFld1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        StatusFld1.setForeground(new java.awt.Color(0, 0, 0));
        StatusFld1.setText("ATIVO");
        StatusFld1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        LastUpdateText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LastUpdateText1.setForeground(new java.awt.Color(0, 0, 102));
        LastUpdateText1.setText("Última atualização");
        LastUpdateText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        LastUpdateFld1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LastUpdateFld1.setForeground(new java.awt.Color(0, 0, 0));
        LastUpdateFld1.setText("07/11/2024 22:07:00");
        LastUpdateFld1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        UpdateByText1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UpdateByText1.setForeground(new java.awt.Color(0, 0, 102));
        UpdateByText1.setText("Atualizado por");
        UpdateByText1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        UpdateByFld1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        UpdateByFld1.setForeground(new java.awt.Color(0, 0, 0));
        UpdateByFld1.setText("VICTOR GABRIEL MARTINS SEIDEL");
        UpdateByFld1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        UpdateHistoryBtn1.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn1.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn1.setText("Histórico de atualizações");
        UpdateHistoryBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn1.setBorderPainted(false);
        UpdateHistoryBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Health Track");
        setResizable(false);

        Background.setBackground(new java.awt.Color(204, 204, 204));

        NavBarPanel.setBackground(new java.awt.Color(0, 0, 102));
        NavBarPanel.setPreferredSize(new java.awt.Dimension(470, 50));

        SoftwareNameText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SoftwareNameText.setForeground(new java.awt.Color(255, 255, 255));
        SoftwareNameText.setText("Health Track");
        SoftwareNameText.setPreferredSize(new java.awt.Dimension(300, 22));

        javax.swing.GroupLayout NavBarPanelLayout = new javax.swing.GroupLayout(NavBarPanel);
        NavBarPanel.setLayout(NavBarPanelLayout);
        NavBarPanelLayout.setHorizontalGroup(
            NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoftwareNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NavBarPanelLayout.setVerticalGroup(
            NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SoftwareNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        SideBarPanel.setBackground(new java.awt.Color(204, 204, 204));
        SideBarPanel.setPreferredSize(new java.awt.Dimension(250, 650));
        SideBarPanel.setRequestFocusEnabled(false);

        PatientInfoBtn.setBackground(new java.awt.Color(0, 0, 102));
        PatientInfoBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PatientInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        PatientInfoBtn.setText("Paciente");
        PatientInfoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PatientInfoBtn.setBorderPainted(false);
        PatientInfoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PatientInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientInfoBtnActionPerformed(evt);
            }
        });

        MedicalRecordBtn.setBackground(new java.awt.Color(0, 0, 102));
        MedicalRecordBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MedicalRecordBtn.setForeground(new java.awt.Color(255, 255, 255));
        MedicalRecordBtn.setText("Prontuário");
        MedicalRecordBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MedicalRecordBtn.setBorderPainted(false);
        MedicalRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MedicalRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalRecordBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideBarPanelLayout = new javax.swing.GroupLayout(SideBarPanel);
        SideBarPanel.setLayout(SideBarPanelLayout);
        SideBarPanelLayout.setHorizontalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(MedicalRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
        );
        SideBarPanelLayout.setVerticalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PatientInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MedicalRecordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PatientPanel.setBackground(new java.awt.Color(255, 255, 255));
        PatientPanel.setPreferredSize(new java.awt.Dimension(1030, 50));

        PatientNameText.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PatientNameText.setForeground(new java.awt.Color(0, 0, 0));
        PatientNameText.setText("   VICTOR GABRIEL MARTINS SEIDEL");
        PatientNameText.setPreferredSize(new java.awt.Dimension(300, 22));

        PatientInfoText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PatientInfoText.setForeground(new java.awt.Color(0, 0, 0));
        PatientInfoText.setText("Atendimento 89752, Masculino, 05/12/2005,18 anos 10 meses, Urgência e Emergência");
        PatientInfoText.setPreferredSize(new java.awt.Dimension(300, 22));

        javax.swing.GroupLayout PatientPanelLayout = new javax.swing.GroupLayout(PatientPanel);
        PatientPanel.setLayout(PatientPanelLayout);
        PatientPanelLayout.setHorizontalGroup(
            PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PatientNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PatientInfoText, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        PatientPanelLayout.setVerticalGroup(
            PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PatientPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(PatientNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addComponent(PatientInfoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(SideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(ScrollPanel)
                        .addContainerGap())))
            .addComponent(NavBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1286, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addComponent(NavBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(PatientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                        .addContainerGap())))
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

        getAccessibleContext().setAccessibleName("Tela Inicial");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PatientInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientInfoBtnActionPerformed
        SetScrollPanel(PatientInfoPanel);
    }//GEN-LAST:event_PatientInfoBtnActionPerformed

    private void MedicalRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalRecordBtnActionPerformed
        SetScrollPanel(MedicalRecordPanel);
    }//GEN-LAST:event_MedicalRecordBtnActionPerformed

    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new view_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdditionalDataText;
    private javax.swing.JLabel AdditionalDataText1;
    private javax.swing.JLabel AdressFld;
    private javax.swing.JLabel AdressText;
    private javax.swing.JTextPane AllergiesFld;
    private javax.swing.JScrollPane AllergiesPanel;
    private javax.swing.JLabel AllergiesText;
    private javax.swing.JLabel AllergiesText1;
    private javax.swing.JButton AppointmentsBtn1;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel BirthDateFld;
    private javax.swing.JLabel BirthDateFld1;
    private javax.swing.JLabel BirthDateText;
    private javax.swing.JLabel BirthDateText1;
    private javax.swing.JLabel BloodTypeFld;
    private javax.swing.JLabel BloodTypeFld1;
    private javax.swing.JLabel BloodTypeText;
    private javax.swing.JLabel BloodTypeText1;
    private javax.swing.JLabel CnsFld;
    private javax.swing.JLabel CnsText;
    private javax.swing.JLabel CpfFld;
    private javax.swing.JLabel CpfText;
    private javax.swing.JTextPane DiseasesFld;
    private javax.swing.JLabel DiseasesHisText1;
    private javax.swing.JScrollPane DiseasesPanel;
    private javax.swing.JLabel DiseasesText;
    private javax.swing.JLabel DiseasesText1;
    private javax.swing.JLabel EmContactText;
    private javax.swing.JLabel EmContacttFld;
    private javax.swing.JLabel EmNameFld;
    private javax.swing.JLabel EmNameText;
    private javax.swing.JLabel EmRelationFld;
    private javax.swing.JLabel EmRelationText;
    private javax.swing.JLabel EmailFld;
    private javax.swing.JLabel EmailText;
    private javax.swing.JButton ExamsBtn1;
    private javax.swing.JLabel FamilyHisText1;
    private javax.swing.JLabel FatherFld;
    private javax.swing.JLabel FatherText;
    private javax.swing.JLabel ForMoreInfoText;
    private javax.swing.JButton GoToMedicalRecordBtn;
    private javax.swing.JLabel GuardianFld;
    private javax.swing.JLabel GuardianText;
    private javax.swing.JLabel HealthInfoText;
    private javax.swing.JLabel HealthInfoText1;
    private javax.swing.JLabel HealthPlanText;
    private javax.swing.JLabel HeightFld;
    private javax.swing.JLabel HeightFld1;
    private javax.swing.JLabel HeightText;
    private javax.swing.JLabel HeightText1;
    private javax.swing.JButton HospitalizationsBtn1;
    private javax.swing.JButton HospitalizationsBtn2;
    private javax.swing.JLabel LastUpdateFld;
    private javax.swing.JLabel LastUpdateFld1;
    private javax.swing.JLabel LastUpdateFld2;
    private javax.swing.JLabel LastUpdateText;
    private javax.swing.JLabel LastUpdateText1;
    private javax.swing.JLabel LastUpdateText2;
    private javax.swing.JButton MedicalRecordBtn;
    private javax.swing.JPanel MedicalRecordPanel;
    private javax.swing.JTextPane MedicationFld;
    private javax.swing.JScrollPane MedicationPanel;
    private javax.swing.JLabel MedicationText;
    private javax.swing.JLabel MedicationText1;
    private javax.swing.JLabel MotherFld;
    private javax.swing.JLabel MotherText;
    private javax.swing.JLabel NameFld;
    private javax.swing.JLabel NameFld1;
    private javax.swing.JLabel NameText;
    private javax.swing.JLabel NameText1;
    private javax.swing.JPanel NavBarPanel;
    private javax.swing.JTextPane ObsFld;
    private javax.swing.JTextPane ObsFld1;
    private javax.swing.JTextPane ObsFld2;
    private javax.swing.JTextPane ObsFld3;
    private javax.swing.JTextPane ObsFld4;
    private javax.swing.JTextPane ObsFld5;
    private javax.swing.JTextPane ObsFld6;
    private javax.swing.JTextPane ObsFld7;
    private javax.swing.JTextPane ObsFld8;
    private javax.swing.JScrollPane ObsPanel;
    private javax.swing.JScrollPane ObsPanel1;
    private javax.swing.JScrollPane ObsPanel2;
    private javax.swing.JScrollPane ObsPanel3;
    private javax.swing.JScrollPane ObsPanel4;
    private javax.swing.JScrollPane ObsPanel5;
    private javax.swing.JScrollPane ObsPanel6;
    private javax.swing.JScrollPane ObsPanel7;
    private javax.swing.JScrollPane ObsPanel8;
    private javax.swing.JLabel ObsText;
    private javax.swing.JLabel ObsText1;
    private javax.swing.JLabel ObsText2;
    private javax.swing.JLabel PatientCodeFld;
    private javax.swing.JLabel PatientCodeText;
    private javax.swing.JButton PatientInfoBtn;
    private javax.swing.JPanel PatientInfoPanel;
    private javax.swing.JLabel PatientInfoText;
    private javax.swing.JLabel PatientNameText;
    private javax.swing.JPanel PatientPanel;
    private javax.swing.JLabel PersonalInfoText;
    private javax.swing.JLabel PersonalInfoText1;
    private javax.swing.JLabel PersonalInfoText2;
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
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JLabel ServiceHistoryText1;
    private javax.swing.JLabel SexFld;
    private javax.swing.JLabel SexText;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JLabel SocialNameFld;
    private javax.swing.JLabel SocialNameFld1;
    private javax.swing.JLabel SocialNameText;
    private javax.swing.JLabel SocialNameText1;
    private javax.swing.JLabel SoftwareNameText;
    private javax.swing.JLabel StatusFld;
    private javax.swing.JLabel StatusFld1;
    private javax.swing.JLabel StatusFld2;
    private javax.swing.JLabel StatusText;
    private javax.swing.JLabel StatusText1;
    private javax.swing.JLabel StatusText2;
    private javax.swing.JLabel SurgeryHisText1;
    private javax.swing.JLabel UpdateByFld;
    private javax.swing.JLabel UpdateByFld1;
    private javax.swing.JLabel UpdateByFld2;
    private javax.swing.JLabel UpdateByText;
    private javax.swing.JLabel UpdateByText1;
    private javax.swing.JLabel UpdateByText2;
    private javax.swing.JButton UpdateHistoryBtn;
    private javax.swing.JButton UpdateHistoryBtn1;
    private javax.swing.JButton UpdateHistoryBtn2;
    private javax.swing.JLabel WeightFld;
    private javax.swing.JLabel WeightFld1;
    private javax.swing.JLabel WeightText;
    private javax.swing.JLabel WeightText1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void SetScrollPanel(JPanel newPanel)
    {
        ScrollPanel.setViewportView(newPanel);
    }
}
