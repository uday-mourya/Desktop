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
            if ((a % 4 == 0) && (a % 100!= 0)|| (a%400 == 0))
                throw new MyException("LEAP YEAR");
            else  
                throw new MyException("NOT LEAP YEAR");  

        }
        catch(MyException ref)
        {
            System.out.println(ref);
        }
    }
}