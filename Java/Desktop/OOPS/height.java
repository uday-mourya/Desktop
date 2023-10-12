class Test
{
    public static void main(String[] args) 
    {
        Height h1=new Height();
        Height h2=new Height();
        Height h3=new Height();
        
        h1.setData(2,39);
        h2.setData(3,27);
        h1.display();
        h2.display();
        h3.addHeight(h1,h2);
        h3.display();
        
    }
}
class Height
{
    private int f,i;
    public void setData(int f,int i)
    {
        this.f=f;
        this.i=i;
    }
    public void display()
    {
        System.out.println("feet="+this.f);
        System.out.println("Inch="+this.i);
        System.out.println("--------------");
    }
    public void addHeight(Height h1,Height h2)
    {
        this.f=h1.f+h2.f;
        this.i=h1.i+h2.i;
        if(this.i>12)
        {
            this.f+=this.i/12;
            this.i%=12;
        }
    }
    
}
