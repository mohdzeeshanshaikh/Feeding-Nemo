import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class ShowSpeed extends Actor
{
    NemoFish nemo;
    int speed;
    
    public ShowSpeed(NemoFish sub)
    {
        super();
        nemo = sub;
    }
        
    public void act() 
    {
        speed=nemo.getSpeed();
        speed=speed*(-1);
        setImage(new GreenfootImage("Speed: " + speed, 30,  Color.ORANGE, Color.BLUE));
    }    
}
