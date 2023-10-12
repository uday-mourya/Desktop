class CalculatorPOJO
{  
    private double a,b,c;
    public void setA(double a)
    {
       this.a=a; 
    }
    public void setB(double b)
    {
       this.b=b; 
    }
    public void setC(double c)
    {
       this.c=c; 
    }
    public double getA()
    {
       return this.a;
    }
    public double getB()
    {
       return this.b;
    }
    public double getC()
    {
       return this.c;
    }
}    
class Calculatoroperation 
{   
    public double add(CalculatorPOJO ref)
    {
     
      return ref.getA()+ref.getB();    
    }
     public double sub(CalculatorPOJO ref)
    {
     
      return ref.getA()-ref.getB();    
    }
    public double multi(CalculatorPOJO ref)
    {
     
      return ref.getA()*ref.getB();    
    }
    public double div(CalculatorPOJO ref)
    {
     
      return ref.getA()/ref.getB();    
    }
    public double mod(CalculatorPOJO ref)
    {
     
      return ref.getA()%ref.getB();    
    }
}
class Test
{    
    public static void main(String [] args)
    { 
      
      CalculatorPOJO ob=new CalculatorPOJO();
      ob.setA(7);
      ob.setB(8);
      Calculatoroperation ob1=new Calculatoroperation();
      double res=ob1.add(ob);
      System.out.println("ADDITION = "+res);
    }
}
   
