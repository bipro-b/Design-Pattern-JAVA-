package Observer;

public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);

        System.out.println("after update");
        subject.setState("First state");
        System.out.println("after update");
        subject.setState("Second state");

    }
}
