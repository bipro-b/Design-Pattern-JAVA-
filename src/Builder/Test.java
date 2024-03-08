package Builder;

public class Test {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder(
                "500GB","2 GB"
        ).setBluetoothEnabled(true).setBluetoothEnabled(true).build();

    }
}
