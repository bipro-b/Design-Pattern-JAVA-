package Observer;

public class ConcreteObserver implements Observer{
    private String state;
    private Subject subject;

    ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update() {
        state = (String) subject.getUpdate(this);
        System.out.println("State updated to: " + state);
    }

}

// concrete observer
