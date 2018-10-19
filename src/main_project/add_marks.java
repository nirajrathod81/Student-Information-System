/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * add_marks.java
 *
 * Created on Sep 21, 2014, 5:35:56 PM
 */
package main_project;

import javax.swing.JOptionPane;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import java.awt.event.KeyEvent;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
public class add_marks extends javax.swing.JFrame {

    public add_marks() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Marks_Details = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Reg_No = new javax.swing.JLabel();
        Twelve = new javax.swing.JLabel();
        Reg_No_Text = new javax.swing.JTextField();
        Twelve_Text = new javax.swing.JTextField();
        Tenth = new javax.swing.JLabel();
        Tenth_Text = new javax.swing.JTextField();
        FE = new javax.swing.JLabel();
        FE_Text = new javax.swing.JTextField();
        SE = new javax.swing.JLabel();
        SE_Text = new javax.swing.JTextField();
        TE = new javax.swing.JLabel();
        TE_Text = new javax.swing.JTextField();
        BE = new javax.swing.JLabel();
        BE_Text = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        find = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Show_all = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Show = new javax.swing.JTable();
        Clear_Table = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Marks_Details.setFont(new java.awt.Font("Tempus Sans ITC", 0, 30));
        Marks_Details.setForeground(new java.awt.Color(102, 102, 255));
        Marks_Details.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\file_add.png")); // NOI18N
        Marks_Details.setText("  Marks Details");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Marks"));

        Reg_No.setFont(new java.awt.Font("Tahoma", 0, 14));
        Reg_No.setText("Registration No:");

        Twelve.setFont(new java.awt.Font("Tahoma", 0, 14));
        Twelve.setText("12th (%)");

        Reg_No_Text.setFont(new java.awt.Font("Tahoma", 0, 14));
        Reg_No_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg_No_TextActionPerformed(evt);
            }
        });
        Reg_No_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Reg_No_TextKeyPressed(evt);
            }
        });

        Twelve_Text.setFont(new java.awt.Font("Tahoma", 0, 14));

        Tenth.setFont(new java.awt.Font("Tahoma", 0, 14));
        Tenth.setText("10th (%)");

        Tenth_Text.setFont(new java.awt.Font("Tahoma", 0, 14));

        FE.setFont(new java.awt.Font("Tahoma", 0, 14));
        FE.setText("FE (%)");

        FE_Text.setFont(new java.awt.Font("Tahoma", 0, 14));
        FE_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FE_TextKeyPressed(evt);
            }
        });

        SE.setFont(new java.awt.Font("Tahoma", 0, 14));
        SE.setText("SE (%)");

        SE_Text.setFont(new java.awt.Font("Tahoma", 0, 14));
        SE_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SE_TextKeyPressed(evt);
            }
        });

        TE.setFont(new java.awt.Font("Tahoma", 0, 14));
        TE.setText("TE (%)");

        TE_Text.setFont(new java.awt.Font("Tahoma", 0, 14));
        TE_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TE_TextKeyPressed(evt);
            }
        });

        BE.setFont(new java.awt.Font("Tahoma", 0, 14));
        BE.setText("BE (%)");

        BE_Text.setFont(new java.awt.Font("Tahoma", 0, 14));
        BE_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BE_TextActionPerformed(evt);
            }
        });
        BE_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BE_TextKeyPressed(evt);
            }
        });

        Add.setBackground(new java.awt.Color(255, 255, 255));
        Add.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        Add.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\download (2).jpg")); // NOI18N
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(255, 255, 255));
        Clear.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        Clear.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\390 - Copy.jpg")); // NOI18N
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        find.setBackground(new java.awt.Color(255, 255, 255));
        find.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\search.jpg")); // NOI18N
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Reg_No)
                        .addGap(56, 56, 56)
                        .addComponent(Reg_No_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(find, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FE)
                            .addComponent(TE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tenth)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FE_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(Tenth_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(TE_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Twelve)
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SE_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Twelve_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BE_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(SE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Reg_No)
                            .addComponent(Reg_No_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(find))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tenth)
                    .addComponent(Tenth_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Twelve_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Twelve, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FE)
                    .addComponent(FE_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SE)
                    .addComponent(SE_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TE)
                    .addComponent(TE_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BE)
                    .addComponent(BE_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        Menu.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        Menu.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\home - Copy.jpg")); // NOI18N
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        Show_all.setBackground(new java.awt.Color(0, 102, 102));
        Show_all.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        Show_all.setForeground(new java.awt.Color(255, 255, 255));
        Show_all.setText("Show All");
        Show_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_allActionPerformed(evt);
            }
        });

        Show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg No.", "10 th", "12 th", "FE", "SE", "TE", "BE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Show.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Show);

        Clear_Table.setBackground(new java.awt.Color(255, 255, 255));
        Clear_Table.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        Clear_Table.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\images (2).jpg")); // NOI18N
        Clear_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_TableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Clear_Table)
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Clear_Table)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        Back.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\back.png")); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(255, 255, 255));
        Delete.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14));
        Delete.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\del.jpg")); // NOI18N
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(Marks_Details))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(Show_all, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Marks_Details)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Show_all, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Menu)
                .addContainerGap(468, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
// TODO add your handling code here:
    this.setVisible(false);
    new menu().setVisible(true);
}//GEN-LAST:event_MenuActionPerformed

private void Show_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_allActionPerformed

    DefaultTableModel u = (DefaultTableModel) Show.getModel();
                     int n = u.getRowCount();
                 for(int i = 0;i<n;i++){
                     u.removeRow(0);
 }
    try {
           
            Mongo mongo = new Mongo("127.0.0.1",27017);
            DB db=mongo.getDB("Project_Demo");
            DBCollection collection=db.getCollection("Marks");
            System.out.println("Connected to DB");
            BasicDBObject save=new BasicDBObject();
            
            DBCursor cursor = collection.find();
            while(cursor.hasNext()) {
               
                 u.addRow(new Object[]{cursor.next().get("Reg_No"),cursor.curr().get("Ten'th"),cursor.curr().get("Twelve"),cursor.curr().get("FE"),cursor.curr().get("SE"),cursor.curr().get("TE"),cursor.curr().get("BE")});
     
            }
}
        catch (UnknownHostException ex) {
            Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MongoException ex) {
            Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_Show_allActionPerformed

private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
// TODO add your handling code here:
    Reg_No_Text.setText("");
    Twelve_Text.setText("");
    Tenth_Text.setText("");
    FE_Text.setText("");
    SE_Text.setText("");
    TE_Text.setText("");
    BE_Text.setText("");
    
}//GEN-LAST:event_ClearActionPerformed

private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String Reg_No_1,se,fe,te,be,ten,twelve;
        twelve = Twelve_Text.getText();
        ten = Tenth_Text.getText();
        se = SE_Text.getText();
        fe = FE_Text.getText();
        te = TE_Text.getText();
        be = BE_Text.getText();
        Reg_No_1 = Reg_No_Text.getText();
        if (Reg_No_1.equals("") || !Pattern.matches("[0-9]+", Reg_No_1) ){
        JOptionPane.showMessageDialog(null, "Please Enter Valid Registration Number");
    }
       else if (ten.equals("") ){
        JOptionPane.showMessageDialog(null, "Please Enter 10th Marks ");
    }
      else  if (twelve.equals("") ){
        JOptionPane.showMessageDialog(null, "Please Enter 12th Marks ");
    }
          else {
             try {
                // TODO code application logic here
                Mongo mongo =new Mongo("127.0.0.1",27017); 
                DB db=mongo.getDB("Project_Demo");
                DBCollection collection=db.getCollection("Marks");
                System.out.println("Connected to DB");
                BasicDBObject save=new BasicDBObject();
                BasicDBObject query = new BasicDBObject();
                        query.put("Reg_No",Reg_No_1);
                        DBCursor cursor = collection.find(query);


                            if(cursor.hasNext()){
                                JOptionPane.showMessageDialog(null, "sorry...data on this Reg. no. is already present");
                                Reg_No_Text.setText("");
                               this.setVisible(false);
                               new add_marks().setVisible(true);
                            }
                            else{
                                    save.append("Reg_No",Reg_No_1);
                                    save.append("Ten'th",ten);
                                    save.append("Twelve",twelve);
                                    save.append("FE",fe);
                                    save.append("SE",se);
                                    save.append("TE",te);
                                    save.append("BE",be);
                                    collection.insert(save);
                                    JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
                                }
            } catch (UnknownHostException ex) {
                Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
            }

           this.setVisible(false);
           new add_marks().setVisible(true);
        }
}//GEN-LAST:event_AddActionPerformed

private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed

    this.setVisible(false);
    new student_details().setVisible(true);
}//GEN-LAST:event_BackActionPerformed

private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
this.setVisible(false);
new delete_rec().setVisible(true);
    
}//GEN-LAST:event_DeleteActionPerformed

private void Clear_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_TableActionPerformed
// TODO add your handling code here:
     DefaultTableModel u = (DefaultTableModel) Show.getModel();
int no = u.getRowCount();
int n=0;
for(n=0; n<no; n++)
    {
     u.removeRow(0);   
    }
}//GEN-LAST:event_Clear_TableActionPerformed

private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
    String Reg_No_1;
    Reg_No_1 = Reg_No_Text.getText();
    if (Reg_No_1.equals("") || !Pattern.matches("[0-9]+", Reg_No_1) ){
            JOptionPane.showMessageDialog(null, "Please Enter Valid Registration Number");
         }
    else {
            try{
                Mongo  mongo = new Mongo("127.0.0.1",27017);
                DB db= mongo.getDB("Project_Demo");
                DBCollection collection=db.getCollection("Registration");
                System.out.println("Connected to DB");
                BasicDBObject query = new BasicDBObject();
                query.put("Reg_No",Reg_No_1);
                DBCursor cursor = collection.find(query);
                if(cursor.hasNext()){
                    JOptionPane.showMessageDialog(null, "Record Found");
                    Reg_No_Text.setEnabled(false);
                    Twelve_Text.setEnabled(true);
                    Tenth_Text.setEnabled(true);
                    FE_Text.setEnabled(true);
                    SE_Text.setEnabled(true);
                    TE_Text.setEnabled(true);
                    BE_Text.setEnabled(true);  
                }
            else{
                    JOptionPane.showMessageDialog(null, "Record Not Found");
                       Twelve_Text.setEnabled(false);
                       Tenth_Text.setEnabled(false);
                       FE_Text.setEnabled(false);
                       SE_Text.setEnabled(false);
                       TE_Text.setEnabled(false);
                       BE_Text.setEnabled(false);
                }
                }
                catch (UnknownHostException ex) {
                    Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
                } 
                catch (MongoException ex) {
                    Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
                }
         }
}//GEN-LAST:event_findActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

            Twelve_Text.setEnabled(false);
            Tenth_Text.setEnabled(false);
            FE_Text.setEnabled(false);
            SE_Text.setEnabled(false);
            TE_Text.setEnabled(false);
            BE_Text.setEnabled(false);

}//GEN-LAST:event_formWindowOpened

private void BE_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BE_TextActionPerformed
// TODO add your handling code here:
    
}//GEN-LAST:event_BE_TextActionPerformed

private void BE_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BE_TextKeyPressed
// TODO add your handling code here:
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    String Reg_No_1,se,fe,te,be,ten,twelve;
        twelve = Twelve_Text.getText();
        ten = Tenth_Text.getText();
        se = SE_Text.getText();
        fe = FE_Text.getText();
        te = TE_Text.getText();
        be = BE_Text.getText();
        Reg_No_1 = Reg_No_Text.getText();
            if (Reg_No_1.equals("") || !Pattern.matches("[0-9]+", Reg_No_1) ){
            JOptionPane.showMessageDialog(null, "Please Enter Valid Registration Number");
        }
           else if (ten.equals("") ){
            JOptionPane.showMessageDialog(null, "Please Enter 10th Marks ");
        }
          else  if (twelve.equals("") ){
            JOptionPane.showMessageDialog(null, "Please Enter 12th Marks ");
        }
              else {
                 try {
                    // TODO code application logic here
                    Mongo mongo =new Mongo("127.0.0.1",27017); 
                    DB db=mongo.getDB("Project_Demo");
                    DBCollection collection=db.getCollection("Marks");
                    System.out.println("Connected to DB");
                    BasicDBObject save=new BasicDBObject();
                    BasicDBObject query = new BasicDBObject();
                            query.put("Reg_No",Reg_No_1);
                            DBCursor cursor = collection.find(query);


                                if(cursor.hasNext()){
                                    JOptionPane.showMessageDialog(null, "sorry...data on this Reg. no. is already present");
                                    Reg_No_Text.setText("");
                                   this.setVisible(false);
                                   new add_marks().setVisible(true);
                                }
                                else{
                                        save.append("Reg_No",Reg_No_1);
                                        save.append("Ten'th",ten);
                                        save.append("Twelve",twelve);
                                        save.append("FE",fe);
                                        save.append("SE",se);
                                        save.append("TE",te);
                                        save.append("BE",be);
                                        collection.insert(save);
                                        JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
                                    }
                } catch (UnknownHostException ex) {
                    Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
                }

               this.setVisible(false);
               new add_marks().setVisible(true);
            }
            }
}//GEN-LAST:event_BE_TextKeyPressed

private void FE_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FE_TextKeyPressed
// TODO add your handling code here:
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    String Reg_No_1,se,fe,te,be,ten,twelve;
        twelve = Twelve_Text.getText();
        ten = Tenth_Text.getText();
        se = SE_Text.getText();
        fe = FE_Text.getText();
        te = TE_Text.getText();
        be = BE_Text.getText();
        Reg_No_1 = Reg_No_Text.getText();
        if (Reg_No_1.equals("") || !Pattern.matches("[0-9]+", Reg_No_1) ){
        JOptionPane.showMessageDialog(null, "Please Enter Valid Registration Number");
    }
       else if (ten.equals("") ){
        JOptionPane.showMessageDialog(null, "Please Enter 10th Marks ");
    }
      else  if (twelve.equals("") ){
        JOptionPane.showMessageDialog(null, "Please Enter 12th Marks ");
    }
          else {
             try {
                // TODO code application logic here
                Mongo mongo =new Mongo("127.0.0.1",27017); 
                DB db=mongo.getDB("Project_Demo");
                DBCollection collection=db.getCollection("Marks");
                System.out.println("Connected to DB");
                BasicDBObject save=new BasicDBObject();
                BasicDBObject query = new BasicDBObject();
                        query.put("Reg_No",Reg_No_1);
                        DBCursor cursor = collection.find(query);


                            if(cursor.hasNext()){
                                JOptionPane.showMessageDialog(null, "sorry...data on this Reg. no. is already present");
                                Reg_No_Text.setText("");
                               this.setVisible(false);
                               new add_marks().setVisible(true);
                            }
                            else{
                                    save.append("Reg_No",Reg_No_1);
                                    save.append("Ten'th",ten);
                                    save.append("Twelve",twelve);
                                    save.append("FE",fe);
                                    save.append("SE",se);
                                    save.append("TE",te);
                                    save.append("BE",be);
                                    collection.insert(save);
                                    JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
                                }
            } catch (UnknownHostException ex) {
                Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
            }

           this.setVisible(false);
           new add_marks().setVisible(true);
        }
    }
}//GEN-LAST:event_FE_TextKeyPressed

private void SE_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SE_TextKeyPressed
// TODO add your handling code here:
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    String Reg_No_1,se,fe,te,be,ten,twelve;
        twelve = Twelve_Text.getText();
        ten = Tenth_Text.getText();
        se = SE_Text.getText();
        fe = FE_Text.getText();
        te = TE_Text.getText();
        be = BE_Text.getText();
        Reg_No_1 = Reg_No_Text.getText();
        if (Reg_No_1.equals("") || !Pattern.matches("[0-9]+", Reg_No_1) ){
        JOptionPane.showMessageDialog(null, "Please Enter Valid Registration Number");
    }
       else if (ten.equals("") ){
        JOptionPane.showMessageDialog(null, "Please Enter 10th Marks ");
    }
      else  if (twelve.equals("") ){
        JOptionPane.showMessageDialog(null, "Please Enter 12th Marks ");
    }
          else {
             try {
                // TODO code application logic here
                Mongo mongo =new Mongo("127.0.0.1",27017); 
                DB db=mongo.getDB("Project_Demo");
                DBCollection collection=db.getCollection("Marks");
                System.out.println("Connected to DB");
                BasicDBObject save=new BasicDBObject();
                BasicDBObject query = new BasicDBObject();
                        query.put("Reg_No",Reg_No_1);
                        DBCursor cursor = collection.find(query);


                            if(cursor.hasNext()){
                                JOptionPane.showMessageDialog(null, "sorry...data on this Reg. no. is already present");
                                Reg_No_Text.setText("");
                               this.setVisible(false);
                               new add_marks().setVisible(true);
                            }
                            else{
                                    save.append("Reg_No",Reg_No_1);
                                    save.append("Ten'th",ten);
                                    save.append("Twelve",twelve);
                                    save.append("FE",fe);
                                    save.append("SE",se);
                                    save.append("TE",te);
                                    save.append("BE",be);
                                    collection.insert(save);
                                    JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
                                }
            } catch (UnknownHostException ex) {
                Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
            }

           this.setVisible(false);
           new add_marks().setVisible(true);
        }
    }
}//GEN-LAST:event_SE_TextKeyPressed

private void TE_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TE_TextKeyPressed
// TODO add your handling code here:
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    String Reg_No_1,se,fe,te,be,ten,twelve;
        twelve = Twelve_Text.getText();
        ten = Tenth_Text.getText();
        se = SE_Text.getText();
        fe = FE_Text.getText();
        te = TE_Text.getText();
        be = BE_Text.getText();
        Reg_No_1 = Reg_No_Text.getText();
        if (Reg_No_1.equals("") || !Pattern.matches("[0-9]+", Reg_No_1) ){
        JOptionPane.showMessageDialog(null, "Please Enter Valid Registration Number");
    }
       else if (ten.equals("") ){
        JOptionPane.showMessageDialog(null, "Please Enter 10th Marks ");
    }
      else  if (twelve.equals("") ){
        JOptionPane.showMessageDialog(null, "Please Enter 12th Marks ");
    }
          else {
             try {
                // TODO code application logic here
                Mongo mongo =new Mongo("127.0.0.1",27017); 
                DB db=mongo.getDB("Project_Demo");
                DBCollection collection=db.getCollection("Marks");
                System.out.println("Connected to DB");
                BasicDBObject save=new BasicDBObject();
                BasicDBObject query = new BasicDBObject();
                        query.put("Reg_No",Reg_No_1);
                        DBCursor cursor = collection.find(query);


                            if(cursor.hasNext()){
                                JOptionPane.showMessageDialog(null, "sorry...data on this Reg. no. is already present");
                                Reg_No_Text.setText("");
                               this.setVisible(false);
                               new add_marks().setVisible(true);
                            }
                            else{
                                    save.append("Reg_No",Reg_No_1);
                                    save.append("Ten'th",ten);
                                    save.append("Twelve",twelve);
                                    save.append("FE",fe);
                                    save.append("SE",se);
                                    save.append("TE",te);
                                    save.append("BE",be);
                                    collection.insert(save);
                                    JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
                                }
            } catch (UnknownHostException ex) {
                Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
            }

           this.setVisible(false);
           new add_marks().setVisible(true);
        }
    }
}//GEN-LAST:event_TE_TextKeyPressed

private void Reg_No_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg_No_TextActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Reg_No_TextActionPerformed

private void Reg_No_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Reg_No_TextKeyPressed
// TODO add your handling code here:
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    String Reg_No_1;
    Reg_No_1 = Reg_No_Text.getText();
    if (Reg_No_1.equals("") || !Pattern.matches("[0-9]+", Reg_No_1) ){
            JOptionPane.showMessageDialog(null, "Please Enter Valid Registration Number");
         }
    else {
            try{
                Mongo  mongo = new Mongo("127.0.0.1",27017);
                DB db= mongo.getDB("Project_Demo");
                DBCollection collection=db.getCollection("Registration");
                System.out.println("Connected to DB");
                BasicDBObject query = new BasicDBObject();
                query.put("Reg_No",Reg_No_1);
                DBCursor cursor = collection.find(query);
                if(cursor.hasNext()){
                    JOptionPane.showMessageDialog(null, "Record Found");
                    Reg_No_Text.setEnabled(false);
                    Twelve_Text.setEnabled(true);
                    Tenth_Text.setEnabled(true);
                    FE_Text.setEnabled(true);
                    SE_Text.setEnabled(true);
                    TE_Text.setEnabled(true);
                    BE_Text.setEnabled(true);  
                }
            else{
                    JOptionPane.showMessageDialog(null, "Record Not Found");
                    Twelve_Text.setEnabled(false);
                    Tenth_Text.setEnabled(false);
                    FE_Text.setEnabled(false);
                    SE_Text.setEnabled(false);
                    TE_Text.setEnabled(false);
                    BE_Text.setEnabled(false);
                }
                }
                catch (UnknownHostException ex) {
                    Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
                } 
                catch (MongoException ex) {
                    Logger.getLogger(add_marks.class.getName()).log(Level.SEVERE, null, ex);
                }
         }
    }
}//GEN-LAST:event_Reg_No_TextKeyPressed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(add_marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new add_marks().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel BE;
    private javax.swing.JTextField BE_Text;
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Clear_Table;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel FE;
    private javax.swing.JTextField FE_Text;
    private javax.swing.JLabel Marks_Details;
    private javax.swing.JButton Menu;
    private javax.swing.JLabel Reg_No;
    public javax.swing.JTextField Reg_No_Text;
    private javax.swing.JLabel SE;
    private javax.swing.JTextField SE_Text;
    private javax.swing.JTable Show;
    private javax.swing.JButton Show_all;
    private javax.swing.JLabel TE;
    private javax.swing.JTextField TE_Text;
    private javax.swing.JLabel Tenth;
    private javax.swing.JTextField Tenth_Text;
    private javax.swing.JLabel Twelve;
    private javax.swing.JTextField Twelve_Text;
    public javax.swing.JButton find;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
