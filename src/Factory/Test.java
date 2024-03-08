package Factory;

public class Test {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC","2 GB","200 GB","2.4 GHZ");
        Computer server = ComputerFactory.getComputer("server","16 GB","2000 GB","4.0 GHZ");
        System.out.println("PC Config: "+pc);
        System.out.println("Server Config: "+server);
    }
}
