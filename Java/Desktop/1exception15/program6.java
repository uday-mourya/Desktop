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
            if(a<0||a>2)
                throw new MyException("INVALID");
            if(a==1)
                throw new MyException("You Give Exam Second Year");
            else if(a==2)  
                throw new MyException("You Can't Give Exam Second Year ");
            else  
                throw new MyException("Pass(1)||Supply(2) ="+a);  

        }
        catch(MyException ref)
        {
            System.out.println(ref);
        }
    }
}

