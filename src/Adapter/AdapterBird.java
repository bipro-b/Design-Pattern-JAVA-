package Adapter;

public class AdapterBird implements ToyDuck{

    Bird bird;

    public AdapterBird(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.sound();
    }
}
