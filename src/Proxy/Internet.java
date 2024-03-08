package Proxy;

public class Internet implements Connection{
    @Override
    public void createConnection(String sender, String receiver) {
        System.out.println("Connecting "+sender+" to "+receiver);
    }
}
