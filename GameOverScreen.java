import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOverScreen extends Screen
{
    String str;
    int x;
    
    public GameOverScreen()
    {
        super(false);
        prepare();
    }

    public GameOverScreen(String state)
    {
        super(false);
        str=state;
        prepare();
    }

    private void prepare()
    {
        ICommand slot1 = new MenuCommand(new GameScreen());
        ICommand slot2 = new MenuCommand(new MenuScreen());

        IInvoker startBtn = new Button("Play Again");
        IInvoker backBtn = new Button("Main Menu");

        startBtn.setCommand(slot1);
        backBtn.setCommand(slot2);

        if(str=="deadState"){
            setBackground("shark.jpg");
            x=500;
        }
        else{
            setBackground("Nemo Won.jpg");
            x=900;
        }
        addObject((Button)startBtn, x, 500);
        addObject((Button)backBtn, x, 550);
    }
}