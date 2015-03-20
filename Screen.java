import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Screen extends World implements IReceiver
{
    boolean flag=true;
    private GreenfootSound music = new GreenfootSound("POL-on-the-beach-short.wav"); 
    
    public Screen(boolean flag)
    {
        super(1000, 600, 1, flag);
    }
    
    public void display () {
         Greenfoot.setWorld(this);
    }
    
    public void started()  
    {  
        music.playLoop();  
    }  
  
    public void stopped()  
    {  
        music.stop();  
    } 
    
}