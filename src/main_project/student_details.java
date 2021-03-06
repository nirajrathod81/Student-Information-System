/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * student_details.java
 *
 * Created on Sep 21, 2014, 4:52:44 PM
 */
package main_project;

import com.mongodb.MongoException;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NIRAJ
 */
public class student_details extends javax.swing.JFrame {
//private DefaultTableModel Model;
    /** Creates new form student_details */
    public student_details() {
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

        Stud_Details = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Add_Marks = new javax.swing.JButton();
        Fee_Details = new javax.swing.JButton();
        Attendance = new javax.swing.JButton();
        Display_rec = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Show = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1300, 600));

        Stud_Details.setBackground(new java.awt.Color(255, 255, 255));
        Stud_Details.setFont(new java.awt.Font("Tempus Sans ITC", 0, 30));
        Stud_Details.setForeground(new java.awt.Color(153, 153, 255));
        Stud_Details.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\notebook-128.png")); // NOI18N
        Stud_Details.setText("  Student Details");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));

        Add_Marks.setBackground(new java.awt.Color(255, 255, 255));
        Add_Marks.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        Add_Marks.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\file_add.png")); // NOI18N
        Add_Marks.setText("  Add Marks");
        Add_Marks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_MarksActionPerformed(evt);
            }
        });

        Fee_Details.setBackground(new java.awt.Color(255, 255, 255));
        Fee_Details.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        Fee_Details.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\images (10).jpg")); // NOI18N
        Fee_Details.setText("  Fee Details");
        Fee_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fee_DetailsActionPerformed(evt);
            }
        });

        Attendance.setBackground(new java.awt.Color(255, 255, 255));
        Attendance.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        Attendance.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\att.jpg")); // NOI18N
        Attendance.setText(" Attendance");
        Attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendanceActionPerformed(evt);
            }
        });

        Display_rec.setBackground(new java.awt.Color(255, 255, 255));
        Display_rec.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        Display_rec.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\show1.jpg")); // NOI18N
        Display_rec.setText("Display All Records");
        Display_rec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Display_recMouseClicked(evt);
            }
        });
        Display_rec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_recActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(255, 255, 255));
        Clear.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\images (2).jpg")); // NOI18N
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_Marks, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fee_Details, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Display_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Add_Marks, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Fee_Details, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Display_rec)
                .addGap(18, 18, 18)
                .addComponent(Clear)
                .addContainerGap())
        );

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        Menu.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\home.jpg")); // NOI18N
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        Show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg No", "First name", "Last name", "Roll No", "Dept", "Class", "Address", "Mobile", "DOB", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Show.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Show);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(Stud_Details, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Stud_Details)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
// TODO add your handling code here:
    this.setVisible(false);
    new menu().setVisible(true);
}//GEN-LAST:event_MenuActionPerformed

private void Fee_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fee_DetailsActionPerformed
// TODO add your handling code here:
    this.setVisible(false);
    new fee_details().setVisible(true);
}//GEN-LAST:event_Fee_DetailsActionPerformed

private void AttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendanceActionPerformed
// TODO add your handling code here:
    this.setVisible(false);
    new attendance().setVisible(true);
}//GEN-LAST:event_AttendanceActionPerformed

private void Add_MarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_MarksActionPerformed
// TODO add your handling code here:
    this.setVisible(false);
    new add_marks().setVisible(true);
}//GEN-LAST:event_Add_MarksActionPerformed

private void Display_recActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_recActionPerformed
    DefaultTableModel u = (DefaultTableModel) Show.getModel();
             int n = u.getRowCount();
         for(int i = 0;i<n;i++){
             u.removeRow(0);
 }
        try {
           
            Mongo mongo = new Mongo("127.0.0.1",27017);
            DB db=mongo.getDB("Project_Demo");
            DBCollection collection=db.getCollection("Registration");
            System.out.println("Connected to DB");
            //BasicDBObject save=new BasicDBObject();
            
            DBCursor cursor = collection.find();
            while(cursor.hasNext()) {
                 u.addRow(new Object[]{
                         cursor.next().get("Reg_No"),
                         cursor.curr().get("Fname"),
                         cursor.curr().get("Lname"),
                         cursor.curr().get("Roll_No"),
                         cursor.curr().get("Dept"),
                         cursor.curr().get("Class"),
                         cursor.curr().get("Address"),
                         cursor.curr().get("Mobile"),
                         cursor.curr().get("DOB"),
                         cursor.curr().get("Email")});
            }
      }
        catch (UnknownHostException ex) {
            Logger.getLogger(student_details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MongoException ex) {
            Logger.getLogger(student_details.class.getName()).log(Level.SEVERE, null, ex);
        
}//GEN-LAST:event_Display_recActionPerformed
}
private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
 DefaultTableModel u = (DefaultTableModel) Show.getModel();
int no = u.getRowCount();
int n=0;
for(n=0; n<no; n++)
    {
     u.removeRow(0);   
    }
}//GEN-LAST:event_ClearActionPerformed

private void Display_recMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Display_recMouseClicked

}//GEN-LAST:event_Display_recMouseClicked

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
            java.util.logging.Logger.getLogger(student_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new student_details().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Marks;
    private javax.swing.JButton Attendance;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Display_rec;
    private javax.swing.JButton Fee_Details;
    private javax.swing.JButton Menu;
    private javax.swing.JTable Show;
    private javax.swing.JLabel Stud_Details;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
