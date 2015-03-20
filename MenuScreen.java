import greenfoot.*;
import java.util.ArrayList;

public class MenuScreen extends Screen
{
    private ICommand slot1;
    private ICommand slot2;
    private ICommand slot3;
    private ArrayList<Button> buttons = new ArrayList<Button>();
    private int loadSpeed = 25;

    public MenuScreen()
    {
        super(false);
        slot1 = new MenuCommand(new GameScreen());
        slot2 = new MenuCommand(new InstructionScreen());
        slot3 = new MenuCommand(new CreditsScreen());
        prepare();

        System.out.println("Kindly minimize this window.");
    }

    private void prepare()
    {
        IInvoker startBtn = new Button("Play Game");
        IInvoker instructionsBtn = new Button("Instructions");
        IInvoker creditsBtn = new Button("Credits");
        buttons.add((Button)startBtn);
        buttons.add((Button)instructionsBtn);
        buttons.add((Button)creditsBtn);

        startBtn.setCommand(slot1);
        instructionsBtn.setCommand(slot2);
        creditsBtn.setCommand(slot3);

        addButtons();
    }

    private void addButtons() {
        int[] yPositions = {
            470,
            520,
            570
        };
        for(int i = 0; i < buttons.size(); i++) {
            addObject(buttons.get(i), 0, 0);
            buttons.get(i).setLocation(-buttons.get(i).getImage().getWidth(), yPositions[i]);
        }
    }

    public void act() {
        for(int i = 0; i < buttons.size(); i++) {
            if(buttons.get(i).getX() < this.getWidth()/2) {
                buttons.get(i).setLocation(buttons.get(i).getX() + loadSpeed, buttons.get(i).getY());
                break;
            }
        }
    }
}