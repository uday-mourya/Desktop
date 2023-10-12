class Time
{  
    private int h,m,s;
    public void setData(int h,int m, int s)
    {
       this.h=h; 
       this.m=m;
       this.s=s;
    }
    public void display()
    {
       System.out.println("HOURE  ="+this.h);
       System.out.println("MINUTE ="+this.m);
       System.out.println("SEOCND ="+this.s);
       System.out.println("---------------");
    }
    public void addTime(Time k1,Time k2)
    {
      this.h=k1.h+k2.h;
      this.m=k1.h+k2.m;
      this.s=k1.s+k1.s;
      
      /*if(this.s>=60||this.m>=60)
      {
        this.m=this.m+this.s/60;
        this.s=this.s%60;
        this.h=this.h+this.m/60;
        this.m=this.m%60;
      }
      */
      int total=k1.h*3600+k2.h*3600+k1.m*60+k2.m*60+k1.s+k2.s;
      this.h=total/3600;
      this.m=(total%3600);
      this.s=(total%3600)%60;  
     
    }
}
class Test
{    
    public static void main(String [] args)
    { 
      
      Time t1=new Time();
      Time t2=new Time();
      Time t3=new Time();
      t1.setData(5,155,115);
      t2.setData(3,145,225);
      
      t1.display();
      t2.display();
      t3.addTime(t1,t2);
      t3.display();
    }
}
 //https://pustakalaya-techdeveloper.onrender.com  
