/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreadOp;
class UserThread extends Thread{
      @Override
      public void run(){
          System.out.println("this s the user thread");
      }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("program strated");
        int x=56+34;
        System.out.println("sum is "+x);
        //Thread...
        Thread t=Thread.currentThread();
        System.out.println("current running thread is :"+t.getName());
        
        t.setName("Mymain");
        System.out.println("current running thread is :"+t.getName());
        System.out.println(t.getId());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
           // Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        //going to start user thread
        UserThread thread=new UserThread();
        thread.start();
        System.out.println("progra ended");
        
    }
    
}

