package Singleton;

public class LazzySingleton {
    private static LazzySingleton instance;

    private LazzySingleton(){};

    public static LazzySingleton getInstance(){
        if(instance == null){
            instance = new LazzySingleton();
        }
        return instance;
    }
}
