public interface ISubject  
{
    public void attach(IObserver obj);
    public void detach(IObserver obj);
    public void notifyObservers();
}