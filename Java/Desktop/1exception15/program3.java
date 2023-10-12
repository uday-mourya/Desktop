class MyException extends Exception{
    MyException(){}
    MyException(String msg){
        super(msg);
    }
}
class Test2
{
    public static void main(String [] args){
        try{  
            int a=Integer.parseInt(args[0]);
            if(a<0)
                throw new MyException("INVALID");
            if(a>10000)
                throw new MyException("You Cant Widraw Money");
            else if(a<10000)  
                throw new MyException("Widraw Successful");
            else  
                throw new MyException("BALANCE ="+a);  

        }
        catch(MyException ref)
        {
            System.out.println(ref);
        }
    }
}
