package Adapter;

public class Sparrow implements Bird {

    @Override
    public void sound() {
        System.out.println("Chirp Chirping");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
