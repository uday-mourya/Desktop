class Tomato
{
    int weight;
    String colour;
    Nutrition quantity;
    public Tomato(int weight,String colour,int sugar,int vitaminA,int vitaminB,int calcium)
    {
       
        this.weight=weight;
        this.colour=colour;
        quantity =new Nutrition(sugar,vitaminA,vitaminB,calcium);
    }
    public void display()
    {
        System.out.println("Weight    :"+weight);
        System.out.println("Colour    :"+colour);
        this.quantity.show();
    }
        class Nutrition
        {
           int sugar,vitaminA,vitaminB,calcium;
           public Nutrition(int sugar,int vitaminA,int vitaminB,int calcium)
           {
               this.sugar=sugar;
               this.vitaminA=vitaminA;
               this.vitaminB=vitaminB;
               this.calcium=calcium;
           }
           public void show()
           {
                System.out.println("Sugar  gram  :"+sugar);
                System.out.println("vitamin A ug :"+vitaminA);
                System.out.println("vitamin B mg :"+vitaminB);
                System.out.println("calcium   mg :"+calcium); 
          }
       }
}
class Test
{
    public static void main(String args[])
    {
        Tomato ob=new Tomato(100,"ReD",34,3,3,521) ;
        ob.display();
    }
}       
         
    
        
        
