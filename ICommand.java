
public interface ICommand {
	public abstract void execute();
	public abstract void setReceiver(IReceiver target);
}
 