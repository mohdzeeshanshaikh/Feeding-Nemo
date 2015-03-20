import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class InstructionBox extends Actor
{
    public void addedToWorld(World world) {
        int width = world.getWidth(), height = world.getHeight();
        double rate = 0.1;
        for(double d = rate; d < 1; d += rate) {
            int w = (int)Math.round((double)width*d),
                h = (int)Math.round((double)height*d);
            GreenfootImage img = new GreenfootImage(w, h);
            img.setTransparency(180);
            img.fill();
            setImage(img);
            Greenfoot.delay(1);
        }
        GreenfootImage img = new GreenfootImage(width, height);
        img.setTransparency(180);
        img.fill();
        img.setColor(Color.WHITE);
        String[] text = {
            "Game Instructions",
            "[Press Escape to exit]",
            "",
            "1. Use navigation keys to move around",
            "       Go right: '->'",
            "       Go left: '<-'",
            "       Move faster: 'Up arrow key'",
            "       Slow down : 'Down arrow key'",
            "2. Dodge the Shark and Devil Fishes",
            "3. Eating the gumballs the speed of Nemo will increase.",
            "4. Score will help you to go the next level.",
            "       Level 1 - Score 10 points. ",
            "       Level 2 - Score 30 points. ",
            "       Level 3 - Score 60 points. ",
            "",
            "                                        Enjoy the Game",
            ""
        };
        int fontSize = (height-10)/text.length;
        img.setFont(img.getFont().deriveFont((float)fontSize));
        for(int i = 0; i < text.length; i++) {
            img.drawString(text[i], 10, fontSize*i+fontSize);
        }
        setImage(img);
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("escape")) Greenfoot.setWorld(new MenuScreen());
    } 
}
