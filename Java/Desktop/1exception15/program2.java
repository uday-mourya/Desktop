class MyException extends Exception{
    MyException(){}
    MyException(String msg){
        super(msg);
    }
}
class Test1
{
    public static void main(String [] args){
        try{
            int a=Integer.parseInt(args[0]);
            if(a<0)
                throw new MyException("Invalid Age");
            else if(a>=18)
                throw new MyException("You Can Vote");
            else if(a>0&&a<18)  
                throw new MyException("You can't Vote ");
            else  
                throw new MyException("Age ="+a);  

        }
        catch(MyException ref)
        {
            System.out.println(ref);
        }
    }
}
