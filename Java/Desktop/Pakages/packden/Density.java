class Test 
{
    public static void main(String []args)
    {
        Density ob=new Density();
        ob.setData(5,7,9,4654);
        System.out.println("Area= "+ob.a());
        System.out.println("Volume= "+ob.v());
        System.out.println("Density= "+ob.d());
    }
}
