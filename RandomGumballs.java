import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RandomGumballs extends Actor
{
    GumballCreator gumballFactory = new GumballCreator();
    Gumballs gumball;
        
    public Gumballs setRandomGumballs()
    {   
         switch ((Greenfoot.getRandomNumber(9999) % 3))
         {
             case 0:
             {
                 gumball = gumballFactory.makeGumballs("red");
                 break;
             }
             
             case 1:
             {
                 gumball = gumballFactory.makeGumballs("green");
                 break;
             }
             
             case 2:
             {
                 gumball = gumballFactory.makeGumballs("blue");
                 break;
             }
         }
         return(gumball);
    }
}
