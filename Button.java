import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;  

public class Button extends Actor implements IInvoker
{
    private ICommand theCommand;  
    private boolean mouseOver = false;
    private int lastX, lastY;
    private GreenfootImage image, over;
    
    public Button (String text)
    { 
        createImages(text);
        setImage(image);
    }

    public void act() {
        int x = getX();
        int y = getY();
        if(Greenfoot.mouseMoved(this)) {
            if(!mouseOver) {
                setImage(over); // set gray if mouse is over buttons
                mouseOver = true;
            }
        }else if(Greenfoot.mouseMoved(null)) {
            if(mouseOver) {
                setImage(image);
                mouseOver = false;
            }
        } else if(x != lastX || y != lastY) {
            MouseInfo m = Greenfoot.getMouseInfo();
            if(m != null) {
            }
            
        }
        lastX = x;
        lastY = y;
        if (Greenfoot.mouseClicked(this)) 
        {
            invoke(); 
        }
    } 
    
    protected void createImages(String name) {
        image = new GreenfootImage(210, 40); 
        image.setColor(new Color(0,0,0,0)); 
        image.clear();  
        image.fill();  
        GreenfootImage numImage = new GreenfootImage(name, 40, Color.WHITE, new Color(0,0,0,0));  
        image.drawImage(numImage, 19, 20 - numImage.getHeight() / 2);
        over = new GreenfootImage(210, 40);
        over.clear();
        over.setColor(new Color(128,128,128));  
        over.fill();  
        over.drawImage(numImage, 19, 20 - numImage.getHeight() / 2);
    }
    
    //Command Pattern 
    public void setCommand(ICommand cmd) {
        theCommand = cmd ;
    }

    public void invoke() {
        theCommand.execute();
    }
}