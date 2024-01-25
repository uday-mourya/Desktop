/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreadOp;

/**
 *
 * @author T460
 */
public class Main {
    public static void main(String[] args) {
       Company comp=new Company();
       Producer p=new Producer(comp);
       Consumer c=new Consumer(comp);
       p.start();
       c.start();
    }
}
