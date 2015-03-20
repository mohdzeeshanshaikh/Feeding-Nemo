public class MenuCommand implements ICommand {
    private IReceiver theReceiver ;    
    
    public MenuCommand (Screen scr) { 
        this.theReceiver = scr; 
    }
    
    public void execute() {
        theReceiver.display();
    }

    public void setReceiver(IReceiver target) {
        theReceiver = target ;
    }     
}
 
