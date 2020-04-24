package clases;

import com.mysql.jdbc.Connection;
import com.sun.xml.internal.fastinfoset.EncodingConstants;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FramePQRS extends javax.swing.JFrame {
    
    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConection () {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pqrs", "root", "");
            JOptionPane.showMessageDialog(null, "Successful Connection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
    private void cleanBoxes(){
        txtcode.setText(null);
        txtname.setText(null);
        txtlastname.setText(null);
        txtage.setText(null);
        txtrequest.setText(null);
        txtcomplaints.setText(null);
        txtclaims.setText(null);
        txtsuggestions.setText(null);
    }

    public FramePQRS() {
        initComponents();
        setLocationRelativeTo(null);

        txtrequest.setVisible(false);
        scrollrequest.setVisible(false);

        txtcomplaints.setVisible(false);
        scrollcomplaints.setVisible(false);

        txtclaims.setVisible(false);
        scrollclaims.setVisible(false);

        txtsuggestions.setVisible(false);
        scrollsuggestions.setVisible(false);
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnmodify = new javax.swing.JButton();
        scrollrequest = new javax.swing.JScrollPane();
        txtrequest = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        scrollcomplaints = new javax.swing.JScrollPane();
        txtcomplaints = new javax.swing.JTextArea();
        scrollsuggestions = new javax.swing.JScrollPane();
        txtsuggestions = new javax.swing.JTextArea();
        scrollclaims = new javax.swing.JScrollPane();
        txtclaims = new javax.swing.JTextArea();
        btnsearch = new javax.swing.JButton();

        jTextField8.setText("jTextField8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel1.setText("PQRS system");

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        jLabel2.setText("Code");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        jLabel4.setText("Last name");

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 16)); // NOI18N
        jLabel5.setText("Age");

        btnsave.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnmodify.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        btnmodify.setText("Modify");
        btnmodify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifyActionPerformed(evt);
            }
        });

        txtrequest.setBackground(new java.awt.Color(255, 204, 204));
        txtrequest.setColumns(20);
        txtrequest.setRows(5);
        scrollrequest.setViewportView(txtrequest);

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 11)); // NOI18N
        jButton4.setText(" Request");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 153));
        jButton5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 11)); // NOI18N
        jButton5.setText("Complaints");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 102));
        jButton6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 11)); // NOI18N
        jButton6.setText("Claims");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 153, 51));
        jButton7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 11)); // NOI18N
        jButton7.setText("Suggestions");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        txtcomplaints.setBackground(new java.awt.Color(255, 153, 153));
        txtcomplaints.setColumns(20);
        txtcomplaints.setRows(5);
        scrollcomplaints.setViewportView(txtcomplaints);

        txtsuggestions.setBackground(new java.awt.Color(255, 153, 51));
        txtsuggestions.setColumns(20);
        txtsuggestions.setRows(5);
        scrollsuggestions.setViewportView(txtsuggestions);

        txtclaims.setBackground(new java.awt.Color(255, 204, 102));
        txtclaims.setColumns(20);
        txtclaims.setRows(5);
        scrollclaims.setViewportView(txtclaims);

        btnsearch.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollrequest, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(scrollclaims, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollsuggestions, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(scrollcomplaints, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtlastname)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmodify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnsave)
                        .addGap(18, 18, 18)
                        .addComponent(btnmodify))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollcomplaints)
                            .addComponent(scrollrequest, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollclaims, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollsuggestions, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txtrequest.setVisible(true);
        txtrequest.setBounds(185, 210, 270, 200);
        scrollrequest.setVisible(true);
        scrollrequest.setBounds(185, 210, 270, 200);

        txtcomplaints.setVisible(false);
        scrollcomplaints.setVisible(false);

        txtclaims.setVisible(false);
        scrollclaims.setVisible(false);

        txtsuggestions.setVisible(false);
        scrollsuggestions.setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtcomplaints.setVisible(true);
        txtcomplaints.setBounds(185, 210, 270, 200);
        scrollcomplaints.setVisible(true);
        scrollcomplaints.setBounds(185, 210, 270, 200);

        txtclaims.setVisible(false);
        scrollclaims.setVisible(false);

        txtsuggestions.setVisible(false);
        scrollsuggestions.setVisible(false);

        txtrequest.setVisible(false);
        scrollrequest.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        txtclaims.setVisible(true);
        txtclaims.setBounds(185, 210, 270, 200);
        scrollclaims.setVisible(true);
        scrollclaims.setBounds(185, 210, 270, 200);

        txtrequest.setVisible(false);
        scrollrequest.setVisible(false);

        txtcomplaints.setVisible(false);
        scrollcomplaints.setVisible(false);

        txtsuggestions.setVisible(false);
        scrollsuggestions.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        txtsuggestions.setVisible(true);
        txtsuggestions.setBounds(185, 210, 270, 200);
        scrollsuggestions.setVisible(true);
        scrollsuggestions.setBounds(185, 210, 270, 200);

        txtrequest.setVisible(false);
        scrollrequest.setVisible(false);

        txtcomplaints.setVisible(false);
        scrollcomplaints.setVisible(false);

        txtclaims.setVisible(false);
        scrollclaims.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        ///////////
        Connection con = null;
        try{
            con=getConection();
            ps=con.prepareStatement("INSERT INTO management (cod, name, lastname, age, request, complaint, claim, suggestion) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1,txtcode.getText());
            ps.setString(2,txtname.getText());
            ps.setString(3,txtlastname.getText());
            ps.setString(4,txtage.getText());
            ps.setString(5,txtrequest.getText());
            ps.setString(6,txtcomplaints.getText());
            ps.setString(7,txtclaims.getText());
            ps.setString(8,txtsuggestions.getText());
            
            int res = ps.executeUpdate();
            if (res>0) {
                JOptionPane.showMessageDialog(null, "Saved");
                cleanBoxes();
            }else{
                JOptionPane.showMessageDialog(null, "Save error");
                cleanBoxes();
            }
            con.close();
            
        }catch(SQLException e){
            System.err.print(e);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        
        Connection con = null;
        try {
            con=getConection();
            ps=con.prepareStatement("SELECT * FROM `management` WHERE cod=?");
            ps.setString(1, txtcode.getText());
            
            rs=ps.executeQuery();
            if (rs.next()) {
                txtcode.setText(rs.getString("cod"));
                txtname.setText(rs.getString("name"));
                txtlastname.setText(rs.getString("lastname"));
                txtage.setText(rs.getString("age"));
                txtrequest.setText(rs.getString("request"));
                txtcomplaints.setText(rs.getString("complaint"));
                txtclaims.setText(rs.getString("claim"));
                txtsuggestions.setText(rs.getString("suggestion"));
            }else{
                JOptionPane.showMessageDialog(null, "Does not exist");
            }
        }catch(SQLException e){
            System.err.print(e);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnmodifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifyActionPerformed
        Connection con = null;
        try{
            con=getConection();
            int num=Integer.parseInt(txtcode.getText());
            ps=con.prepareStatement("UPDATE management SET cod=?, name=?, lastname=?, age=?, request=?, complaint=?, claim=?, suggestion=? WHERE cod="+num+"");
            ps.setString(1,txtcode.getText());
            ps.setString(2,txtname.getText());
            ps.setString(3,txtlastname.getText());
            ps.setString(4,txtage.getText());
            ps.setString(5,txtrequest.getText());
            ps.setString(6,txtcomplaints.getText());
            ps.setString(7,txtclaims.getText());
            ps.setString(8,txtsuggestions.getText());
            
            int res = ps.executeUpdate();
            if (res>0) {
                JOptionPane.showMessageDialog(null, "Modified");
                cleanBoxes();
            }else{
                JOptionPane.showMessageDialog(null, "Error when modifying, please do not change the code.");
                cleanBoxes();
            }
            con.close();
            
        }catch(SQLException e){
            System.err.print(e);
        }
    }//GEN-LAST:event_btnmodifyActionPerformed

    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(FramePQRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePQRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePQRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePQRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePQRS().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmodify;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JScrollPane scrollclaims;
    private javax.swing.JScrollPane scrollcomplaints;
    private javax.swing.JScrollPane scrollrequest;
    private javax.swing.JScrollPane scrollsuggestions;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextArea txtclaims;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextArea txtcomplaints;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextArea txtrequest;
    private javax.swing.JTextArea txtsuggestions;
    // End of variables declaration//GEN-END:variables
}
