package singleton;
public class LazySingleton {
    public String context = "Lazy Singleton Context";
    private static LazySingleton lazyInstance;
    private LazySingleton(){}
    public static LazySingleton getLazyInstance(){
        if(lazyInstance == null) lazyInstance = new LazySingleton();
        return lazyInstance;
    }
    public void log(){
        System.out.println(context);
    }
}
