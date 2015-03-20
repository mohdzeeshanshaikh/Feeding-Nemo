
public  class GumballCreator  
{
    public GumballCreator()
    {
    }
    
    public Gumballs makeGumballs(String color)
    {
        RedGumballFactory r = new RedGumballFactory();
        BlueGumballFactory b = new BlueGumballFactory();
        GreenGumballFactory g = new GreenGumballFactory();
        if(color.equals("red"))
        {
            return r.getGumball();
        }
        if(color.equals("green"))
        {
           return  g.getGumball();
        }
        
        if(color.equals("blue"))
        {
            return b.getGumball();
        }
        return null;
    }
    
}
