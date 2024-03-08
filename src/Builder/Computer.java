package Builder;

public class Computer {
    // required parameter

    private String HDD;
    private String RAM;

    // optional parametes

    private boolean isGraphicsCardEnables;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnables() {
        return isGraphicsCardEnables;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    //before resolve
//    public Computer(String HDD, String RAM, boolean isGraphicsCardEnables, boolean isBluetoothEnabled) {
//        this.HDD = HDD;
//        this.RAM = RAM;
//        this.isGraphicsCardEnables = isGraphicsCardEnables;
//        this.isBluetoothEnabled = isBluetoothEnabled;
//    }

    //after resolve

    private Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsCardEnables = builder.isGraphicsCardEnabled;
    }

    public static class ComputerBuilder{
        // required parameters
        private String HDD;
        private String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

}
