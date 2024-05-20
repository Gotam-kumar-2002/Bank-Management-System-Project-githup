package New;

import java.io.FileWriter;
import java.util.Random;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;


public class CurrentAccount extends javax.swing.JFrame {

    static void withdraw(double num1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Creates new form CurrentAccount
     * @param l
     */
    public CurrentAccount() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        deposite = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Current Account");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(28, 42, 42));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 197, -1, -1));

        name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 159, -1));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 98, -1, 70));

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 135, -1, 80));

        pass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 160, 20));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 175, -1, 70));

        number.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberKeyTyped(evt);
            }
        });
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 160, -1));

        nic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });
        nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicKeyTyped(evt);
            }
        });
        getContentPane().add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 160, -1));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CNIC No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 80));

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Current  Balance");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 255, 150, 70));

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\src\\main\\java\\New\\forward.gif")); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 140, 30));

        deposite.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        deposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositeActionPerformed(evt);
            }
        });
        deposite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                depositeKeyTyped(evt);
            }
        });
        getContentPane().add(deposite, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 161, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Current Account");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\src\\main\\java\\New\\getty_1digital-banking-2021_122220.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static int limit=1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(limit<=5)
{
        if(name.getText().isEmpty() || pass.getText().isEmpty() || number.getText().isEmpty() || nic.getText().isEmpty() || deposite.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all DATA");
        }

        else{
            String   Name, Number, CNIC , Deposite ;
            Name = name.getText();
            Number = number.getText();
            CNIC = nic.getText();
            String bio = "\n Account Holder Name :"+name.getText() + "\n Account Holder Number : " + number.getText() + "\n Account Holder CNIC : "  + nic.getText() + " \n Money in Account : "   + deposite.getText();
            JOptionPane.showMessageDialog(null, "\n Your Full DATA is : "+bio);

            int random = 5000;
            Random r = new Random();
            int int_random = r.nextInt(random);
            JOptionPane.showMessageDialog(null,"Your account number is : "+int_random );

            String ame = name.getText();
            String num = number.getText();
            String cnic = nic.getText();
            String money = deposite.getText();
                            new DATA(ame,num,cnic,money).setVisible(true);

            String pame = name.getText();
            String numb = number.getText();
            String cnicc = nic.getText();
            String moneyy = deposite.getText();
            
            try
            {
                FileWriter Writer = new FileWriter("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\Current Accounts\\"+pame+".txt");
                Writer.write(" "+pame+" "+numb+" "+cnicc+" "+moneyy);
                Writer.write(System.getProperty("line.separator"));
                Writer.close();
                JOptionPane.showMessageDialog(null,""+limit);
                limit++;
                dispose();


            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error");
            }
           
        }}
         else
            {
                                JOptionPane.showMessageDialog(null,"Limit Exceeded");

            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void depositeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depositeKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_depositeKeyTyped

    private void depositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositeActionPerformed

    private void nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_nicKeyTyped

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void numberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_numberKeyTyped

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyTyped

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

    }//GEN-LAST:event_nameActionPerformed

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
            java.util.logging.Logger.getLogger(CurrentAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrentAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deposite;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField name;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField number;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
