package package50;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Cone extends Frame implements WindowListener,ActionListener
{
    Label l1,l2,l3;
    TextField tf1,tf2,tf3;
    Button b1,b2;
    public Cone()
    {
        this.setVisible(true);
        
        this.setTitle("TsaCone");
        this.setSize(500,300);
        this.setLocation(200, 100);
        this.setBackground(Color.white);
        this.setLayout(null);
        l1=new Label("Enter Radius :");
        l1.setBounds(100,50,150,40);
        this.add(l1);
        
        l2=new Label("Enter Length:");
        l2.setBounds(100,100,150,40);
        this.add(l2);
        
        l3 = new Label();
        l3.setBounds(150,230,70,30);
        this.add(l3);
        
        tf1 = new TextField();
        tf1.setBounds(300,60,70,30);
        this.add(tf1);
        
        tf2 = new TextField();
        tf2.setBounds(300,110,70,30);
        this.add(tf2);
                
        b1 = new Button("CSA");
        b1.setBounds(100,210,50,30);
        this.add(b1);

        
        b2=new Button("Clear");
        b2.setBounds(300,210,70,30);
        this.add(b2);
      
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        this.addWindowListener(this);
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
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String x = tf1.getText();
        String y = tf1.getText();
        int r = Integer.parseInt(x);
        int l = Integer.parseInt(y);

        double c = 0;
        if(e.getSource()==b1)
        {
             c =3.14*r*r+3.14*r*l;
            String s = Double.toString(c);
            l3.setText(s);
        }

        else if(e.getSource()==b2)
        {
           tf1.setText("");
           tf2.setText("");
        }
          
        
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
}
class Cone1{
    public static void main(String[] args) {
        new Cone();
    }
}