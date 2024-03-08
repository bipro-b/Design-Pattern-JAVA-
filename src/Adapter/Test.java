package Adapter;

public class Test {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        PlasticToyDuck plasticToyDuck = new PlasticToyDuck();
        plasticToyDuck.squeak();
        AdapterBird adapterBird = new AdapterBird(sparrow);
        adapterBird.squeak();

    }
}
