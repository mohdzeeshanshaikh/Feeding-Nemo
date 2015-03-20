
public class EnemyFish1 implements FishCreator 
{   
    public EnemyFish1()
    {
    }
    public Fish getFish()
    {
       return new SharkFish();
    }
}
