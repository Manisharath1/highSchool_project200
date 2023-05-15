
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiba
 */
public class StudentView extends javax.swing.JFrame {

    /**
     * Creates new form StudentView
     */
    StudentFunction s=new StudentFunction();
    DefaultTableModel model;
    public StudentView() {
        initComponents();
       s.fillStudentJtable(jTable1,"");
       
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.red);
        jTable1.setSelectionBackground(Color.blue);
      
       jLabel2.setText("Total records :"+Integer.toString(StudentFunction.countRecord("student_info")));
       jTextArea1 = new javax.swing.JTextArea();
       jTextArea1.setBounds(200, 620, 380, 49);
       jPanel1.add(jTextArea1);
       
               jTextArea1.setColumns(20);
               jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
               jTextArea1.setRows(5);
               
               JButton btnNewButton = new JButton("Save");
               btnNewButton.setBounds(90, 704, 176, 45);
               btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
               btnNewButton.setIcon(new ImageIcon("C:\\Users\\panda\\Downloads\\icons8-save-40.png"));
               jPanel1.add(btnNewButton);
               
               JButton btnNewButton_1 = new JButton("Menu");
               btnNewButton_1.setBounds(320, 704, 155, 45);
               btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\panda\\Downloads\\icons8-menu-24.png"));
               btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 22));
               jPanel1.add(btnNewButton_1);
               
               JButton btnNewButton_2 = new JButton("Cancel");
               btnNewButton_2.addActionListener(new ActionListener() {
               	public void actionPerformed(ActionEvent e) {
               	}
               });
               btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\panda\\Downloads\\icons8-cancel-16.png"));
               btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 23));
               btnNewButton_2.setBounds(533, 705, 140, 43);
               jPanel1.add(btnNewButton_2);
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(440, 10, 910, 120);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(20, 189, 70, 29);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(20, 236, 70, 29);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(19, 287, 155, 29);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(20, 347, 164, 29);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(20, 404, 154, 29);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(20, 520, 62, 29);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setBounds(20, 577, 75, 29);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(14, 640, 160, 29);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setBounds(20, 810, 150, 29);
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setBounds(200, 179, 370, 35);
        jTextField2 = new javax.swing.JTextField();
        jTextField2.setBounds(200, 233, 370, 35);
        jTextField3 = new javax.swing.JTextField();
        jTextField3.setBounds(200, 284, 370, 35);
        jTextField4 = new javax.swing.JTextField();
        jTextField4.setBounds(199, 344, 371, 35);
        jTextField6 = new javax.swing.JTextField();
        jTextField6.setBounds(200, 513, 380, 43);
        jTextField8 = new javax.swing.JTextField();
        jTextField8.setBounds(200, 566, 380, 45);
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane2.setBounds(200, 810, 380, 40);
        jTextArea2 = new javax.swing.JTextArea();
        jlabel_photo = new javax.swing.JLabel();
        jlabel_photo.setBounds(620, 210, 240, 260);
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(650, 490, 161, 37);
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser1.setBounds(200, 389, 370, 46);
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setBounds(20, 461, 87, 29);
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton1.setBounds(200, 457, 111, 37);
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton2.setBounds(346, 457, 155, 37);
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane3.setBounds(892, 189, 623, 558);
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton6.setBounds(480, 871, 130, 40);
        jButton7 = new javax.swing.JButton();
        jButton7.setBounds(630, 870, 140, 40);
        jButton3 = new javax.swing.JButton();
        jButton3.setBounds(240, 870, 220, 40);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new Color(0, 128, 128));
        jPanel1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("High School Management System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Total Records :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        jPanel1.add(jPanel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Father Name");
        jPanel1.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mother Name");
        jPanel1.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date of Birth");
        jPanel1.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Class");
        jPanel1.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("phone");
        jPanel1.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("par address");
        jPanel1.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("cur address");
        jPanel1.add(jLabel11);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jTextField1);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jTextField2);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jTextField3);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jTextField4);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField8);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);

        jlabel_photo.setBackground(new java.awt.Color(51, 51, 0));
        jlabel_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));
        jPanel1.add(jlabel_photo);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jDateChooser1);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender");
        jPanel1.add(jLabel12);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton1.setText("Male");
        jPanel1.add(jRadioButton1);

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jRadioButton2.setText("Female");
        jPanel1.add(jRadioButton2);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "Fname", "Mname", "Dob", "Gender", "Class", "phone", "par_addr", "cur_addr", "image"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-icon (3).png"))); // NOI18N
        jButton6.setText("Home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancel.png"))); // NOI18N
        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/StartMenu.png"))); // NOI18N
        jButton3.setText("Student Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton2.setBounds(90, 870, 120, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Save-icon (1).png"))); // NOI18N
        jButton2.setText("Add ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 990));

        jMenu2.setText("File");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/file-info-icon.png"))); // NOI18N
        jMenuItem3.setText("Teacher file");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/file-info-icon.png"))); // NOI18N
        jMenuItem4.setText("Result file");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/file.png"))); // NOI18N
        jMenuItem6.setText("Class file");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-icon (3).png"))); // NOI18N
        jMenuItem5.setText("Home");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete-icon.png"))); // NOI18N
        jMenuItem7.setText("Exit");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }

    }//GEN-LAST:event_jTextField8KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {


    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
    
        
      
      int rowIndex=jTable1.getSelectedRow();
      model=(DefaultTableModel) jTable1.getModel();
      jRadioButton1.setSelected(false);
      jRadioButton2.setSelected(false);
      if(model.getValueAt(rowIndex, 5).toString().equals("Male"))
        {
            jRadioButton1.setSelected(true);
        }
        else
        {
            jRadioButton2.setSelected(true);
        }
         jTextField1.setText(model.getValueAt(rowIndex, 0).toString());
         jTextField2.setText(model.getValueAt(rowIndex, 1).toString());
         jTextField3.setText(model.getValueAt(rowIndex, 2).toString());
         jTextField4.setText(model.getValueAt(rowIndex, 3).toString());
         jTextField6.setText(model.getValueAt(rowIndex, 6).toString());
         jTextField8.setText(model.getValueAt(rowIndex, 7).toString());
         jTextArea1.setText(model.getValueAt(rowIndex, 8).toString());
         jTextArea2.setText(model.getValueAt(rowIndex, 9).toString());
        
         try {
             
             
              Connection con=AllConnection.getConnection();
             
            Statement st=con.createStatement();
         
           ResultSet rs=st.executeQuery("SELECT * FROM `student_info` WHERE `id`='"+jTextField1.getText()+"'");
           if(rs.next())
           {
               byte[] img=rs.getBytes("image");
               ImageIcon image=new ImageIcon(img);
               Image im=image.getImage();
             
              ImageIcon newImage=new ImageIcon(im);
              jlabel_photo.setIcon(newImage);
           }
           else
           {
               JOptionPane.showMessageDialog(null,"no data");
               
           }
      
         } catch (HeadlessException | SQLException e) {
          
        }
    
        Date bdate;
         try {
             bdate=new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
             jDateChooser1.setDate(bdate);
         } catch (ParseException ex) {
           
             JOptionPane.showMessageDialog(null, ex);
         }
        
    }

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {
      if(evt.getKeyCode()==KeyEvent.VK_UP||evt.getKeyCode()==KeyEvent.VK_DOWN)
        {   
        int rowIndex=jTable1.getSelectedRow();
        model=(DefaultTableModel) jTable1.getModel();
       jRadioButton1.setSelected(false);
       jRadioButton2.setSelected(false);
       if(model.getValueAt(rowIndex, 5).toString().equals("Male"))
        {
            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
        }
        else
        {
             jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(true);
        }
         jTextField1.setText(model.getValueAt(rowIndex, 0).toString());
         jTextField2.setText(model.getValueAt(rowIndex, 1).toString());
         jTextField3.setText(model.getValueAt(rowIndex, 2).toString());
         jTextField4.setText(model.getValueAt(rowIndex, 3).toString());
         jTextField6.setText(model.getValueAt(rowIndex, 6).toString());
         jTextField8.setText(model.getValueAt(rowIndex, 7).toString());
         jTextArea1.setText(model.getValueAt(rowIndex, 8).toString());
         jTextArea2.setText(model.getValueAt(rowIndex, 9).toString());
        //// jlabel_photo.setBlob(model.getValueAt(rowIndex, 10));
         try {
       
             
            Connection con=AllConnection.getConnection();
            
            Statement st=con.createStatement();
         
           ResultSet rs=st.executeQuery("SELECT * FROM `student_info` WHERE `id`='"+jTextField1.getText()+"'");
           if(rs.next())
           {
               byte[] img=rs.getBytes("image");
               ImageIcon image=new ImageIcon(img);
               Image im=image.getImage();
            
              ImageIcon newImage=new ImageIcon(im);
              jlabel_photo.setIcon(newImage);
           }
           else
           {
               JOptionPane.showMessageDialog(null,"no data");
               
           }
      
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
   
        Date bdate;
         try {
             bdate=new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
             jDateChooser1.setDate(bdate);
         } catch (ParseException ex) {
           
             JOptionPane.showMessageDialog(null, ex);
         }
       }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {

    }//GEN-LAST:event_jTable1MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        ManuClass form=new ManuClass();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
      dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        StudentClass form=new StudentClass();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        //                         form.dispose();
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        CreateStudent form=new CreateStudent();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        //                         form.dispose();
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        TeacherClass form=new  TeacherClass();
        //                         
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        //                         form.dispose();
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
        ResultClass form=new  ResultClass();
       
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        //                          form.dispose();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        ClassMain form=new ClassMain();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        //                         form.dispose();
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
        form.setResizable(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        ManuClass form=new ManuClass();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
     
        form.welcome.setText("Wecome Mr "+jTextField1.getText());
        dispose();
    }

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

  
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentView().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButton1;
    public static final javax.swing.JButton jButton2 = new javax.swing.JButton();
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel jlabel_photo;
}
