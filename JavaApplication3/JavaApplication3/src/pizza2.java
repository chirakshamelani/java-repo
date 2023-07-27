
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
  
public class pizza2 extends javax.swing.JFrame  {

    
    public pizza2() {
        initComponents();

 
 
    }
   DefaultTableModel  model;
      String size,item; 
      int price;
      
   Connection con;
PreparedStatement pst;
PreparedStatement pst1;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jadd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jfamily = new javax.swing.JRadioButton();
        jco = new javax.swing.JComboBox<>();
        jfriend = new javax.swing.JRadioButton();
        jsingle = new javax.swing.JRadioButton();
        jprint = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpay = new javax.swing.JLabel();
        jbal = new javax.swing.JLabel();
        jqty = new javax.swing.JSpinner();
        jpayment = new javax.swing.JTextField();
        jbalance = new javax.swing.JTextField();
        jtotal = new javax.swing.JLabel();
        jto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jremove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jl = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel2.setLayout(null);

        jScrollPane1.setForeground(new java.awt.Color(255, 204, 153));

        jTable1.setBackground(new java.awt.Color(255, 204, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteam", "Size", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(760, 280, 390, 180);

        jadd.setBackground(new java.awt.Color(255, 204, 153));
        jadd.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jadd.setForeground(new java.awt.Color(255, 0, 0));
        jadd.setText("ADD");
        jadd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddActionPerformed(evt);
            }
        });
        jPanel2.add(jadd);
        jadd.setBounds(460, 10, 90, 40);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));

        jfamily.setBackground(new java.awt.Color(255, 255, 204));
        jfamily.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jfamily.setForeground(new java.awt.Color(204, 0, 0));
        jfamily.setText("Small");
        jfamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfamilyActionPerformed(evt);
            }
        });

        jco.setBackground(new java.awt.Color(255, 204, 102));
        jco.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT PIZZA", "onion", "cheese", "sausages", "mashroom", "peporoni" }));
        jco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcoActionPerformed(evt);
            }
        });

        jfriend.setBackground(new java.awt.Color(255, 255, 204));
        jfriend.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jfriend.setForeground(new java.awt.Color(204, 0, 0));
        jfriend.setText("Medium");

        jsingle.setBackground(new java.awt.Color(255, 255, 204));
        jsingle.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jsingle.setForeground(new java.awt.Color(204, 0, 0));
        jsingle.setText("Large");
        jsingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsingleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsingle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jfamily, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfriend, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jfamily, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jfriend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsingle)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(590, 80, 230, 180);

        jprint.setBackground(new java.awt.Color(255, 204, 153));
        jprint.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jprint.setForeground(new java.awt.Color(255, 0, 0));
        jprint.setText("PRINT INVOICE");
        jprint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprintActionPerformed(evt);
            }
        });
        jPanel2.add(jprint);
        jprint.setBounds(370, 120, 180, 40);

        jLabel1.setBackground(new java.awt.Color(255, 51, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("  QTY");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(890, 50, 60, 30);

        jpay.setBackground(new java.awt.Color(255, 204, 153));
        jpay.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jpay.setForeground(new java.awt.Color(255, 255, 0));
        jpay.setText("Payment");
        jpay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jpay);
        jpay.setBounds(890, 140, 90, 40);

        jbal.setBackground(new java.awt.Color(255, 204, 153));
        jbal.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jbal.setForeground(new java.awt.Color(255, 255, 0));
        jbal.setText("Balance");
        jbal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jbal);
        jbal.setBounds(890, 200, 90, 40);

        jqty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jqty);
        jqty.setBounds(1030, 50, 90, 30);

        jpayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpaymentActionPerformed(evt);
            }
        });
        jPanel2.add(jpayment);
        jpayment.setBounds(1030, 150, 90, 30);

        jbalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbalanceActionPerformed(evt);
            }
        });
        jPanel2.add(jbalance);
        jbalance.setBounds(1030, 200, 90, 30);

        jtotal.setBackground(new java.awt.Color(255, 204, 153));
        jtotal.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jtotal.setForeground(new java.awt.Color(255, 255, 0));
        jtotal.setText("Total");
        jtotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jtotal);
        jtotal.setBounds(890, 100, 60, 30);

        jto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jto);
        jto.setBounds(1030, 100, 90, 30);

        jLabel5.setFont(new java.awt.Font("SimSun", 3, 48)); // NOI18N
        jLabel5.setText("SELECT");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(310, 190, 200, 80);

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        jLabel6.setText("    Your");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(400, 280, 160, 30);

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 3, 36)); // NOI18N
        jLabel7.setText("    choice");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(410, 320, 160, 59);

        jremove.setBackground(new java.awt.Color(255, 204, 153));
        jremove.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jremove.setForeground(new java.awt.Color(255, 0, 0));
        jremove.setText("Remove");
        jremove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jremoveActionPerformed(evt);
            }
        });
        jPanel2.add(jremove);
        jremove.setBounds(410, 60, 140, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheese-food-meal-dinner-thumbnail (1).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(880, 0, 290, 180);

        jl.setBackground(new java.awt.Color(255, 0, 0));
        jl.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jl.setForeground(new java.awt.Color(204, 204, 204));
        jl.setText("leave our Magic World");
        jl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlActionPerformed(evt);
            }
        });
        jPanel2.add(jl);
        jl.setBounds(570, 0, 240, 40);

        jLabel4.setBackground(new java.awt.Color(255, 51, 0));
        jLabel4.setForeground(new java.awt.Color(255, 204, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Orikmo Technologies\\OneDrive\\Pictures\\Screenshots\\Screenshot (109).png")); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 1340, 500);

        jMenu1.setText("Home");

        jMenuItem1.setText("Go to Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jfamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfamilyActionPerformed
    
        
    }//GEN-LAST:event_jfamilyActionPerformed

    private void jpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpaymentActionPerformed
        
    }//GEN-LAST:event_jpaymentActionPerformed

    private void jbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbalanceActionPerformed
 
    }//GEN-LAST:event_jbalanceActionPerformed

 
public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Register the mysql driver
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pizza","root","");
            
            String tot = jto.getText();
            String bal = jbalance.getText();
            String pay = jpay.getText();
              String query = "insert into sales(subtotal,pay,bal)values(?,?,?)";
            
            pst.setString(1, tot);
            pst.setString(2, pay);
             pst.setString(3, bal);
             pst.executeUpdate();
             ResultSet rs = pst.getGeneratedKeys();
            if(rs.next())
            {int lastid =0;
                lastid = rs.getInt(1);
            }
            int row = jTable1.getRowCount();
            String query1 = "insert into sales_product(sales_id,prodname,price,qty,total)values(?,?,?,?,?)";
    
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }

    
    
    private void jaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddActionPerformed
       int qty;
      
     
       if(jfamily.isSelected()==true)
       {
           size ="Small";
           price=1140;
       }
       else if(jfriend.isSelected()==true){ 
           size="Medium";
           price=1320;
       }
        else if(jsingle.isSelected()==true){ 
           size="Large";
           price=1100;
       }
       qty=Integer.parseInt(jqty.getValue().toString());
       int tot=qty*price;
       
       model= (DefaultTableModel)jTable1.getModel();
     model.addRow(new Object[]
     { 
         
         item,
         size,
         price,
         qty,
         tot,
     });
     
     int sum=0;
     
     for(int a=0;a<jTable1.getRowCount(); a++)
     {
         sum=sum+Integer.parseInt(jTable1.getValueAt(a,4).toString());
      }
       
     jto.setText(Integer.toString(sum));
     int pay=Integer.parseInt(jpayment.getText());
    }//GEN-LAST:event_jaddActionPerformed

    private void jremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jremoveActionPerformed
        model.removeRow(jTable1.getSelectedRow());
        int sum=0;
        for(int a=0;a<jTable1.getRowCount(); a++)
     {
         sum=sum+Integer.parseInt(jTable1.getValueAt(a,4).toString());
      }
     
     jto.setText(Integer.toString(sum));
    }//GEN-LAST:event_jremoveActionPerformed

    private void jsingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsingleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsingleActionPerformed

    private void jcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcoActionPerformed
     if(jco.getSelectedItem()=="onion"){
     item="onion";
     }
     else if(jco.getSelectedItem()=="cheese"){
          item="cheese";
     }
      else if(jco.getSelectedItem()=="sausages"){
          item="sausages";
     }
      else if(jco.getSelectedItem()=="mashroom"){
          item="mashroom";
     }
      else if(jco.getSelectedItem()=="peparoni"){
          item="peparoni";
     }
    }//GEN-LAST:event_jcoActionPerformed

    private void jprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprintActionPerformed
         if(jpayment.getText().isEmpty()){
                
                    JOptionPane.showMessageDialog(null, "Please enter payment","erruer",JOptionPane.ERROR_MESSAGE);
    jpayment.requestFocus();
                
         }
        else{
           JOptionPane.showMessageDialog(this,"sucsefull");

        }
        
        
        int pay=Integer.parseInt(jpayment.getText());
         int tot=Integer.parseInt(jto.getText());
         int bal=pay-tot;
         jbalance.setText(Integer.toString(bal));
         
         try{
         String dbpath="jdbc:mysql://localhost/pizza";
    Connection con=DriverManager.getConnection(dbpath,"root","");
    Statement st=con.createStatement();
    st.executeUpdate("insert into sales values('"+tot+"','"+pay+",'"+bal+"')");
    JOptionPane.showMessageDialog(this,"sucsesful add data");
    con.close();
    }



catch(NumberFormatException e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}
 catch(SQLException e){
      System.out.println(e.getMessage());
      
    }
         
    }//GEN-LAST:event_jprintActionPerformed

    private void jlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlActionPerformed
        this.dispose();
    }//GEN-LAST:event_jlActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         pizza1 p= new pizza1();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizza2().setVisible(true);
                
               
            }
        });
    }
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jadd;
    private javax.swing.JLabel jbal;
    private javax.swing.JTextField jbalance;
    private javax.swing.JComboBox<String> jco;
    private javax.swing.JRadioButton jfamily;
    private javax.swing.JRadioButton jfriend;
    private javax.swing.JButton jl;
    private javax.swing.JLabel jpay;
    private javax.swing.JTextField jpayment;
    private javax.swing.JButton jprint;
    private javax.swing.JSpinner jqty;
    private javax.swing.JButton jremove;
    private javax.swing.JRadioButton jsingle;
    private javax.swing.JTextField jto;
    private javax.swing.JLabel jtotal;
    // End of variables declaration//GEN-END:variables
}
