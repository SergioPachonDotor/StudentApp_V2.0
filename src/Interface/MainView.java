/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Backend.Conexion;
import Backend.StudentServices;
import Backend.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sap98
 */
public class MainView extends javax.swing.JFrame {
    public MainView() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jSplitPane1 = new javax.swing.JSplitPane();
        Background = new javax.swing.JLabel();
        CreateStdudent = new javax.swing.JButton();
        UpdateStudent = new javax.swing.JButton();
        DeleteStudent = new javax.swing.JButton();
        StudentIDBox_Update = new javax.swing.JTextField();
        StudentNameBox_Update = new javax.swing.JTextField();
        StudentAddressBox_Update = new javax.swing.JTextField();
        StudentPhoneBox_Update = new javax.swing.JTextField();
        StudentGenderBox_Update = new javax.swing.JTextField();
        StudentMailBox_Update = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentsDatabaseTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ID_Label = new javax.swing.JLabel();
        Name_Label = new javax.swing.JLabel();
        Mail_Label = new javax.swing.JLabel();
        Address_Label = new javax.swing.JLabel();
        Phone_Label = new javax.swing.JLabel();
        Gender_Label = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(99, 94, 193));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Background.setBackground(new java.awt.Color(51, 51, 255));

        CreateStdudent.setText("Create Student");
        CreateStdudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateStdudentMouseClicked(evt);
            }
        });

        UpdateStudent.setText("Update Student");
        UpdateStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateStudentMouseClicked(evt);
            }
        });
        UpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudentActionPerformed(evt);
            }
        });

        DeleteStudent.setText("Delete Student");
        DeleteStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteStudentMouseClicked(evt);
            }
        });

        StudentIDBox_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentIDBox_UpdateActionPerformed(evt);
            }
        });

        StudentNameBox_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNameBox_UpdateActionPerformed(evt);
            }
        });

        StudentsDatabaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        StudentsDatabaseTable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                StudentsDatabaseTableMouseMoved(evt);
            }
        });
        StudentsDatabaseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentsDatabaseTableMouseClicked(evt);
            }
        });
        StudentsDatabaseTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                StudentsDatabaseTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(StudentsDatabaseTable);

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel1.setText("Welcome To High School Student Database");

        ID_Label.setText("ID: ");

        Name_Label.setText("Name:");

        Mail_Label.setText("Mail: ");

        Address_Label.setText("Address: ");

        Phone_Label.setText("Phone: ");

        Gender_Label.setText("Gender: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name_Label)
                    .addComponent(Mail_Label)
                    .addComponent(ID_Label)
                    .addComponent(Address_Label)
                    .addComponent(Phone_Label)
                    .addComponent(Gender_Label))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreateStdudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateStudent)
                        .addGap(41, 41, 41)
                        .addComponent(DeleteStudent))
                    .addComponent(StudentAddressBox_Update)
                    .addComponent(StudentPhoneBox_Update)
                    .addComponent(StudentNameBox_Update)
                    .addComponent(StudentMailBox_Update)
                    .addComponent(StudentGenderBox_Update)
                    .addComponent(StudentIDBox_Update))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(164, 164, 164)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Background))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StudentIDBox_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name_Label)
                            .addComponent(StudentNameBox_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StudentMailBox_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mail_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StudentAddressBox_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StudentPhoneBox_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StudentGenderBox_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gender_Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreateStdudent)
                            .addComponent(UpdateStudent)
                            .addComponent(DeleteStudent))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateStudentActionPerformed

    private void StudentIDBox_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentIDBox_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentIDBox_UpdateActionPerformed

    private void CreateStdudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateStdudentMouseClicked
        // TODO add your handling code here:
        String student_id = StudentIDBox_Update.getText();
        String student_name = StudentNameBox_Update.getText();
        String student_mail = StudentMailBox_Update.getText();
        String student_address = StudentAddressBox_Update.getText();
        String student_phone = StudentPhoneBox_Update.getText();
        String student_gender = StudentGenderBox_Update.getText();
        if (StudentIDBox_Update.getText().isEmpty()){
            StudentServices.createStudentGUI(
                                            student_name, 
                                            student_mail,
                                            student_address,
                                            student_phone,
                                            student_gender);
        showStudentsTable();
        setEmptyBox();
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null, "Student ID Must Be Empty", "Error!", 0);
        }

    }//GEN-LAST:event_CreateStdudentMouseClicked

    private void UpdateStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateStudentMouseClicked
        // TODO add your handling code here:
        int student_id = Integer.parseInt(StudentIDBox_Update.getText());
        String student_name = StudentNameBox_Update.getText();
        String student_mail = StudentMailBox_Update.getText();
        String student_address = StudentAddressBox_Update.getText();
        String student_phone = StudentPhoneBox_Update.getText();
        String student_gender = StudentGenderBox_Update.getText();
        StudentServices.updateStudentGUI(
                                        student_id,
                                        student_name, 
                                        student_mail,
                                        student_address,
                                        student_phone,
                                        student_gender
        );
        showStudentsTable();
        setEmptyBox();
    }//GEN-LAST:event_UpdateStudentMouseClicked

    private void DeleteStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteStudentMouseClicked
        // TODO add your handling code here:
        int student_id = Integer.parseInt(StudentIDBox_Update.getText());
        StudentServices.deleteStudentGUI(student_id);
        showStudentsTable();
        setEmptyBox();
    }//GEN-LAST:event_DeleteStudentMouseClicked

    private void StudentNameBox_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNameBox_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentNameBox_UpdateActionPerformed

    private void StudentsDatabaseTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_StudentsDatabaseTableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentsDatabaseTableComponentShown

    private void StudentsDatabaseTableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentsDatabaseTableMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentsDatabaseTableMouseMoved

    private void StudentsDatabaseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentsDatabaseTableMouseClicked
        // TODO add your handling code here:
        int table_row = this.StudentsDatabaseTable.getSelectedRow();
        Object selected_column = this.StudentsDatabaseTable.getValueAt(table_row, 0);
        
        Conexion connect_to_db = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
                
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("student_id");
        model.addColumn("sdutend_name");
        model.addColumn("student_mail");
        model.addColumn("student_address");
        model.addColumn("student_phone");
        model.addColumn("gender");
        
        StudentsDatabaseTable.setModel(model);    
        
        try(Connection conexion = connect_to_db.get_connection()){
            
            String query = "SELECT * FROM students WHERE student_id = ? ";
            ps = conexion.prepareStatement(query);
            ps.setString(1,selected_column.toString());
            rs = ps.executeQuery();
            while(rs.next()){
                this.StudentAddressBox_Update.setText(rs.getString("student_address"));
                this.StudentGenderBox_Update.setText(rs.getString("gender"));
                this.StudentIDBox_Update.setText(rs.getString("student_id"));
                this.StudentMailBox_Update.setText(rs.getString("student_mail"));
                this.StudentNameBox_Update.setText(rs.getString("student_name"));
                this.StudentPhoneBox_Update.setText(rs.getString("student_phone"));
            }
            showStudentsTable();
            
        }
        catch(SQLException e){
            System.out.println("No Students Recorded");
            System.out.println(e);
        }
    }//GEN-LAST:event_StudentsDatabaseTableMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        showStudentsTable();
        setEmptyBox();
        
    }//GEN-LAST:event_formWindowActivated

    private void setEmptyBox(){
    this.StudentAddressBox_Update.setText("");
    this.StudentGenderBox_Update.setText("");
    this.StudentIDBox_Update.setText("");
    this.StudentMailBox_Update.setText("");
    this.StudentNameBox_Update.setText("");
    this.StudentPhoneBox_Update.setText("");
    }
    
    public void showStudentsTable(){
        Conexion connect_to_db = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("student_id");
        model.addColumn("sdutend_name");
        model.addColumn("student_mail");
        model.addColumn("student_address");
        model.addColumn("student_phone");
        model.addColumn("gender");
        
        StudentsDatabaseTable.setModel(model);    
        
        try(Connection conexion = connect_to_db.get_connection()){
            String query = "SELECT * FROM students";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                String student[] = new String[6];
                student[0] = rs.getString("student_id");
                student[1] = rs.getString("student_name");
                student[2] = rs.getString("student_mail");
                student[3] = rs.getString("student_address");
                student[4] = rs.getString("student_phone");
                student[5] = rs.getString("gender");
                model.addRow(student);
                
            }            
            this.StudentsDatabaseTable.setModel(model);
           
        }
        catch(SQLException e){
            System.out.println("No Students Recorded");
            System.out.println(e);
        }
    }
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });     
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address_Label;
    private javax.swing.JLabel Background;
    private javax.swing.JButton CreateStdudent;
    private javax.swing.JButton DeleteStudent;
    private javax.swing.JLabel Gender_Label;
    private javax.swing.JLabel ID_Label;
    private javax.swing.JLabel Mail_Label;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JLabel Phone_Label;
    private javax.swing.JTextField StudentAddressBox_Update;
    private javax.swing.JTextField StudentGenderBox_Update;
    private javax.swing.JTextField StudentIDBox_Update;
    private javax.swing.JTextField StudentMailBox_Update;
    private javax.swing.JTextField StudentNameBox_Update;
    private javax.swing.JTextField StudentPhoneBox_Update;
    private javax.swing.JTable StudentsDatabaseTable;
    private javax.swing.JButton UpdateStudent;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
