import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class DevilFish extends Fish
{
    int counter=0;
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
