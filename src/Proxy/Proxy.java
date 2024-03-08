package Proxy;

public class Proxy {
    public static void main(String[] args) {
        Connection i = new ProxyInternet();
        i.createConnection("192.168.0.1","192.168.0.1");
    }
}
