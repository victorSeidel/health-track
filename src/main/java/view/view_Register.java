package view;

import java.awt.Cursor;
import java.awt.event.KeyEvent;

public class view_Register extends javax.swing.JFrame
{
    public view_Register() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        UserText = new javax.swing.JLabel();
        UserFld = new javax.swing.JTextField();
        PasswordText = new javax.swing.JLabel();
        PasswordCheck = new javax.swing.JCheckBox();
        PasswordFld = new javax.swing.JPasswordField();
        ErrorText = new javax.swing.JLabel();
        UserText1 = new javax.swing.JLabel();
        UserFld1 = new javax.swing.JTextField();
        UserText3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ConPasswordFld = new javax.swing.JPasswordField();
        PasswordText1 = new javax.swing.JLabel();
        ConPasswordCheck = new javax.swing.JCheckBox();
        CancelBtn = new javax.swing.JButton();
        RegisterBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        Panel.setBackground(new java.awt.Color(0, 0, 102));

        UserText.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UserText.setForeground(new java.awt.Color(255, 255, 255));
        UserText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UserText.setText("Usuário");

        UserFld.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UserFld.setToolTipText("Digite seu nome de usuário.");
        UserFld.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UserFld.setNextFocusableComponent(PasswordFld);
        UserFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFldActionPerformed(evt);
            }
        });
        UserFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserFldKeyPressed(evt);
            }
        });

        PasswordText.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PasswordText.setForeground(new java.awt.Color(255, 255, 255));
        PasswordText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PasswordText.setText("Senha");

        PasswordCheck.setBackground(new java.awt.Color(0, 0, 102));
        PasswordCheck.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        PasswordCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PasswordCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordCheckActionPerformed(evt);
            }
        });

        PasswordFld.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PasswordFld.setToolTipText("Digite sua senha.");
        PasswordFld.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PasswordFld.setNextFocusableComponent(RegisterBtn);
        PasswordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFldKeyPressed(evt);
            }
        });

        ErrorText.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ErrorText.setForeground(java.awt.Color.red);
        ErrorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ErrorText.setToolTipText("");

        UserText1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UserText1.setForeground(new java.awt.Color(255, 255, 255));
        UserText1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UserText1.setText("Nome");

        UserFld1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UserFld1.setToolTipText("Digite seu nome de usuário.");
        UserFld1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UserFld1.setNextFocusableComponent(PasswordFld);
        UserFld1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserFld1ActionPerformed(evt);
            }
        });
        UserFld1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserFld1KeyPressed(evt);
            }
        });

        UserText3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UserText3.setForeground(new java.awt.Color(255, 255, 255));
        UserText3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UserText3.setText("Tipo de profissional");

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secretaria / Recepção", "Profissional da saúde" }));

        ConPasswordFld.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ConPasswordFld.setToolTipText("Digite sua senha.");
        ConPasswordFld.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ConPasswordFld.setNextFocusableComponent(RegisterBtn);
        ConPasswordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConPasswordFldKeyPressed(evt);
            }
        });

        PasswordText1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PasswordText1.setForeground(new java.awt.Color(255, 255, 255));
        PasswordText1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PasswordText1.setText("Repetir senha");

        ConPasswordCheck.setBackground(new java.awt.Color(0, 0, 102));
        ConPasswordCheck.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ConPasswordCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConPasswordCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConPasswordCheckActionPerformed(evt);
            }
        });

        CancelBtn.setBackground(new java.awt.Color(147, 201, 255));
        CancelBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CancelBtn.setText("Cancelar");
        CancelBtn.setToolTipText("Aperte para fazer login.");
        CancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        CancelBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CancelBtnKeyPressed(evt);
            }
        });

        RegisterBtn.setBackground(new java.awt.Color(147, 201, 255));
        RegisterBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        RegisterBtn.setText("Registrar");
        RegisterBtn.setToolTipText("Aperte para fazer login.");
        RegisterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });
        RegisterBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RegisterBtnKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ErrorText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(PasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PasswordCheck)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(UserText, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                .addGap(32, 32, 32))
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(UserFld)
                                                .addGap(42, 42, 42)))
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(UserText3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(UserFld1)
                                            .addComponent(UserText1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(PasswordText1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ConPasswordCheck))
                                            .addComponent(ConPasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(10, 10, 10)))))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(UserText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserFld1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordText1)
                            .addComponent(ConPasswordCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConPasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(UserText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(UserText3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordText)
                    .addComponent(PasswordCheck, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        UserFld.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        dispose();
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void UserFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserFldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) RegisterBtn.doClick();
    }//GEN-LAST:event_UserFldKeyPressed

    private void RegisterBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegisterBtnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) RegisterBtn.doClick();
    }//GEN-LAST:event_RegisterBtnKeyPressed

    private void PasswordFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) RegisterBtn.doClick();
    }//GEN-LAST:event_PasswordFldKeyPressed

    private void PasswordCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordCheckActionPerformed
        if (PasswordCheck.isSelected()) PasswordFld.setEchoChar((char) 0);
        else PasswordFld.setEchoChar('*');
    }//GEN-LAST:event_PasswordCheckActionPerformed

    private void UserFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserFldActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void CancelBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CancelBtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelBtnKeyPressed

    private void UserFld1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserFld1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserFld1ActionPerformed

    private void UserFld1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserFld1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserFld1KeyPressed

    private void ConPasswordCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConPasswordCheckActionPerformed
        if (ConPasswordCheck.isSelected()) ConPasswordFld.setEchoChar((char) 0);
        else ConPasswordFld.setEchoChar('*');
    }//GEN-LAST:event_ConPasswordCheckActionPerformed

    private void ConPasswordFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConPasswordFldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConPasswordFldKeyPressed

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
            java.util.logging.Logger.getLogger(view_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new view_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JCheckBox ConPasswordCheck;
    private javax.swing.JPasswordField ConPasswordFld;
    private javax.swing.JLabel ErrorText;
    private javax.swing.JPanel Panel;
    private javax.swing.JCheckBox PasswordCheck;
    private javax.swing.JPasswordField PasswordFld;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JLabel PasswordText1;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JTextField UserFld;
    private javax.swing.JTextField UserFld1;
    private javax.swing.JLabel UserText;
    private javax.swing.JLabel UserText1;
    private javax.swing.JLabel UserText3;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables

    private int Verify()
    {
        if (UserFld.getText().length() == 0)
        {
            ErrorText.setText("Digite seu nome de usuário.");
            return 0;
        }
        
        if (PasswordFld.getText().length() == 0)
        {
            ErrorText.setText("Digite sua senha.");
            return 0;
        }
        
        return 0;
    }
    
    private void Login()
    {
        view_Home viewHome = new view_Home();
        viewHome.setVisible(true);
        this.dispose();
    }
    
    private void Register()
    {
        view_Register viewRegister = new view_Register();
        viewRegister.setVisible(true);
    }
}
