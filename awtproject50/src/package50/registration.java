
package package50;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Reg extends Frame implements WindowListener, ActionListener {

    Label lb1, lb2, lb3;
    TextField tf1, tf2,tf3;
    Button btn1;

    public Reg() {
        this.setVisible(true);
        //this.setSize(600, 400);
        //this.setLocation(100, 50);
        this.setTitle("Myframe");
        this.setBackground(Color.gray);
        this.setBounds(100, 50, 400, 350);
        this.setLayout(null);

        lb1 = new Label("Enter Name");
        lb1.setBounds(50, 100, 110, 20);
        this.add(lb1);

        lb2 = new Label("Enter fName");
        lb2.setBounds(50, 140, 120, 20);
        this.add(lb2);

        tf1 = new TextField();
        tf1.setBounds(200, 100, 110, 20);
        this.add(tf1);

        tf2 = new TextField();
        tf2.setBounds(200, 140, 120, 20);
        this.add(tf2);
        
        lb3 = new Label("Enter Class");
        lb3.setBounds(200, 180, 140, 20);
        this.add(lb3);
        
        tf3 = new TextField();
        tf3.setBounds(200, 180, 140, 20);
        //tf3.setBounds(200, 250, 100, 20);
        this.add(tf3);
        
        btn1 = new Button("SUBMIT");
        btn1.setBounds(200, 250, 100, 20);
        //btn1.setBounds(50, 180, 50, 20);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.white);
        this.add(btn1);
        
                   
        btn1.addActionListener(this);
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
        //tf1.setText("");
        //tf2.setText("");
     
        
       tf1.setText("");
       tf2.setText("");
    }
}


public class registration {

     public static void main(String[] args) {
     new Reg();
    }
    
}
