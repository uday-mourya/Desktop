/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreadOp;



public class Company {
    int n;
    boolean f=false;
     // if f value = false then producer produces
     // if f value = true then consumer
     synchronized public void produce_item(int n)
     {
         if(f){
             try {
                 wait();
             } catch (InterruptedException ex) {
                 //Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         this.n=n;
         System.out.println("Produced : "+this.n);
         f=true;
         notify();
     }
     synchronized public int consume_item()
     {   
         if(!f){
             try {
                 wait();
             } catch (InterruptedException ex) {
                 //Logger.getLogger(Company.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         System.out.println("Consumed : "+this.n);
         f=false;
         notify();
         return this.n;
     }  
}
