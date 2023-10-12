class ThreadSyn{
    synchronized public void test(String msg)
    {
        System.out.println("INDIA IS A"+msg);
        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e){ }
            System.out.println("COUNTRY");
    }
}  
class childThread extends Thread
{
    String message;
    ThreadSyn tob;
    public 
    public childThread(ThreadSyn tob,String msg)
    {
        this.tob=tob;
        this.message=msg;
        this.start();

    }
    public void run(){
        tob.test(message);
    }
}
public class Main{
    public static void main(String[] args) 
    {
        ThreadSyn ts=new ThreadSyn();
        childThread ob1=new childThread(ts,"GREAT");
        childThread ob2=new childThread(ts,"COOL");
    }  
}