/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Crime_management;



import java.sql.Statement;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Admin
 */
public class ViewCulprit extends javax.swing.JFrame {
    Connection c;
    PreparedStatement p;
    ResultSet rs = null;
    /**
     * Creates new form ViewCulprit
     */
    public ViewCulprit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        show = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Culprit_no", "Pan_no", "Firstname", "Middlename", "Lastname", "Age", "Phone_no", "Date_Of_Birth", "Image", "Gender", "Grade", "Type_Of_Crime"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        show.setText("SHOW RECORDS");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        back.setText("BACK TO HOMEPAGE");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(show)
                .addGap(123, 123, 123)
                .addComponent(back)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(show)
                    .addComponent(back)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/crime_management","root","root");
            Statement p=c.createStatement();
            String s="Select * from culprit";
            p=c.prepareStatement(s);
            ResultSet rs=p.executeQuery(s);
  // p=c.prepareStatement(s);
            
            /*while(rs.next())
            {
              String Culprit_no=rs.getString("Culprit_no");
              String Pan_no=rs.getString("Pan_no");
              String Firstname=rs.getString("F_Name");
              String Middlename=rs.getString("M_Name");
              String Lastname=rs.getString("L_Name");
              String Age=String.valueOf(rs.getInt("Age"));
              String Phone_no=String.valueOf(rs.getInt("Phone_no"));
              String Date_Of_Birth=rs.getString("Date_Of_Birth");
              //p.setBinaryStream(8, img, (int)f.length());
              blob
              String Gender=rs.getString("Gender");
              String Grade=rs.getString("Grade");
              String Type_Of_Crime=rs.getString("Type_OF_Crime");
            
              
              String Data[]={Culprit_no,Pan_no,Firstname,Middlename,Lastname,Age,Phone_no,Date_Of_Birth,Gender,Grade,Type_Of_Crime};
              DefaultTableModel tbl=(DefaultTableModel)jTable1.getModel();
              tbl.addRow(Data);
            }*/
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewCulprit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ViewCulprit.class.getName()).log(Level.SEVERE, null, ex);
        }
            

    }//GEN-LAST:event_showActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Interface i=new Interface();
        ViewCulprit vc=new  ViewCulprit();
        vc.setVisible(false);
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCulprit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCulprit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCulprit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCulprit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCulprit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}
