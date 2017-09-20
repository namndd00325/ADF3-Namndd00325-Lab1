/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.swinglab;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nam Nguyen
 */
public class SwingLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame formStudent = new JFrame();
        formStudent.setSize(800, 600);
        formStudent.setLocationRelativeTo(null);

        JPanel formPanel = new JPanel();
        formPanel.setBackground(Color.PINK);
        formPanel.setLayout(null);
        formPanel.setBounds(100, 50, 600, 450);

        JLabel lblID = new JLabel("ID Student");
        JLabel lblName = new JLabel("Name");
        JLabel lblEmail = new JLabel("Email");
        JLabel lblPhone = new JLabel("Phone");
        JLabel lblRollNumber = new JLabel("Roll Number");
        JLabel lblClasName = new JLabel("Class Name");

        lblID.setBounds(120, 70, 100, 40);
        lblName.setBounds(120, 110, 100, 40);
        lblEmail.setBounds(120, 150, 100, 40);
        lblPhone.setBounds(120, 190, 100, 40);
        lblRollNumber.setBounds(120, 230, 100, 40);
        lblClasName.setBounds(120, 270, 100, 40);

        JTextField txtID = new JTextField();
        JTextField txtName = new JTextField();
        JTextField txtEmail = new JTextField();
        JTextField txtPhone = new JTextField();
        JTextField txtRollNumber = new JTextField();
        JTextField txtClassName = new JTextField();

        txtID.setBounds(230, 70, 300, 35);
        txtName.setBounds(230, 110,300 , 35);
        txtEmail.setBounds(230, 150, 300, 35);
        txtPhone.setBounds(230, 190, 300, 35);
        txtRollNumber.setBounds(230, 230,300, 35);
        txtClassName.setBounds(230, 270, 300, 35);
        
        JButton btnSubmit= new JButton();
        JButton btnReset = new JButton();
        btnReset.setText("Reset");
        btnSubmit.setText("Submit");
        btnSubmit.setBounds(250, 310, 120, 35);
        btnReset.setBounds(400, 310, 120, 35);

        formPanel.add(txtID);
        formPanel.add(txtName);
        formPanel.add(txtEmail);
        formPanel.add(txtPhone);
        formPanel.add(txtRollNumber);
        formPanel.add(txtClassName);
        formPanel.add(lblID);
        formPanel.add(lblName);
        formPanel.add(lblEmail);
        formPanel.add(lblPhone);
        formPanel.add(lblRollNumber);
        formPanel.add(lblClasName);
        formPanel.add(btnReset);
        formPanel.add(btnSubmit);

        formStudent.add(formPanel);

        formStudent.setLayout(null);
        formStudent.setVisible(true);
        formStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
