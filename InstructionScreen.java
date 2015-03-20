import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionScreen extends Screen
{
    private int c=0;
    
    public InstructionScreen()
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
            this.addObject(new InstructionBox(), this.getWidth()/2, this.getHeight()/2);
            c++;
        }
    } 
}
