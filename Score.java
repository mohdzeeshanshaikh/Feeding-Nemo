import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Score extends Observer
{
    int scre = 0;
    public Score(Subject sub)
    {
        super(sub);
    }
    
    public void setScore(int s){
        scre=s;
    }
    
    public void update(){
           scre += 5;
           System.out.println("Score:"+scre);
           IHandler h1 = new Level1Handler();
           IHandler h2 = new Level2Handler();
           IHandler h3 = new GameOverHandler();
           
           h1.setSuccessor(h2);
           h2.setSuccessor(h3);
           h1.handleLevelRequest(scre);
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + scre, 30,  Color.ORANGE, Color.BLUE));
    }    
}
