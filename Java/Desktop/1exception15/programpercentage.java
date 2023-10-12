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
             if (a<0)
                throw new MyException("<<---INVALID PERCENTAGE--->>");
            else if (a>=60)
                throw new MyException("Pass In Second Division");
            else if (a>=45&&a<60)
                throw new MyException("Pass In Second Division");
            else if (a>=33&&a<45)
                throw new MyException("Pass In Third Division");          
            else  
                throw new MyException("-----FAIL-----");  

        }
        catch(MyException ref)
        {
            System.out.println(ref);
        }
    }
}