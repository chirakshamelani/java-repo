
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlo = new javax.swing.JButton();
        ju = new javax.swing.JTextField();
        jc = new javax.swing.JButton();
        jnew = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jl = new javax.swing.JButton();
        jp = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("           Login to Magic World");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 550, 90));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setText("User ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 140, 60));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 140, 50));

        jlo.setBackground(new java.awt.Color(153, 153, 0));
        jlo.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jlo.setText("Login");
        jlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloActionPerformed(evt);
            }
        });
        getContentPane().add(jlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 110, 40));

        ju.setBackground(new java.awt.Color(153, 102, 0));
        ju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juActionPerformed(evt);
            }
        });
        getContentPane().add(ju, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 180, 40));

        jc.setBackground(new java.awt.Color(153, 153, 0));
        jc.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jc.setText("Clear");
        jc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcActionPerformed(evt);
            }
        });
        getContentPane().add(jc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 140, 40));

        jnew.setBackground(new java.awt.Color(153, 102, 0));
        jnew.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jnew.setText("New to Magic Pizza");
        jnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnewActionPerformed(evt);
            }
        });
        getContentPane().add(jnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 200, 40));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Viner Hand ITC", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 51, 0));
        jTextField1.setText("MAGIC");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jl.setBackground(new java.awt.Color(153, 153, 153));
        jl.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jl.setForeground(new java.awt.Color(204, 204, 255));
        jl.setText("leave our Magic World");
        jl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                .addComponent(jl, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 720, -1));

        jp.setBackground(new java.awt.Color(153, 102, 0));
        jPanel2.add(jp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 190, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p53.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 590, 636));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 450, 450));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 740, 670));

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));

        jMenu1.setText("Home");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Go to Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlActionPerformed
  this.dispose();
    }//GEN-LAST:event_jlActionPerformed

    private void juActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juActionPerformed

    private void jloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloActionPerformed
     String user;
            String pwd;
             user=ju.getText();
             pwd=jp.getText();
        
         if(ju.getText().isEmpty()){
                
                    JOptionPane.showMessageDialog(null, "Please enter username","erruer",JOptionPane.ERROR_MESSAGE);
    ju.requestFocus();
              
         }
        else{ 

        }
         if(jp.getText().isEmpty()){
                
                    JOptionPane.showMessageDialog(null, "Please enter password","erruer",JOptionPane.ERROR_MESSAGE);
    jp.requestFocus();
                
         }
        else{
JOptionPane.showMessageDialog(this,"login sucsesfull");
      choice c= new choice();
         c.setVisible(true);
         this.dispose();
         
        }
         
    }//GEN-LAST:event_jloActionPerformed

    private void jnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnewActionPerformed
        register r= new register();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jnewActionPerformed

    private void jcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcActionPerformed
         ju.setText("");
         jp.setText("");
    }//GEN-LAST:event_jcActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here: 
        pizza1 p= new pizza1();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jc;
    private javax.swing.JButton jl;
    private javax.swing.JButton jlo;
    private javax.swing.JButton jnew;
    private javax.swing.JPasswordField jp;
    private javax.swing.JTextField ju;
    // End of variables declaration//GEN-END:variables
}
