import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Observer extends Actor implements IObserver
{
    protected String observerState;
    protected Subject subject;
    
    public Observer(Subject theSubject)
    {
        this.subject=theSubject;
    }
    
    public void update(){    
    }
    
        public void act() 
    {
        // Add your action code here.
    }    
}