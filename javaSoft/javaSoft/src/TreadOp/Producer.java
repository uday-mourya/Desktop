/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreadOp;



/**
 *
 * @author T460
 */
public class Producer extends Thread {
    Company c;
    Producer(Company c){
        this.c=c; 
    }
    @Override
    public void run()
    { 
        int i=1;
       while(true)
       {
        try {
            this.c.produce_item(i);
            Thread.sleep(1000);
            i++;
        } catch (InterruptedException ex) {
           // Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }
    
}
