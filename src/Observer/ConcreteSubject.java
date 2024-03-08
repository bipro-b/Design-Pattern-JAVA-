package Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{


    private List<Observer> observers;
    private String state;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    public void register(Observer obj){
        if(obj==null){
            throw new NullPointerException("Null observer");
        }
        if(!observers.contains(obj)){
            observers.add(obj);
        }
    }
    @Override
    public void unRegister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.state;
    }

    public void setState(String state){
        this.state = state;
        notifyObservers();
    }

}

// concrete subject