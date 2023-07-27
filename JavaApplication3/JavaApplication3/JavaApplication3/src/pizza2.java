
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jremove = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jl = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jScrollPane1.setForeground(new java.awt.Color(255, 204, 153));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jScrollPane1.setBounds(460, 420, 320, 110);

        jadd.setBackground(new java.awt.Color(102, 102, 102));
        jadd.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jadd.setForeground(new java.awt.Color(153, 153, 255));
        jadd.setText("ADD");
        jadd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddActionPerformed(evt);
            }
        });
        jPanel2.add(jadd);
        jadd.setBounds(10, 430, 90, 40);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jfamily.setBackground(new java.awt.Color(0, 102, 102));
        jfamily.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jfamily.setForeground(new java.awt.Color(153, 153, 255));
        jfamily.setText("One cup size");
        jfamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfamilyActionPerformed(evt);
            }
        });
        jPanel1.add(jfamily);
        jfamily.setBounds(115, 65, 108, 26);

        jco.setBackground(new java.awt.Color(0, 51, 51));
        jco.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jco.setForeground(new java.awt.Color(153, 153, 255));
        jco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT FLAVOUR", "Choclate", "Vanila", "Stawberry", "Capachino", "Mango" }));
        jco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcoActionPerformed(evt);
            }
        });
        jPanel1.add(jco);
        jco.setBounds(7, 15, 135, 22);

        jfriend.setBackground(new java.awt.Color(0, 102, 102));
        jfriend.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jfriend.setForeground(new java.awt.Color(153, 153, 255));
        jfriend.setText("Two cup size");
        jPanel1.add(jfriend);
        jfriend.setBounds(113, 103, 110, 21);

        jsingle.setBackground(new java.awt.Color(0, 102, 102));
        jsingle.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jsingle.setForeground(new java.awt.Color(153, 153, 255));
        jsingle.setText("Large cup size");
        jsingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsingleActionPerformed(evt);
            }
        });
        jPanel1.add(jsingle);
        jsingle.setBounds(113, 136, 110, 21);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(20, 220, 230, 180);

        jprint.setBackground(new java.awt.Color(102, 102, 102));
        jprint.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jprint.setForeground(new java.awt.Color(153, 153, 255));
        jprint.setText("PRINT INVOICE");
        jprint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprintActionPerformed(evt);
            }
        });
        jPanel2.add(jprint);
        jprint.setBounds(270, 430, 170, 40);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setText("  QTY");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(550, 50, 60, 30);

        jpay.setBackground(new java.awt.Color(255, 204, 153));
        jpay.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jpay.setText("Payment");
        jpay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jpay);
        jpay.setBounds(520, 150, 90, 40);

        jbal.setBackground(new java.awt.Color(255, 204, 153));
        jbal.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jbal.setText("Balance");
        jbal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jbal);
        jbal.setBounds(520, 210, 90, 40);

        jqty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jqty);
        jqty.setBounds(670, 50, 90, 30);

        jpayment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpaymentActionPerformed(evt);
            }
        });
        jPanel2.add(jpayment);
        jpayment.setBounds(670, 160, 90, 30);

        jbalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbalanceActionPerformed(evt);
            }
        });
        jPanel2.add(jbalance);
        jbalance.setBounds(670, 220, 90, 30);

        jtotal.setBackground(new java.awt.Color(255, 204, 153));
        jtotal.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jtotal.setText("Total");
        jtotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jtotal);
        jtotal.setBounds(550, 100, 60, 30);

        jto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 2, true));
        jPanel2.add(jto);
        jto.setBounds(670, 100, 90, 30);

        jLabel6.setBackground(new java.awt.Color(102, 102, 255));
        jLabel6.setFont(new java.awt.Font("Wide Latin", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("    Your....");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(100, 150, 370, 30);

        jLabel7.setFont(new java.awt.Font("Wide Latin", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("    choice");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 350, 120);

        jremove.setBackground(new java.awt.Color(102, 102, 102));
        jremove.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jremove.setForeground(new java.awt.Color(153, 153, 255));
        jremove.setText("Remove");
        jremove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jremoveActionPerformed(evt);
            }
        });
        jPanel2.add(jremove);
        jremove.setBounds(120, 430, 140, 40);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 204, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p55.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 1240, 420);

        jl.setBackground(new java.awt.Color(102, 102, 102));
        jl.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jl.setForeground(new java.awt.Color(153, 153, 255));
        jl.setText("leave our Magic World");
        jl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlActionPerformed(evt);
            }
        });
        jPanel2.add(jl);
        jl.setBounds(540, 0, 240, 40);

        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 210, 38, 16);

        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 30, 38, 16);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
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
     if(jco.getSelectedItem()=="Choclate"){
     item="Choclate";
     }
     else if(jco.getSelectedItem()=="'Vanila"){
          item="Vanila";
     }
      else if(jco.getSelectedItem()=="Stawberry"){
          item="Stawberry";
     }
      else if(jco.getSelectedItem()=="Capachino"){
          item="Capachino";
     }
      else if(jco.getSelectedItem()=="Mango"){
          item="Mango";
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
         String dbpath="jdbc:mysql://localhost/icecream";
    Connection con=DriverManager.getConnection(dbpath,"root","");
    Statement st=con.createStatement();
    st.executeUpdate("insert into order values('"+tot+"','"+pay+",'"+bal+"')");
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
