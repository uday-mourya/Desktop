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
            if(a>100)
                throw new MyException("value is>100");
            else if(a<0)  
                throw new MyException("Value is <0");
            else  
                throw new MyException("Marks ="+a);  

        }
        catch(MyException ref)
        {
            System.out.println(ref);
        }
    }
}