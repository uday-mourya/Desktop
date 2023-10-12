 class MyException extends Exception{
    MyException(){}
    MyException(String msg){
        super(msg);
    }
}
class Test3
{
    public static void main(String [] args){
        try{  
            int a=Integer.parseInt(args[0]);
            if(a<0)
                throw new MyException("INVALID");
            else if(a==1981)
                throw new MyException("LOG IN SUCCESSFUL");
            else  `
                throw new MyException("INVALID PASSWORD");

        }
        catch(MyException ref)
        {
            System.out.println(ref);
        }
    }
}
