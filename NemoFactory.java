
public class NemoFactory implements FishCreator 
{   
    public NemoFactory()
    {
    }

    public Fish getFish()
    {
        return new NemoFish();
    }
}
