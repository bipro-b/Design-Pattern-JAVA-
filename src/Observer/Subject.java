package Observer;

public interface Subject {
    void register(Observer obj);
    void unRegister(Observer obj);
    void notifyObservers();

    Object getUpdate(Observer obj);
}
// subject interface
