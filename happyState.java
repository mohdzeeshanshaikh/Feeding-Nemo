public class happyState implements IFishStates 
{
    NemoFish nemo;
    
    public happyState(NemoFish f){
        nemo=f;
        nemo.setSpeed(nemo.getSpeed()-1);
    }

    public void eatGumball(){
        System.out.println("Eating Gumball in "+ this.getClass().getName() +" State");
        System.out.println("Already in "+ this.getClass().getName() +" State");
        nemo.setSpeed(nemo.getSpeed()-1);
        if(nemo.getSpeed()>8)
            nemo.setSpeed(-8);
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
