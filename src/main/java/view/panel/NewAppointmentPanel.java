package view.panel;

import controller.HomeDAO;
import view.view_Home;

public class NewAppointmentPanel extends javax.swing.JPanel 
{
    public NewAppointmentPanel() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ServicePanel = new javax.swing.JPanel();
        PersonalInfoText3 = new javax.swing.JLabel();
        BirthDateText2 = new javax.swing.JLabel();
        BirthDateFld2 = new javax.swing.JLabel();
        BirthDateText3 = new javax.swing.JLabel();
        BirthDateFld3 = new javax.swing.JLabel();
        BirthDateText4 = new javax.swing.JLabel();
        BirthDateFld4 = new javax.swing.JLabel();
        AllergiesText2 = new javax.swing.JLabel();
        ObsPanel16 = new javax.swing.JScrollPane();
        ObsFld16 = new javax.swing.JTextPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        AllergiesText3 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        AllergiesText4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
        AllergiesText5 = new javax.swing.JLabel();
        AllergiesText6 = new javax.swing.JLabel();
        ObsPanel17 = new javax.swing.JScrollPane();
        ObsFld17 = new javax.swing.JTextPane();
        ObsPanel18 = new javax.swing.JScrollPane();
        ObsFld18 = new javax.swing.JTextPane();
        AllergiesText7 = new javax.swing.JLabel();
        AllergiesText8 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        UpdateHistoryBtn7 = new javax.swing.JButton();
        UpdateHistoryBtn8 = new javax.swing.JButton();

        ServicePanel.setBackground(new java.awt.Color(255, 255, 255));

        PersonalInfoText3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PersonalInfoText3.setForeground(new java.awt.Color(0, 0, 102));
        PersonalInfoText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PersonalInfoText3.setText("AGENDAR NOVA CONSULTA");
        PersonalInfoText3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BirthDateText2.setForeground(new java.awt.Color(0, 0, 102));
        BirthDateText2.setText("Nome do paciente");
        BirthDateText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateFld2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BirthDateFld2.setText("VICTOR GABRIEL MARTINS SEIDEL");
        BirthDateFld2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateText3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BirthDateText3.setForeground(new java.awt.Color(0, 0, 102));
        BirthDateText3.setText("Nome do profissional");
        BirthDateText3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateFld3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BirthDateFld3.setText("NOME");
        BirthDateFld3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateText4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BirthDateText4.setForeground(new java.awt.Color(0, 0, 102));
        BirthDateText4.setText("Especialidade");
        BirthDateText4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        BirthDateFld4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BirthDateFld4.setText("Odontologia");
        BirthDateFld4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AllergiesText2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText2.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText2.setText("Motivo da consulta");
        AllergiesText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsPanel16.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel16.setBorder(null);
        ObsPanel16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ObsFld16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObsFld16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ObsPanel16.setViewportView(ObsFld16);

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 consulta", "Retorno", "Avaliação" }));
        jComboBox1.setBorder(null);
        jComboBox1.setLightWeightPopupEnabled(false);

        AllergiesText3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText3.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText3.setText("Tipo de consulta");
        AllergiesText3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jCalendar1.setDate(new java.util.Date(1731113113000L));
        jCalendar1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jCalendar1.setWeekOfYearVisible(false);

        AllergiesText4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText4.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText4.setText("Data da consulta");
        AllergiesText4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jList1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12:40 OCUPADO", "13:20 OCUPADO" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList1.setEnabled(false);
        jList1.setFocusable(false);
        jList1.setName(""); // NOI18N
        jScrollPane1.setViewportView(jList1);

        timePicker1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        AllergiesText5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText5.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText5.setText("Hora da consulta");
        AllergiesText5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AllergiesText6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText6.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText6.setText("Informações adicionais");
        AllergiesText6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ObsPanel17.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel17.setBorder(null);
        ObsPanel17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ObsFld17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObsFld17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ObsPanel17.setViewportView(ObsFld17);

        ObsPanel18.setBackground(new java.awt.Color(255, 255, 255));
        ObsPanel18.setBorder(null);
        ObsPanel18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        ObsFld18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ObsFld18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ObsFld18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ObsPanel18.setViewportView(ObsFld18);

        AllergiesText7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText7.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText7.setText("Valor da consulta");
        AllergiesText7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        AllergiesText8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AllergiesText8.setForeground(new java.awt.Color(0, 0, 102));
        AllergiesText8.setText("Método de pagamento");
        AllergiesText8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jFormattedTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        UpdateHistoryBtn7.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn7.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn7.setText("Salvar");
        UpdateHistoryBtn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn7.setBorderPainted(false);
        UpdateHistoryBtn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        UpdateHistoryBtn8.setBackground(new java.awt.Color(0, 0, 102));
        UpdateHistoryBtn8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateHistoryBtn8.setForeground(new java.awt.Color(255, 255, 255));
        UpdateHistoryBtn8.setText("Cancelar");
        UpdateHistoryBtn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateHistoryBtn8.setBorderPainted(false);
        UpdateHistoryBtn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ServicePanelLayout = new javax.swing.GroupLayout(ServicePanel);
        ServicePanel.setLayout(ServicePanelLayout);
        ServicePanelLayout.setHorizontalGroup(
            ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ObsPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ServicePanelLayout.createSequentialGroup()
                            .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AllergiesText2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(ServicePanelLayout.createSequentialGroup()
                                    .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BirthDateText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BirthDateFld2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BirthDateText3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BirthDateFld3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BirthDateText4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BirthDateFld4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(PersonalInfoText3, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(ServicePanelLayout.createSequentialGroup()
                                    .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(AllergiesText3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AllergiesText6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ObsPanel17)))
                                .addGroup(ServicePanelLayout.createSequentialGroup()
                                    .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AllergiesText4, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(timePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AllergiesText5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ServicePanelLayout.createSequentialGroup()
                                    .addComponent(UpdateHistoryBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(UpdateHistoryBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(2, 2, 2)))
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AllergiesText7, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField1))
                        .addGap(18, 18, 18)
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ObsPanel18)
                            .addComponent(AllergiesText8, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        ServicePanelLayout.setVerticalGroup(
            ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(PersonalInfoText3)
                .addGap(18, 18, 18)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addComponent(BirthDateText2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BirthDateFld2))
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addComponent(BirthDateText4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BirthDateFld4))
                    .addComponent(BirthDateText3)
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(BirthDateFld3)))
                .addGap(18, 18, 18)
                .addComponent(AllergiesText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllergiesText3)
                    .addComponent(AllergiesText6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(ObsPanel17))
                .addGap(18, 18, 18)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllergiesText4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllergiesText5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllergiesText7)
                    .addComponent(AllergiesText8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addGap(47, 47, 47)
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateHistoryBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateHistoryBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addComponent(ObsPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1037, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ServicePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1007, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(ServicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllergiesText2;
    private javax.swing.JLabel AllergiesText3;
    private javax.swing.JLabel AllergiesText4;
    private javax.swing.JLabel AllergiesText5;
    private javax.swing.JLabel AllergiesText6;
    private javax.swing.JLabel AllergiesText7;
    private javax.swing.JLabel AllergiesText8;
    private javax.swing.JLabel BirthDateFld2;
    private javax.swing.JLabel BirthDateFld3;
    private javax.swing.JLabel BirthDateFld4;
    private javax.swing.JLabel BirthDateText2;
    private javax.swing.JLabel BirthDateText3;
    private javax.swing.JLabel BirthDateText4;
    private javax.swing.JTextPane ObsFld16;
    private javax.swing.JTextPane ObsFld17;
    private javax.swing.JTextPane ObsFld18;
    private javax.swing.JScrollPane ObsPanel16;
    private javax.swing.JScrollPane ObsPanel17;
    private javax.swing.JScrollPane ObsPanel18;
    private javax.swing.JLabel PersonalInfoText3;
    private javax.swing.JPanel ServicePanel;
    private javax.swing.JButton UpdateHistoryBtn7;
    private javax.swing.JButton UpdateHistoryBtn8;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    // End of variables declaration//GEN-END:variables
}
