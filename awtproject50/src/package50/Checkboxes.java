
package package50;

import java.awt.*;
import java.awt.Choice;
import java.awt.Frame;

public class Checkboxes {
    Checkboxes()
        {
            Frame frm=new Frame();
            Checkbox obj1=new Checkbox("YES",true);
            obj1.setBounds(100,100,60,60);
            
            Checkbox obj2=new Checkbox("NO",true);
            obj2.setBounds(100,150,60,60);
            
            frm.add(obj1);
            frm.add(obj2);
            frm.setSize(400,400);
            frm.setLayout(null);
            frm.setVisible(true);
        }
    public static void main(String[] args) {
       new Checkboxes();
    }
    
}
