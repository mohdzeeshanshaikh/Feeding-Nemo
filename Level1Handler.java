import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1Handler extends Actor implements IHandler
{
    private IHandler successor = null;
         
    public void act() {
    }    

	public void handleLevelRequest ( int request ) {        
        if ( request == 10 )
        {
            StartLevel1 level1 = new StartLevel1();
            Greenfoot.setWorld(level1);
        }
        else
        {
            if ( successor != null )
                successor.handleLevelRequest(request);
        }
	}

	public void setSuccessor(IHandler next) {
        this.successor = next ;
	}
}