import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class SearchTeacher extends javax.swing.JFrame {

    /**
     * Creates new form SearchTeacher
     */
  TeacherFunction tf=new TeacherFunction();
    File f;
   DefaultTableModel model;
    public SearchTeacher() {
        initComponents();
        
      tf.fillTeacherJtable(jTable1, "");
//         ButtonGroup bg=new ButtonGroup();
//         bg.add(male);
//         bg.add(female);
//        model=(DefaultTableModel) jTable1.getModel();
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.red);
        jTable1.setSelectionBackground(Color.blue);
        jPanel1.setLayout(null);
        jPanel1.add(jLabel9);
        jPanel1.add(jTextField1);
        jPanel1.add(jLabel4);
        jPanel1.add(jTextField4);
        jPanel1.add(jLabel5);
        jPanel1.add(jTextField5);
        jPanel1.add(jLabel3);
        jPanel1.add(jTextField9);
        jPanel1.add(jLabel7);
        jPanel1.add(jLabel8);
        jPanel1.add(jLabel6);
        jPanel1.add(jTextField6);
        jPanel1.add(jScrollPane2);
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2.setViewportView(jTextArea1);
        
                jTextArea1.setColumns(20);
                jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
                jTextArea1.setRows(5);
        jPanel1.add(jTextField8);
        jPanel1.add(jButton1);
        jPanel1.add(jLabel10);
        jPanel1.add(jButton2);
        jPanel1.add(jButton3);
        jPanel1.add(jButton5);
        jPanel1.add(jButton7);
        jPanel1.add(jScrollPane1);
        jPanel1.add(jPanel2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBounds(335, 10, 836, 141);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(71, 218, 34, 29);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(71, 272, 174, 29);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(66, 327, 213, 29);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(71, 382, 198, 29);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(71, 441, 218, 29);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(66, 496, 197, 29);
        jTextField4 = new javax.swing.JTextField();
        jTextField4.setBounds(388, 251, 322, 50);
        jTextField5 = new javax.swing.JTextField();
        jTextField5.setBounds(388, 311, 320, 50);
        jTextField6 = new javax.swing.JTextField();
        jTextField6.setBounds(388, 371, 320, 50);
        jTextField8 = new javax.swing.JTextField();
        jTextField8.setBounds(390, 498, 320, 50);
        jTextField9 = new javax.swing.JTextField();
        jTextField9.setBounds(388, 186, 322, 50);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(731, 218, 203, 203);
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBounds(956, 229, 552, 521);
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setBounds(1067, 171, 164, 48);
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setBounds(1213, 172, 302, 48);
        jButton7 = new javax.swing.JButton();
        jButton7.setBounds(806, 679, 140, 64);
        jButton2 = new javax.swing.JButton();
        jButton2.setBounds(32, 681, 257, 61);
        jButton5 = new javax.swing.JButton();
        jButton5.setBounds(625, 680, 140, 63);
        jButton3 = new javax.swing.JButton();
        jButton3.setBounds(335, 683, 241, 61);
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane2.setBounds(388, 431, 322, 59);
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(741, 435, 179, 41);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(0, 128, 128));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("High School Management System ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Search Teacher Information");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teacher Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teacher's Subject");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teacher's Phone");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teacher's Address");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teacher's Salary");

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Subject", "Phone", "Address", "Salary", "image"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search-icon.png"))); // NOI18N
        jLabel9.setText("Search ");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancel.png"))); // NOI18N
        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/StartMenu.png"))); // NOI18N
        jButton2.setText("Teacher's Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-icon (3).png"))); // NOI18N
        jButton5.setText("Menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Students.png"))); // NOI18N
        jButton3.setText("Student's Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image.png"))); // NOI18N
        jButton1.setText("Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/file-info-icon.png"))); // NOI18N
        jMenuItem3.setText("Teacher file");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/file-info-icon.png"))); // NOI18N
        jMenuItem2.setText("Student file");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/file-info-icon.png"))); // NOI18N
        jMenuItem4.setText("Result file");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-icon (3).png"))); // NOI18N
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete-icon.png"))); // NOI18N
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2091, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowIndex=jTable1.getSelectedRow();
        model=(DefaultTableModel) jTable1.getModel();

        try {
            jTextField9.setText(model.getValueAt(rowIndex,0).toString());
            jTextField4.setText(model.getValueAt(rowIndex,1).toString());
            jTextField5.setText(model.getValueAt(rowIndex,2).toString());
            jTextField6.setText(model.getValueAt(rowIndex,3).toString());
            jTextArea1.setText(model.getValueAt(rowIndex,4).toString());
            jTextField8.setText(model.getValueAt(rowIndex,5).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }

        try {
//             Connection con=null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/highschool?zeroDateTimeBehavior=convertToNull", "root","");
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
            
            Connection con=AllConnection.getConnection();
        
            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("SELECT * FROM `teacher_info` WHERE `id`='"+jTextField9.getText()+"'");
            if(rs.next())
            {
                byte[] img=rs.getBytes("image");
                ImageIcon image=new ImageIcon(img);
                Image im=image.getImage();
                // Image myImg=im.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_REPLICATE);
                // ImageIcon newImage=new ImageIcon(myImg);
                ImageIcon newImage=new ImageIcon(im);
                jLabel10.setIcon(newImage);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"no data");

            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_UP||evt.getKeyCode()==KeyEvent.VK_DOWN)
        {
            int rowIndex=jTable1.getSelectedRow();
            model=(DefaultTableModel) jTable1.getModel();
            try {
                jTextField9.setText(model.getValueAt(rowIndex,0).toString());
                jTextField4.setText(model.getValueAt(rowIndex,1).toString());
                jTextField5.setText(model.getValueAt(rowIndex,2).toString());
                jTextField6.setText(model.getValueAt(rowIndex,3).toString());
                jTextArea1.setText(model.getValueAt(rowIndex,4).toString());
                jTextField8.setText(model.getValueAt(rowIndex,5).toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }

            try {
//                Connection con=Connection.getConnection();
                 Connection con=null;
               con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/highschool?zeroDateTimeBehavior=convertToNull", "root","");
                Statement st=con.createStatement();

                ResultSet rs=st.executeQuery("SELECT * FROM `teacher_info` WHERE `id`='"+jTextField9.getText()+"'");
                if(rs.next())
                {
                    byte[] img=rs.getBytes("image");
                    ImageIcon image=new ImageIcon(img);
                    Image im=image.getImage();
                    // Image myImg=im.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_REPLICATE);
                    // ImageIcon newImage=new ImageIcon(myImg);
                    ImageIcon newImage=new ImageIcon(im);
                    jLabel10.setIcon(newImage);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"no data");

                }

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
         SearchTeacher.jTable1.setModel(new DefaultTableModel(null,new Object[]{"id","name","subject","phone","address","salary","image"}));
            tf.fillTeacherJtable(SearchTeacher.jTable1,jTextField1.getText());
            
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        
        try {
            SearchTeacher.jTable1.setModel(new DefaultTableModel(null,new Object[]{"id","name","subject","phone","address","salary","image"}));
            tf.fillTeacherJtable(SearchTeacher.jTable1,jTextField1.getText());
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,e);
        }
       
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        try {
       SearchTeacher.jTable1.setModel(new DefaultTableModel(null,new Object[]{"id","name","subject","phone","address","salary","image"}));
        tf.fillTeacherJtable(SearchTeacher.jTable1,jTextField1.getText());
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
 
       
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        TeacherClass form=new  TeacherClass();
        //                         form.setDefaultCloseOperation(null);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        //                           form.dispose();
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        StudentClass form=new StudentClass();
        //                           form.setDefaultCloseOperation(null);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        //                           form.dispose();
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TeacherClass form=new  TeacherClass();
        //                         form.setDefaultCloseOperation(null);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        //                         form.dispose();
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        StudentClass form=new StudentClass();
        //                           form.setDefaultCloseOperation(null);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        //                           form.dispose();
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ResultClass form=new  ResultClass();
        //                           form.setDefaultCloseOperation(null);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        //                          form.dispose();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ManuClass form=new ManuClass();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        /// form.resize(0, 0);
        //form.setSize(600,600);
        ///form.setExtendedState(JFrame.MAXIMIZED_BOTH);
        form.welcome.setText("Wecome Mr "+jTextField1.getText());
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        StudentClass form=new StudentClass();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        //                         form.dispose();
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        try {
//            JFileChooser fc=new JFileChooser();
//            fc.showOpenDialog(this);
//            f=fc.getSelectedFile();
//            String path=f.getAbsolutePath();
//            jLabel10.setIcon(new ImageIcon(path));
//        } catch (HeadlessException e) {
//            System.out.println(e);
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    
}