

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

public class Fact7 extends Frame implements WindowListener,ActionListener
{
    Label l1,l2;
    TextField tf1;
    Button b1;
    public Fact7()
    {
        this.setVisible(true);
        this.setTitle("Factorial6");
        this.setSize(500,300);
        this.setLocation(200, 100);
        this.setBackground(Color.green);
        this.setLayout(null);
        
        l1=new Label("Enter any number:");
        l1.setBounds(20,50,150,40);
        this.add(l1);

        l2 = new Label();
        l2.setBounds(110,200,50,30);
        this.add(l2);
        
        tf1 = new TextField();
        tf1.setBounds(170,60,70,30);
        this.add(tf1);
        
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
        //String power = tf2.getText();
        int b = Integer.parseInt(base);
        //int p = Integer.parseInt(power);
        int i,fact=1;
        int sum =0;
       for( i=1;i<=b;i++)
       {
            fact=fact*i;
           if(i%2==0)
           {
           sum=sum+fact/i;
           }
           else
           {
               sum=sum-fact/i; 
           }
       }    
       String s=Integer.toString(sum);
        l2.setText(s);
        tf1.setText("");
       // tf2.setText("");
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
class Facto7
{
    public static void main(String[] args) {
        new Fact7();
    }
}






