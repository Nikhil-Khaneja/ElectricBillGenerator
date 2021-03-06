/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitybillgenerator;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author family
 */
public class ElectricityBill extends javax.swing.JFrame {
    Connection conn = MySqlConnect.connectDb();
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    

    @Override
    public void setResizable(boolean bln) {
        super.setResizable(bln); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Creates new form ElectricityBill
     */
    static{
        sql= "SELECT * FROM billdetails WHERE consumerno = ?";
    }
    public ElectricityBill() {
        initComponents();
        generateBill();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jctable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblconsumerno = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblconsumername = new javax.swing.JLabel();
        lblmonth = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblmeterno = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        lblpincode = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbcharges = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        lbladdress = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btngenerate = new javax.swing.JButton();
        jtfconsumerno = new javax.swing.JTextField();
        jtfmonthyy = new javax.swing.JTextField();
        jtfunits = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbllogo = new javax.swing.JLabel();

        jctable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Energy Charges", null},
                {"Wheeling Charges @ 1.8Rs/U", null},
                {"Electricity Duty ", null},
                {"Tax on Sale @ 9.04 Ps/U", null},
                {"Total Current Bill", null}
            },
            new String [] {
                "CHARGES", "AMOUNT in Rs."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jctable);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electricitybillgenerator/images/close_frame.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Consumer No");

        lblconsumerno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblconsumerno.setText("*******");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel8.setText("ELECTRICITY BILL FOR THE MONTH OF");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Consumer Name");

        lblconsumername.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblconsumername.setText("LASTNAME FIRSTNAME");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Meter No");

        lblmeterno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblmeterno.setText("*******");

        Address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Address.setText("Address");
        Address.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblpincode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblpincode.setText("******");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Pin Code");

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"RESIDENTIAL", "4.8"},
                {"NON-RESIDENTIAL", "5.5"},
                {"INDUSTRIAL", "4.3"},
                {"PUBLIC ", "3.5"}
            },
            new String [] {
                "AREA", "RS/UNIT"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jtbcharges.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbcharges.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jtbcharges);

        lbladdress.setEditable(false);
        lbladdress.setColumns(20);
        lbladdress.setRows(5);
        jScrollPane4.setViewportView(lbladdress);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblpincode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblconsumerno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblconsumername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmeterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(lblmonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblconsumerno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblconsumername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblmeterno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpincode)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                            .addComponent(lblmonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        jLabel1.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VES ELECTRICITY PVT LTD");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfconsumernoFocusLost(evt);
            }
        });

        btngenerate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btngenerate.setText("GENERATE");
        btngenerate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });

        jtfconsumerno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtfconsumerno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfconsumerno.setText("consumer no");
        jtfconsumerno.setBorder(null);
        jtfconsumerno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfconsumernoFocusGained(evt);
            }
        });
        jtfconsumerno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfconsumernoActionPerformed(evt);
            }
        });

        jtfmonthyy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfmonthyy.setText("month");
        jtfmonthyy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfmonthyyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfmonthyyFocusLost(evt);
            }
        });
        jtfmonthyy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfmonthyyActionPerformed(evt);
            }
        });

        jtfunits.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtfunits.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfunits.setText("units");
        jtfunits.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfunits.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfunitsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfunitsFocusLost(evt);
            }
        });
        jtfunits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfunitsKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jtfconsumerno, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jtfmonthyy, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(btngenerate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfunits))
                .addGap(10, 10, 10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfconsumerno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfmonthyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfunits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btngenerate)
                .addContainerGap())
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(340, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        lbllogo.setBackground(new java.awt.Color(0, 0, 0));
        lbllogo.setFont(new java.awt.Font("AR DELANEY", 0, 24)); // NOI18N
        lbllogo.setForeground(new java.awt.Color(255, 255, 255));
        lbllogo.setText("ELECTRICITY BILL GENERATOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void generateBill(){
                if(placeholder3.equals(jtfunits.getText()));
                else
                    units = Integer.parseInt(jtfunits.getText());
                lblmonth.setText(jtfmonthyy.getText());
                energycharge = units * 4.8;
                wheelingcharge =units*1.8;
                electricityduty = units;
                saletax = 0.94 * units;
                total = energycharge + wheelingcharge + electricityduty + saletax;        
                storeBill();
                getBillDetails(this.sql);
    }
    private void storeBill(){
        try{
                
                String sqlQuery = "INSERT INTO billdetails(consumerno,energycharges,wheelingcharges,electricityduty,saletax,total,month) VALUES(?,?,?,?,"
                        + "?,?,?)";
                preparedStatement = conn.prepareStatement(sqlQuery);
                preparedStatement.setString(1, lblconsumerno.getText());
                preparedStatement.setDouble(2, energycharge);
                preparedStatement.setDouble(3, wheelingcharge);
                preparedStatement.setDouble(4, electricityduty);
                preparedStatement.setDouble(5, saletax);
                preparedStatement.setDouble(6, total);
                preparedStatement.setString(7, lblmonth.getText());
                preparedStatement.execute();
                
        }
        catch(SQLException e) {
            System.out.print("ISSUe IN STORING BILL :"+e);
        }
       
        
    }
    
    private void getBillDetails(String sql){
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,jtfconsumerno.getText());
            rs =preparedStatement.executeQuery();
            jtbcharges.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Issue in inserting data in table :"+e.getMessage());
        }
        finally{
            try {
                rs.close();
                preparedStatement.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Issue:"+e.getMessage());
            }
        }
    }
    private void getPersonalDetails(){
        String consumernumber = jtfconsumerno.getText();
        String sql = "SELECT * FROM consumerid WHERE consumerno = "+ consumernumber;
        try {
            preparedStatement = conn.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            if(rs.next()){
                lblconsumerno.setText(rs.getString("consumerno"));
                lblconsumername.setText(rs.getString("consumername"));
                lblmeterno.setText(rs.getString("meterno"));
                lbladdress.setText(rs.getString("address"));
                lblpincode.setText(rs.getString("pincode"));
            }
        } catch (Exception e) {
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            int ans = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit","Login",JOptionPane.YES_NO_OPTION);
        if(ans == JOptionPane.YES_OPTION){
            close();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfconsumernoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfconsumernoFocusLost
        // TODO add your handling code here:
        if("".equals(jtfconsumerno.getText())){
            jtfconsumerno.setText(placeholder1);
        }
    }//GEN-LAST:event_jtfconsumernoFocusLost

    private void jtfunitsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfunitsKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
            jLabel3.setText("only number");
        }
        else{
            jLabel3.setText("");
        }
    }//GEN-LAST:event_jtfunitsKeyTyped

    private void jtfunitsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfunitsFocusLost
        // TODO add your handling code here:
        if(jtfunits.getText().equals("")){
            jtfunits.setText(placeholder3);
        }
    }//GEN-LAST:event_jtfunitsFocusLost

    private void jtfunitsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfunitsFocusGained
        // TODO add your handling code here:
        if(placeholder3.equals(jtfunits.getText())){
            jtfunits.setText("");
        }
    }//GEN-LAST:event_jtfunitsFocusGained

    private void jtfmonthyyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfmonthyyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfmonthyyActionPerformed

    private void jtfmonthyyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfmonthyyFocusLost
        // TODO add your handling code here:
        if("".equals(jtfmonthyy.getText())){
            jtfmonthyy.setText(placeholder2);
        }
    }//GEN-LAST:event_jtfmonthyyFocusLost

    private void jtfmonthyyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfmonthyyFocusGained
        // TODO add your handling code here:
        if(placeholder2.equals(jtfmonthyy.getText())){
            jtfmonthyy.setText("");
        }
    }//GEN-LAST:event_jtfmonthyyFocusGained

    private void jtfconsumernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfconsumernoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfconsumernoActionPerformed

    private void jtfconsumernoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfconsumernoFocusGained
        // TODO add your handling code here:
        if(placeholder1.equals(jtfconsumerno.getText())){
            jtfconsumerno.setText("");
        }
    }//GEN-LAST:event_jtfconsumernoFocusGained

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
        // TODO add your handling code here:
        if(btngenerate.getText().equals("GENERATE")){
            getPersonalDetails();
            generateBill();
            btngenerate.setText("PRINT");
        }
        else{
            getPrint();
        }
        
    }//GEN-LAST:event_btngenerateActionPerformed
    public void getPrint(){

  PrinterJob pj = PrinterJob.getPrinterJob();
  pj.setJobName(" Print Component ");

  pj.setPrintable (new Printable() {    
    public int print(Graphics pg, PageFormat pf, int pageNum){
      if (pageNum > 0){
      return Printable.NO_SUCH_PAGE;
      }

      Graphics2D g2 = (Graphics2D) pg;
      g2.translate(pf.getImageableX(), pf.getImageableY());
      jPanel5.paint(g2);
      return Printable.PAGE_EXISTS;
    }
  });
  if (pj.printDialog() == false)
  return;

  try {
        pj.print();
  } catch (PrinterException ex) {
        // handle exception
  }
}
    private void close(){
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ElectricityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElectricityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElectricityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectricityBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElectricityBill().setVisible(true);
            }
        });
        
        
    }
    PersonalDetails pd;
    private int units=0;
    private double energycharge;
    private double wheelingcharge;
    private double electricityduty;
    private double saletax;
    private double total;
    static final String sql;
    private String placeholder1 ="consumer no";
    private String placeholder2 = "month";
    private String placeholder3 = "units";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JButton btngenerate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jctable;
    private javax.swing.JTable jtbcharges;
    private javax.swing.JTextField jtfconsumerno;
    private javax.swing.JTextField jtfmonthyy;
    private javax.swing.JTextField jtfunits;
    private javax.swing.JTextArea lbladdress;
    private javax.swing.JLabel lblconsumername;
    private javax.swing.JLabel lblconsumerno;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblmeterno;
    private javax.swing.JLabel lblmonth;
    private javax.swing.JLabel lblpincode;
    // End of variables declaration//GEN-END:variables

}
