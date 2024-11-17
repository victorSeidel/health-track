package view;

import java.awt.Cursor;
import java.awt.event.KeyEvent;

public class view_Login extends javax.swing.JFrame
{
    public view_Login() 
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
        RegisterText = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        ErrorText = new javax.swing.JLabel();

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
        PasswordFld.setNextFocusableComponent(LoginBtn);
        PasswordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFldKeyPressed(evt);
            }
        });

        RegisterText.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        RegisterText.setForeground(new java.awt.Color(147, 201, 255));
        RegisterText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RegisterText.setText("Criar novo usuário");
        RegisterText.setToolTipText("Aperte para criar um novo usuário.");
        RegisterText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterTextMouseExited(evt);
            }
        });

        LoginBtn.setBackground(new java.awt.Color(147, 201, 255));
        LoginBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LoginBtn.setText("Login");
        LoginBtn.setToolTipText("Aperte para fazer login.");
        LoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        LoginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginBtnKeyPressed(evt);
            }
        });

        ErrorText.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ErrorText.setForeground(java.awt.Color.red);
        ErrorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ErrorText.setText("a");
        ErrorText.setToolTipText("");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RegisterText)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(UserText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ErrorText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PasswordCheck))
                                .addComponent(UserFld, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PasswordFld, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(UserText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordText)
                    .addComponent(PasswordCheck, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorText)
                .addContainerGap(50, Short.MAX_VALUE))
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
                .addGap(100, 100, 100)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        if (Verify() == 1)
        {
            return;
        }
        
        Login();
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void UserFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserFldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) LoginBtn.doClick();
    }//GEN-LAST:event_UserFldKeyPressed

    private void LoginBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginBtnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) LoginBtn.doClick();
    }//GEN-LAST:event_LoginBtnKeyPressed

    private void RegisterTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterTextMouseClicked
        Register();
    }//GEN-LAST:event_RegisterTextMouseClicked

    private void RegisterTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterTextMouseEntered
        RegisterText.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_RegisterTextMouseEntered

    private void RegisterTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterTextMouseExited
        RegisterText.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_RegisterTextMouseExited

    private void PasswordFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) LoginBtn.doClick();
    }//GEN-LAST:event_PasswordFldKeyPressed

    private void PasswordCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordCheckActionPerformed
        if (PasswordCheck.isSelected()) PasswordFld.setEchoChar((char) 0);
        else PasswordFld.setEchoChar('*');
    }//GEN-LAST:event_PasswordCheckActionPerformed

    private void UserFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserFldActionPerformed

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
            java.util.logging.Logger.getLogger(view_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new view_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel ErrorText;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel Panel;
    private javax.swing.JCheckBox PasswordCheck;
    private javax.swing.JPasswordField PasswordFld;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JLabel RegisterText;
    private javax.swing.JTextField UserFld;
    private javax.swing.JLabel UserText;
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
        view_Main viewMain = new view_Main();
        viewMain.setVisible(true);
        this.dispose();
    }
    
    private void Register()
    {
        view_Register viewRegister = new view_Register();
        viewRegister.setVisible(true);
    }
}
