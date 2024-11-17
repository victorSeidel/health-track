package view.panel.patient;

import controller.HomeDAO;
import controller.MainDAO;

public class RegisterNewPatientPanel extends javax.swing.JPanel 
{
    public RegisterNewPatientPanel() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        PersonalInfoText = new javax.swing.JLabel();
        NameText = new javax.swing.JLabel();
        SocialNameText = new javax.swing.JLabel();
        BirthDateText = new javax.swing.JLabel();
        NationalityText = new javax.swing.JLabel();
        NaturalnessText = new javax.swing.JLabel();
        RaceText = new javax.swing.JLabel();
        SexText = new javax.swing.JLabel();
        PatientIdText = new javax.swing.JLabel();
        CpfText = new javax.swing.JLabel();
        MotherText = new javax.swing.JLabel();
        FatherText = new javax.swing.JLabel();
        GuardianText = new javax.swing.JLabel();
        Phone1Text = new javax.swing.JLabel();
        Phone2Text = new javax.swing.JLabel();
        EmailText = new javax.swing.JLabel();
        EmContactText = new javax.swing.JLabel();
        EmNameText = new javax.swing.JLabel();
        EmRelationText = new javax.swing.JLabel();
        AdressText = new javax.swing.JLabel();
        HealthPlanText = new javax.swing.JLabel();
        CnsText = new javax.swing.JLabel();
        PlanNameText = new javax.swing.JLabel();
        PlanNumberText = new javax.swing.JLabel();
        AdditionalDataText = new javax.swing.JLabel();
        ObsText = new javax.swing.JLabel();
        NameFld = new javax.swing.JTextField();
        SocialNameFld = new javax.swing.JTextField();
        BirthDateFld = new javax.swing.JFormattedTextField();
        NationalityFld = new javax.swing.JTextField();
        NaturalnessFld = new javax.swing.JTextField();
        RaceFld = new javax.swing.JComboBox<>();
        SexFld = new javax.swing.JComboBox<>();
        PatientIdFld = new javax.swing.JTextField();
        CpfFld = new javax.swing.JFormattedTextField();
        MotherFld = new javax.swing.JTextField();
        FatherFld = new javax.swing.JTextField();
        GuardianFld = new javax.swing.JTextField();
        Phone1Fld = new javax.swing.JTextField();
        Phone2Fld = new javax.swing.JTextField();
        EmailFld = new javax.swing.JTextField();
        EmContactFld = new javax.swing.JTextField();
        EmNameFld = new javax.swing.JTextField();
        EmRelationFld = new javax.swing.JTextField();
        AdressFld = new javax.swing.JTextField();
        CnsFld = new javax.swing.JTextField();
        PlanNameFld = new javax.swing.JTextField();
        PlanNumberFld = new javax.swing.JTextField();
        ObsPanel = new javax.swing.JScrollPane();
        ObsFld = new javax.swing.JTextPane();
        CancelBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();

        Background.setBackground(new java.awt.Color(255, 255, 255));

        PersonalInfoText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PersonalInfoText.setForeground(new java.awt.Color(0, 0, 102));
        PersonalInfoText.setText("INFORMAÇÕES PESSOAIS");
        PersonalInfoText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NameText.setForeground(new java.awt.Color(0, 0, 102));
        NameText.setText("Nome de registro *");
        NameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SocialNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SocialNameText.setForeground(new java.awt.Color(0, 0, 102));
        SocialNameText.setText("Nome social");
        SocialNameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BirthDateText.setForeground(new java.awt.Color(0, 0, 102));
        BirthDateText.setText("Data de nascimento * (somente números)");
        BirthDateText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NationalityText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NationalityText.setForeground(new java.awt.Color(0, 0, 102));
        NationalityText.setText("Nacionalidade *");
        NationalityText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NaturalnessText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NaturalnessText.setForeground(new java.awt.Color(0, 0, 102));
        NaturalnessText.setText("Naturalidade");
        NaturalnessText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        RaceText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RaceText.setForeground(new java.awt.Color(0, 0, 102));
        RaceText.setText("Raça");
        RaceText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        SexText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SexText.setForeground(new java.awt.Color(0, 0, 102));
        SexText.setText("Sexo *");
        SexText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PatientIdText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PatientIdText.setForeground(new java.awt.Color(0, 0, 102));
        PatientIdText.setText("Código do paciente");
        PatientIdText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CpfText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CpfText.setForeground(new java.awt.Color(0, 0, 102));
        CpfText.setText("CPF (somente números)");
        CpfText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        MotherText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MotherText.setForeground(new java.awt.Color(0, 0, 102));
        MotherText.setText("Mãe *");
        MotherText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        FatherText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FatherText.setForeground(new java.awt.Color(0, 0, 102));
        FatherText.setText("Pai");
        FatherText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        GuardianText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GuardianText.setForeground(new java.awt.Color(0, 0, 102));
        GuardianText.setText("Responsável legal");
        GuardianText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Phone1Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Phone1Text.setForeground(new java.awt.Color(0, 0, 102));
        Phone1Text.setText("Telefone 1 *");
        Phone1Text.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Phone2Text.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Phone2Text.setForeground(new java.awt.Color(0, 0, 102));
        Phone2Text.setText("Telefone 2");
        Phone2Text.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmailText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmailText.setForeground(new java.awt.Color(0, 0, 102));
        EmailText.setText("E-mail");
        EmailText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmContactText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmContactText.setForeground(new java.awt.Color(0, 0, 102));
        EmContactText.setText("Contato de emergência");
        EmContactText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmNameText.setForeground(new java.awt.Color(0, 0, 102));
        EmNameText.setText("Nome do contato");
        EmNameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EmRelationText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmRelationText.setForeground(new java.awt.Color(0, 0, 102));
        EmRelationText.setText("Relação");
        EmRelationText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AdressText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AdressText.setForeground(new java.awt.Color(0, 0, 102));
        AdressText.setText("Endereço completo");
        AdressText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HealthPlanText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HealthPlanText.setForeground(new java.awt.Color(0, 0, 102));
        HealthPlanText.setText("INFORMAÇÕES DE PLANO DE SAÚDE");
        HealthPlanText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        CnsText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CnsText.setForeground(new java.awt.Color(0, 0, 102));
        CnsText.setText("CNS");
        CnsText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PlanNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PlanNameText.setForeground(new java.awt.Color(0, 0, 102));
        PlanNameText.setText("Plano de saúde");
        PlanNameText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        PlanNumberText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PlanNumberText.setForeground(new java.awt.Color(0, 0, 102));
        PlanNumberText.setText("Número");
        PlanNumberText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AdditionalDataText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AdditionalDataText.setForeground(new java.awt.Color(0, 0, 102));
        AdditionalDataText.setText("DADOS ADICIONAIS");
        AdditionalDataText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ObsText.setForeground(new java.awt.Color(0, 0, 102));
        ObsText.setText("Observações");
        ObsText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NameFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NameFld.setMargin(new java.awt.Insets(2, 2, 2, 10));

        SocialNameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        SocialNameFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BirthDateFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            BirthDateFld.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        BirthDateFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BirthDateFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BirthDateFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BirthDateFldFocusGained(evt);
            }
        });

        NationalityFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NationalityFld.setText("Brasileiro(a)");
        NationalityFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NaturalnessFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NaturalnessFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RaceFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        RaceFld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Branca", "Preta", "Parda", "Amarela", "Indígena", "Outro" }));
        RaceFld.setBorder(null);
        RaceFld.setLightWeightPopupEnabled(false);

        SexFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        SexFld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Feminino", "Outro" }));
        SexFld.setBorder(null);
        SexFld.setLightWeightPopupEnabled(false);

        PatientIdFld.setEditable(false);
        PatientIdFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PatientIdFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PatientIdFld.setFocusable(false);

        CpfFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            CpfFld.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CpfFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CpfFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CpfFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CpfFldFocusGained(evt);
            }
        });

        MotherFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        MotherFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        FatherFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        FatherFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GuardianFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        GuardianFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Phone1Fld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Phone1Fld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Phone2Fld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Phone2Fld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EmailFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmailFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EmContactFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmContactFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EmNameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmNameFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EmRelationFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        EmRelationFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AdressFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        AdressFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CnsFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CnsFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PlanNameFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PlanNameFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PlanNumberFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        PlanNumberFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ObsPanel.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel.setBorder(null);
        ObsPanel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ObsFld.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObsFld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ObsPanel.setViewportView(ObsFld);

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

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MotherText, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(MotherFld))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(FatherFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(GuardianFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FatherText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PersonalInfoText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AdditionalDataText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HealthPlanText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AdressFld, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SexFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SexText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PatientIdText, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(PatientIdFld))
                            .addGap(18, 18, 18)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CpfText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CpfFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GuardianText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(EmContactText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(NationalityText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Phone1Text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Phone1Fld)
                                .addComponent(NationalityFld, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NameFld, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EmContactFld, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addComponent(NaturalnessFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(RaceFld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(EmNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(NaturalnessText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Phone2Text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SocialNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Phone2Fld, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SocialNameFld, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(EmNameFld, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(EmailFld)
                                        .addComponent(EmailText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BirthDateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RaceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BirthDateFld)
                                        .addComponent(EmRelationFld)
                                        .addComponent(EmRelationText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(ObsText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CnsFld)
                                .addComponent(CnsText, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PlanNameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PlanNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PlanNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PlanNumberFld, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(SaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(ObsPanel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AdressText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 47, Short.MAX_VALUE))
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
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SocialNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BirthDateFld))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NaturalnessText)
                        .addComponent(RaceText))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NaturalnessFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NationalityFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RaceFld, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                    .addComponent(NationalityText))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SexText)
                            .addComponent(PatientIdText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SexFld, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(PatientIdFld, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(CpfText)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(CpfFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MotherText)
                        .addComponent(FatherText)
                        .addComponent(GuardianText))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FatherFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MotherFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuardianFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Phone1Text)
                    .addComponent(EmailText)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(Phone2Text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Phone2Fld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone1Fld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmContactText)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EmNameText)
                        .addComponent(EmRelationText, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmRelationFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmContactFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AdressText, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(AdressFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(HealthPlanText)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(CnsText, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CnsFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(PlanNameText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlanNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(PlanNumberText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlanNumberFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(AdditionalDataText)
                .addGap(18, 18, 18)
                .addComponent(ObsText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void BirthDateFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BirthDateFldFocusGained
        BirthDateFld.setCaretPosition(0);
    }//GEN-LAST:event_BirthDateFldFocusGained

    private void CpfFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CpfFldFocusGained
        CpfFld.setCaretPosition(0);
    }//GEN-LAST:event_CpfFldFocusGained

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        MainDAO.Singleton.INSTANCE.getMain().SetScrollPanel(null);
        MainDAO.Singleton.INSTANCE.getMain().registerNewPatientPanel = new RegisterNewPatientPanel();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        
    }//GEN-LAST:event_SaveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdditionalDataText;
    private javax.swing.JTextField AdressFld;
    private javax.swing.JLabel AdressText;
    private javax.swing.JPanel Background;
    private javax.swing.JFormattedTextField BirthDateFld;
    private javax.swing.JLabel BirthDateText;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextField CnsFld;
    private javax.swing.JLabel CnsText;
    private javax.swing.JFormattedTextField CpfFld;
    private javax.swing.JLabel CpfText;
    private javax.swing.JTextField EmContactFld;
    private javax.swing.JLabel EmContactText;
    private javax.swing.JTextField EmNameFld;
    private javax.swing.JLabel EmNameText;
    private javax.swing.JTextField EmRelationFld;
    private javax.swing.JLabel EmRelationText;
    private javax.swing.JTextField EmailFld;
    private javax.swing.JLabel EmailText;
    private javax.swing.JTextField FatherFld;
    private javax.swing.JLabel FatherText;
    private javax.swing.JTextField GuardianFld;
    private javax.swing.JLabel GuardianText;
    private javax.swing.JLabel HealthPlanText;
    private javax.swing.JTextField MotherFld;
    private javax.swing.JLabel MotherText;
    private javax.swing.JTextField NameFld;
    private javax.swing.JLabel NameText;
    private javax.swing.JTextField NationalityFld;
    private javax.swing.JLabel NationalityText;
    private javax.swing.JTextField NaturalnessFld;
    private javax.swing.JLabel NaturalnessText;
    private javax.swing.JTextPane ObsFld;
    private javax.swing.JScrollPane ObsPanel;
    private javax.swing.JLabel ObsText;
    private javax.swing.JTextField PatientIdFld;
    private javax.swing.JLabel PatientIdText;
    private javax.swing.JLabel PersonalInfoText;
    private javax.swing.JTextField Phone1Fld;
    private javax.swing.JLabel Phone1Text;
    private javax.swing.JTextField Phone2Fld;
    private javax.swing.JLabel Phone2Text;
    private javax.swing.JTextField PlanNameFld;
    private javax.swing.JLabel PlanNameText;
    private javax.swing.JTextField PlanNumberFld;
    private javax.swing.JLabel PlanNumberText;
    private javax.swing.JComboBox<String> RaceFld;
    private javax.swing.JLabel RaceText;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> SexFld;
    private javax.swing.JLabel SexText;
    private javax.swing.JTextField SocialNameFld;
    private javax.swing.JLabel SocialNameText;
    // End of variables declaration//GEN-END:variables

}
