import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameScreen extends Screen
{
    int a=0,b=0,c=0;
    int count =0;
    private int threshold_1 =60 , threshold_2 = 60, threshold_gumballs = 40;
    private Fish enemy1,enemy2;
    public Gumballs gumball;
    private RandomGumballs randomgumballs= new RandomGumballs() ;
    GameScreen world;
    NemoFish nemo = new NemoFish();
    Score score = new Score(nemo); 
    Status status = new Status(nemo); 
    ShowSpeed speed = new ShowSpeed(nemo); 
    
    public GameScreen()
    {    
        super(true);
        prepare();
    }
    
    private void prepare()
    {
        Fish e1;     
        
        addObject(nemo,700,300);       
        addObject(score, getWidth()/2, 20);    
        addObject(status, 110, 20);    
        
        nemo.attach(score);  
        nemo.attach(status);        
        
        addObject(speed, 950, 20);   
        
        FishCreator f1 = new EnemyFish1();
        e1 = f1.getFish();
        addObject(e1,411,63);
        
        FishCreator f2 = new EnemyFish2();
        e1 = f2.getFish();
        addObject(e1,511,493);       
    }
    
    public Gumballs getGumball()
    {
        return this.gumball;
    }
    
    public void setGumball(Gumballs newGumball)
    {
        this.gumball = newGumball;
    }
    
    public void act()  
    {  
        a++;  
        if(a == threshold_1)  
        {  
            RandomThingMethodFish1();  
            a = 0;  
        }  
        b++;
        if (b == threshold_2)
        {
            RandomThingMethodFish2(); 
            b = 0;
        }
        c++;
        if (c == threshold_gumballs)
        {
            RandomGumballsOnScreen();
            c=0;
           
        } 
    }  
  
    public void RandomThingMethodFish1()  
    {  
        int z = Greenfoot.getRandomNumber(10);  
        int x = Greenfoot.getRandomNumber(getWidth());  
        int y = Greenfoot.getRandomNumber(getHeight()); 
        if(z == 1) {  
            FishCreator f3 = new EnemyFish1();
            enemy1 = f3.getFish();
            addObject(enemy1,10,y);
        }
    }  
    
    public void RandomThingMethodFish2()  
    {  
        int u = Greenfoot.getRandomNumber(10);  
        int v = Greenfoot.getRandomNumber(getWidth());  
        int w = Greenfoot.getRandomNumber(getHeight());  
  
        if(u == 1){
            FishCreator f4 = new EnemyFish2();
            enemy2 = f4.getFish();
            addObject(enemy2,10,w);
        }
    }  
    
    public void RandomGumballsOnScreen()  
    {  
        int z1= Greenfoot.getRandomNumber(10);  
        int y1 = Greenfoot.getRandomNumber(getWidth());  
        int x1 = Greenfoot.getRandomNumber(getHeight());  
          
        if(count < 10){    
            gumball =randomgumballs.setRandomGumballs();
            if (gumball != null ){
                addObject(gumball, y1, x1);
                count++;
            }
        }
    }
}