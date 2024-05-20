package New;

import java.io.FileWriter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class DATA extends javax.swing.JFrame {
    public DATA() {
        initComponents();
    }

    String ame,num,money,cnic;int limit;
    public DATA(String val1,String val2,String val3,String val4){
    initComponents();
    this.ame=val1;
    this.num=val2;
    this.cnic=val3;
    this.money=val4;
    
        AddDataToTable();
    }

   
    
    void AddDataToTable(){
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    Vector v = new Vector();
    v.add(ame);
    v.add(num);
    v.add(cnic);
    v.add(money);
    dt.addRow(v);
    }
    public String[][] data; 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        create = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data of Current Account");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Account INFO :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone Number", "CNIC no", "Balance"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 71, 590, 49));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Data:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 39, -1, -1));

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\src\\main\\java\\New\\grid_update.png")); // NOI18N
        jButton1.setText("WithDraw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, 28));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Create New Account");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        buttonGroup1.add(create);
        create.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        jPanel1.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        buttonGroup1.add(no);
        no.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        no.setForeground(new java.awt.Color(255, 255, 255));
        no.setText("Exit");
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\src\\main\\java\\New\\forward.gif")); // NOI18N
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 140, 30));

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\src\\main\\java\\New\\2879357_11zon (2).gif")); // NOI18N
        jButton3.setText("Transfer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 130, 30));

        jButton4.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\src\\main\\java\\New\\download7.gif")); // NOI18N
        jButton4.setText("Deposite");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 130, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("current account info:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\src\\main\\java\\New\\bank11.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 800, 350));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bank Management");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\src\\main\\java\\New\\piccurrent.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 800, 160));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Double tot;
    Double amount = Double.parseDouble(money);
    String num;
    num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount");
    double amount2 = Double.parseDouble(num);
    if(amount<amount2){
    JOptionPane.showMessageDialog(this,"Sorry! You Have No Enough Money. ");
    }
    else{
    tot = amount - amount2;
    JOptionPane.showMessageDialog(this,"your amount will be"+tot.toString());
     try
            {
                FileWriter Writer = new FileWriter("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\Current Accounts\\"+ame+".txt");
                Writer.write(" "+ame+" "+num+" "+cnic+" "+tot);
                Writer.write(System.getProperty("line.separator"));
                Writer.close();
                JOptionPane.showMessageDialog(null,"Success");
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                dt.setValueAt(tot.toString(), 0, 3);
                money=tot.toString();

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error");
            }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if (create.isSelected())
   {
       CurrentAccount s = new CurrentAccount();
       s.show();
       dispose();
              
   }
   else if (no.isSelected()) 
   {
       this.setVisible(false);
   }   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Double tot2;
    Double amount = Double.parseDouble(money);
    Double amount3=amount;
    String num2;
    num2 = JOptionPane.showInputDialog(null, "Enter a Amount To Transfer :", "Transfer Amount");
    double amount4 = Double.parseDouble(num2);
    if(amount3<amount4){
    JOptionPane.showMessageDialog(this,"Sorry! You Have No Enough Money. ");
    }
    else{
    tot2 = amount3 - amount4;
    JOptionPane.showMessageDialog(this,"your amount will be"+tot2.toString());
     try
            {
                FileWriter Writer = new FileWriter("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\Current Accounts\\"+ame+".txt");
                Writer.write(" "+ame+" "+num+" "+cnic+" "+tot2);
                Writer.write(System.getProperty("line.separator"));
                Writer.close();
                JOptionPane.showMessageDialog(null,"Success");
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                dt.setValueAt(tot2.toString(), 0, 3);
                money=tot2.toString();
                

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error");
            }
    }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Double tot3;
    Double amount4 = Double.parseDouble(money);
    String num2;
    num2 = JOptionPane.showInputDialog(null, "Enter a Amount To Deposite :", "Deposite amount");
    double amount5 = Double.parseDouble(num2);

    tot3 = amount4 + amount5;
    JOptionPane.showMessageDialog(null,"Deposited Succefully");
               
                  try
            {
                FileWriter Writer = new FileWriter("C:\\Users\\ABC\\Desktop\\Meezan BankProject\\Current Accounts\\"+ame+".txt");
                Writer.write(" "+ame+" "+num+" "+cnic+" "+tot3);
                Writer.write(System.getProperty("line.separator"));
                Writer.close();
                JOptionPane.showMessageDialog(null,"Success");
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                dt.setValueAt(tot3.toString(), 0, 3);
                money=tot3.toString();

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error");
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createActionPerformed

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
            java.util.logging.Logger.getLogger(DATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DATA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton create;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton no;
    // End of variables declaration//GEN-END:variables
}
