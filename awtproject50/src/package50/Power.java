
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

class Power extends Frame implements WindowListener,ActionListener
{
    Label l1,l2,l3;
    TextField tf1,tf2;
    Button b1;
    public Power()
    {
        this.setVisible(true);
        this.setTitle("Power");
        this.setSize(500,300);
        this.setLocation(200, 100);
        this.setBackground(Color.magenta);
        this.setLayout(null);
        l1=new Label("Enter Your Base:");
        l1.setBounds(20,50,150,40);
        this.add(l1);
        l2 = new Label("Enter Your Power:");
        l2.setBounds(20, 90,150, 40);
        this.add(l2);
        l3 = new Label();
        l3.setBounds(110,200,50,30);
        this.add(l3);
        
        tf1 = new TextField();
        tf1.setBounds(170,60,70,30);
        this.add(tf1);
        tf2 = new TextField();
        tf2.setBounds(170,100,70,30);
        this.add(tf2);
        
        b1 = new Button("Submit");
        b1.setBounds(110,150,70,30);
        this.add(b1);
        this.addWindowListener(this);
        b1.addActionListener(this);
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String base = tf1.getText();
        String power = tf2.getText();
        int b = Integer.parseInt(base);
        int p = Integer.parseInt(power);
        int i,pow;
        for(i=1,pow=1;i<=p;i++,pow=pow*b);
        String s = Integer.toString(pow);
        l3.setText(s);
        tf1.setText("");
        tf2.setText("");
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
class Power1
{
    public static void main(String[] args) {
        new Power();
    }
}




