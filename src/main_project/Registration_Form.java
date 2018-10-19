/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Registration_Form.java
 *
 * Created on Sep 21, 2014, 3:39:49 PM
 */
package main_project;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.awt.event.KeyEvent;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NIRAJ
 */
public class Registration_Form extends javax.swing.JFrame {

int  str;
    String Reg_No_1,Fname,Lname,Roll_No_1,Email,Mobile_1,Adds,Dob_Date,Dob_Month,Dob_Year,Dept_1,Class_;
    String Email_Check = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

    /** Creates new form Registration_Form */
    public Registration_Form() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    public Registration_Form(int s) {
        initComponents();
        str=s;
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

        stud_profile = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Reg_No = new javax.swing.JLabel();
        Reg_No_Text = new javax.swing.JTextField();
        Fname_Text = new javax.swing.JTextField();
        Roll_No = new javax.swing.JLabel();
        Dept = new javax.swing.JLabel();
        Dept_List = new javax.swing.JComboBox();
        Class = new javax.swing.JLabel();
        Class_List = new javax.swing.JComboBox();
        Address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address_Text = new javax.swing.JTextArea();
        Mobile = new javax.swing.JLabel();
        Mobile_Text = new javax.swing.JTextField();
        Birth_Date = new javax.swing.JLabel();
        Date = new javax.swing.JComboBox();
        Month = new javax.swing.JComboBox();
        Year = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        E_Mail = new javax.swing.JLabel();
        E_Mail_Text = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Lname_Text = new javax.swing.JTextField();
        Roll_No_Text = new javax.swing.JTextField();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        stud_profile.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36));
        stud_profile.setForeground(new java.awt.Color(102, 102, 255));
        stud_profile.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\Student-id-icon.png")); // NOI18N
        stud_profile.setText("  Student Profile");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Name.setFont(new java.awt.Font("Tahoma", 0, 16));
        Name.setText("Name:");

        Reg_No.setFont(new java.awt.Font("Tahoma", 0, 16));
        Reg_No.setText("Registration No:");

        Reg_No_Text.setFont(new java.awt.Font("Tahoma", 0, 15));
        Reg_No_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg_No_TextActionPerformed(evt);
            }
        });
        Reg_No_Text.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Reg_No_TextInputMethodTextChanged(evt);
            }
        });
        Reg_No_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Reg_No_TextKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Reg_No_TextKeyReleased(evt);
            }
        });

        Fname_Text.setFont(new java.awt.Font("Tahoma", 0, 15));
        Fname_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fname_TextActionPerformed(evt);
            }
        });
        Fname_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Fname_TextKeyPressed(evt);
            }
        });

        Roll_No.setFont(new java.awt.Font("Tahoma", 0, 16));
        Roll_No.setText("Roll No:");

        Dept.setFont(new java.awt.Font("Tahoma", 0, 16));
        Dept.setText("Department:");

        Dept_List.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IT", "Computer", "E & TC", "Mechanical", "Civil" }));
        Dept_List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dept_ListActionPerformed(evt);
            }
        });

        Class.setFont(new java.awt.Font("Tahoma", 0, 16));
        Class.setText("Class:");

        Class_List.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FE", "SE", "TE", "BE" }));

        Address.setFont(new java.awt.Font("Tahoma", 0, 16));
        Address.setText("Address:");

        Address_Text.setColumns(20);
        Address_Text.setRows(5);
        jScrollPane1.setViewportView(Address_Text);

        Mobile.setFont(new java.awt.Font("Tahoma", 0, 16));
        Mobile.setText("Mobile:");

        Mobile_Text.setFont(new java.awt.Font("Tahoma", 0, 15));

        Birth_Date.setFont(new java.awt.Font("Tahoma", 0, 16));
        Birth_Date.setText("Birth Date:");

        Date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        Month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });

        Year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });

        jLabel10.setText("  ( Date )");

        jLabel11.setText(" ( Month )");

        jLabel12.setText("(Year)");

        E_Mail.setFont(new java.awt.Font("Tahoma", 0, 16));
        E_Mail.setText("E-mail:");

        E_Mail_Text.setFont(new java.awt.Font("Tahoma", 0, 15));
        E_Mail_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_Mail_TextActionPerformed(evt);
            }
        });
        E_Mail_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                E_Mail_TextKeyPressed(evt);
            }
        });

        Submit.setBackground(new java.awt.Color(255, 255, 255));
        Submit.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\clear-for-ios-7-icon-580-100054611-large.png")); // NOI18N
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(255, 255, 255));
        Clear.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18));
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\clea.jpg")); // NOI18N
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Lname_Text.setFont(new java.awt.Font("Tahoma", 0, 15));
        Lname_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lname_TextActionPerformed(evt);
            }
        });

        Roll_No_Text.setFont(new java.awt.Font("Tahoma", 0, 15));
        Roll_No_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Roll_No_TextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reg_No)
                    .addComponent(Name)
                    .addComponent(Roll_No)
                    .addComponent(Dept)
                    .addComponent(Class)
                    .addComponent(Address)
                    .addComponent(Mobile)
                    .addComponent(Birth_Date)
                    .addComponent(E_Mail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(E_Mail_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Fname_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Class_List, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Dept_List, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(Reg_No_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                        .addComponent(Roll_No_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Lname_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addGap(9, 9, 9))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                .addComponent(Mobile_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                            .addComponent(jLabel11)
                                            .addGap(21, 21, 21))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(22, 22, 22))
                                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(199, 199, 199)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reg_No)
                    .addComponent(Reg_No_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(Fname_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lname_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Roll_No)
                    .addComponent(Roll_No_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dept)
                    .addComponent(Dept_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Class_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Class))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Address)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mobile)
                            .addComponent(Mobile_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Birth_Date)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(E_Mail_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(E_Mail))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Submit, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(84, 84, 84))
        );

        Menu.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        Menu.setForeground(new java.awt.Color(102, 102, 102));
        Menu.setIcon(new javax.swing.ImageIcon("G:\\project\\pics\\icon\\icons\\taskbar-icon.png")); // NOI18N
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stud_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stud_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void Fname_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fname_TextActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Fname_TextActionPerformed

private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_YearActionPerformed

private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
  
    Reg_No_1 = Reg_No_Text.getText();
    Fname = Fname_Text.getText();
    Lname = Lname_Text.getText();
    Roll_No_1 = Roll_No_Text.getText();
    Email = E_Mail_Text.getText();
    Mobile_1 = Mobile_Text.getText();
    Class_ = (String)Class_List.getSelectedItem();
    Dob_Date = (String)Date.getSelectedItem();
    Dob_Month = (String)Month.getSelectedItem();
    Dob_Year = (String)Year.getSelectedItem();
    Dept_1 = (String)Dept_List.getSelectedItem();
    Adds = Address_Text.getText(); 
    if (Reg_No_1.equals("") || !Pattern.matches("[0-9]+", Reg_No_1) ){
        JOptionPane.showMessageDialog(null, "Please Enter Valid Registration Number");
    }
    else if (Fname.equals("") || Pattern.matches("[0-9]+", Fname) || Fname.length()>20){
        JOptionPane.showMessageDialog(null, "Enter Valid First Name");
    }
    else if (Lname.equals("") || Pattern.matches("[0-9]+", Lname) || Lname.length()>20){
        JOptionPane.showMessageDialog(null, "Enter Valid Surname");
    }
    else if (Roll_No_1.equals("") || !Pattern.matches("[0-9]+", Roll_No_1) || Roll_No_1.length()>10){
        JOptionPane.showMessageDialog(null, "Enter Valid Roll Number");
    }
    else if (Mobile_1.equals("") || !Pattern.matches("[0-9]+", Mobile_1) ||  Mobile_1.length()!=10){
        JOptionPane.showMessageDialog(null, "Enter Valid Mobile Number");
    }
    else if (Email.equals("") || !Email.matches(Email_Check)){
        JOptionPane.showMessageDialog(null, "Enter Valid Email Address");
    }

        else {
             try {

                Mongo mongo =new Mongo("127.0.0.1",27017); 
                DB db=mongo.getDB("Project_Demo");
                DBCollection collection=db.getCollection("Registration");
                System.out.println("Connected to DB");
                BasicDBObject save=new BasicDBObject();
                BasicDBObject query = new BasicDBObject();
                query.put("Reg_No",Reg_No_1);
                DBCursor cursor = collection.find(query);
                try{
                    if(cursor.hasNext()){
                        JOptionPane.showMessageDialog(null, "sorry...Registration number is already present");
                        Reg_No_Text.setText("");
                      }
                    else
                    {
                        save.append("Reg_No",Reg_No_1);
                        save.append("Fname",Fname);
                        save.append("Lname",Lname);
                        save.append("Roll_No",Roll_No_1);
                        save.append("Dept",Dept_1);
                        save.append("Class",Class_);
                        save.append("Address",Adds);
                        save.append("Mobile",Mobile_1);
                        save.append("DOB",Dob_Date+"/"+Dob_Month+"/"+Dob_Year);
                        save.append("Email",Email);
                        collection.insert(save);
                        JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
                 this.setVisible(false);
           new menu().setVisible(true);
                    }
                }
                finally{
                    cursor.close();
                }

            } catch (UnknownHostException ex) {
                Logger.getLogger(Registration_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}//GEN-LAST:event_SubmitActionPerformed

private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
// TODO add your handling code here:
    this.setVisible(false);
    new menu().setVisible(true);
}//GEN-LAST:event_MenuActionPerformed

private void Lname_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lname_TextActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Lname_TextActionPerformed

private void Roll_No_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Roll_No_TextActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Roll_No_TextActionPerformed

private void E_Mail_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_Mail_TextActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_E_Mail_TextActionPerformed

private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
// TODO add your handling code here:
    Reg_No_Text.setText("");
    Fname_Text.setText("");
    Lname_Text.setText("");
    Roll_No_Text.setText("");
    Address_Text.setText("");
    Mobile_Text.setText("");
    E_Mail_Text.setText("");
    Class_List.setSelectedIndex(0);
    Dept_List.setSelectedIndex(0);
    Date.setSelectedIndex(0);
    Month.setSelectedIndex(0);
    Year.setSelectedIndex(0);
}//GEN-LAST:event_ClearActionPerformed

private void Reg_No_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg_No_TextActionPerformed

}//GEN-LAST:event_Reg_No_TextActionPerformed

private void Dept_ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dept_ListActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Dept_ListActionPerformed

private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_DateActionPerformed

private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_MonthActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

}//GEN-LAST:event_formWindowOpened

private void Fname_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Fname_TextKeyPressed
    if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
        JOptionPane.showMessageDialog(null,"Please Enter only charecters..!!");
       Fname_Text.setText("");
    }
}//GEN-LAST:event_Fname_TextKeyPressed

private void E_Mail_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_E_Mail_TextKeyPressed
// TODO add your handling code here:
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        Reg_No_1 = Reg_No_Text.getText();
        Fname = Fname_Text.getText();
        Lname = Lname_Text.getText();
        Roll_No_1 = Roll_No_Text.getText();
        Email = E_Mail_Text.getText();
        Mobile_1 = Mobile_Text.getText();
        Class_ = (String)Class_List.getSelectedItem();
        Dob_Date = (String)Date.getSelectedItem();
        Dob_Month = (String)Month.getSelectedItem();
        Dob_Year = (String)Year.getSelectedItem();
        Dept_1 = (String)Dept_List.getSelectedItem();
        Adds = Address_Text.getText(); 
        if (Reg_No_1.equals("") || !Pattern.matches("[0-9]+", Reg_No_1) ){
            JOptionPane.showMessageDialog(null, "Please Enter Valid Registration Number");
        }
        else if (Fname.equals("") || Pattern.matches("[0-9]+", Fname) || Fname.length()>20){
            JOptionPane.showMessageDialog(null, "Enter Valid First Name");
        }
        else if (Lname.equals("") || Pattern.matches("[0-9]+", Lname) || Lname.length()>20){
            JOptionPane.showMessageDialog(null, "Enter Valid Surname");
        }
        else if (Roll_No_1.equals("") || !Pattern.matches("[0-9]+", Roll_No_1) || Roll_No_1.length()>10){
            JOptionPane.showMessageDialog(null, "Enter Valid Roll Number");
        }
        else if (Mobile_1.equals("") || !Pattern.matches("[0-9]+", Mobile_1) ||  Mobile_1.length()!=10){
            JOptionPane.showMessageDialog(null, "Enter Valid Mobile Number");
        }
        else if (Email.equals("") || !Email.matches(Email_Check)){
            JOptionPane.showMessageDialog(null, "Enter Valid Email Address");
        }

            else {
                 try {

                    Mongo mongo =new Mongo("127.0.0.1",27017); 
                    DB db=mongo.getDB("Project_Demo");
                    DBCollection collection=db.getCollection("Registration");
                    System.out.println("Connected to DB");
                    BasicDBObject save=new BasicDBObject();
                    BasicDBObject query = new BasicDBObject();
                    query.put("Reg_No",Reg_No_1);
                    DBCursor cursor = collection.find(query);
                    try{
                        if(cursor.hasNext()){
                            JOptionPane.showMessageDialog(null, "sorry...Registration number is already present");
                            Reg_No_Text.setText("");
                          }
                        else
                        {
                            save.append("Reg_No",Reg_No_1);
                            save.append("Fname",Fname);
                            save.append("Lname",Lname);
                            save.append("Roll_No",Roll_No_1);
                            save.append("Dept",Dept_1);
                            save.append("Class",Class_);
                            save.append("Address",Adds);
                            save.append("Mobile",Mobile_1);
                            save.append("DOB",Dob_Date+"/"+Dob_Month+"/"+Dob_Year);
                            save.append("Email",Email);
                            collection.insert(save);
                            JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
                     this.setVisible(false);
               new menu().setVisible(true);
                        }
                    }
                    finally{
                        cursor.close();
                    }

                } catch (UnknownHostException ex) {
                    Logger.getLogger(Registration_Form.class.getName()).log(Level.SEVERE, null, ex);
                }

}
}

}//GEN-LAST:event_E_Mail_TextKeyPressed

private void Reg_No_TextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Reg_No_TextKeyReleased
}//GEN-LAST:event_Reg_No_TextKeyReleased

private void Reg_No_TextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Reg_No_TextKeyTyped

}//GEN-LAST:event_Reg_No_TextKeyTyped

private void Reg_No_TextInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Reg_No_TextInputMethodTextChanged

}//GEN-LAST:event_Reg_No_TextInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Registration_Form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JTextArea Address_Text;
    private javax.swing.JLabel Birth_Date;
    private javax.swing.JLabel Class;
    private javax.swing.JComboBox Class_List;
    private javax.swing.JButton Clear;
    private javax.swing.JComboBox Date;
    private javax.swing.JLabel Dept;
    private javax.swing.JComboBox Dept_List;
    private javax.swing.JLabel E_Mail;
    private javax.swing.JTextField E_Mail_Text;
    private javax.swing.JTextField Fname_Text;
    private javax.swing.JTextField Lname_Text;
    private javax.swing.JButton Menu;
    private javax.swing.JLabel Mobile;
    private javax.swing.JTextField Mobile_Text;
    private javax.swing.JComboBox Month;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Reg_No;
    public javax.swing.JTextField Reg_No_Text;
    private javax.swing.JLabel Roll_No;
    private javax.swing.JTextField Roll_No_Text;
    public javax.swing.JButton Submit;
    private javax.swing.JComboBox Year;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel stud_profile;
    // End of variables declaration//GEN-END:variables
}
