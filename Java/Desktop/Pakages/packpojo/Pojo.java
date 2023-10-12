package packpojo;
public class Pojo
{
    protected double l,b,h;
    public Pojo()
    {
    
    }
    public Pojo(double l,double b)
    {
         this.l=l;
         this.b=b;
    }
    public void setData(double l,double b)
    {
         this.l=l;
         this.b=b;
    }
    public double getareaL()
    {
        return this.l;
    }
    public double getareaB()
    {
        return this.b;
    }
}
