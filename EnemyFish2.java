
public class EnemyFish2 implements FishCreator 
{
    public EnemyFish2()
    {
    }
    public Fish getFish()
    {
        return new DevilFish();
    }
}
