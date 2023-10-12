 class MyException extends Exception{
    MyException(){}
    MyException(String msg){
        super(msg);
    }
}
class Test4
{
    public static void main(String [] args){
        try{  
            int a=Integer.parseInt(args[0]);
            if(a<0||a>24)
                throw new MyException("INVALID");
            if(a<=9)
                throw new MyException("You Enter In Classroom");
            else if(a>9)  
                throw new MyException("You Can't Enter In Classroom ");
            else  
                throw new MyException("TIME ="+a);  

        }
        catch(MyException ref)
        {
            System.out.println(ref);
        }
    }
}
