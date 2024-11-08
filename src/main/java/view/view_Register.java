package view;

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
        UserText = new javax.swing.JLabel();
        UserFld = new javax.swing.JTextField();
        PasswordText = new javax.swing.JLabel();
        PasswordFld = new javax.swing.JTextField();
        CancelBtn = new javax.swing.JButton();
        RegisterBtn = new javax.swing.JButton();
        ErrorText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setResizable(false);

        Background.setBackground(new java.awt.Color(153, 204, 255));

        UserText.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        UserText.setForeground(new java.awt.Color(0, 0, 0));
        UserText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UserText.setText("Usuário");

        UserFld.setBackground(new java.awt.Color(204, 255, 255));
        UserFld.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        UserFld.setToolTipText("Digite seu nome de usuário.");
        UserFld.setMargin(new java.awt.Insets(0, 10, 0, 0));
        UserFld.setNextFocusableComponent(PasswordFld);
        UserFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserFldKeyPressed(evt);
            }
        });

        PasswordText.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        PasswordText.setForeground(new java.awt.Color(0, 0, 0));
        PasswordText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PasswordText.setText("Senha");

        PasswordFld.setBackground(new java.awt.Color(204, 255, 255));
        PasswordFld.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        PasswordFld.setToolTipText("Digite sua senha..");
        PasswordFld.setMargin(new java.awt.Insets(0, 10, 0, 0));
        PasswordFld.setNextFocusableComponent(RegisterBtn);
        PasswordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFldKeyPressed(evt);
            }
        });

        CancelBtn.setBackground(new java.awt.Color(0, 153, 255));
        CancelBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        CancelBtn.setText("Cancelar");
        CancelBtn.setToolTipText("Aperte para cancelar essa ação.");
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

        RegisterBtn.setBackground(new java.awt.Color(0, 153, 255));
        RegisterBtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        RegisterBtn.setForeground(new java.awt.Color(0, 0, 0));
        RegisterBtn.setText("Registrar");
        RegisterBtn.setToolTipText("Aperte para registrar o novo usuário.");
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

        ErrorText.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ErrorText.setForeground(new java.awt.Color(255, 0, 0));
        ErrorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ErrorText.setToolTipText("");
        ErrorText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UserText, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserFld, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorText, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(UserText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(UserFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(PasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ErrorText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        UserFld.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Register");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        if (Verify() == 1)
        {
            return;
        }
        
        Login();
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void PasswordFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) RegisterBtn.doClick();
    }//GEN-LAST:event_PasswordFldKeyPressed

    private void UserFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserFldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) RegisterBtn.doClick();
    }//GEN-LAST:event_UserFldKeyPressed

    private void RegisterBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegisterBtnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) RegisterBtn.doClick();
    }//GEN-LAST:event_RegisterBtnKeyPressed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void CancelBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CancelBtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelBtnKeyPressed

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
    private javax.swing.JLabel ErrorText;
    private javax.swing.JTextField PasswordFld;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JTextField UserFld;
    private javax.swing.JLabel UserText;
    // End of variables declaration//GEN-END:variables

    private int Verify()
    {
        if (UserFld.getText().length() == 0)
        {
            ErrorText.setText("Digite seu nome de usuário.");
            return 1;
        }
        
        if (PasswordFld.getText().length() == 0)
        {
            ErrorText.setText("Digite sua senha.");
            return 1;
        }
        
        return 0;
    }
    
    private void Login()
    {
        
    }
}
