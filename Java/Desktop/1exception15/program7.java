class MyException extends Exception{
    MyException(){}
    MyException(String msg){
        super(msg);
    }
}
class Test
{
    public static void main(String [] args){
        try{
            int a=Integer.parseInt(args[0]);
            if(a%2==0)
                throw new MyException("EVEN NUMBER");
            else  
                throw new MyException("ODD NUMBER");  

        }
        catch(MyException ref)
        {
            System.out.println(ref);
        }
    }
}