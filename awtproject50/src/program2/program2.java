/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class Myframe extends Frame implements WindowListener,ActionListener
 {
     Label lb1,lb2;
     TextField tf1;
     Button btn;
    
    public Myframe()
     {
        this.setVisible(true);
        //this.setSize(600, 400);
        //this.setLocation(100, 50);
   	this.setTitle("Myframe");
        this.setBackground(Color.gray);
       	this.setBounds(100, 50, 700, 400);
       	this.setLayout(null);
       	
       	lb1=new Label("Enter name");
       	lb1.setBounds(10,50,150,30);
       	this.add(lb1);

        tf1=new TextField();
        tf1.setBounds(170,50,150,30);
        this.add(tf1);
       	
       	btn=new Button ("SUBMIT");
       	btn.setBounds(40,100,80,40);
       	btn.setBackground(Color.black);
       	btn.setForeground(Color.white);
       	
       	lb2=new Label();
       	lb2.setBounds(150,130,150,30);
       	this.add(lb2);
       	this.add(btn);
       	
         	btn.addActionListener(this);
        	this.addWindowListener(this);

    }

   
    

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub

    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=tf1.getText();
    	lb2.setText("Your name="+s);
    	tf1.setText("");
    }
}

class TestMain {
    public static void main(String[] args) {
       // new Frame();
        Myframe ob = new Myframe();

    }
}
