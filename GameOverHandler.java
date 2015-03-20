import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOverHandler extends Actor implements IHandler
{
    private IHandler successor = null;

    public void act() {
    } 
    
    public void handleLevelRequest ( int request) {        
    if ( request == 60 )
    {
        GameOverScreen gameOver = new GameOverScreen();
        Greenfoot.setWorld(gameOver);
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