/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Login extends JFrame implements ActionListener {
    
    JButton rules,back;
    JTextField tfname;
    
    public Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("mypack/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600, 500);
        add(image);
        
        JLabel heading=new JLabel("Reading Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
        heading.setForeground(new Color(30,144,244));
        add(heading);
        
        JLabel name=new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,244));
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,23));
        add(tfname);
        
        rules =new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back =new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        
        setSize(1200,500);
        setLocation(50, 50);
        setVisible(true);
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(e.getSource()==rules)
        {
            String name= tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(e.getSource()==back)
        {
            setVisible(false);
        }
    }
}    
