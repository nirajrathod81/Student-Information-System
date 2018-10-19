/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * update.java
 *
 * Created on Sep 21, 2014, 5:22:36 PM
 */
package main_project;

import com.mongodb.MongoException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NIRAJ
 */
public class update extends javax.swing.JFrame  {
    
    
    /** Creates new form update */
    public update() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Update_rec = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();
        Reg_No = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Search_Table = new javax.swing.JTable();
        Reg_No_Text_1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 550));
        getContentPane().setLayout(null);

        Update_rec.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36));
        Update_rec.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\Photobooth-icon.png")); // NOI18N
        Update_rec.setText("Update Record");
        getContentPane().add(Update_rec);
        Update_rec.setBounds(330, 10, 340, 70);

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        Menu.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\images (11).jpg")); // NOI18N
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu);
        Menu.setBounds(963, 11, 70, 70);

        Reg_No.setFont(new java.awt.Font("Tahoma", 0, 16));
        Reg_No.setText("Registration No:");
        getContentPane().add(Reg_No);
        Reg_No.setBounds(320, 140, 115, 20);

        Update.setBackground(new java.awt.Color(255, 255, 255));
        Update.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\download.jpg")); // NOI18N
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update);
        Update.setBounds(620, 130, 50, 50);

        Search_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg No.", "First Name", "Last Name", "Roll No", "Dept", "Class", "Address", "Mobile", "DOB", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Search_Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Search_Table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 250, 1039, 55);

        Reg_No_Text_1.setFont(new java.awt.Font("Tahoma", 0, 15));
        Reg_No_Text_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg_No_Text_1ActionPerformed(evt);
            }
        });
        getContentPane().add(Reg_No_Text_1);
        Reg_No_Text_1.setBounds(450, 140, 143, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\textures_1920x1080_wallpaper_Wallpaper_1920x1080_www.wallpaperswa.com.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
// TODO add your handling code here:
    this.setVisible(false);
    new menu().setVisible(true);
}//GEN-LAST:event_MenuActionPerformed

private void Reg_No_Text_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg_No_Text_1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Reg_No_Text_1ActionPerformed

private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
String Reg_No_1;
Reg_No_1 = Reg_No_Text_1.getText();
    DefaultTableModel u = (DefaultTableModel) Search_Table.getModel();
int no = u.getRowCount();
int n=0;
for(n=0; n<no; n++)
    {
     u.removeRow(0);   
    }
    
    if (Reg_No_1.equals("") || !Pattern.matches("[0-9]+", Reg_No_1) ){
    JOptionPane.showMessageDialog(null, "Please Enter Valid Registration Number");
}
    else {
    try {
            Mongo mongo=new Mongo("127.0.0.1",27017);
            DB db= mongo.getDB("Project_Demo");
            DBCollection collection=db.getCollection("Registration");
            System.out.println("Connected to DB");
            //BasicDBObject save=new BasicDBObject();
            BasicDBObject query = new BasicDBObject();
            query.put("Reg_No",Reg_No_1);
            DBCursor cursor = collection.find(query);
            
            try{
                if(cursor.hasNext()){
                        u.addRow(new Object[]{cursor.next().get("Reg_No"),cursor.curr().get("Fname"),cursor.curr().get("Lname")
                                ,cursor.curr().get("Roll_No"),cursor.curr().get("Dept"),cursor.curr().get("Class")
                                ,cursor.curr().get("Address"),cursor.curr().get("Mobile"),cursor.curr().get("DOB")
                                ,cursor.curr().get("Email")});
                           
                             JOptionPane.showMessageDialog(null, "Record Found");
                            // Update_Form  r = new Update_Form();
                             DBObject save = cursor.curr();
                                 String fname =(String) save.get("Fname");
                                 String lname =(String) save.get("Lname");
                                 String roll =(String) save.get("Roll_No");
                                 String dept =(String) save.get("Dept");
                                 String clas =(String) save.get("Class");
                                 String adds =(String) save.get("Address");
                                 String mobile =(String) save.get("Mobile");
                                 String dob =(String) save.get("DOB");
                                 String email =(String) save.get("Email");
                                 this.dispose();
                                 new Update_Form(Reg_No_1,fname,lname,roll,dept,clas,adds,mobile,email,dob).setVisible(true);
                }
                        else {
                            JOptionPane.showMessageDialog(null, "Record Not Found");
                        }
                         }
            finally{
                cursor.close();
            }
                    
    }
    catch (UnknownHostException ex) {
            Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MongoException ex) {
            Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }         
}//GEN-LAST:event_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new update().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JLabel Reg_No;
    public javax.swing.JTextField Reg_No_Text_1;
    private javax.swing.JTable Search_Table;
    public javax.swing.JButton Update;
    private javax.swing.JLabel Update_rec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}