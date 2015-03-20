import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Status extends Observer
{
    String status="Hungry State";
    NemoFish nemo;
    
    public Status(Subject sub)
    {
        super(sub);
        nemo=(NemoFish)sub;
    }
        
    public void update(){
       status=nemo.getNemoState();
       if(status.equals("happyState")){
           status="Happy State";
        }
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("State: " + status, 30,  Color.ORANGE, Color.BLUE));
    }    
}
