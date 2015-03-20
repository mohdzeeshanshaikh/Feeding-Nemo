import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2Handler extends Actor implements IHandler
{
    private IHandler successor = null;

    public void act(){
    } 
    
    public void handleLevelRequest( int request ) {        
        if ( request == 30 )
        {
            StartLevel2 level2 = new StartLevel2();
            Greenfoot.setWorld(level2);
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