/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreadOp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T460
 */
public class Consumer extends Thread {
    Company c;
    Consumer(Company c){
       this.c=c;
    }
    
    public void run(){
       while(true){
         this.c.consume_item();
           try {
               Thread.sleep(2000);
           } catch (InterruptedException ex) {
            //   Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
    
    
}
