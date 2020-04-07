package singleton;
public class ThreadSafeSingleton {
    public String context = "TS Singleton Context";
    private static ThreadSafeSingleton tsInstance;
    private ThreadSafeSingleton(){}
    public static synchronized ThreadSafeSingleton getTSInstance(){
        if (tsInstance == null) tsInstance = new ThreadSafeSingleton();
        return tsInstance;
    }
    public void log(String Thread){
        System.out.println(Thread+" "+context);
    }
}