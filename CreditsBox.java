import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class CreditsBox extends Actor 
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
            "Game",
            "[Press Escape to exit]",
            "",
            "Directed by",
            "TEAM 16",
            "",
            "Produced by",
            "Prof. PAUL NGUYEN",
            "",
            "Written by",
            "RAMYA RAJENDRA PATIL",
            "MAITHILI GOLE",
            "ABDUL MALIK",
            "MOHD ZEESHAN SHAIKH",
            "NOMAAN KHAN",
            "",
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





















