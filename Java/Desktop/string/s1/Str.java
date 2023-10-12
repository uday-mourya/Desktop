/* 
class Test
{
    public static void main(String args[])
    {
        String s1=new String("Aman");
        String s2=new String("Aman");
        if(s1.equals(s2))
        System.out.println("Both are Different");
        else
        System.out.println("Both are Different"); 
    }
} 
//o/p-both are different
*/
/*
class Test
{
    public static void main(String args[])
    {
        String s1="Aman";
        String s2=new String("Aman");
        if(s1.equals(s2))
        System.out.println("Both are Same");
        else
        System.out.println("Both are Different"); 
    }
}
o/p-Same
*/
/*
class Test
{
    public static void main(String args[])
    {
        String s1="Aman";
        String s2="Aman";
        if(s1.equals(s2))
        System.out.println("Both are Same");
        else
        System.out.println("Both are Different"); 
    }
}
o/p-Same
*/
/*
class Test
{
    public static void main(String args[])
    {
        String s1="Aman";
        String s2=new String("Aman");
        if(s1==s2)
        System.out.println("Both are Same");
        else
        System.out.println("Both are Different"); 
    }
}
//o/p-diff.
*/
/*
class Test
{
    public static void main(String args[])
    {
        String s1=new String("Aman");
        String s2=new String("Aman");
        if(s1==s2)
        System.out.println("Both are Different");
        else
        System.out.println("Both are Different"); 
    }
}
//o/p-diff.
*/
/*
class Test
{
    public static void main(String args[])
    {
        String s1="Aman";
        String s2="Aman";
        if(s1==s2)
        System.out.println("Both are Same");
        else
        System.out.println("Both are Different"); 
    }
}
//o/p-same
*/
/*
class Test
{
    public static void main(String args[])
    {
        String s1="Aman";
        String s2=new String("Aman");
        if(s1==s2)
        System.out.println("Both are Different");
        else
        System.out.println("Both are Different"); 
    }
}
//o/p-diff..
*/
/*
class Test
{
    public static void main(String args[])
    {
        String s1="Aman";
        String s2="Vaibhav";
        String s3="Mohan lal";
        System.out.println(" "+s1.charAt(2)); //m
       // System.out.println(" "+s1.charAt(5)); stringindexoutofbounds
        System.out.println(" "+s1.indexOf('m')); //1
       // System.out.println(" "+s1/indexOf("a")); cannot find Symbol
       System.out.println(" "+s2.lastIndexOf('a')) ;//5
       System.out.println(" "+s2.substring(2)); //ibhav
       System.out.println(" "+s2.substring(1,5));//aibh
       CharSequence s=s2.subSequence(1,5);
       System.out.println(s);//aibh
       System.out.println(" "+s1.toUpperCase());//AMAN
       System.out.println(" "+s2.toLowerCase());//vaibhav
       System.out.println(" "+s2.length());//7
       System.out.println(" "+s3.trim());//Mohan lal
       System.out.println(" "+s3.trim().length());//9 
    }
}
*/


