
package mypack;

import java.awt.*;
import javax.swing.*; 
public class Demo extends JFrame {
    public JLabel img;
    public JScrollPane jp;
    
    public Demo()
    {    
         
         setSize(600,400);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         img=new JLabel(new ImageIcon("logo.png"));
         add(img);
         jp=new JScrollPane();
         jp.setViewportView(new Demo());
         add(jp);
         setVisible(true);
    }
}
