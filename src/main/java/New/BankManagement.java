package New;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankManagement extends javax.swing.JFrame {

    /**
     * Creates new form BankManagement
     */
    public BankManagement() {
        initComponents();
        date();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        current = new javax.swing.JRadioButton();
        save = new javax.swing.JRadioButton();
        reccur = new javax.swing.JRadioButton();
        fix = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Management");

        jPanel1.setBackground(new java.awt.Color(199, 192, 192));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(current);
        current.setForeground(new java.awt.Color(255, 255, 255));
        current.setText("Current Account");
        jPanel1.add(current, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        buttonGroup1.add(save);
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Saving Account");
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        buttonGroup1.add(reccur);
        reccur.setForeground(new java.awt.Color(255, 255, 255));
        reccur.setText("Reccuring Account");
        reccur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reccurActionPerformed(evt);
            }
        });
        jPanel1.add(reccur, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        buttonGroup1.add(fix);
        fix.setForeground(new java.awt.Color(255, 255, 255));
        fix.setText("Fix Deposite Account");
        jPanel1.add(fix, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        next.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        next.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\src\\main\\java\\New\\forward.gif")); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATE AND TIME");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 143, 70));

        jLabel9.setEditable(false);
        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabel9ActionPerformed(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 180, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 6, 604, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\src\\main\\java\\New\\bank9.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 800, 510));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     public void date()
    {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss"); 
        LocalDateTime now =LocalDateTime.now();
        String date =dt.format(now);
        
        jLabel9.setText(date);//function call
    }
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
       if(current.isSelected()){
        CurrentAccount CA = new CurrentAccount();
        JOptionPane.showMessageDialog(null, "Current Account is slected \n Instruction : \n In this account you can Deposite And Withdraw anytime.");
        CA.show();
        dispose();
       }
        else if (save.isSelected()) 
   {
       JOptionPane.showMessageDialog(null, "Saving Account is slected \n Instruction 2 : \n In this account you can only deposit in order to pay online bill");
        SavingAccount s = new SavingAccount();
        s.show();
        dispose();
   }
        else if (reccur.isSelected()) 
   {
       JOptionPane.showMessageDialog(null, "Recurring Account is slected \n Instruction 3 : \n In this account you deposit money, you get interest rate per month. \n After per year you able to withdraw money");
       ReccuringAccount r = new ReccuringAccount();
       r.show();
       dispose();
       
   }
        else if (fix.isSelected()) 
   {
       JOptionPane.showMessageDialog(null, "Fix Deposite Account is slected \n Instruction : \n In this account you deposit money, you get interest rate per year \n");
       FixDepAccount f = new FixDepAccount();
        f.show();
        dispose();
   }
      
    }//GEN-LAST:event_nextActionPerformed

    private void reccurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reccurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reccurActionPerformed

    private void jLabel9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabel9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(BankManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton current;
    private javax.swing.JRadioButton fix;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton reccur;
    private javax.swing.JRadioButton save;
    // End of variables declaration//GEN-END:variables
}
