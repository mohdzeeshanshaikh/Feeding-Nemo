import greenfoot.*;


public class NemoFish extends Subject
{
    private int gumballsEaten;
    private int speed;
    IFishStates hungryState;
    IFishStates happyState;
    IFishStates deadState;
    IFishStates currentState;
    
    public void act() 
    {       
        move();
        eatGumball();
        crash();        
    }  
    
    public void eatGumball()
    {
        Actor g = getOneObjectAtOffset(0, 0, Gumballs.class); 
        if(g != null) {
            getWorld().removeObject(g);
            Greenfoot.playSound("eating.wav");
            gumballsEaten = gumballsEaten + 1; 
            System.out.println("State:"+ currentState);
            System.out.println("Speed:"+ speed);
            currentState.eatGumball();
            System.out.println("State:"+ currentState);
            System.out.println("Speed:"+ speed);
            notifyObservers();
        }
    }
    
    public void crash()
    {
        Actor g = getOneObjectAtOffset(0, 0, Fish.class);
        if(g != null) {
            getWorld().removeObject(this);
            System.out.println("State:"+ currentState);
            System.out.println("Speed:"+ speed);
            currentState.crash();
            revive();
        }
    }
    public void revive()
    {
        System.out.println("State:"+ currentState);
        System.out.println("Speed:"+ speed);
        currentState.revive();
        GameOverScreen ms = new GameOverScreen(getNemoState());
        Greenfoot.setWorld(ms);
        System.out.println("State:"+ currentState);
        System.out.println("Speed:"+ speed);
    }
    
    public void move()
    {
        move(speed);
        checkKeys();
        bounce();
    }    
    
    protected void checkKeys()
    {
        if (Greenfoot.isKeyDown("left"))
            moveLeft();
        if (Greenfoot.isKeyDown("right"))
            moveRight();
        if (Greenfoot.isKeyDown("up"))
            moveUp();
        if (Greenfoot.isKeyDown("down"))
            moveDown();
        if (Greenfoot.isKeyDown("space"))
            jump();
    }
    private void moveLeft()
    {
        turn(-1);
    }    
    private void moveRight()
    {
        turn(1);
    }    
    private void moveUp()
    {
        move(-1);
    }    
    private void moveDown()
    {
        move(2);
    }    
    private void jump()
    {
        setLocation(getX(), getY()-10);
    }
        
    public void bounce()
    {
        String edge = getEdge();
        if (edge == "left")
            this.setRotation(180);
        if (edge == "right")
            this.setRotation(0);
        if (edge == "top")
            this.setRotation(270);
        if (edge == "bottom")
            this.setRotation(90);
    }    
    public String getEdge()
    {
        int x = getX();
        int y = getY();
        if (y == 0)
            return "top";
        else if (x == 0)
            return "left";
        else if (x == getWorld().getWidth()-1)
            return "right";
        else if (y == getWorld().getHeight()-1)
            return "bottom";
        else
            return "none";
    }
            
    public String getNemoState(){
       System.out.println(currentState);
       if(currentState.getClass()==deadState.getClass()){
           return "deadState";
       }
       else if(currentState.getClass()==happyState.getClass()){
           return "happyState";
       }
       else {
           return "hungryState";
       }
    }
            
    public NemoFish(){
        GreenfootImage image = getImage();  
        image.scale(image.getHeight()-20,image.getWidth()-20);
        hungryState = new hungryState(this);
        happyState = new happyState(this);
        deadState = new deadState(this); 
        currentState=hungryState;
        setSpeed(-1);
    }
    
    public void setSpeed(int s){
        speed=s;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void setState(IFishStates cs){
       currentState = cs;
    }
}