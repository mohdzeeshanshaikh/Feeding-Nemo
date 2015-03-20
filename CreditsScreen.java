import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; 

public class CreditsScreen extends Screen
{
    private int c=0;
    
    public CreditsScreen()
    {    
        super(false);
        prepare();
    }

    private void prepare()
    {
        setBackground("Nemo.jpg");
    }
    
    public void act() {
        if(c==0){
            this.addObject(new CreditsBox(), this.getWidth()/2, this.getHeight()/2);
            c++; 
        }
    } 
}
