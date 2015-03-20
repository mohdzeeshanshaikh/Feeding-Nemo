public class deadState implements IFishStates 
{
    NemoFish nemo;
    public deadState(NemoFish f)
    {
        nemo=f;
        nemo.setSpeed(0);        
    }

    public void eatGumball(){
       System.out.println("Eating Gumball in "+ this.getClass().getName() +" State");
       System.out.println("Cannot eat gumball in "+ this.getClass().getName() +" State");
    }
    
    public void crash(){
       System.out.println("Nemo Crashed in "+ this.getClass().getName() +" State");
       System.out.println("Cannot crash in "+ this.getClass().getName() +" State");
    }
    
    public void revive(){
        System.out.println("Reviving in "+ this.getClass().getName() +" State");
    }    
}
