import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SharkFish extends Fish
{
    public void act() 
    {
        move (1) ;
        if (getX () <= 5 || getX() >= getWorld().getWidth () - 5)
        {
            getWorld().removeObject(this);
            return; 
        }
        if (getY () <= 5 || getY() >= getWorld().getHeight () - 5)
        {
            getWorld().removeObject(this);
            return; 
        }
    }    
}

