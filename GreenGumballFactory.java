
public class GreenGumballFactory extends GumballCreator 
{
    public GreenGumballFactory()
    {
    }

    public Gumballs getGumball()
    {
        return new GreenGumball();
    }
}
