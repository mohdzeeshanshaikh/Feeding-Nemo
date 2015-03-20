public class hungryState implements IFishStates 
{
    NemoFish nemo;
    public hungryState(NemoFish f)
    {
        nemo=f;
        nemo.setSpeed(-1);
    }

    public void eatGumball(){
        System.out.println("Eating Gumball in "+ this.getClass().getName() +" State");
        IFishStates hs = new happyState(nemo);
        nemo.setState(hs);
    }
    
    public void crash(){
        System.out.println("Nemo Crashed in "+ this.getClass().getName() +" State");
        IFishStates ds = new deadState(nemo);
        nemo.setState(ds);
    }
    
    public void revive(){
        System.out.println("Reviving in "+ this.getClass().getName() +" State");
        System.out.println("Cannot Revive in "+ this.getClass().getName() +" State");
    }    
}
