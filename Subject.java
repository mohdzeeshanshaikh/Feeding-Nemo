import greenfoot.*; 
import java.util.*;

public class Subject extends Fish implements ISubject
{
    private String nemoState;
    
    private ArrayList<IObserver> observers = new ArrayList<IObserver>() ;
      
    public String getState(){
        return nemoState;
    }
    
    public void setState(String status){
        nemoState = status;
        notifyObservers();
    }
    
    public void attach(IObserver obj) {
        observers.add(obj) ;
    }

    public void detach(IObserver obj) {
        observers.remove(obj) ;
    }
    
    public void notifyObservers() {
        for (IObserver obj  : observers)
        {
            obj.update();
        }
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
