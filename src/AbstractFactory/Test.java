package AbstractFactory;

public class Test {
    public static void main(String[] args) {
        printAbstractFactory();
    }
    private static void printAbstractFactory(){
        Computer pc = ComputerFactory.getComputer(new PcFactory("2 GB","200 GB","2.4 GHZ"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16GB","2000GB","3.1 GHZ"));
        System.out.println("PC Config: "+pc);
        System.out.println("Server Config: "+server);
    }
}
